public class SumOfEvenNumber {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 2 * i;
        }
        System.out.println("Sum of first " + n + " even numbers is: " + sum);
    }
}