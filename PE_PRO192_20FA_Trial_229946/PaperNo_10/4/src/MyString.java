/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Hoang Minh
 */
public class MyString implements IString{
    @Override
    public int f1(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='5'||str.charAt(i)=='7'){
                count++;
            }
        }
        return count;
    }
    @Override
    public String f2(String str){

//        String[] array = new String[100];
//        int k=0;
//        int flag=0;
//        for(int i=0;i<str.length()-2;i++){
//            if(str.charAt(i+1)==' '){
//                array[k]= str.substring(flag, i+1);
//                flag=i+2;
//                k++;
//            }
//        }
//
//        for(int i=str.length()-1;i>0;i--){
//            if(str.charAt(i-1)==' '){
//                array[k]=str.substring(i,str.length()-1);
//                break;
//            }
//        }
//
//        str=array[k];
//        for (int i=k-1;i>=0;i--){
//            str=str+" "+array[i];
//        }
//
//        str+=array[k];
//        return str;
//    }
    String[] array = str.split(" ");
    str=array[array.length-1];
    for(int i=array.length-2;i>=0;i--){
        str=str+" "+array[i];
    }
    return str;
    }
}
