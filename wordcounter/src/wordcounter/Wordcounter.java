/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcounter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hoang Minh
 */
public class Wordcounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputstring = input();
        String array[] = inputstring.split(" ");
        int number_of_word = array.length;
        wordcounter(array);
        charcounter(inputstring);
    }
    public static String input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String input = sc.nextLine();
        return input;
    }
    public static void charcounter(String input){
        ArrayList<Character> charater = new ArrayList<Character>();
        ArrayList<Integer> appear = new ArrayList<Integer>();
        input = input.toLowerCase();
        charater.add(input.charAt(0));
        appear.add(1);       
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)==' ') continue;
            int check = 0;
            for(int j=0;j<charater.size();j++){

                if(input.charAt(i)==charater.get(j)){
                    appear.set(j,appear.get(j) + 1);
                    check++;
                }
            }
            if(check == 0){
                charater.add(input.charAt(i));
                appear.add(1);
            }
        }
        System.out.print("{");
        for(int i=0;i<charater.size()-1;i++){
            System.out.print(charater.get(i)+"="+appear.get(i)+", ");
        }
        System.out.print(charater.get(charater.size()-1)+"="+appear.get(charater.size()-1)+"}\n");
    }
    static Map<String,Integer> x = new HashMap<>();
    public static void wordcounter(String array[]){
        ArrayList<String> string = new ArrayList<String>();
        ArrayList<Integer> appear = new ArrayList<Integer>();        
        string.add(array[0]);
        appear.add(1);
        for(int i=1;i<array.length;i++){
            int check = 0;
            for(int j=0;j<string.size();j++){
                if(string.get(j).equalsIgnoreCase(array[i])){
                    appear.set(j, appear.get(j)+1);
                    check++;
                }
            }
            if(check==0){
                string.add(array[i]);
                appear.add(1);
            }
        }
        System.out.print("{");
        int i;
        for(i=0;i<string.size();i++){
            //System.out.print(string.get(i)+"="+appear.get(i)+", ");
            x.put(string.get(i),appear.get(i));
        }
        for(Map.Entry m:x.entrySet()){
            System.out.println(m.getKey()+"="+m.getValue());
        }
    }
}
