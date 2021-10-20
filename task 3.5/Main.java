public class Main {
    public static void main(String[] args) {
        int num[] = {4,2,6,2,65};
        int i = 0;
        myFunction(i,num);
    }
    public static void myFunction (int i, int num[]) {
        if (i < num.length) {
            System.out.println("На печать "+i+"-й элемент массива: "+num[i]);
            myFunction(i+1,num);
        }
    }
}
