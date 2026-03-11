package Challenge110to112;

public class TestingFunctionalInterface {

    public static void main(String[] args) {

        TestFunctional candidate = num -> {
            if (num <= 1) return false;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(candidate.isCandiate(12));
    }
}