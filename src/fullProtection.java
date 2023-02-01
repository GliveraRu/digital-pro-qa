import java.util.InputMismatchException;
import java.util.Scanner;

public class fullProtection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number;

            try {
                while (true) {
                System.out.println("Введите номер телефона без +7: ");
                number = scan.nextLong();
                long operNumber = number;
                int count = 1;
                while (operNumber / 10 > 0) {
                    count++;
                    operNumber /= 10;
                }
                if (count != 10) {
                    System.out.println("Должно быть 10 цифр!");
                    System.out.println("Кол-во цифр: " + count);
                } else {
                    System.out.println("Номер телефона " + "+7" + number + " сохранен.");
                    break;
                }
            }

        }
        catch (InputMismatchException e) {
            System.out.println("ERROR: Введены не цифры!");
            }

        }
    }

