import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        test2();
    }

    public static void test2() { // 5강
        // System.out -> 표준 출력 -> 모니터(콘솔)
        // 2. 출력문의 값을 문자열로 받아서 봇에게 줄 수 있다.
        PrintStream origin = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream(); // 비어있는 스트림
        System.setOut(new PrintStream(out));
        System.out.println("hello");
        System.setOut(origin);
        String str = out.toString();
        System.out.println(str);
    }

    public static void test1() {
        // System.in --> 표준 입력

        // 1. 입력을 봇에게 맡길 수 있다.
        Scanner scan = new Scanner("등록\n현재를 사랑하라.\n작자미상\n");

        String val1 = scan.nextLine();
        System.out.println(val1);

        String val2 = scan.nextLine();
        System.out.println(val2);

        String val3 = scan.nextLine();
        System.out.println(val3);

        //테스트봇 만들기
        TestApp app = new TestApp();
        app.run();
    }
}
