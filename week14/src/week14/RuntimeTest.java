package week14;

import java.util.Scanner;

public class RuntimeTest {
	public static <T> void printType(T input) {
        System.out.println("입력값: " + input);
        System.out.println("타입: " + input.getClass().getName());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 5) {
            int value = Integer.valueOf(num);
            printType(value);
        } else if (num == 10) {
            String value = String.valueOf(num);
            printType(value);
        } else {
            double value = Double.valueOf(num);
            printType(value);
        }

        // 제네릭 메소드 호출 - 컴파일러는 T를 추론할 수 없으므로 Object로 봄
        
        sc.close();
    }
}
