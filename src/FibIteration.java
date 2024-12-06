public class FibIteration implements FindFib {
    public int calculate_fib(int Fib) {
        if (Fib == 1 || Fib == 2) {
            return 1;
        }

        int[] myArray = new int[]{1, 1, 2};

        for (int i = 2; i < Fib; i++) {
            myArray[2] = myArray[0] + myArray[1];
            myArray[0] = myArray[1];
            myArray[1] = myArray[2];
        }
        return myArray[2];
    }
}
