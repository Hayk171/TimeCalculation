import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class TimeCalc {
    public static void main(String[] args) {
        timeCalculator(new LinkedList<>());
        timeCalculator(new ArrayList<>());
    }

    public static void timeCalculator(Collection collection) {
        int collectionLength = 1000000;
        long startTime = 0;
        long endTime = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < collectionLength; i++) {
            Random random = new Random();
            int number = random.nextInt();
            collection.add(number);
            if (number % 2 == 0) {
                collection.remove(number);
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time spent = " + ((endTime - startTime))/1000.0 + " seconds");
    }
}
