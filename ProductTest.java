import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    private final String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
    private final int[][] sales = {
            {25, 18, 20},   // Cozy Nights Monarch
            {15, 10, 12},   // Restonic Barbados
            {18, 15, 20}    // Sealy Phuket
    };

    // Unit Test 1
    @Test
    void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(names, sales);

        int expected = 153;
        int actual = product.GetTotalProductsSold();

        assertEquals(expected, actual);
    }

    // Unit Test 2
    @Test
    void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(names, sales);

        double expected = 17.0;   // 153 / 9
        double actual = product.GetAverageProductSold();

        assertEquals(expected, actual, 0.001);
    }
}
