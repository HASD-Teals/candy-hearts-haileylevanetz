public class Heart {
    // PROPERTIES
    private String color;
    private int size;
    private String saying;
    private int calories;
    private double costPerLb;
    private boolean available;
    private int stock;

    // CONSTRUCTORS
    public Heart() {
        this.color = "";
        this.size = 0;
        this.saying = "";
        this.setCalories(0);
        this.setCostPerLb(0);
        this.setAvailable(false);
        this.setStock(0);
    }

    // Override Constructors
    public Heart(String color, int size, String saying, double costPerLb, int calories, Boolean available, int stock) {
        this.color = color;
        this.size = size;
        this.saying = saying;
        this.setCalories(calories);
        this.setAvailable(available);
        this.setStock(stock);
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }

    public int getSize() {
        return this.size;
    }

    public String getSaying() {
        return this.saying;
    }

    public int getCalories() {
        return calories;
    }

    public double getCostPerLb() {
        return costPerLb;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getStock() {
        return stock;
    }

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSaying(String saying) {
        this.saying = saying;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setCostPerLb(double costPerLb) {
        this.costPerLb = costPerLb;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void adjPrice(int costPerLb, int percent) {
        this.costPerLb = (costPerLb * percent / 100);
    }

    public boolean inStock(int stock, int want) {
        boolean inStock = false;
        if (stock >= want)
            inStock = true;
        return inStock;
    }

    // METHODS
    public String report() {
        return this.color + " " + this.size + " " + this.saying + " " + this.costPerLb + " " + this.stock + " ";
    }

    
}
