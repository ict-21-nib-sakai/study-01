package java_api;

import java.util.Scanner;

public class ScannerClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("入力した文字列: " + input);
    }
}
