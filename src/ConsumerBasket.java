import java.util.Scanner;

public class ConsumerBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] products = {"Хлеб", "Яблоки", "Молоко",
                "Гречневая крупа", "Картофель"};
        int[] prices = {70, 100, 80, 120, 90};
        int[] basket = new int[products.length];

        while (true) {
            System.out.println("Выберите товар и количество или end для завершения");
            System.out.println("1.Хлеб 70 руб/шт" +
                    "\n2.Яблоки 100 руб/кг" +
                    "\n3.Молоко 80 руб/шт" +
                    "\n4.Гречневая крупа 120 руб/кг" +
                    "\n5.Картофель 90 руб/кг");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            String[] consumerInput = input.split(" ");
            int product = Integer.parseInt(consumerInput[0]) - 1;
            int count = Integer.parseInt(consumerInput[1]);
            basket[product] += count;
        }

        System.out.println("Ваша корзина:");
        int total = 0;
        for (int i = 0; i < products.length; i++) {
            if (basket[i] > 0) {
                int cost = prices[i] * basket[i];
                total += cost;
                System.out.println(products[i] + " " + basket[i] + " шт/кг " + cost + " руб");
            }
        }
        System.out.println("Итого сумма: " + total + " руб");
        System.out.println("Программа завершина");
    }
}
