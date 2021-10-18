public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите произвольное число ");
        int a = scan.nextInt();
        for (int i = 2; i < a; i++) {
            if (a % i != 0)
            System.out.println("False. Не делится без остатка ни на что кроме самого себя и 1");
            else
            System.out.println("True. Делится без остатка минимум на " + i);
            break;
        }
    }
    }
