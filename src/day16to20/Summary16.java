/*
 Java FX
 
-프로젝트 > 속성 > 빌드패스 > 라이브러리 > 모듈인포 > 외부입력 > javafx-sdk-21.0.2 > lib 안 파일 전부 넣기
-프로젝트 > 컨피그 > 모듈인포 생성 > 클래스명에서 umimplement method(오버라이딩) > 오버라이딩 된 메소드에 코드 적기

-라이브러리 자체를 만들기
윈도우>프리퍼런스 > java 검색 > 빌드패스-유저라이브러리 > 라이브러리 만들고 javafx-sdk-21.0.2 > lib 안 파일 전부 넣기 >
이후 첫번째 방법대로 가서 외부입력대신 '라이브러리 추가' > 유저라이브러리 > 내가 만든 라이브러리 넣기

메소드명에서 extends Application 으로 상속시키고, 메소드명에 빨간밑줄로 오류뜨는것을 마우스를 올려 unimplemented methods로 오버라이딩을 해준다.
이후 main 메소드르 만들고 그 안에 launch(args); 를 넣어 사용을 할 수 있게 해준다

클래스를 만들때 main을 선택해서 만들면 위의 준비과정이 완료된 클래스를 만들어 준다.

코드를 적을 오버라이딩 된 메소드와, 메인메소드 2개에서 launch는 메인 메소드에 들어감.
역할은 start를 실행할 수 있게 해주고, 오버라이딩된 메소드에서 출력하기 위해 메소드명.show를 쓴다.

.show로 보이는 창을 Stage라고 부른다.
그 위에 Scene을 놓고 버튼이나 라벨등을 놓을 수 있다.
하나의 Scene에는 한개의 요소만 넣을 수 있기 때문에 layout을 사용하여 여러개를 넣는다.
Pane 위에 여러개의 요소를 넣고, 한번에 Scene에 넣는 방법으로도 활요할 수 있다.

-연동한 메소드는 항상 throws Exception이 필요하다.


Lable 
글자 크기, 색깔등을 지정할 수 있으며, 객체를 만들어 사용한다.
모듈 인포에 넣어줘야 사용할 수 있다.
.setFont(new Font(30)); > 폰트 크기 30
.setText("안녕하세요"); > 텍스트 입력


Scene scane = new Scene(라벨변수, 200, 300);
씬을 만들면서 가로, 세로 크기를 정해준다. 두번째,세번째 자리 숫자


AnchorPane > 사용자가 지정하는 대로 배치
BorderPane > 중앙,위,아래,왼쪽,오른쪽 배치
FlowPane > 행 또는 열로 배치(순서대로 위치가 지정됨)
GridPane > 그리드로 배치, 고정정이지 않음
StackPane > 여러 개를 겹쳐서 배치
TilePane > 그리드 배치되면 고정 크기
Hbox > 기본 수평 배치
Vbox > 기본 수직 배치

arg0.setScene(scane); > 씬을 배치한다.
arg0.setTitle("제목을 설정합니다"); > 제목설정


Label lb = new Label("라벨입니다"); > 라벨 객체 만들면서 내용입력
Button btn01 = new Button("버튼 01"); > 버튼 객체 만들면서 내용입력
Button btn02 = new Button();
btn02.setText("버튼 02"); > 객체 만들기와 내용입력을 따로 하는 방법

FlowPane fp = new FlowPane(Orientation.VERTICAL);  > 플로우팬으로 만들면서 세로배치하기
fp.setColumnHalignment(HPos.RIGHT);  > 오른쪽 정렬
fp.setAlignment(Pos.CENTER);
fp.setPadding(new Insets(10,10,10,30));  > 위, 오른쪽, 아래, 왼쪽 순으로 내용을 안으로 밀어내 가장자리에 여백을 만든다.
fp.setVgap(10); > 행간 만들기
fp.setHgap(20); > 자간 만들기

flowPane.getChildren().add(배치할 요소의 변수);  > 레이아웃에 요소를 배치하는 메소드. add를 addAll로 쓸 수 도 있다.

GridPane gp = new GridPane();
gp.setRowIndex(btn, 0);  > 세로에서 0번째 위치에 배치

setRowIndex가 static이여서 왜 클래스가 아니고 변수로 사용하냐는 의미의 오류가 뜨는데 그냥 진행해도 무관
아래와 같이 직접 불러서 메소드를 쓰면 오류밑줄이 없기는 함

GridPane.setColumnIndex(위치할 요소의 변수, 0); >가로 0번째 배치

GridPane.setConstraints(위치할 요소의 변수, 0, 2);//가로 세로 위치를 n번째 형식으로 입력해 요소의 위치 지정
GridPane.setConstraints(위치할 요소의 변수, 1, 1);//가로 세로
		
TextArea ta = new TextArea();  > 아래와 다른 메소드지만 기능은 비슷함
TextField tf = new TextField();


gp = 그리드팬 변수
gp.add(new Button("B1, B0"), 1, 0); > 괄호안의 내용을 가진 버튼이 가로 1번째, 세로 0번째에 위치한다.
gp.add(new Label("L0, L1"), 0, 1); > 괄호안의 내용을 가진 라벨이 가로 0번째, 세로 1번째에 위치한다.
		
gp.setHgap(50); > 세로 배치
gp.setVgap(50); > 가로 배치
		
		
메소드명.setScene(new Scene(gp, 300,300));

플로우팬.setStyle("-fx-background-color:black;"); > 색깔 지정하기. :콜론 뒤의 색을 바꿔주는것 외에 폼이 고정되어 있음
그리드팬.add(플로우팬, 0, 2,2,1);  > 가로, 세로, 가로병합, 세로병합

여러 요소를 쓸때 팬 안에 팬을 넣어서 한번에 씬에 넣기도 가능.

보더팬.setTop(요소의 변수);

bp = 보더팬 변수
bp.setCenter(new Button("center 버튼"));
bp.setBottom(new Button("아래 버튼"));
bp.setLeft(new Button("왼쪽 버튼"));
bp.setRight(new Button("오른쪽 버튼"));


hbox.setPrefSize(10, 50);  > 가로 세로(기본 border가 맞춰진다)
	arg0.setResizable(false);  > 사이즈를 고정시킨다.
	
	
	
	
Scene Builder 연동
	

System.out.println(getClass().getResource("testfx.fxml"));  > 파일 위치를 알려줌
FXMLLoader loader = new FXMLLoader(getClass().getResource("testfx.fxml"));  > loader가 fxml 경로를 할당받음
		
AnchorPane root = loader.load();  > fxml에서 앵커팬을 만들었기 때문에 앵커팬으로 받아옴
모든 pane의 부모로 Parent가 있다. (굳이 형태를 맞출필요 없이 부모로 불로 올 수 있다.)	



윈도우 > 프리퍼런스 > javafx > 신빌더exe 위치 가서 경로 잡아주기 > 실행 
-프로젝트 파일에 위에서 한 FX라이브러리먼저 넣어줘야 아래 fxml파일을 만들 수 있다.
클래스 만들기에서 fxml누르고 실행.> 생긴 fxml파일 우클릭 > 오픈 with scene builder

fxml파일을 자바안에 못만들었다면 웹사이트에서 그냥 실행하고, 자바프로젝트안에 파일로 저장하기.그 이후는 동일

신빌더에서 만들고 저장한 이후, 이클립스 내의 fxml 파일을 꼭 클릭해주어야 한다, 그래야 만든게 코드로 들어온다.

코드를 오류없이 만들고 실행하기 위해서는 똑같이 프로젝트>컨피그>모듈인포 생성이 필요한데.
버튼과 라벨을 담당하는 !! requires javafx.controls; !! 부분은 자동으로 생성이 안되서 직접 적어줘야 한다,

체크박스는 여러개 선택할때
라디오박스는 한개만 선택할땐


System.out.println(getClass().getResource("testfx.fxml")); > 파일 위치를 알려줌
FXMLLoader loader = new FXMLLoader(getClass().getResource("testfx.fxml")); > loader가 fxml 경로를 할당받음
		
AnchorPane root = loader.load(); > fxml에서 앵커팬을 만들었기 때문에 앵커팬으로 받아옴
모든 pane의 부모로 Parent가 있다. (굳이 형태를 맞출필요 없이 부모로 불로 올 수 있다.)	

Parent root = loader.load();




*/

