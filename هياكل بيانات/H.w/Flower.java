public class Flower {
    private String name;
    private int numberOfFlower;
    private float price;

    public Flower(String name, int numberOfFlower, float price) {
        this.name = name;
        this.numberOfFlower = numberOfFlower;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfFlower() {
        return numberOfFlower;
    }

    public void setNumberOfFlower(int numberOfFlower) {
        this.numberOfFlower = numberOfFlower;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
