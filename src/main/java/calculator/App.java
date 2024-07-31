package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 1-1
        // 양의 정수 2개(0 포함)을 전달 받을 수 있다. 양의 정수는 각각 하나씩 전달 받는다.
        // 정수 2개를 각각 하나씩 전달 받는 거라 num1, num2의 이름을 붙였다.
        // Scanner를 샤용하여 입력 받고 적합한 타입의 변수에 저장하라 해서 sc.nerxtInt();를 썼다.
        // 정수를 전달 받을 수 있다 하여 int를 썼다.

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        // 1-2
        // 사칙연산은 하나하나 사용되기 때문에 string(문자열)보다는 char(문자)를 사용해보자.
        System.out.print("사칙연산 기호를 입력하세요: "); // 연산 기호는 +, -, *, /

        char operator = sc.next().charAt(0); //next는 string 타입을 쓰기 때문에 charAt을 붙여준다.
        // char operator = sc.nextInt().charAt(0);으로 했을 때 숫자 0 부분에서 자꾸 오류가 남.
        // char operator = sc.nextInt().charAt('0'); char는 문자에 사용되니 '' 붙여봤지만 오류가 남.
        // nextInt가 아니라 next만 써야 했다. int는 정수.

        System.out.println("operator = " + operator);

        // 1-3
        // 양의 정수 2개와 사직연산 기호를 사용하여 연산을 진행한 수 결과값을 출력하라.
        // 제어문 (e.g.if, switch)을 활용하자.
        // switch(피연산자) 문은 case(조건) 문과 함께 사용한다.
        // switch(피연산자) {case(조건): (연산)}의 형태로 많이 쓰인다.
        // case는 여러 개 설정할 수 있고, 각 case의 마지막에 break;를 꼭 넣어줘야 한다.
        // 사직연산의 기호는 operator에 넣어놨다.
        // "나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."는 if문으로 써보자.

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("분모에 0이 입력될 수 없습니다.");
                    return; // return을 쓰지 않아서 오류가 났었다.
                }
                break;
        }

        System.out.println("결과: " + result);

        // 1-4
        // 반복의 종료를 알리는 "exit" 문자열을 입력하기 전까지 무한으로 계산을 진행하자.
        // 반복문을 사용합니다. (e.g. for, while …)
        // for (초기값; 조건문; 증가연산) { (연산) } : for문의 형태
        // for(int i=0; i < 4; i++) 참고하자.
        // while(조건문) { (연산) } : while문의 형태
        // for문의 무한루프 : for(;;){}, while문의 무한루프 : while(true){}
        // 안에 if문으로 조건을 걸어 빠져나올 수 있게 만들 수 있다.

        while (true) {
            System.out.println("더 계산하시겠습니까?");
            if (sc.next().equals("exit") == true)
                break;

            num1 = sc.nextInt();
            num2 = sc.nextInt();

            // 여기서 시간이 오래 걸렸다. 무한루프 생성을 너무 복잡하게 하고 있었고, 아직 while문이 익숙하지가 않았다.

        }

        // 1-5
        // 연산 결과 10개를 저장할 수 있는 배열을 선언 및 생성하고 결과를 저장하자.
        // 배열 선언은 두 가지 방법이 있다.
        // 타입[] 변수;  ||  타입 변수[];

    }
}
