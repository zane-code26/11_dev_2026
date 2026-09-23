public class Main {
    public static void main(String[]args) {
      int scholarship = 10000;
      int foodExpenses = 4000;
      int transportExpenses = 1500;
      int entertainmentExpenses = 1000;
    double smartphonePrice = 25000.0;
    int totalExpenses = foodExpenses + transportExpenses + entertainmentExpenses ;
    int remainingMoney = scholarship - totalExpenses;
    int savingsForSixMonths = remainingMoney * 6;
    int fullMonths = (int) smartphonePrice / remainingMoney;
    int monthsNeeded = fullMonths + 1;
    System.out.println("Расходы за месяц: " + totalExpenses);
    System.out.println("Остаток за месяц: " + remainingMoney);
    System.out.println("Накопления за 6 месяцев: " + savingsForSixMonths);
    System.out.println("Хватит за " + monthsNeeded + " месяцев");
    }

}