package day06to10;

public class Summary07_am {

	/*Set, 인덱스 사용불가, 중복 허용 안함, 처리속도 빠름
	 순서를 유지하지 않는 데이터의 집합(입력한 순서대로 저장되는게 아님)
	 데이터의 중복을 허용하지 않는다(중복된 값을 입력하면 한개만 저장)
	 HashSet = 배열의 크기를 16개로 잡고, 75%가 차면 추가 16개의 자리가 생김
	 
	 Set은 인터페이스 이므로 구현체인 HashSet을 통해 객체를 생성한다.
	 
	*/
	
	//set에는 순서가 없어 get을 쓸수 없다
	
	/* Iterator : 반복자(배열 형식의 데이터로 만든다)
	 - hasNext : 다음 위치에 값이 있으면 true, 없으면 False 
	 - next : 다음 위치로 이동 후 값을 얻어옴
	 bof : 데이터의 시작을 의미
	 eof : 데이터의 끝을 의미
	 it => [bof, 일, 이, 삼, eof]
	 
	 bof는 일종의 자리같은걸로, 처음 it이 존재하는곳.
	 next는 it이 다음 값으로 이동후 그 값을 도출하게 만듬.
	 hasNext는 다음 자리에 값이 있는지 없는지를 확인
	*/
	
	/*Map,
	 키(key)와 값(value)의 쌍(pair)으로 이루어진 데이터 집합
	 순서는 유지되지 않는다.
	 키는 중복을 허용하지 않고, 값은 중복을 허용한다. 
	 */
	
	//리스트, 셋의 .add가 맵에서는 .put 이라고 쓰인다
	
	/* 해쉬맵을 생성할때에 <문자열, 정수>로 키와 값을 만들겠다고 설정했으니,
	그 형식으로 키와 값을 넣어야 함. 안그럼 에러가 난다 */
	
	
	
	
	
	
}