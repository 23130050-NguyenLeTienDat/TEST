package lab1;

public class AppTest {
    public static void main(String[] args) {
        Ex2 e = new Ex2();

        if (!Ex2.check(6)) {
            throw new RuntimeException("Test failed: 4 should be even");
        }

        if (Ex2.check(5)) {
            throw new RuntimeException("Test failed: 5 should be odd");
        }

        if (!e.isPrime(17)) {
            throw new RuntimeException("Test failed: 17 is prime");
        }

        if (e.isPrime(4)) {
            throw new RuntimeException("Test failed: 4 is not prime");
        }

        System.out.println("All tests passed ✅");
    }
}