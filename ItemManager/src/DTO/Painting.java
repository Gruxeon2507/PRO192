/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class Painting extends Item{

    private int height;
    private int width;
    private boolean isWatercolor;
    private boolean isFramed;

    public Painting() {
        height = 0;
        width = 0;
        isWatercolor = false;
        isFramed = false;
    }

    public Painting(int height, int width, boolean isWatercolor, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isFramed = isFramed;
        this.isWatercolor = isWatercolor;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isIsWatercolor() {
        return isWatercolor;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setIsWatercolor(boolean isWatercolor) {
        this.isWatercolor = isWatercolor;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void inputPainting() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        height = sc.nextInt();
        System.out.print("Enter width: ");
        width = sc.nextInt();
        System.out.print("Is water colour? ");
        isWatercolor = sc.nextBoolean();
        System.out.print("Is framed? ");
        isFramed = sc.nextBoolean();
    }

    public void outputPainting() {

        System.out.print("Height: " + height);
        System.out.print("Width: " + width);
        System.out.print("Is water colour: " + isWatercolor);
        System.out.print("Is framed: " + isFramed);
    }

}
