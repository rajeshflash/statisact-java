package statisticker;

import java.util.List;

public class Statistics {
    public static class Stats {
        public float average;
        public float min;
        public float max;
    }

    public static Stats getStatistics(List<Float> numbers) {
        Stats stats = new Stats();
        if (numbers.isEmpty()) {
            stats.average = Float.NaN;
            stats.min = Float.NaN;
            stats.max = Float.NaN;
            return stats;
        }

        float sum = 0;
        stats.min = Float.MAX_VALUE;
        stats.max = Float.MIN_VALUE;

        for (float num : numbers) {
            sum += num;
            stats.min = Math.min(stats.min, num);
            stats.max = Math.max(stats.max, num);
        }

        stats.average = sum / numbers.size();
        return stats;
    }
}
