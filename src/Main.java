import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> spicok = new ArrayList<String>();
        spicok.add("1.Сложение");
        spicok.add("2.Вычитание");
        spicok.add("3.Умножение");
        spicok.add("4.Деление");
        spicok.add("5.Возведение в N степень");
        spicok.add("6.Выход из программы");
        for (String delo : spicok) {

            System.out.println(delo);
        }
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        while (num != "6"){

            if (Objects.equals(num, "1")) {
                System.out.print("Введите количество чисел для сложения: ");
                int count = scanner.nextInt(); //кол-во повторов цикла
                int cnt = 0; //переменная для счета
                int sum = 0; //переменная для суммы
                while (count != cnt) {
                    int coun = scanner.nextInt();
                    sum += coun;
                    cnt += 1;
                }
                System.out.print("Сумма: ");
                System.out.println(sum);

            }
            if (Objects.equals(num, "2")) {
                System.out.print("Введите 1 число(из которого будем вычитать): ");
                double a = scanner.nextDouble(); // 1 число
                System.out.print("Введите 2 число(что будем вычитать): ");
                double b = scanner.nextDouble(); // 2 число
                double sub = a - b;
                System.out.print("Вычитание: ");
                System.out.println(sub);
            }
            if (Objects.equals(num, "3")) {
                System.out.print("Введите 1 число: ");
                double a = scanner.nextDouble(); // 1 число
                System.out.print("Введите 2 число: ");
                double b = scanner.nextDouble(); // 2 число
                double sub = a * b;
                System.out.print("Умножение: ");
                System.out.println(sub);
            }
            if (Objects.equals(num, "4")) {
                System.out.print("Введите 1 число(из которого будем вычитать): ");
                double a = scanner.nextDouble(); // 1 число
                System.out.print("Введите 2 число(что будем вычитать): ");
                double b = scanner.nextDouble(); // 2 число
                double sub = a - b;
                System.out.print("Деление: ");
                System.out.println(sub);
            }
            if (Objects.equals(num, "5")) {
                System.out.print("Введите 1 число: ");
                double a = scanner.nextDouble(); // 1 число
                System.out.print("Введите, в какую степень вы хотите возвести: ");
                double b = scanner.nextDouble(); // 2 число
                double sub = Math.pow(a,b);
                System.out.print("Возведение в степень: ");
                System.out.println(sub);
            }
            if (Objects.equals(num, "6")) {
                System.exit(0);
            }

            num = scanner.nextLine();

        }

    }
    }






