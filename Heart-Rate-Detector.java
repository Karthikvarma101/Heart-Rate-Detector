import java.util.*;

public class HeartRateDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("❤️ Heart Rate Detector ❤️");
        System.out.println("--------------------------");
        System.out.println("Enter 5 pulse intervals (in milliseconds):");

        List<Long> intervals = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Interval " + (i + 1) + ": ");
            intervals.add(scanner.nextLong());
        }

        double averageInterval = calculateAverage(intervals);
        double bpm = 60000 / averageInterval; // 60,000 ms per minute

        System.out.printf("\n💓 Your estimated heart rate: %.2f BPM\n", bpm);

        if (bpm < 60)
            System.out.println("⚠️  Low heart rate (Bradycardia)");
        else if (bpm > 100)
            System.out.println("⚠️  High heart rate (Tachycardia)");
        else
            System.out.println("✅ Normal heart rate");
    }

    private static double calculateAverage(List<Long> intervals) {
        double sum = 0;
        for (long interval : intervals) {
            sum += interval;
        }
        return sum / intervals.size();
    }
}
