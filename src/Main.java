public class Main {

    public static void main(String[] args) {
        int moneyOnBalance = 100; // Количество денег на счете
        int amount = 1000; // Сумма для пополнения
        int bonus = 0;

        if (amount > 1000) {
            bonus = amount / 100;
        }

        int moneyResult = moneyOnBalance + amount + bonus;

        System.out.println("Итоговая сумма на счету: " + moneyResult);
    }
}
