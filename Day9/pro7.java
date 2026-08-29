package day9;

public class pro7 {

    static int[] arr = {1, 3, 5, 7, 9, 11};
    static int[] tree = new int[4 * arr.length];

    // Build Segment Tree
    static void build(int node, int start, int end) {

        if (start == end) {
            tree[node] = arr[start];
            return;
        }

        int mid = (start + end) / 2;

        build(2 * node, start, mid);
        build(2 * node + 1, mid + 1, end);

        tree[node] = tree[2 * node] + tree[2 * node + 1];
    }

    // Range Sum Query
    static int query(int node, int start, int end, int left, int right) {

        // Completely outside range
        if (right < start || end < left) {
            return 0;
        }

        // Completely inside range
        if (left <= start && end <= right) {
            return tree[node];
        }

        int mid = (start + end) / 2;

        int leftSum = query(2 * node, start, mid, left, right);
        int rightSum = query(2 * node + 1, mid + 1, end, left, right);

        return leftSum + rightSum;
    }

    // Update an element
    static void update(int node, int start, int end, int index, int value) {

        if (start == end) {
            arr[index] = value;
            tree[node] = value;
            return;
        }

        int mid = (start + end) / 2;

        if (index <= mid) {
            update(2 * node, start, mid, index, value);
        } else {
            update(2 * node + 1, mid + 1, end, index, value);
        }

        tree[node] = tree[2 * node] + tree[2 * node + 1];
    }

    public static void main(String[] args) {

        int n = arr.length;

        // Build tree
        build(1, 0, n - 1);

        // Query sum from index 1 to 4
        System.out.println("Sum = " + query(1, 0, n - 1, 1, 4));

        // Update index 2 from 5 to 10
        update(1, 0, n - 1, 2, 10);

        // Query again
        System.out.println("Sum after update = "
                + query(1, 0, n - 1, 1, 4));
    }
}