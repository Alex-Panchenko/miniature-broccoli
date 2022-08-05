public class Car {
    int id;
    String brand;
    String model;
    int year;
    String color;
    int price;
    int number;

    public Car(int id, String brand, String model, int year, String color, int price, int number){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }
}
