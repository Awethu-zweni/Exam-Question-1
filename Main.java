import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = new int[3][3];   // [product][month]

        // Capture sales
        for (int p = 0; p < names.length; p++) {
            for (int m = 0; m < 3; m++) {
                System.out.print("Enter number of sales for month " + (m + 1)
                        + " for " + names[p] + " mattress: ");
                sales[p][m] = input.nextInt();
            }
            System.out.println();
        }

        // Calculate totals
        int[] productTotals = new int[names.length];   // 1D array of totals
        int grandTotal = 0;
        for (int p = 0; p < names.length; p++) {
            for (int m = 0; m < 3; m++) {
                productTotals[p] += sales[p][m];
            }
            grandTotal += productTotals[p];
        }

        int average = grandTotal / (names.length * 3);

        // Find most popular product (highest total)
        int best = 0;
        for (int p = 1; p < names.length; p++) {
            if (productTotals[p] > productTotals[best]) {
                best = p;
            }
        }

        // Report
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*".repeat(45));
        System.out.println("TOTAL PRODUCT SALES: " + grandTotal);
        System.out.println("AVERAGE PRODUCT SALES: " + average);
        System.out.println("MOST POPULAR PRODUCT: " + names[best] + "(" + productTotals[best] + ")");
    }
}