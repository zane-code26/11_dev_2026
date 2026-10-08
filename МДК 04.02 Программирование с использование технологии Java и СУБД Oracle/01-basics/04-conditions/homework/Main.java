import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double START_BALANCE = 10000;
        double balance = START_BALANCE;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int choice;

        do {
            System.out.println("1 - Показать баланс");
            System.out.println("2 - Пополнить счёт");
            System.out.println("3 - Снять наличные");
            System.out.println("4 - Добавить проценты");
            System.out.println("0 - Выход");
            System.out.print("Выбери действие: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    break;
                case 2: {
                    System.out.print("Сумма пополнения: ");
                    double amount = scanner.nextDouble();
                    if (amount < 0) {
                        System.out.println("Нельзя вводить отрицательную сумму.");
                    } else {
                        balance += amount;
                    }
                    break;
                }
                case 3: {
                    System.out.print("Сумма снятия: ");
                    double amount = scanner.nextDouble();
                    if (amount < 0) {
                        System.out.println("Нельзя вводить отрицательную сумму.");
                    } else if (amount > balance) {
                        System.out.println("Недостаточно денег.");
                    } else {
                        balance -= amount;
                    }
                    break;
                }
                case 4:
                    // 0,5 процента = 0,005 от текущего баланса.
                    balance += balance * 0.005;
                    break;
                case 0:
                    System.out.println("Выход.");
                    break;
                default:
                    System.out.println("Такого пункта нет.");
            }

            if (choice != 0) {
                System.out.printf(Locale.US, "Баланс: %.2f руб.%n%n", balance);
            }
        } while (choice != 0);

        scanner.close();
    }
}
