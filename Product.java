public class Product implements IProduct {
    private final String[] names;   // single-dimensional array
    private final int[][] sales;    // two-dimensional array [product][month]

    public Product(String[] names, int[][] sales) {
        this.names = names;
        this.sales = sales;
    }

    // Helper: total sales for one product across all months
    private int ProductTotal(int p) {
        int sum = 0;
        for (int m = 0; m < sales[p].length; m++) {
            sum += sales[p][m];
        }
        return sum;
    }

    // Method 1: total products sold
    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int p = 0; p < sales.length; p++) {
            total += ProductTotal(p);
        }
        return total;
    }

    // Method 2: average products sold
    @Override
    public double GetAverageProductSold() {
        int entries = sales.length * sales[0].length;
        return (double) GetTotalProductsSold() / entries;
    }

    // Method 3: most popular product (highest total sales)
    @Override
    public String GetMostPopularProduct() {
        int best = 0;
        for (int p = 1; p < sales.length; p++) {
            if (ProductTotal(p) > ProductTotal(best)) {
                best = p;
            }
        }
        return names[best] + "(" + ProductTotal(best) + ")";
    }
}