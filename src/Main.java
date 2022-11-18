public class Main {

    public static void main(String[] args) {
        int a = 500; // баланс на счету
        int b = 1300; // сумма пополнения
        int percent; // процент бонуса
        if (b >= 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = b * percent / 100;
        int result = a + b;
        System.out.println("Сумма пополнения:" + result);
        System.out.println("Бонусные рубли:" + bonus);



    }
}