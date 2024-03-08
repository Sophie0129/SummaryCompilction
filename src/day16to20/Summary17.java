
/*

씬빌더에서 기능(버튼,텍스트필드 등)을 올려놓고, 오른쪽 옵션중 코드를 선택 
fxid > 해당 기능의 고유 코드
On Action > 클릭했을ㄸ때 일어나는 이벤트

왼쪽에는 도큐멘트 하위에 컨트롤러 옵션이 있는데 
Controller Class에 패키지명.클래스명 을 입력하면 연동된다.
연동할 클래스는 메인클래스가 아닌, 활성화시 실행될 이벤트 코드를 만드는 클래스일것.

-아래는 자바에서 쓰는 코드-
@FXML public TextField tf; // 텍스트 필드 객체 만들기 < 메소드 밖에 위치
신빌더에 있던 텍스트필드의 fxid를 tf로 설정한 이후, 텍스트필드의 객체를 만드는 코드.

버튼 활성화의 경우 On Action에 btnFunc 이라고 적어놓았는데,
해당 기능을 사용하기 위해, 메소드명을 똑같이 btnFunc으로 만든다.


//onenote 2016 >> 캡쳐 붙혀놓기 편한 노트//


FXMLLoader loader = new FXMLLoader(경로);
>> fxmlloader는 주소를 url으로만 받을 수 있다. 문자열로 적어 넣는게 불가능


경로 부분에는 같은 패키지(폴더)안에 있을경우에는 "fxml파일명"만 적으면 됨.
다른 경로에 있을경우, 절대 경로를 불러오는 아래의 식과 문자열을 합쳐서 쓴다.
Paths.get("").toAbsolutePath().toString()
절대 경로 : 현재 코드를 적고 있는 메인클래스의 프로젝트까지의 경로를 보여줌

나머지 세부 경로는 문자열로 + 해주면 되는데, 위에서 말했듯이 문자열이 들어가지 않으므로,
변수에 할당해서 해당 변수를 넣는다.

경로를 url 형태로 바꾸는 메소드가 있다.
URL url = new URL("file:/"+Paths.get("").toAbsolutePath().toString()+"/bin/login/fxml/Login.fxml");

또,
file:/ 부터 절대경로의 위치는 변함이 없고, 자주 쓰기 때문에 인터페이스에 넣어 변수에 할당한다.
public String fxPath = "file:/"+Paths.get("").toAbsolutePath().toString()+"/bin/";

그러면 경로 불러오는 코드가 짧아진다.
URL url = new URL(URLService.fxPath+"login/fxml/Login.fxml");
FXMLLoader loader = new FXMLLoader(url);


Parent root = loader.load(); >> 컨트롤러 만들어지는 시점
		

신빌더에서 만든 텍스트필드의 객체는 연결한 controller 클래스에서 캑체를 만들어 준다.
@FXML public TextField fxid; 
@FXML public TextField fxpwd;
골뱅이부분 어노테이션이라고 부르고 그것을 이용해 객체를 생성한다.

그 객체를 main에서 사용할 수 있게 main에서 controller 객체를 만드는데,
Controller ctrl = loader.getController(); >> 컨트롤러 클래스에 있는 객체 불러옴
 //Controller ctrl = new Controller; //이렇게 객체생성하면 안됌 (fxml에서 연결한 그 위치의 그 파일만 연동이 되는거라서)
ctrl.setRoot(root);


스테이지 > 씬 > 루트 순서대로 화면이 올라가게 되는데, 불러오는 순서는 반대로 루트에서 씬을 부르고, 씬이 스테이지를 부르는 식이다.

-창 닫기-
스테이지 객체를 불러온 이후 stage.close();를 한다.

기존 Stage memberStage = new Stage(); 방법이 있지만, 해당 버튼을 눌렀을 때 창이 2개가 된다.

Stage memberStage = (Stage)root.getScene().getWindow(); 방법은 메소드를 만들때,
Parent를 할당한 root를 메소드에 할당시켜주어야 가능하다.
main > controller > (인터페이스)LoginService.registerFunc(root) > LoginServiceImlp 로 이동
>registerFunc(Parent root) 안의 memberMain.viewFx(root)로 이동 > viewFx(Parent root) 메소드 수행

괄호 뒤 매개변수를 넣을때, 변수.기능() 의 경우에는 매개변수명만 적고,
public void 메소드명() 일때는 자료형인 Parent 까지 같이 넣어준다.


생성자에서는 객체를 얻기전 초기화라서 생성자초기화 대신 상속받는 initializable을 사용

.setItem();  > 데이터만 새롭게 추가한다


*/