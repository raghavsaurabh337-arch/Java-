import java.util.Scanner;

class Marksheet {

    public static void main(String[] age) {

        int input;
        int hindi = 0;
        int english = 0;
        int math = 0;
        int py = 0;
        int ch = 0;

        Scanner se = new Scanner(System.in);

        System.out.println("Enter your marks hindi: ");
        input = se.nextInt();

        if (0 <= input && input <= 100) {
            hindi = input;
        } else {
            System.out.println("pls enter your valid mark:");
        }

        System.out.println("Enter your marks english: ");
        input = se.nextInt();

        if (0 <= input && input <= 100) {
            english = input;
        } else {
            System.out.println("pls enter your valid mark:");
        }

        System.out.println("Enter your marks math: ");
        input = se.nextInt();

        if (0 <= input && input <= 100) {
            math = input;
        } else {
            System.out.println("pls enter your valid mark:");
        }

        System.out.println("Enter your marks py: ");
        input = se.nextInt();

        if (0 <= input && input <= 100) {
            py = input;
        } else {
            System.out.println("pls enter your valid mark:");
        }

        System.out.println("Enter your marks ch: ");
        input = se.nextInt();

        if (0 <= input && input <= 100) {
            ch = input;
        } else {
            System.out.println("pls enter your valid mark:");
        }

        int total = hindi + english + math + py + ch;

        float pre = (total / 500.0f) * 100;

        if (pre >= 95) {
            System.out.print(pre + " A++");
        } else if (pre >= 90) {
            System.out.print(pre + " A+");
        } else if (pre >= 80) {
            System.out.print(pre + " A");
        } else if (pre >= 70) {
            System.out.print(pre + " B++");
        } else if (pre >= 60) {
            System.out.print(pre + " B");
        } else if (pre >= 50) {
            System.out.print(pre + " B");
        } else if (pre >= 33) {
            System.out.print(pre + " Online PASS");
        } else {
            System.out.println(pre + " Fail");
        }

        se.close();
    }
}