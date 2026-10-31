import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int[] math = new int[6];
        int sum = 0;
        int good = 0;
        System.out.println("Часть 1. Введите 6 оценок по математике:");
        for (int i = 0; i < math.length; i++) {
            math[i] = scanner.nextInt();
            sum += math[i];
            if (math[i] == 4 || math[i] == 5) {
                good++;
            }
        }
        System.out.print("Оценки: ");
        for (int i = 0; i < math.length; i++) {
            System.out.print(math[i] + " ");
        }
        System.out.println();
        // Деление на 6.0 сохраняет дробную часть среднего балла.
        System.out.printf("Средний балл: %.2f%n", sum / 6.0);
        System.out.println("Количество оценок 4 и 5: " + good);

        int[][] grades = new int[2][6];
        String[] subjects = {"Математика", "Физика"};
        double[] averages = new double[2];
        System.out.println("Часть 2. Введите оценки по двум предметам:");
        for (int subject = 0; subject < grades.length; subject++) {
            System.out.println(subjects[subject] + ", 6 оценок:");
            for (int student = 0; student < grades[subject].length; student++) {
                grades[subject][student] = scanner.nextInt();
            }
        }

        for (int subject = 0; subject < grades.length; subject++) {
            int total = 0;
            int fours = 0;
            int fives = 0;
            int twos = 0;
            for (int student = 0; student < grades[subject].length; student++) {
                int grade = grades[subject][student];
                total += grade;
                if (grade == 4) fours++;
                if (grade == 5) fives++;
                if (grade == 2) twos++;
            }
            averages[subject] = total / 6.0;
            System.out.printf("%s: средний балл %.2f, оценок 4-5: %d, учеников с двойкой: %d%n",
                    subjects[subject], averages[subject], fours + fives, twos);
            System.out.printf("Оценок 4: %d, оценок 5: %d%n", fours, fives);
        }

        if (averages[0] > averages[1]) {
            System.out.println("Выше по среднему: математика");
        } else if (averages[1] > averages[0]) {
            System.out.println("Выше по среднему: физика");
        } else {
            System.out.println("Средние баллы равны");
        }
        scanner.close();
    }
}
