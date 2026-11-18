public class PrintProduct {
    private final IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    public void PrintHeader() {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*".repeat(45));
    }

    // Prints the total product sales
    public void PrintTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    // Prints the average product sales
    public void PrintAverageProductSales() {
        System.out.println("AVERAGE PRODUCT SALES: "
                + String.format("%.0f", product.GetAverageProductSold()));
    }

    // Prints the most popular product
    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}