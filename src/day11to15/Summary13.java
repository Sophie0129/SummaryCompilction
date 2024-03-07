package day11to15;
/*

롬복 Lombok
자바에서 Getter, Setter, toString과같은 반복 메소드 작성을 줄여주기 위한 라이브러리
DTO의 기능을 편하게 만들어준다 
lombok 검색해서 lombok project에서 다운받을 수 있다
롬북파일은 이클립스exe랑 같은 폴더에 위치
>이클립스 ini파일을 메모장으로 열기>맨밑에 두줄 추가하기> -vmargs -javaagent:lombok.jar

이후 module-info파일에 requires static lombok; 을 추가하고,
사용할 프로젝트 우클릭>빌드패스>라이브러리>모듈패스>add external>롬북선택>추가하고 닫기

이후 셋터,겟터,투스트링 같은걸 @불러올 수 있다.
@set하고 자동완성. 셋터,겟터 따로따로 만들어줘야함.


@Setter
@Getter
@ToString // 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
@NoArgsConstructor // 아무것도 받지 않은 DTO를 생성
@AllArgsConstructor // 모든 값을 받는 생성자를 만든다

@Data // 데이터를 만들면 위에 만든것들의 기능을 다 하지만
@AllArgsConstructor // 올아규먼트는 없어서 직접 넣어줘야함
@NoArgsConstructor // 그리고 올아규먼트는 노아규먼트도 같이 넣어줘야한다


자바에서는 입출력을 다루기 위한 InputStream과 OutputStream이 있다.
스트림은 단방향으로만 데이터를 전송할 수 있기 때문에, 입력과 출력을 동시에 처리하기 위해서는 각각의 스트림이 필요하다.
출처: https://ittrue.tistory.com/167 [IT is True:티스토리]




File I/O (Input/Output)
-파일에 특정 테이터를 저장하고 불러오는 것
-영구적으로 데이터를 사용할 수 있다

File path = new File("D:\\0_김보선_핀테크\\Java\\test\\test.txt");
FileOutputStream fos = new FileOutputStream(path);

위 형태로 어떤 경로로 스트림(이통통로)를 만들고 어떤파일을 만들지 적고, 새 객체를 만든다
경로표현시 역슬래쉬를 이스케이프문자로 쓰지만, 슬래쉬 하나로도 표현할 수 있다

.write(); > 해당파일에 괄호안 값을 넣는다. 출력하는 개념
.getBytes() > 파일안의 내용을 가져오는 함수

**파일인풋/아웃풋스트림을 하면 관련된 오류가 항상 떠서 메소드명 옆에 Throws Exception을 항상 적어준다.

.mkdir(); > 경로에 폴더를 생성한다
.delete(); > 파일을 삭제한다
.list() > 폴더 안 파일들을 나열해준다
		이 함수를 출력폼에 넣으면 데이터 위치를 알려주기 때문에 if each문으로 출력하면
		정확한 파일명들을 죽 알려준다.
.length > 폴더 안 파일이 몇개 있는지 알려준다
.exists(); > 파일에 값이 존재하는지 확인한다(True, False)

저장후에 같은 폼으로 또 다른 내용을 출력시키면 내용의 덮어씌워짐
생성시 파일이 없으면 만들지만 파일이 있을경우 기존내용을 파괴, 새 내용을 넣는다

FileOutputStream fos = new FileOutputStream(path, true);
.append(어펜드) 기능과 비슷. 뒤에 true붙히면 내용을 바꿔도 기존내용 유지하면서 이어붙혀준다


sc.next();//next는 공백을 기준으로 (스페이스바,엔터) 모두 구분자로 본다
sc.nextLine();//공백도 받을 수 있지만 엔터를 구분자로 봄


.close(); >> 스트림을 닫아버리면 더이상 값을 주고받을 수 없지만 사용이 끝난뒤에는 닫아주어야 메모리를 효율적으로 쓴다.
			이후 write를 써도 값을 넣을 수 없다. close이후 값을 넣으려면 new를 이용해 다시 객체를 만들어주어야 한다.
.read(); >> 입력 스트림에서 데이터 바이트를 읽는다. 데이터의 다음 바이트를 반환하고, 파일 끝에 도달하면 -1을 반환
			파일을 한글자씩 읽어올 땐 read() 메소드로 정수를 리턴받아 char 형 변환을 해주는 작업이 필요합니다.
 
읽었던 파일을 다시 읽을 땐 객체를 다시 한번 생성해 주어야 합니다.
 
그 이유는 자바에서 파일을 열어 읽게 되면 파일 포인터가 읽은 만큼 이동하게 되는데
만약 파일을 모두 읽은 상태에서 다시 한번 파일을 읽게 되면 포인터가 0으로 고정이 되어 반복문이 무한하게 돌게 됩니다.
출처: https://lasbe.tistory.com/65 [LasBe's Upgrade:티스토리]

FileInputStream fis = new FileInputStream(path);
		int re = fis.read();//내용 읽기
		System.out.println((char)re);
		while(true) {
			re = fis.read();
			if(re <0) {
				System.out.println("내용 없음 : "+re);
				break;
			}
			System.out.println((char)re);
		}
		fis.close();
		
		



보조스트림
-기본 스트림을 바탕으로 보조해주는 역할의 스트림이다.
-보조 스트림은 기본스트림을 바탕으로 만들어진다.

bufferedOutputStream
-자바에서 실행되는 값을 Buffered에 저장 후 한번에 file로 전송 및 수신하는 역할
-flush() - buffer에 저장되어 있는값을 파일로 전송
-Close() - buffer에 저장되어 있는 내용을 파일로 전송하고 스트림을 닫는다


String path = "D:/0_김보선_핀테크/Java/test/test.txt";
FileOutputStream fos = new FileOutputStream(path);
BufferedOutputStream bos = new BufferedOutputStream(fos); //보조스트림
	for(char ch = '0'; ch<='9' ; ch++) {
		Thread.sleep(1);
		fos.write(ch); // 하나가 나올때마다 파일에 접근한다. 처리속도가 느리다
		bos.write(ch); //나온값을 쌓아놓고 전송을 기다림

위와 같은 반복문에서 File은 값이 나오면 바로 파일을 입력하고, 다음 사이클을 돌고 답이 나오면 또 파일을 입력하고.. 하는 방식이다.
처리속도가 느리다고 할 수 있다.
반면 보조 스트림인 buffered는 값을 버퍼에 저장해놓고 특정 메소드를 만나거나, 버퍼가 꽉 찼을때만 값을 반환한다.

.flush(); > 버퍼를 수동으로 비우는 메소드.

buffered는 .close()를 만나도 그동안 쌓아둔 값을 반환한 이후에 스트림이 닫힌다.




DataInputStream
-기본 스트림을 이용하여 보조스트림을 만들어 사용한다.
-기본 스트림보다 많은 기능들을 제공해 준다.

입력된 값을 바이트로 변환해서 저장하는 File.
입력된 값을 버퍼에 저장해두는 Buffered.

Data는 바이트 스트림으로부터 자바의 기본 자료형 데이터를 입력하는 기능이다.
이진 데이터(0,1)을 입출력할때 쓴다는 내용도 있음

그래서 Data는 메모장으로 읽을 수 없다.//외계문자로 써있음

자바에서 제공하는 boolean, byte, char, short, int, long, float, double
등과 같은 자료의 기본형을 직접 읽고 쓸 수 있도록 해준다

부모로는 Fillter인/아웃풋스트림 이 있고, 그위로 인풋, 그위로 오브젝트..가 있다고함 

.writeUTF(); > 한글 입력 메소드
.writeInt(); > 정수 입력
.writeDouble(); > 실수 입력


보조스트림은 다양하게 많고 작업하는 코드의 내용에 따라 필요한걸로 쓰게 된다

String path = "D:/0_김보선_핀테크/Java/test/test.txt";
FileOutputStream fos = new FileOutputStream(path);
BufferedOutputStream bos = new BufferedOutputStream(fos);
DataOutputStream dos = new DataOutputStream(bos);
dos.writeUTF("안녕하세요");
dos.writeInt(100);
dos.writeDouble(1.111);
		
dos.close();bos.close();fos.close(); //클로즈는 역순으로
		
FileInputStream fis = new FileInputStream(path);
BufferedInputStream bis = new BufferedInputStream(fis);
DataInputStream dis = new DataInputStream(bis); // 값을 가져올때도 넣은 순서대로

String msg = dis.readUTF();
int num = dis.readInt();
double dou = dis.readDouble();
System.out.println(msg);
System.out.println(num);
System.out.println(dou);

내가 열어놓은 스트림 1,2,3 이 있다면 클로즈는 3,2,1 로.. 역순으로 클로즈를 한다
값을 가져오려면 내가 열어놓은 1,2,3 순서대로 차근차근 1에서 2로, 2에서 3으로, 3에서 변수로 값을 할당하여 출력해야한다.

		


직열화
-객체를 파일에 저장할 수 없기 때문에 직열화를 통해 직열화를 통해 객체를 저장해야 한다

-객체를 특정 위치에 바이트형식으로 변환하여 저장하는 것
-Implements Serializable 상속을 받으면 자동으로 직렬화를 해준다


역직렬화
-특정 위치에 저장되어 있는 byte형식의 데이터를 자바의 객체로 변환해주는 것


직렬화 과정에서는 writeObject가 역직렬화 과정에서는 readObject 메서드를 쓴다.

ObjectIn/OutputStream으로 직렬화를 한다.
객체를 통채로 입출력하는 역할

- ObjectOutputStream 과 ObejctInputStream은 각각 객체를 직렬화, 역직렬화하는 메소드를 제공하는 스트림이다. 
- 객체 스트림은 프로그램 메모리상에 존재하는 객체를 직접 입출력해 줄 수 있는 스트림으로 현재 상태를 보존하기 위한 영속성을 지원할 수 있다.
- 자바에서 객체 안에 저장되어 있는 내용을 파일로 저장하거나 네트워크를 통하여 다른 곳으로 전송하려면 객체를 바이트 형태로 일일이 분해해야 한다. 
  이를 위하여 객체를 직접 입출력 할 수 있도록 해주는 객체 스트림이다.
즉 ObejctStream을 사용하기 위해서 객체가 직렬화(Serialization) 가 되어 있어야 한다는 것이다.
출처: https://zeroco.tistory.com/17 [zeroco:티스토리]


@Data
public class Ex08DTO implements Serializable{ 
	private String name, addr;
	
일때

String path = "D:/0_김보선_핀테크/Java/test/test.txt";
	FileInputStream fis = new FileInputStream(path);
	BufferedInputStream bis = new BufferedInputStream(fis);
	ObjectInputStream ois = new ObjectInputStream(bis);
		
	Ex08DTO dto = (Ex08DTO)ois.readObject();//역직렬화
	// .readObject가 dto 값이기 때문에 new로 새 객체를 만들 필요가 없다
		
	System.out.println("name : "+dto.getName());
	System.out.println("addr : "+dto.getAddr());
	
역직렬화를 위해 객체를 만들 때, 내가 Ex08DTO를 직렬화 한것이기 때문에 
역직렬화를 하는 ois.readObject가 Ex08TDO 그 차체인것, 그래서 new로 만들 필요없이 
Ex08DTO dto = (Ex08DTO)ois.readObject();
이렇게 부를 수 있다.









*/