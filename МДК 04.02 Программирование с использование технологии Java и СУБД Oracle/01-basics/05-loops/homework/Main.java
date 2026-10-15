import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите недельную дистанцию в км: ");
        double start = scanner.nextDouble();

        if (start <= 0) {
            System.out.println("Дистанция должна быть больше нуля");
            return;
        }

        double distance = start;
        int weeks = 0;

        while (distance < 42) {
            // Увеличение прошлой дистанции на 5 процентов.
            distance = distance * 1.05;
            weeks++;
            System.out.printf("Неделя %d: %.2f км%n", weeks, distance);
        }

        System.out.println("Всего недель до 42 км: " + weeks);

        double total = 0;
        distance = start;

        for (int week = 1; week <= 6; week++) {
            total += distance;
            distance += 2;
        }

        System.out.printf("Суммарный километраж за 6 недель: %.2f км%n", total);
        scanner.close();
    }
}
