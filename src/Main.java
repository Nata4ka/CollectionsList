import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите код операции: 1- добавить, 2- показать, 3- удалить.");
            String input = scanner.nextLine();
            int z = Integer.parseInt(input);
            switch (z) {
                case 1: {
                    System.out.println("Добавьте покупку:");
                    String product = scanner.nextLine();
                    list.add(product);
                    System.out.println("Добавили товар: " + list.size() + "." + product);
                    break;

                }
                case 2: {
                    System.out.println("Ваш список покупок: ");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + "." + list.get(i));
                    }
                    break;
                }
                case 3: {
                    System.out.println("Список покупок: ");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + "." + list.get(i));
                    }
                    System.out.println("Введите номер товара который хотите удалить: ");
                    String number = scanner.nextLine();
                    try {
                        int x = Integer.parseInt(number);
                        list.remove(x - 1);
                        System.out.println("Товар " + x + " удален, " + "список покупок: ");
                    } catch (Exception e) {
                        list.remove(number);
                        System.out.println("Товар " + number + " удален, " + "список покупок: ");
                    }
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + "." + list.get(i));
                    }
                    break;
                }
            }
        }
    }
}


