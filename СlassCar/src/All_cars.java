public class All_cars {

    public static void main(String[] args) {
        Car c1 = new Car(1234, "Ford", "Mustang", 1976, "White", 200000, 9395);
        Car c2 = new Car(1541, "Honda", "Civic", 2000, "Black", 100000, 3173);
        Car c3 = new Car(1001, "Ford", "Focus", 2010, "Green", 180000, 1254);
        Car c4 = new Car(2345, "Citroen", "Jumper Fourgon", 2016, "Blue", 250000, 9999);
        Car c5 = new Car(1786, "Kia", "Stinger", 2020, "Violet", 300000, 7777);
        Car c6 = new Car(2222, "Citroen", "Space", 2020, "Yellow", 295000, 1111);
        Car c7 = new Car(9999, "Ford", "Focus", 2002, "Black", 120000, 1053);

        Car[] array = new Car[]{c1, c2, c3, c4, c5, c6, c7};
        for (int i = 0; i < array.length; i++) {
//            if (array[i].getBrand() == "Ford") {
//                System.out.println(array[i].getModel() + "; Price: " + array[i].getPrice() + "; Year: " + array[i].getYear());
//            }
//            if (array[i].getYear() < 2010) {
//                System.out.println(array[i].getModel() + " - " + array[i].getYear());
//            }
            if (array[i].getPrice() > 200000) {
                System.out.println(array[i].getBrand() + " " + array[i].getModel());
            }
        }
    }
}

