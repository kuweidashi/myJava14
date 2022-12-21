package myJava14;
import java.util.Scanner;

public class Class02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println(str.toUpperCase());
    }
}
