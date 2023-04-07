
public class Main {
    public static void main(String[] args) {

        int balance = 200;
        int sum = 300;
        int bonus = sum/100;
        int x = balance+sum;

       if (sum<1000) {bonus = 0;}


        System.out.println("Итоговый счет:"+ x);
        System.out.println("Количество бонусных рублей:"+ bonus);
    }
}