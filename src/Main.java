public class Main {
    public static void main(String[] args) {

        int balance = 200;
        int sum = 300;
        int bonus = sum / 100;
        int score = balance + sum;

        if (sum < 1000) {
            bonus = 0;
        }
        System.out.println("Итоговый счет:" + score);
        System.out.println("Количество бонусных рублей:" + bonus);
    }
}
