import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int log = scanner.nextInt();
        if (log ==10)
        System.out.print("Верно");
        else
            System.out.println("Неверно");
    }
}
