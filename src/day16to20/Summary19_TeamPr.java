
/*
다른 폴더에 있는 FXML파일은 URL 메소드를 통해 FXMLLoader에 넣어준다.
스테이지를 열기 위해서는.
씬 빌더에서 만든 팬을 가져오기 위해 parents 객체 생성해 FXML로더의 변수를 load해준다.
해당 팬을 사용할 수 있는 Scene의 객체를 만든다.
메소드명.setScene을 한다.
show.

값을 입력받는 메소드는 FXid만 필요하다.
선택시 상호작용을 하는 메소드는 on Action만 필요하다.
FXid랑 OnAction을 똑같이 하는건 권장하지 않음

왜 DAO의 getUser를 메소드형태 LoginDTO로 해야하는가?

// 서브페이지 불러오기
Parent sub = FXMLLoader.load(getClass().getResource("move.fxml"));
// 메인창 지정
nchorPane root = (AnchorPane)stage.getScene().getRoot();
// 서브페이지 추가(메인 레이아웃위에 서브 레이아웃을 덮어쓴다.
root.getChildren().add(sub);
출처: https://qdgbjsdnb.tistory.com/75 [하위^^:티스토리]mainOverview Pane -> getChildren() -> add("fxml 파일명")  : Pane에 fxml 넣기.

mainOverview Pane -> getChildren() -> remove("fxml 파일명") : Pane에 넣은 fxml 삭제
출처: https://rucrazia.tistory.com/15 [Rucrazia's Blog:티스토리]
			
			
			
.setRoot
.lookup() > fxml 파일에서 control을 가져오는 메소드
.executeUpdate() > 내가 .setString 한것이 잘 저장이 되었는가를 숫자로 알수 있는 메소드
저장되었을때는 1, 아닐때는 0 (sql에서 1행이 추가되었습니다. 또는 0행이 추가되었습니다(추가 안되었을때 뜨는 문구) 에 따라)
.requestFocus() > 버튼을 다시 누르게 한다.

모듈인포에 메인클래스를 임포트하지 않으면 그 클래스의 FX와 연결된 코드는 쓰지 못한다.

모든객체는 초기화가 이뤄져야 null문제가 없다
생성자로 초기화를 하든, =0, =null을 하든...잘확인하자..................

아니 너무 헷갈리자나ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ
&& and 모두가 찹일 때만 참, 하나라도 거짓이면 거짓
|| or 하나라도 참이면 참, 모두가 거짓일때만 거짓
 여기에 ! not 까지 합쳐서 만든 식이 너무 헷갈린다.
 
if(!num1.contains(num3) || !num1.contains(num4)) {
			알람문구 = "아이디는 영문과 숫자의 조합으로 7~12자리 사이로 입력해주세요2";
			ID.requestFocus();

자 num1이 num3만 있을때, num1이 num4만 있을때, num1이 num3,num4 둘 다 가지고 있을때
각자의 true, false 를 서술하시오


마지막 행 다음의 결과 집합 > 검색 내용
결과 집합 = ResultSet 다음 = next() 마지막 행 = last row 문구 = statement 정도로 예상됩니다.
질의하고 hasNext()가 false인데 next()를 호출했을 듯...

*/


