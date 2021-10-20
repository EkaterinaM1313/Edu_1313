public class Main {

    public static void main(String[] args) {
        System.out.println("min = "+min(1, 2, 3));       // min = 1
        System.out.println("min = "+min(-1, -2, -3));    // min = -3
        System.out.println("min = "+min(3, 5, 3));       // min = 3
        System.out.println("min = "+min(5, 5, 10));      // min = 5
    }

    public static int min(int a, int b, int c) {
        if (a<=b)
          if (a<=c)
              return a;
          else if (b<=c)
              return b;
              return c;
    }
}
