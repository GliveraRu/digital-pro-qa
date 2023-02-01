import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер телефона без +7: ");
        long number;

        try {
            number = scan.nextLong();
        }
        catch (InputMismatchException e) {
            System.out.println("ERROR: Введены не цифры!");
        }
        finally {

        }
        }
}
