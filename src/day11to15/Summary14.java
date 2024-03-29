/*

TCP , UDP 통신

TCP
-연결형 프로토콜
-신뢰성 데이터 전송

UDP
-비 연결형 프로토콜
-비 신뢰성 데이터 전송


TCP는 서로를 기억하고 데이터가 다 안넘어오면 다시 요청하기도 함
UDP는 연결되어있지 않고 한쪽에서 데이터를 한번 넘겨주면 끝 그래서 UDP가 더 정보처리가 빠르다고 하지만
큰 차이는 없다.


네트워크 프로그래밍
-네트워크 프로그래밍 또는 socket 프로그래밍
서로 다른 pc와 데이터를 주고 받는 코드

-Socket
서로 다른 pc의 통신할 수 있게 연결해주는 것

-Ip
서로 다른 pc의 정보. 즉 특정 pc를 찾아가기 위한 번호

-Port
각 pc에서 동작하는 프로그램을 식별하기 위한 번호

-Server
서비스를 제공하는 컴퓨터

-Client
서비스를 제공받는 컴퓨터

ServerSocket server = new ServerSocket(12345);
괄호안 숫자가 포트번호, 2바이트까지 허용하며 아무 번호조함으로 만들어도 되나
낮은 번호의 숫자들을 쓰면 프로그램간 충돌이 일어날 가능성이 있어 높은 번호로 만든다

0 ~ 1023 : 잘 알려진 포트 (well-known port)
1024 ~ 49151 : 등록된 포트 (registered port)
49152 ~ 65535 : 동적 포트 (dynamic port)
(출처 위키백과)
출처: https://mine-it-record.tistory.com/15 [나만의 기록들:티스토리]

포트번호와 내 pc의 ip번호로 소켓을 만들어 낸다


ServerSocket server = new ServerSocket(12345);
서버에서 소켓번호를 만들 때 쓰는 서버소켓

Socket sock = new Socket("127.0.0.1", 12345);
클라이언트에서 서버로 연결할 때 쓰는 소켓




기본 스트림은 바이트값만 가능 숫자로 0~255까지 가능
시계형태로 기억할 수 있다. 256은 다시 0이 되고, 257은 1이 된다

네트워트 프로그래밍을 연습할 때 서버와 클라이언트 2가지의 클래스로 계속 연습을 하는데
항상 서버를 먼저 실행시켜야 제대로된 코드의 실행을 볼 수 있다.


서버는 클라이언트가 접속할때까지 계속 기다리고 있는 중...
.accept(); > 연결이 될때까지 기다리게하는 기능 클라이언트가 접속하면 연결해준다.

클라이언트가 많으면 .accept를 여러개 적어 놓을 때가 있는데
접속한 순서대로 제일 윗줄의 코드를 할당받게 된다.



네트워크 프로그래밍을 할땐 소켓을 만들어야하고 그에 따르는 ip주소와 포트번호가 필요하다.
아래와 같이 부른다.

Socket sock = new Socket("192.168.42.115", 12345);


--192.168.42.115 내 PC아이디--
내 ip를 기억해 항상 적기가 귀찮다면 아래와 같이 쓸 수 있다.

"127.0.0.1"
루프백 주소로 내 ip를 쓰겠다는 의미.

.getInetAddress(); > 현재 사용자의 정보를 가져온다

~~다자간 채팅 서버(오픈채팅) 만들기~~
파일은 클라이언트1,2 / 클라이언트 쓰레드 / 서버 / 서버 쓰레드

-Sever
클라이언트와 연동하고 serverThread로 sock을 전송하는 기능

-ServerThread
sever에서 받는 사용자를 관리하며 모든 사용자에게 데이터를 전송하는 기능

-Client
서버에 연결하고, 서버로 데이터를 전송하는 기능

-ClientThread
서버로부터 데이터를 수신하는 기능

---------------------------------------
다자간 채팅을 위해 각 클라이언트마다 입력, 출력에 쓰레드가 따로 있어야 한다.

https://kadosholy.tistory.com/125



소켓이 서로 연동이 안될때
시작창에서 고급 검색 > 고급 보안이 포함된 Windows Defender 방화벽 >
인바운드 규칙 > 새규칙 > 포트 > 로컬포트 정하기 > 

인바운드는 외부에서 내컴으로 들어오는것,
아웃바운드는 내컴에서 외부로 나가는 것










*/