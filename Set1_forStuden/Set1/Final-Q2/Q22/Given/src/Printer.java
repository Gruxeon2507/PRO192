
public class Printer {

    double price;
    String name;

    public Printer() {
        price = 0;
        name = "";
    }

    public Printer(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    //add and complete you other methods (if needed) here   
}
