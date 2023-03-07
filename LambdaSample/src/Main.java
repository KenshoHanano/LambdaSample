import java.util.*;

public class Main {
    public static void main(String[] args) {
        SampleSum sampleSum = getSampleSum();
        System.out.println(sampleSum.sum(10,5));
    }

    private static SampleSum getSampleSum() {
        return (x,y) -> x + y;
    }
}