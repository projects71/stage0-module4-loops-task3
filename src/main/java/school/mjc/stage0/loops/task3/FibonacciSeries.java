package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a=0, b=1, result=0;


        for(int i = 1; i <= lastFibonacci; i++) {
            System.out.println(a);
            result = a + b;
            a=b;
            b=result;

        }
    }
}
