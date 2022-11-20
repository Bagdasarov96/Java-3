public class Main {

    public static void main(String[] args) {
        int accountBalance = 500; // баланс на счету
        int replenishment = 1300; // сумма пополнения
        int percent; // процент бонуса
        if (replenishment >= 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = replenishment * percent / 100;
        int result = accountBalance + replenishment;
        System.out.println("Сумма пополнения:" + result);
        System.out.println("Бонусные рубли:" + bonus);



    }
}