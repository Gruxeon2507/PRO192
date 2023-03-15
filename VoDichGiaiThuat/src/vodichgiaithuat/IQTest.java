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
public class IQTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int odd=0;int even=0;
        for(int i=0;i<n;i++){
            array[i] =sc.nextInt();
            if(array[i]%2==0) even++;
            else odd++;
        }
        if(odd>even){
            for(int i=0;i<n;i++){
                if(array[i]%2==0){
                    System.out.println(i+1);
                    break;
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(array[i]%2==1){
                    System.out.println(i+1);
                    break;
                }
            }            
        }
    }
}
