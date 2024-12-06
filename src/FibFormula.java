public class FibFormula implements FindFib {
    public int calculate_fib(int num) {
        double part1 = ((1 + Math.sqrt(5)) / 2);
        double part2 = (((1 - Math.sqrt(5)) / 2));
        double answer = (Math.pow(part1, num) - (Math.pow(part2, num))) / Math.sqrt(5);
        int Fib = (int) answer;
        return Fib;
    }
}
