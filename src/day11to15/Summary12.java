package day11to15;

/*

람다 Lamda
인터페이스의 메소드를 또 다른 방식으로 사용하는 방법
인터페이스의 메소드는 하나만 존재해야한다


Test02 t = new Test02() {
	public void test() {
		System.out.println("test 실행");
		}}; t.test();
위의 코드와 아래의 코드가 같은 내용이다
			
Test02 t02 = () -> System.out.println("test실행222");
t02.test();
-> 이전의 메소드를 -> 이후의 내용으로 할당한다는 이야기

매개변수가 2개면 괄호에 2개를 받을 변수를 넣어줘야 한다

받을 내용이 자료형 Test04이 되면 Test04의 객체가 필요하다.

스레드 thread
-process를 구성하는 일의 단위
-모든 Process는 기본적으로 하나 이상의 Thread를 가진다.
-개발자의 의도에 따라 thread를 추가 할 수 있으며, 하나 이상의 Thread를 가지면
 Multi Thread라고 한다.
 
스레드는 무조건 run으로 오버라이딩 그리고 start로 호출해야 한다.

start를 쓰려면 반드시 메소드가 퍼블릭 보이드 런이여야 한다
start가 자식연산이 되는 이유 //Class_05.thread.Ex02참고   //https://cano721.tistory.com/161
start로 호출 > 부모에게 감 > run을 호출하기위해 상속받은곳으로 이동 > 오버라이딩으로 자식으로 이동> 자식 출력
Ex02 참고


run() 을 사용하면 run을 호출한 쓰레드에서 작업이 처리되고 
start()를 사용하면 쓰레드를 새로 만들어서 처리된다. 
병렬 처리를 하고 싶다면 start()를 사용해야 한다
출처: https://selfish-developer.com/entry/Java-Thread-start-run [아는 개발자:티스토리]

공유자료로는 스레드를 쓰지 않는다


a.setDaemon(true);//다른 메소드를 같이 종료 시키고 싶은때
main의 실행이 멈출땐 다른 메소드도 멈춰야 한다.
 
ArrayList<Srting> arr = new ArrayList<>();
원래 스트링 자리에는 클래스명이 들어간다 주로 DTO

리턴은 메소드를 종료시킨다
 
데이터에 직접적으로 접근하는 메소드 = DAO

변수를 지속적으로 남겨두기 위해 static으로 만든다. 공용소스가되어 여러곳에서 쓸 수 있다
그냥 객체만들기가 아니라 static으로 초기화객체만들기를 하면 내용추가같은 기능코드를 추가할 수 있다.

리스트 자체에 DTO객체를 n번째 인덱스로 덩어리채 넣는것
그래서 DTO의 name="무엇", addr="어디" 2개의 객체가 통채로 한 인덱스로 들어간다
저 2개 객체 자체가 하나의 인덱스 꺼낼때도 DTO로써 꺼내니까 "무엇"은 name이고, "어디"는 addr인것을 알 수 있다

/*
 new 연산은 새로운 저장공간을 만들어주는것.
		  
		AB t = new AB();
		for(;i<3;) {
			t.setName(i+".홍길동");
			arr.add(t);
			i++;
		}
		if(Test tt : arr)
		System.out.println(tt.getName);
		
		일때 t는 한번만 new가 된것으로 t의 공간은 하나이다.
		거기서 반복문으로 다른 숫자를 계속 넣어봤자 결국 한 공간에 계속 덮어씌워져 마지막 숫자만 남게 되고,
		사실상 arr에는 마지막 입력된 t 즉 2.홍길동만 남게된다
		그 상태에서 if each로 각 값을 할당한다 해도 arr에 참조된 t의 공간은 1개, 
		내용은 덮어씌워져 하나만 남은 마지막 내용이라서 
		결과는 똑같은 답 3개만 나오는것.
		
		해결법은 new연산을 반복문 안에 같이 넣어 한사이클을 돌때마다 새로운 공간을 계속 만들어 주는것
		그러면 마지막 출력문에서도 arr에 참조된 t의 공간은 3개, 각기 다른 3개의 값이 나온다.
		
*/

