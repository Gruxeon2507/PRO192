
public class Motor {
    private String brandName;
    private double price;
    public Motor() {
        brandName="";
        price=0;
    }
    
    public Motor(String brandName, double price) {
        this.brandName = brandName;
        this.price = price;
    }    

    public String getBrandName() {
        return brandName;
    }

    public double getPrice() {
        return price;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return brandName+"\t"+price;
    }
    
    
}
