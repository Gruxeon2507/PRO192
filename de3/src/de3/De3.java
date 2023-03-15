/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de3;
import java.io.*;
import java.util.*;
public class De3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter  tên : ");
       String ten = in.readLine();
       System.out.print("Enter điểm1: ");
       double diem1 = Double.parseDouble(in.readLine());       
       System.out.print("Enter điểm 2: ");
       double diem2 = Double.parseDouble(in.readLine());
       System.out.print("Enter TC: ");
       int tc = Integer.parseInt(in.readLine());
       System.out.println("OUTPUT:");      
       if(tc == 1) {
            Nguoi b = new Nguoi(ten);
            System.out.println(b);
            b = new SinhVien(ten, (float)diem1, (float)diem2);
            System.out.println(b);
       }
       else if(tc == 2) {
           SinhVien b = new SinhVien(ten, (float)diem1, (float)diem2);
           System.out.println(b.getDTB());
       }
   }
 }

    

