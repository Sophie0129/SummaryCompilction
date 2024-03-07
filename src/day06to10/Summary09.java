package day06to10;

/*

생성자 Constructor
객체가 만들어질때 멤버변수의 초기화를 위하여 호출되는 함수

클래스의 이름과 동일한 이름의 메소드로 구성한다.
함수의 반환값(return value)이 없다.
일반적으로 객체를 초기화하는 목적으로 사용된다.

public class 클래스 이름{
	public 클래스이름() {
		생성자 함수의 내용;
	}
}


생성자 메소드는 객체를 호출할때 자동으로 호출되어 출력하기 위한 코드가 없어도 된다
ex) Login log = new Login(); >이것만으로 출력이 됨
그리고 괄호안에 저장할 값을 넣어주면 set의 역할을 하여 값을 저장해준다.
하지만 set클래스에서

public TestDTO(String name, String addr) {
		this.name = name;
		this.addr = addr;
		
		와 같이 괄호안에 자료형과 변수명으로 매개변수를 넣고, 내용으로는 set과 같은 설정내용을 넣어준다.

생성자가 set의 역할을 한다고 해서 get코드만 있으면 안되고 만들때는 set, get 코드를 모두 만들어놔야 한다.

기존에는 Login log = new Login(); 이런 객체호출만으로 출력이 되지 못했던건
생성자가 디폴트여서(보이지 않는) 내용이 없어 호출되었다가 돌아와도 출력을 못했던것.

또한 객체생성은 원할때에 만들어도 된다.(초기호출에서 객체생성을 하지 않아도 괜찮다는말)
Login log; 혹은 Login log=null;
그리고 필요할 때에 아래와 같이 한다
log = new Login();

객체를 생성하지 않았을때는 객체의 값이 쓰레기값(null)이다.

초기화를 위한 생성자가 있다고 하더라도, 
값을 받지 않은 기본 생성자의 값을 사용할때를 대비해 디폴트 생성자도 있는것이 좋다. 그리고 오류도 덜 난다.
ex) public Login () {}

생성자도 오버로딩 가능하다.

private 으로 변수를 만들고 set, get을 하는 클래스를 줄여서 DTO라고 부른다.
연산용 클래스는 display라고 이름짓는게 디폴트인것 같다.

연산용 클래스를 보면 메소드가 여러개인데, 내부연산에만 쓰이는 메소드는 프라이빗으로 만드는것이 편리하다.
퍼블릭으로 노출시키면 자동완성창에 계속 보이게 되어 사용자가 사용할수도 있는데, 내부연산용이라 값이 안나오기 때문.
결국엔 출력용으로 사용할수도 없고, 사용하지 않겠다는 메소드이니 보이지 않게 프라이빗으로 만들어 은닉화시켜두면 에러도 줄일수 있어서 좋다.
 
LoginDTO03 log = new LoginDTO03 일때
log가 null일때는 log.getID에 .으로 시작하는 기능을 쓸 수 없다



long time = System.currentTimeMillis();
시간을 얻어오는 기능(time은 변수명)

SimpleDateFormat si = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
포멧을 정해주는 함수 (si는 변수명)

Date date = new Date();
날짜를 얻어오는 기능
System.out.println( si.format(date));
위와같이 출력하면 시간도 나온다.
Date는 날짜와 시간 둘 다 얻어올 수 있다.

Thread.sleep(2000);
답을 출력하는데 있어 시간을 만들어준다.잠깐 멈췄다가 다음답 출력
1000 = 1초
try {Thread.sleep(2000);}
catch (InterruptedException e) {e.printStackTrace();}
폼이 필요한데, 내일 배울 예정

객체 생성의 의미는 초기화

패키지명은 도메인적는 순서의 반대로 적는다
ex)com.naver > com 폴더 안에 naver 폴더가 있다는 뜻
package 명명법 검색해서 참고

각 파일마다 public class는 하나만 만들수 있다.
앞에 키워드 없는것은 디폴트라고 부름 프라이빗처럼 다른 패키지에서 사용할 수 없고, 내부에서만 사용 가능하다

한 폴더에서 여러가지 클래스를 가져올때 *을 쓰면 그 폴더의 모든 클래스를 불러오는 기능이다.
ex)import constructor.*;  import java.util.*;

호출할때 폴더 위치 잘 확인하기

같은 이름의 기능이나 다른폴더의 같은 이름일 경우 클래스명을 쓸때 앞쪽에 패키지명을 써준다
ex) java.utill.Date date;;
com.care.test. d = new Data();


		













*/