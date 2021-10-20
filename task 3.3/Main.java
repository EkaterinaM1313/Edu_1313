import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vvodChisla = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int a = vvodChisla.nextInt();
        System.out.print("Введите число 2: ");
        int b = vvodChisla.nextInt();

        System.out.println("Результат сравнения двух чисел: "+myFunction(a,b));
    }

    public static boolean myFunction(int x, int y) {
        if (x==y) return true;
        else return false;
    }
}
