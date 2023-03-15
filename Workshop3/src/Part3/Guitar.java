/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part3;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class Guitar {

    private String SerialNumber;
    private String model;
    private String builder;
    private int price;
    private String backWood;
    private String topWood;

    public Guitar() {
        this.SerialNumber = "";
        this.backWood = "";
        this.builder = "";
        this.model = "";
        this.price = 0;
        this.topWood = "";
    }

    public Guitar(String SerialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.SerialNumber = SerialNumber;
        this.backWood = backWood;
        this.builder = builder;
        this.model = model;
        this.price = price;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getBuilder() {
        return builder;
    }

    public int getPrice() {
        return price;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    public void createSound() {
        System.out.println("Back Wood:"+getBackWood());
        System.out.println("Builder: "+getBuilder());
        System.out.println("Model: "+getModel());
        System.out.println("Price: "+getPrice());
        System.out.println("Serial Number: "+getSerialNumber());
        System.out.println("Top Wood: " +getTopWood());

    }
}
