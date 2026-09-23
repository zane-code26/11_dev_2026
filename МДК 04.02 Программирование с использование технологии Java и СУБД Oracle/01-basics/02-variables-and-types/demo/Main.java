public class Main {
    public static void main(String[] args) {
        // Типы данных
        int num = 12; // Целое число
        double flt = 12.21; // Вещественное число
        boolean logic = true; // Логическое значение
        char sym = '!'; // Символ
        String row = "Строка с текстом"; // Текст

        // final перед типом данных обозначает, что это константа
        final int num_const = 12;

        // Базовые операции
        // Математические операции
        int a = 12, b = 18;
        System.out.println(a + b); // Операция сложения
        System.out.println(a - b); // Операция вычетания
        System.out.println(b / a); // Операция деления
        System.out.println(a * b); // Операция умножения
        System.out.println(a % b); // Остаток от деления


        // Выражения
        // Можно решать полноценные математические выражения 
        int c = (a+b) / 12 * 2;
    }
}