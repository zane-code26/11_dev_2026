import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Доход: ");
        int income = s.nextInt();

        System.out.print("Питание: ");
        int food = s.nextInt();

        System.out.print("Транспорт: ");
        int transport = s.nextInt();

        System.out.print("Развлечения: ");
        int fun = (int) s.nextDouble();

        // Общая сумма расходов.
        int expenses = food + transport + fun;

        // Деньги, оставшиеся после расходов.
        int rest = income - expenses;

        // Средние расходы за один из 30 дней.
        double daily = expenses / 30.0;

        System.out.printf("%nСемейный бюджет%n");
        System.out.printf("Расходы: %d руб.%n", expenses);
        System.out.printf("Остаток: %d руб.%n", rest);
        System.out.printf("В день: %.2f руб.%n", daily);

        if (expenses > 0 && rest >= 0) {
            // Остаток делим на месячные расходы.
            System.out.printf("Полных месяцев: %d%n", rest / expenses);
        } else {
            System.out.println("Нет сбережений или расходы равны нулю.");
        }
    }
}