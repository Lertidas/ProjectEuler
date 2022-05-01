public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Working");
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000.0 + " seconds");
    }
}
