/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Hoang Minh
 */
public class Book {
    int price;
    String title;
    public Book(){
        price = 0;
        title = "";
    }
    public Book(String title, int price){
        this.title=title;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title.toUpperCase();
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
