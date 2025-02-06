package app;

public class Main {
    public static void main(String[] args) {

        String product1 = "smartphone";
        double totalSales1 = 12153.41;
        int days1 = 5;
        double dailySales1 = totalSales1 / days1;

        String product2 = "laptop";
        double totalSales2 = 10486.85;
        int days2 = 7;
        double dailySales2 = totalSales2 / days2;

        System.out.printf("Produkt: %s%n", product1 );
        System.out.printf("total sales for %d days is EUR %.2f,%n", days1, totalSales1);
        System.out.printf("sales by day is EUR %.2f.%n", dailySales1);

        System.out.printf("Product No 2: %s,%n", product2);
        System.out.printf("total sales for %d days is EUR %.2f,%n", days2, totalSales2);
        System.out.printf("sales by day is EUR %.2f.%n", dailySales2);
    }
}


