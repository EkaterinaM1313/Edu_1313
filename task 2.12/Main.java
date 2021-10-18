import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = Arrays.stream("2, 4, 4, 4, 8, 8, 4, 12, 12, 14".split(", "))
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
