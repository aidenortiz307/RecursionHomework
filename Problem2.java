public class Problem2 {
    public static int sum7(int n1, int n2) {
        if (n1 > n2) {
            return 0;
        }

        if (n1 % 7 == 0) {
            return n1 + sum7(n1 + 1, n2);
        }

        return sum7(n1 + 1, n2);
    }

    public static void main(String[] args) {
        System.out.println(sum7(1, 30));
    }
}
