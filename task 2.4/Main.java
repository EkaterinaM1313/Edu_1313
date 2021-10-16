public class Main {
    public static void main(String[] args) {
        double a = 10000;
        double b = 0.08;
            for (int year = 1; year <= 5; year++) {
            a += a * b;
            System.out.println("За " + year + " год на вашем счету появится " + a + " рублей");
        }
    }
}
