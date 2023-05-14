package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int a, int b) {
        if(a ==0) {
            System.out.println(b);
            return;
        }
        while (a != b)
        {
            if (a > b) a %= b;
            else b %= a;

            if (a == 0) a = b;
            if (b == 0) b = a;
        }

        System.out.println(a);
    }
}
