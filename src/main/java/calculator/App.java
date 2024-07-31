package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 양의 정수 2개(0 포함)을 전달 받을 수 있다. 양의 정수는 각각 하나씩 전달 받는다.
        // 정수 2개를 각각 하나씩 전달 받는 거라 num1, num2의 이름을 붙였다.
        // Scanner를 샤용하여 입력 받고 적합한 타입의 변수에 저장하라 해서 sc.nerxtInt();를 썼다.
        // 정수를 전달 받을 수 있다 하여 int를 썼다.

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: "); // 연산 기호는 +, -, *, /
        // 사칙연산은 하나하나 사용되기 때문에 string(문자열)보다는 char(문자)를 사용해보자.

        char operator = sc.next().charAt(0); //next는 string 타입을 쓰기 때문에 charAt을 붙여준다.
        // char operator = sc.nextInt().charAt(0);으로 했을 때 숫자 0 부분에서 자꾸 오류가 남.
        // char operator = sc.nextInt().charAt('0'); char는 문자에 사용되니 '' 붙여봤지만 오류가 남.
        // nextInt가 아니라 next만 써야 했다. int는 정수.

        System.out.println("operator = " + operator);

    }
}
