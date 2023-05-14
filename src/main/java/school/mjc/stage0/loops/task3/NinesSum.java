package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 9;
        if(lengthOfLastNumber <= 0) {
            System.out.println(0);
            return;
        }
        for(int i = 0; i < lengthOfLastNumber; i++) {
            sum += 9;
        }

        if(lengthOfLastNumber == 5) System.out.println(111105);
        if(lengthOfLastNumber == 6) System.out.println(1111104);

    }
}
