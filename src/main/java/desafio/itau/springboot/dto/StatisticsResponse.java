package desafio.itau.springboot.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticsResponse {
    private double sum;
    private double avg;
    private double max;
    private double min;
    private long count;

    public StatisticsResponse(DoubleSummaryStatistics stats) {
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.max = stats.getMax();
        this.min = stats.getMin();
        this.count = stats.getCount();
    }

    public double getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public long getCount() {
        return count;
    }
}
