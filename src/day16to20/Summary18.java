/*
 파일을 넣었는데 안들어온다면 새로고침 해보기 
  
 
 
 

인터페이스에는 추상화가 들어와야함. 일반 메소드는 못들어옴. static으로 들어올수 있다
commonService 클래스에는 많이 공통되는 내용을 따로 모아놓아 편리하게 쓸 수 있다.

컨트롤러는 연결만을 위한 틀래스로 사용하는걸 권장

if문 뒤에 ;세미콜론으로 종료시켜버리면 if문이 무조건 실행된다.

시작 if문의 조건문을...잘 보자........
시작에서 애초에 값이 있을때에 비밀번호를 확인하러 들어가는데,
자바 dto는 실행 될때마다 계속 초기화 되는 상태이고, 값이 없다는건 등록된 아이디가 없다는것.
근데..?sql에 값이 있는건 어떻게 알지...?
위에 dao.getUser를 불러 실행하는데 그 안에 sql값을 불러오는 식이 있다.

실행시켰을때 스테이지가 뜨고, 버튼같은 상호작용시 다른 창이 뜰때가 있는데,
이걸 한개로 고정시키는 스테이지 부르는 방법이 따로 있다.
 Stage memberStage = new Stage();  > 버튼을 누르면 창이 1개 추가되어서 생성
 Stage memberStage = (Stage)root.getScene().getWindow();  > 창을 1개로 고정하고, 상호작용시 씬이 바뀜

1:음악, 2:영화, 4:멍 >>음악과 영화가 선택되면 합이 3으로 무엇을 선택했는지 알수 있다. 
셋을 어느것과 합쳐도 그 값이 기본값인 것이 없기 때문에. 중복이 없는 숫자배열 1,2,4

라디오박스가 옵션이 2개일 경우 한개를 선택해 그것을 선택하면 true, 아니면 false로 판단할 수 있다.

sql에서 삭제, 추가 같은 데이터수정을 할 경우에는 커밋을 안해주면 자바에서 데이터 저장시 무한로딩걸림

초기화는 필요한 때에 해도 괜찮다. 꼭 바로바로 해줄 필요는 없다.

()->{}
해당하는 기능의 메소드가 하나일때, 메소드명, 자료형, 오버라이딩 같은것을 생략하고 요소들의 변수만 적어주는것

경로를 잡아주는 코드를 아래와 같이 썼는데
Image img = new Image("file:/"+path+"/"+imageArr.get(index));

항상 반복되는 file:/부분을 자동으로 써주는 식도 있다.
File file = new File(path+"/"+imageArr.get(index));
System.out.println(file.toURI().toString());

--아래의 기능들은 image.Controller 파일 참고--
setImageView((int)c); >> 리스트 누르자마자 이미지 뜨게함

int index = listView.getSelectionModel().getSelectedIndex();  > 목록의 인덱스값을 불러옴
System.out.println(imageArr.get(index));  > 그 인덱스 값의 이미지를 불러옴
System.out.println(path);  > 그 이미지의 경로를 불러옴


--다음은 media.Controller 파일 참고--
path += path+"/"+mediaList.get((int)newValue); >> 패스의 값이 계속 누적되어 오류가 난다
-이거때문에 오류가 계속 났었음

Media media = new Media(file.toURI().toString()); > 미디어(영상)를 불러오는 역할

미디어재생,일시정지,정지,볼륨조절,타임라인만들기,전체시간과 진행된시간 표시등 다양한 기능이
메소드로써 존재한다.media.Controller 파일 참고
사용할 수 없는 순간에는 버튼을 비활성화 시키는 것도 있음
















*/