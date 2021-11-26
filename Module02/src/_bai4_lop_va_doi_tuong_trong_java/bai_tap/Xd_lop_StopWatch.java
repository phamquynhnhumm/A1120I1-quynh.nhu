package _bai4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Arrays;

public class Xd_lop_StopWatch {
    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 1000000);
        }
        Xd_lop_StopWatch stopWatch = new Xd_lop_StopWatch();
        Arrays.sort(a);
        stopWatch.stop();
        System.out.println("Milis: " + stopWatch.getElapsedTime());
    }

    public double startTime;
    public double endTime;

    public Xd_lop_StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public Xd_lop_StopWatch(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
