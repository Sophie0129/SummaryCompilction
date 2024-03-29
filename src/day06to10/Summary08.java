package day06to10;
/*

~오버로딩~
-메소드의 이름을 동일하게 만들고, 전달하는 인자의 개수에 따라서 어떠한 메소드를 호출할 것인지를 구분하는 방법
-매개변수의 개수, 자료형을 기준으로 찾는다.
-메소드의 이름이 같더라도 매개변수의 자료형, 개수가 다르면 다른 함수이다.
변수의 이름이 같을 때, 이름은 같지만 매개변수에 따라 다른 인자로 인식하고
값이 있으면 매개변수가 있는 것을, 없으면 없는것을 사용한다
	
자료형이 다르면 서로 다른 메소드로 인식
	 
지역변수
큰 지역에서 만든 변수는 작은 지역에서 사용가능. 반대는 불가능
name은 main의 변수, 그보다 작은 if의 지역에서 사용가능
n은 if의 변수, 그보다 큰 main의 지역에서 사용 불가능
test1의 지역변수를 test2에서 쓸수 없으니 test1에서는 리턴으로 내보내고 main에서 불러와 test2로 넣어준다


큰지역의 변수는 유지가 되는 반면, 작은 지역이나 서로 연결된 메소드, 인스턴스 변수는 
변수를 사용할때만 쓰고 실행문이 끝나면 사라짐
일회성 변수는 메모리에 계속 남아있으면 공간만 차지하기 때문에
여러공간에서 사용은 클래스 변수, 특정공간 사용은 지역변수

for문의 i변수 같은 경우 일회성이니까 한 메소드의 지역변수로 ok
한 메소드안에 서로 종속되지 않은 for문이 여러개 있다면 같은 이름의 변수인 i를 계속 쓸수 있다.
for문이 끝나면 그 i는 사라지게 되는것이여서

인스턴스 변수로 객체가 있어야 사용가능

스테이틱은 서로다른 위치에서 변수를 사용하고 싶으면 쓸 수 있다

인스턴스 변수는 new로 객체를 만들어주기까지 존재하지 않는것
스테이틱은 변수를 미리 만들어 둔것인데 위쪽 인스턴스 변수(아직 생성되지 않은)것을 사용하려니 에러발생


static이 없는 클래스에 존재하는 변수라 큰 지역에 있음에도 안쪽 메소드에서 쓰려면 객체 필요
자료형 앞에 스테틱붙이면 됨 public static int n;
위에서 스테이틱으로 만들고 아래서 인스턴스변수를 하면 문제가 없다. 반대상황에는 없는 변수를 불러오는것

			
스테틱으로 범위 지정 후 초기화 가능
보통 스테틱 변수이용 호출은 클래스 이름으로 한다.
final을 쓰면 변수값을 변경할 수 없다
			
여러곳에서 필요할때 불러오기위해 각자 객체를 만들어야 한다
하지만 static을 쓰면 각자 객체를 만들 필요 없이 파일 이름.변수 로 불러올 수 있다

public static String url = "c://공유폴더//접근"; {}
이후 다른 클래스에서
System.out.println(StaticTest05.url);
객체 생성 없이 출력가능
				
같은 클래스 안에서 그 변수가 필요하면 인스턴스로 만들어도 괜찮다.
하지만 다른 파일에서 그 변수가 필요하다면 static을 사용하는게 좋다

Static = 다른 많은 파일에서 필요로 하는 경우
인스턴스 = 클래스 내부의 많은 메소드에서 필요로 하는 경우
지역변수 = 메소드 안에서 일회성으로 어떠하나 연산을 할 때 사용
			 
static으로 변수 만들때 보통 대문자로만 쓴다.



 */