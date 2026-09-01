package day10;

import java.util.PriorityQueue;
import java.util.Collections;

public class pro9 {

    public static void main(String[] args) {

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();

        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {

            if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
                maxHeap.add(num);
            } else {
                minHeap.add(num);
            }

            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            }

            if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            }
        }

        double median;

        if (maxHeap.size() == minHeap.size()) {
            median = (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            median = maxHeap.peek();
        }

        System.out.println("Max Heap: " + maxHeap);
        System.out.println("Min Heap: " + minHeap);
        System.out.println("Median: " + median);
    }
}