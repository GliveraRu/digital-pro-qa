import java.util.Scanner;

public class fool_proof {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер телефона без +7: ");
            long number = scan.nextLong();
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
}
