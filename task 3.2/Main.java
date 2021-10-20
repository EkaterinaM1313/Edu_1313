public class Main {
    public static int min(int a, int b, int c, int d) {
       int x = min(a,b);
       if (x<=c)
       if (x <= d)
            return x;
        if (c <= d)
            return c;
        return d;
    }

    public static int min(int a, int b) {
        if (a<=b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("МИН короткой строки = "+min(-20, -10));
        System.out.println("МИН 1-й длинной строки = "+min(-40, -10, -30, 40));
        System.out.println("МИН 2-й длинной строки = "+min(-20, -40, -30, 40));
        System.out.println("МИН 3-й длинной строки = "+min(-20, -10, -40, 40));
        System.out.println("МИН 4-й длинной строки = "+min(-20, -10, -30, -40));    
    }
}
