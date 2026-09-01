package day10;

public class pro4
{

    public static void main(String[] args) {

        int[] item = {1, 2, 3};
        int[] weight = {10, 20, 30};
        int[] profit = {60, 100, 120};

        int capacity = 50;
        double totalProfit = 0;

        // Greedy: find highest profit/weight
        for (int i = 0; i < item.length - 1; i++) {
            for (int j = i + 1; j < item.length; j++) {

                double r1 = (double) profit[i] / weight[i];
                double r2 = (double) profit[j] / weight[j];

                if (r1 < r2) {

                    int temp;

                    temp = weight[i];
                    weight[i] = weight[j];
                    weight[j] = temp;

                    temp = profit[i];
                    profit[i] = profit[j];
                    profit[j] = temp;

                    temp = item[i];
                    item[i] = item[j];
                    item[j] = temp;
                }
            }
        }

        // Select items
        for (int i = 0; i < item.length; i++) {

            if (weight[i] <= capacity) {

                capacity = capacity - weight[i];
                totalProfit = totalProfit + profit[i];

                System.out.println("Item " + item[i] + " selected");
            }
            else {

                double fraction = (double) capacity / weight[i];

                totalProfit = totalProfit + profit[i] * fraction;

                System.out.println("Fraction of Item " + item[i] + " selected");

                break;
            }
        }

        System.out.println("Maximum Profit = " + totalProfit);
    }
}