public class Pprimes {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a % 2 == 0) {
            System.out.println("Not prime");
        }

        if (a % 3 == 0) {
            System.out.println("Not prime");
        }

        if (a % 4 == 0) {
            System.out.println("Not prime");
        }

        if (a % 5 == 0) {
            System.out.println("Not prime");
        }

        if (a % 6 == 0) {
            System.out.println("Not prime");
        }

        if (a % 7 == 0) {
            System.out.println("Not prime");
        }

        if (a % 8 == 0) {
            System.out.println("Not prime");
        }

        if (a % 9 == 0) {
            System.out.println("Not prime");
        }

        if (a % 2 != 0 && a % 3 != 0 && a % 4 != 0 && a % 5 != 0 && a % 6 != 0 && a % 7 != 0 && a % 8 != 0 && a % 9 != 0) {
            System.out.println("Prime");
        }

    }
}
