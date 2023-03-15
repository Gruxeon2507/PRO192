/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vodichgiaithuat;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hoang Minh
 */
public class XeniaandRingroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double[] array = new double[m];
        for(int i=0;i<m;i++){
            array[i] = sc.nextDouble();
        }
        double time=0;
        double location=1;
        for(int i=0;i<m;i++){
            if(array[i]>=location){
                time=time+array[i]-location;
                location = array[i];
            }
            else{
                time=time+n+array[i]-location;
                location=array[i];
            }
            
        }
        System.out.format("%.0f", time);
    }
}
