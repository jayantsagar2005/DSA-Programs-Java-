package OPPs.Introduction;

class CarDetails{
    String engineName;
    int seat;
    double price;

    public CarDetails(String engineName, int seat, double price) {
        this.engineName = engineName;
        this.seat = seat;
        this.price = price;
    }

    public String geeting(){
        return "Hello, my name is Jayant Kumar. And your name is ?";
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "engineName='" + engineName + '\'' +
                ", seat=" + seat +
                ", price=" + price +
                '}';
    }
}

public class Constructor {
    public static void main(String[] args) {
        CarDetails car1 = new CarDetails("Petrol Engine", 4, 42563.50);
        CarDetails car2 = new CarDetails("Small Engine", 4, 40063.00);
        CarDetails car3 = new CarDetails("Big Engine", 2, 40003.64);

        System.out.println(car1.geeting()+"\n"+car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
    }
}
