import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 15};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]==5) {
                System.out.println("Да. В массиве есть число "+mass[i]);
                break;
            }
            if (i==mass.length-1)
                System.out.println("Нет. В массиве нет числа 5");
        }
    }
}
