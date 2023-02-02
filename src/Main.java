public class Main {
    public static void main(String[] args) {

        int clientAcc = 100;
        int addedSumm = 1001;
        int bonus;
        int balance;

        if (addedSumm>1000) {
            bonus = addedSumm/100;
        } else {
            bonus = 0;
        }
        balance = clientAcc + bonus;

        System.out.println("Ваш баланс с учетом бонусов " + (balance));

    }
}