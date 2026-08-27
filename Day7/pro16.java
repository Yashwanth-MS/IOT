package day7;

public class pro16 {

    static void mergesort(String[] a, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        mergesort(a, left, mid);
        mergesort(a, mid + 1, right);

        String[] temp = new String[right - left + 1];

        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (a[i].compareTo(a[j]) < 0) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= right) {
            temp[k++] = a[j++];
        }

        for (i = 0; i < temp.length; i++) {
            a[left + i] = temp[i];
        }
    }

    public static void main(String[] args) {

        String[] names = {"Rahul", "Amit", "Kiran","Anil", "Ravi"};

        mergesort(names, 0, names.length - 1);

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
