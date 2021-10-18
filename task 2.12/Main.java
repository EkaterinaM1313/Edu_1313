import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = Arrays.stream("8, 8, 8, 8, 8, 8, 6, 5, 9, 3".split(", "))
                .mapToInt(Integer::parseInt).toArray();
        int current = 1, max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                current++;
                if (current > max) {
                    max = current;
                }
            } else current = 1;
        }
        System.out.println(max);
    }
}
