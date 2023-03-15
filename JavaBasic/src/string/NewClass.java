/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author nuke duke
 */
import java.util.Scanner;
public class NewClass {

    public static void main(String[] args) {
        String str = "khieu minh duc";
        String str2 = "HA";
        if (str.compareToIgnoreCase(str2) == 0) {
            System.out.println(str + "=" + str2);
        } else if (str.compareToIgnoreCase(str2) > 0) {
            System.out.print(str + "<" + str2);
        } else {
            System.out.println(str + ">" + str2);
        }
        //startsWith kiem tra xau str2 co nam o phan dau cua xau str hay khong
        //str.endsWith(str2) kiem tra xem xau str2 co nam o phan cuoi cua sau str hay khong
        if (str.startsWith(str2)) {
            System.out.println("Str2 la phan dau cua str");
        } else {
            System.out.println("Str2 khong la phan dau cua str");
        }
        //str.equals(str2):cho true neu 2 xau= nhau, nguoc lai cho false
        //str.equalsIgnoreCase(str2): tuong tu nhu equal, khong phan biet chu hoa va chu thuong
        String[] str3 = str.split("[ ]+");
        String str4="";
        //su dung + khi co nhieu ki tu tach tu nam canh nhau
        //ki tu nam trong ngoac vuong la ki tu tach tu
        int count = 0;
        for (int i=0;i<str3.length;i++) {
            str4=str4+ str3[i].substring(0, 1).toUpperCase()+str3[i].substring(1)+" "; 
 //            count++;
//            char[] array = var.toCharArray();
//            array[0] = Character.toUpperCase(array[0]);
//            var = String.valueOf(array);
//            System.out.print(var+" ");
        }
        System.out.println(str4);
        System.out.println("\n So tu trong cau la: "+str3.length);
        str= "Ha noi mua nay";

        Scanner sc=new Scanner(str);
        int i=0;
        String[] str5 = {};
        while(sc.hasNext()){
                   str5[i]= sc.next();
                   i++;
                    
        }
        for( i=0;i<str5.length;i++){
            System.out.println(str5[i]);
        }
    }

}
