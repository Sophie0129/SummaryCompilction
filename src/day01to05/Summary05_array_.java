package day01to05;


		/*변수명과 배열명은 다르다
	인덱스 = 첨자 라고도 부른다*/

		/*구조는 자료형[] 배열명;이나
	수업시간에는 자료형[] 배열명 = new 자료형[] 와 같이 사용했으며,
	마지막 []대괄호에 몇개의 인덱스가 생기지는지 적을 수 있다.*/
		
		/*처음 생성할때만 int[] num = new int[] {값1, 값2, ...}
		  형식이 필요한것 같다. 이후로는
		  double[] dou = {값1, 값2, ...}
		  String[] str = {"값1", "값2", ...}
		 */
		
		/* 변수[] 대괄호 안의 숫자가 인덱스 번호, 값을 할당하거나 출력폼에 넣어 출력할 수 있다.
		   변수.length 변수의 값의 갯수를 출력해줌.
		 */

		/*대괄호를 많이 붙힐수록 1차원>2차원>3차원 배열로 부를 수 있다.
	 해당 표는 갤러리에서 확인
	 배열의 순서는 0부터 시작한다. 첫번째 값을 변수명[0]으로 사용할 수 있다.*/

		/*여러개의 변수를 한번에 선언가능하다. 
	최조의 공간은 값을 주기 전까지 0이다.
	인덱스는 0번째부터 시작한다는것에 유의 */

		/*자료형 배열명 [] 으로도 쓸수 있음 이후 = new double [] 마지막 대괄호에도 숫자를 생략해도 됨.
	이후 {}중괄호를 이어 쓸 수 있는데, 안에 든 값은 초기값 0 인 배열에 값을 주는것. 
	순서대로 들어간다. {변수명[0], 변수명[1], 변수명[2], ...}*/

		/*보통 숫자를 직접넣는 하드코딩은 비추천
	for문 조건문에 숫자 대신 dos.length를 넣는것이 좋다.
	나중에 배열의 갯수가 바뀌었을 경우에 대비해*/

		/*for each문 (자료형 변수에 : 배열의 값을 하나씩 할당)
	구조는 for(자료형 변수 : 배열)의 형태
	변수에 배열의 값을 순서대로 할당하게 된다.
	for문 같이 모든값이 할당될때가지 반복해 출력하게 된다.
	
	
	ex)
		int arr[] = new int[] {1,2,3,4};
		for(int a : arr) {
			System.out.println(a);
		}
		>>> 1
			2
			3
			4
			
			*/

		/*
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println( arr ); //배열이 저장된 정보 출력
		System.out.println( Arrays.toString( arr ) );//배열이 가지고 있는 값 출력
		
		배열은 배열명으로는 값이 출력이 안되고 배열이 가진 정보를 출력한다.
		배열의 값을 출력하려면 Arrays.toString(배열명) 이라고 적어야 하고,
		상단에 Array를 사용하기 위한 구문이 있어야 한다.
		import java.util.Arrays;
		*/
