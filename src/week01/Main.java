package week01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int score[] = new int[3];
        score[2] = 3;
        for (int i : score) {
            System.out.println("score = " + i);
        }

        double f = 0.3333;
        System.out.println(f);

        System.out.println("Hello World");

        String str = "Hello World";
        System.out.println(str);

        String a = "444";
        System.out.printf("%-20s", a);
        System.out.printf("%20s\n", a);

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
    }
}