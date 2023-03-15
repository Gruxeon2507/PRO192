
public class VNMotor extends Motor{  
    private String series;
    public VNMotor() {
        super();
        series="";
    }

    public VNMotor(String brandName, String series, double price) {
        super(brandName, price);
        this.series = series;
    }
    
    /*Complete the below function for second test case*/
    public double getSalePrice() {
        if (getPrice()<3000) return getPrice()*0.95;
        else return getPrice()*0.9;
    }  

    public String getSeries() {
        return series;
    }
    
    @Override
    public String toString(){
        return getBrandName()+"\t"+getSeries()+"\t"+getPrice();
    }
    
    //add and complete your other methods here (if needed)

}
