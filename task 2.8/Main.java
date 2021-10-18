    public class Main {
        public static void main(String[] args) {
            int[] nums = {2, 3, 4, 5};
            int a = 1;
            for (int i = 0; i < nums.length; i++) {
                a = a * nums[i];
                System.out.println("Произведение элементов = " + a);
            }
        }
    }
