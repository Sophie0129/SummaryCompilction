/*

DB와 Java를 연결할때 일반적으로 jdbc
자바 데이터 베이스 커넥션
이라고 한다

자바프로젝트에서 설정 > 빌드패스 > 라이브러리 > 모듈패스 선택하고 > 외부 추가 > ojdbc8.jar 추가 > 확인 
모듈 인포에도 추가해주어야하는데 자동추가하는 기능이 있다. 찾아서 요약해놓을것
자바프로젝트에서 컨피그 > 모듈인포 생성 - 자동으로 추가해줌
exports ex01; requires java.sql; 두개가 필요했는데 첫번째것만 자동입력해줌

-----이해를 돕기위한 설명(온라인 검색)
Connection 객체란?

자바에서 DB와 연결하기 위해 사용하는 객체입니다.
파라미터는 Data의 위치(URL), 기타 정보(DB 접속 ID, 패스워드, 포트 번호)입니다.
DriveManager의 getCOnnection()메소드를 호출하여 생성할 수 있습니다.

String = url = "...";
String user = "...";
String password = "...";

Class.forName("드라이버이름");
Connection con = DriverManager.getConnection(url, user, password);

--------------
자바에서 DB로 SQL문을 전송하고, 
DB에서 SQL문을 실행한 결과를 다시 자바로 받아오기 위해 Statement, PreparedStatement 
또는 CallableStatement 인터페이스를 사용합니다.

Connection 객체의 prepareStatement(String sql) 메소드를 이용해 PreparedStatement 객체를 생성합니다.
Statement와 달리, 객체 생성시 SQL문을 인자로 전달합니다. 

-준비'된'표 가 제일먼저 private으로 객체를 생성하고,(preparedStatement)
이후 준비'하는'표가 커넥션의 메소드로 사용된다.(prepareStatement)

-------------
ResultSet
ResultSet은 SELECT문의 결과를 저장하고 자바로 불러올수 있게 하는 객체입니다.

-------------
ExecuteQuery
1. 수행결과로 ResultSet 객체의 값을 반환합니다.
2. SELECT 구문을 수행할 때 사용되는 함수입니다.

------------
ExecuteUpdate

1. 수행결과로 Int 타입의 값을 반환합니다.
2. SELECT 구문을 제외한 다른 구문을 수행할 때 사용되는 함수입니다.

executeUpdate 함수를 사용하는 방법입니다.
 -> INSERT / DELETE / UPDATE 관련 구문에서는 반영된 레코드의 건수를 반환합니다.
 -> CREATE / DROP 관련 구문에서는 -1 을 반환합니다.
------------------------------------------끝-------------------------------------------------------

private Connection con; >> DB와 Java를 연결해주는 객체
private PreparedStatement ps; >> SQL문을 Java와 DB간 전송해주는 객체
private ResultSet rs; >> SQL문의 결과를 저장하고 Java로 불러오는 객체(위 객체에서 전송되는 SQL문을 실행시키는 객체)

-이후 첫 초기화가 필요하다. 식은 아래와 같다
public DB_con() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // DB의 기능을 불러온다.
			System.out.println("오라클 기능 사용 가능(드라이브 로드)");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl"; //18q버전 이하 :xe, 19버전 이상 :orcl
			String id = "c##java";
			String pwd = "1234";

			con = DriverManager.getConnection(url, id, pwd);  //오라클이랑 연결
			System.out.println("db 연결 성공 : "+con);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
-위 폼은 ""큰따옴표 안에 있는 내용은 연결할 위치에 따라 달라지지만 그 외 코딩은 첫 초기화를 위한 폼이니 
 그냥 그대로 기억해둬야 할것 같다	
	
-SQL문을 할당하는 변수까지는 괜찮은데 관련 객체(PrepareStatement, ResultSet)을 사용하는 구간은 항상 try-catch로 묶어준다.
-첫 초기화 부분도 try-catch가 필요하다.

DAO에서는 DB와의 연결해서 해결해야할 코드들이 들어가있고,
이후 서비스를 받을 클래스에서 그 코드들을 받아 연산하거나 출력한다.
최종 출력폼은 Main.
그리고 서비스 클래스의 메소드가 인터페이스에 저장되어있다.


String sql = "select*from member_test";
String sql = "select*from member_test where Id='"+userId+"'"; //DB에서는 문자를 작은따옴표로 묶어서 그게 없으면 오류남
String sql = "insert into member_test(id, pwd, name, age) values(?,?,?,?)";  //물음표도 순차적으로 값을 넣어줘야함
			 //"insert into member_test values('"+dto)"
String sql = "delete from member_test where Id=?";//나중에 값을 채운다는 의미의 ? // 완성된것은 아님

연결준비를 마치고, DB와 연동된 Java에서 테이블 값을 가지고 출력하기 위한 메소드를 만들 때,
문자열 변수에 SQL문을 할당한다. 필요한 기능에 따라 SQL문을 쓴다.

자바에선 먹히지 않는 SQL문을 썼기 때문에 이후 아래 두 코드가 필요하다.
ps = con.prepareStatement(sql);
rs = ps.executeQuery();

이해를 위해 내용을 적자면
SQL문_전송객체 = 연결객체.전송객체(SQL문_할당한_변수);
값을_불러오는_객체 = 전송객체.값_불러오는_객체를_return시키는_객체();

그래서 해당 코드들에 오류가 날 경우 결과값을 뽑는 executeQuery쪽에서 오류가 나는데,
위에서 준비해온 것들을 뽑아주는 역할이기 때문에 준비코드에서 오류가 있는지 확인해야 한다.

이후 식을 쓸때,
if(rs.next()) 또는 while(rs.next()) 로 많이 쓰는데
rs에 값이 있을때 true, 없을때 false이기 때문에 값이 있을때 실행되는것이라고 보면 된다.

또,
dto.setId(rs.getString("id"))
형태로 값을 DTO에 할당한다. (위에서 dto는 DTO의 변수)
문자열은 .getString() / 정수형은 .getInt() 등이고,
괄호안에 들어가는 게 테이블의 컬럼명이다.

Java에서 입력한 값을 SQL문에 넣을때 SQL형식에 맞춰서 넣어야 한다
SQL문에서 문자열은 ''작은따옴표에 들어가므로 
String sql = "select*from member_test where Id='"+userId+"'";
위 코드에서 작은따옴표를 넣어주어야 제대로 기능한다.(userId는 자바에서 사용자에게 입력받은 값)

위 처럼 작은 따옴표를 만들어서 값을 할당해 변수에 넣을 수도 있지만, ?로 대체하고 이어지는 식에서 값을 넣어줄 수 도 있다.
String sql = "insert into member_test(id, pwd, name, age) values(?,?,?,?)";
컬럼명을 넣는것은 생략할 수도 있지만 넣어주면 자바에서도 확실하게 컬럼명과 순서를 볼 수 있어서 좋다.

물음표에 값을 넣는 식은
ps = con.prepareStatement(sql);
		
ps.setString(1, dto.getId());
ps.setString(2, dto.getPwd());
ps.setString(3, dto.getName());
ps.setInt(4, dto.getAge()); //테이블의 컬럼 순서대로 넣어야 함

result = ps.executeUpdate();

와 같고, 전송객체는 식이 시작할때 넣고, 값을 불러오는 객체는 할당이 끝난 뒤에 넣어준다.
괄호의 첫번째 자리는 물음표의 위치, 두번째 자리가 넣고 싶은 값을 적어넣는다.

물음표가 한개여도 (1, 넣을값)형태를 유지한다.

SQL문 중에서 삭제의 경우에는 (String sql = "delete from member_test where Id=?";)
result = ps.executeUpdate(); 에 값이 있으면 1, 없으면 0이 들어오는데

DB에서 있는값을 지우면 1행이 삭제되었습니다. 하는 알람이 뜨고, 
없는값을 지우면 0행이 삭제되었습니다. 라고 알람이 뜬다.
그 숫자가 돌아오는 값이 되어서 값이 있으면 1, 없으면 0이 된다.

내용을 추가할때도 마찬가지로 내용이 성공적으로 입력이 되면 1행이 추가되었습니다.
라고 뜬는 알람때문에 내용이 추가되었으면 1을 반환한다. 
여러행이 추가되면 그만큼의 숫자를 반환한다.
내용 추가는 마지막에 .executeUpdate 라는 메소드를 쓴다
ex) 변수 = ps.executeUpdate();

그래서 내용추가의 경우에는 
ps.setString(1, type);
result = ps.executeUpdate(); <<결과값을 도출해서

ps = con.prepareStatement(sql); 만 필요하고
rs = ps.executeQuery(); 는 없어야 한다.


-모든 SQL과 관련된 객체들은 try-catch로 묶어주어야 한다.
-DAO의 메소드는 return 으로 값을 내보낸다.

















*/