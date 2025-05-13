public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int count = 0;
        while (i > 0) {
            boolean isEven = i % 2 == 0;

            if (isEven) {
                i = i / 2;
            } else {
                i--;
            }
            count++;
        }
        System.out.println(count);
    }
}