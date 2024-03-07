package day06to10;

public class Summary06_Str {

	/*
	String str;
	String str1 = new String();
	String str2 = "test";
	String str3 = new String("test init");
	
	다양한방법의 스트링 변수 만들기	
	 */
	
	// .toUpperCase() 글을 전부 대문자로 바꿔줌
	// .toLowerCase() 글을 전부 소문자로 바꿔줌
	
	//대소문자를 구분하여 같은 글도 다르게 본다. 그럴때 사용해 비교가능
	
	// 문자열도 순서대로 "test" t는 0번째, e는 1번째로 인덱스 넘버를 가진다.
	// 문자열의 인덱스를 찾는 .charAt() 괄호에 인덱스번호를 넣으면
	
	//단어 하나는 등호 == 로 비교가능. 글자가 아닌 단어 하나로 봐서(아스키코드)
	
	
/*
	String jumin = "90aa14";
	if(jumin.length() == 6) {
		int i=0;
		for( ; i<jumin.length() ; i++ ) {
			if(jumin.charAt(i) < '0' || jumin.charAt(i) > '9')
				System.out.println("숫자를 입력하세요");

		위 코드는 아스키코드로 문자열을 비교한다. 알파벳은 숫자보다 크다.
		*/
	
	//문자열은 공백의 유무로도 서로 다른 글씨로 인식함
	
	// 변수.trim() 양쪽 공백을 삭제시켜줌
	// 변수.split() 특정문자 기준으로 잘라냄
	// 변수.replace("1", "2") 변수에 할당된 1을 2로 바꾼다.
	
	/* . 기능을 사용할때에 미리보기에서 :뒤의 형태가 해당 기능을 사용하기 위한 형태인것을 알려주고,
	노란 메모지 아래쪽의 가장 오른쪽 아이콘을 클릭하면 기능을 설명해주는 창이 뜬다.
	 */
			
	//웹 제작시 대부분은 다 문자열
	
	/* Integer.parseInt() 숫자로 이뤄진 문자열을, 문자열이 아닌 숫자로 바꿔준다
	 
	 
	String s = num + "";
	System.out.println(s + 100);
	
	이후 다시 num을 문자열로 바꾸려면 + "" 를 해준다 
	그냥 String s = num 해도 바뀌지 않는다
	 
	 */
	
	
	
	
	
}
