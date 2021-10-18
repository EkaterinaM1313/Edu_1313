import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[] mass = {5,60,23,44,44,50};
        int a = mass[1];
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Считаем элемент "+i+" он равен "+mass[i]);
            if (a==mass[i]) {
             System.out.println("Да. Имеются одинаковые числа - " + a);
              break;
            }
            if (i==mass.length-1) {
                System.out.println("Нет. Одинаковых чисел нет");
            }
            a = mass[i];
        }
    }
}
