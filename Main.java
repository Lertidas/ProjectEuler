public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Setup Problem class
        Problem3 problem = new Problem3();
        System.out.println(problem.solve());

        long endTime = System.currentTimeMillis();
        System.out.println("Solved in " + (endTime - startTime) / 1000.0 + " seconds");
    }
}
