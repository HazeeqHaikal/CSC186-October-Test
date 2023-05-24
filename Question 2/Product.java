public class Product {
    private String productName;
    private int age;
    private double stockPrice;
    private int quantity;

    public Product(String productName, int age, double stockPrice, int quantity) {
        this.productName = productName;
        this.age = age;
        this.stockPrice = stockPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getAge() {
        return age;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "Product name: " + productName + "\nAge started (months): " + age + "\nStock Price: " + stockPrice
                + "\nQuantity left: " + quantity + String.format("\nSelling Price: RM %,.2f", calculateSellingPrice());
    }

    public double calculateSellingPrice() {
        String secondWords = productName.split(" ")[1];
        double pricePercentage = 0.00;
        double sellingPrice = 0.00;

        switch (secondWords) {
            case "Puree":
                pricePercentage = 1.50;
                break;
            case "Powder":
                pricePercentage = 1.45;
                break;
            case "Cereal":
                pricePercentage = 1.35;
                break;
            default:
                pricePercentage = 1.00;
                break;
        }

        sellingPrice = getStockPrice() * pricePercentage;
        return sellingPrice;
    }
}