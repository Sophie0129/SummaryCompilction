package day01to05;

public class Summary02 {

}

//문장끝에 ;세미콜론은 필수!!

/*첫 변수생성에는 자료형을 넣어주어야 한다. 반복사용시에는 변수명만 적어도 ok

자료형
정수 자료형 - short, int, long 각각 바이트 수 는 2, 4, 8
실수 자료형 - float, double 각각 바이트 수 는 4, 8
문자 자료형 - byte, char(캐릭터) 각각 바이트 수 는 1, 2
논리형 - boolean(불린) 바이트 수 는 1

String 자료형은 문자열을 쓸때 사용, 첫s를 대문자로 써야한다.*/

/*''작은따옴표는 문자 하나를 쓸때 사용한다. 그 이상 쓰면 오류가 난다.
char(캐릭터)에는 오직 작은따옴표와 문자하나만 허용. 큰따옴표나 2개이상 문자는 오류발생
그렇게 한 문자만 쓰면 아스키코드와 맞는 숫자로 변환되어 다음코드에 이용된다.

값이 없는 변수는 더미값(쓰레기값) 이라고 부른다.*/

/*형변환의 종류로는 자동 형변환과 강제 형변환이 있다.
자동 형변환은 코드를 수행하며 자동적으로 형이 변환되는것을 말하며,
강제 형변환은 변수에 값을 할당할때, 값의 앞부분에 ()괄호를 통해 자료형을 넣어주는 것이다.
ex) char ch02 = (char)num;*/

/*오류메세지의 Type은 자료형을 뜻한다

int가 다시 char로 바뀌지 않는 이유는 int는 4바이트, char는 2바이트이기 때문.
()괄호를 사용해 강제 형변환은 할 수 있다*/

/*일반적인 실수값은 8바이트. float 자료형은 4바이트 자료형이기 때문에 강제 형변환이 필요하다
괄호를 이용해도 되고, 실수값 뒤에 f 를 붙여도 강제 형변환이 된다 ex) float a = 1.11f;
특히 float는 실수값에 사용하고 싶으면 항상 값의 뒤에 f를 붙여주어야 하므로,
double을 사용하는것이 더 편리하다.*/

/*문장 끝에는 반드시 ; 붙혀야 오류가 안난다.
문자열은 ""큰 따옴표 안에 넣어야 문자열로 출력이 될 뿐더러 오류가 안난다.*/

/*변수 = 값에 대한 변경이 언제든 가능
상수 = 값에 대한 변경이 불가능
상수화가 필요한 변수는 앞에 final 을 쓴다. 순서로 보자면 final 자료형 변수명 이다.
상수값은 대문자로만 쓰는 규칙이 있다*/

/*복사를 원하는 줄을 클릭하고 Ctrl+Alt를 누르고,
원하는 방향으로의 방향키를 누르면 그 줄이 그대로 복사가 된다.

이동을 원하는 줄에서  Alt누르고 방향키로 움직이면 줄 이동이 가능하다.*/

/*사용자 입력을 받기위해서는 일정한 코드가 필요한데,
시작 단어인 Scanner는 그 기능을 사용하려면 자동완성으로 완성해야한다.
그러면 위쪽에 import java.util.Scanner;라는 코드가 자동생성되고,
그것 또한 사용자 입력을 받기 위한 코드로, 특정기능을 가져오는 역할이다.
이 일정한 코드도 하나의 자료형이다. 

스캐너코드는 아래와 같다
Scanner 변수명 = new Scanner(System.in);

위의 new도 명령어인데, 객체를 만들때 사용된다.*/

/*사용자 입력을 받기 위한 코드
1. Scanner 코드를 만든다.(import 코드가 뜨도록)
2. 변수를 만든다.
3. 사용자 입력 질문을 출력한다.
4. 해당변수에 next코드를 할당한다.

4번의 코드는
변수명 = 스캐너코드변수명.next()의 형태이며,
.next()는 문자열을 입력받을 때 사용하고,
.nextInt()는 정수 값, .nextDouble()은 실수 값 등 다양하다.*/

/*연산을 하기 위해서는 변수를 초기화(initialized)해야한다.
첫문자가 대문자인 아이들은 null(널)로 초기화
첫문자가 소문자인 아이들은 0으로 초기화*/

/*정수 값 이더라도 강제 형변환으로 실수값으로 만들 수 있다. ex) 5 를 5.0 으로
그로인해 연산답도 실수값으로 나오게 된다. ex) 5/2=2 였던게 5.0/2=2.5 가 된다.*/

/*산술 연산자
+ 문자는 더하기
- 문자는 빼기
* 문자는 곱하기
/ 문자는 나눈값의 몫을 출력하고,
% 문자는 나눈값의 나머지를 출력한다.

%연산자 사용
-짝,홀수 구분
 10 % 2 = > 0 이므로 짝수
 15 % 2 = > 1 이므로 홀수

-배수 구분
 123 % 3 => 0 이므로 3의 배수*/

/*
대입 연산자
오른쪽의 결과값을 왼쪽의 변수에 대입
= - a=b = a에 b를 대입

복합대입 연산자
대입연산자를 다른 연산자와 결합하여 사용
+= - a+=b = a와 b를 더하고 그 값을 a에 다시 할당한다.
-= - a-=b = a에서 b를 빼고 그 값을 a에 다시 할당한다.
*= - a*=b = a와 b를 곱하고 그 값을 a에 다시 할당한다.
/= - a/=b = a와 b를 나누고 그 값을 a에 다시 할당한다.
%= - a+=b = a와 b를 나누고 그 나머지값을 a에 다시 할당한다.*/

/*식을 연속해서 계속 길게 써서 같은 변수를 여러번 사용할 경우,
  위에서 계산한 값이 계속 갱신되어 변수에 저장이 되므로,
  다음 계산식에 사용되는 변수는 맨위에 설정한 기존 값이 아니게 된다.*/

/*관계 연산자
두개의 피연산자 간의 대소관계를 비교하기 위하여 사용
true는 (참), false는 (거짓)
< - a<b = a가 b보다 작다
> - a>b = a가 b보다 크다
<= - a<=b = a가 b보다 작거나 같다
>= - a>=b = a가 b보다 크거나 같다
== - a==b = a와 b가 같다
!= - a!=b = a와 b가 같지 않다

관계연산자(>, <=, ==, !=)에서 비교하는 값은 양쪽에 각 1개씩 2개만 비교할 수 있다.*/

/*a=b 라는 식의 뜻은 a와 b가 같다.가 아니라 b의 값을 a에 대입하겠다.이다
boolean 에는 숫자,문자 등은 넣을 수 없고 true, false 만 쓸 수 있다.*/

/*논리 연산자
참과 거짓을 판별하는 연산
|| - a>b || a<c = a가 b보다 크거나 a가 c보다 작으면 참
&& - a>b && a<c = a가 b보다 크고 a가 c보다 작으면 참
! - !(a>b) = a가 b보다 크면 거짓

논리연산자 ||(or) 하나라도 참이면 참(모두가 거짓일때만 거짓)
&&(and) 하나라도 거짓이면 거짓(모두가 참일때만 참)
!() 괄호안의 답의 반대(반전)의 값이 출력*/ 

/*증감 연산자
피연산자를 1씩 증가 혹은 감소하는 기능
++ - ++a = 값을 1만큼 증가 후 연산
++ - a++ = 연산 후 값을 1만큼 증가
-- - --a = 값을 1만큼 감소 후 연산
-- - a-- = 연산 후 값을 1만큼 감소

-전치와 후치에 따른 연산자 비교-
 전치(전위) : a변수에 1을 더한 이후에 연산식을 수행	
 후치(후위) : 기존 a변수로 연산식을 다 수행한 이후 1을 더함  
연산식은 = 도 포함하며, 더이상 수행할 코드가 없는 때가 후치가 수행되는 때이다.

뒤에 증감연산자가 붙으면 다른 모든 연산자를 다 끝낸 뒤에 자기자신에게 +1을 한다.
다만 다른 연산자와 같이 쓰는 경우는 별로 없고 단독적으로 많이 쓰인다.*/

/*삼항 연산자(조건연산자)
변수를 하나 만든 뒤
그 변수에 (연산식)?"참인경우":"거짓인경우" 의 식을 할당한다.
참이면 ?뒤의 문자가 출력되고, 거짓이면 :뒤의 문자가 출력된다.
"참인경우" 또는 "거짓인경우"에 들어가는 식은 변수+"문자열"+숫자.. 등등 다양하게 써도 괜찮다.*/

/*사용자 입력을 한개의 질문에 여러개의 입력을 받고싶을땐 
질문 한개에 next코드를 여러개 이어붙이면 된다.*/

/*사칙연산을 위해 변수는 초기화(initialized)를 해줘야 한다.
초기화된 변수값을 입력받은 후에 다시 변수끼리 연산을 할 때에,
그 연산을 하는 변수의 코드는 사용자입력코드 아래에 위치해야한다.
사용자입력코드 위에 재연산코드를 위치할 경우 초기화값 때문에 변수가 0으로 계산된다.*/

/*자바에도 소수점 자리 지정이 가능한 코드가 있지만, 잘 쓰지 않는다.
자바는 연산에는 무거운 프로그램이라 연산이 필요하면 다른 프로그램을 쓴다*/
