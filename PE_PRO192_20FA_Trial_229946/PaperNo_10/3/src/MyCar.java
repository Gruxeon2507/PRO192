
import java.util.List;
import java.math.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Hoang Minh
 */
public class MyCar implements ICar{
    @Override
    public int f1(List<Car>t){
        double rate=0;
        for(int i=0;i<t.size();i++){
            rate+=t.get(i).getRate();
        }
        rate=rate/t.size();
        int result= (int)Math.floor(rate);
        return result;
    }
    @Override
    public void f2(List<Car> t){
        int min=t.get(0).getRate();
        int max=min;
        int lmin=0,lmax=0;
        for(int i=1;i<t.size();i++){
            if(min>t.get(i).getRate()){
                min=t.get(i).getRate();
                lmin=i;
            }
            if(max<t.get(i).getRate()){
                max=t.get(i).getRate();
                lmax=i;
            }   
        }
        Car cr = new Car();
        cr= t.get(lmin);
        Car cr1 = new Car();
        cr1=t.get(lmax);
        t.remove(lmin);
        t.add(lmin, cr1);
        t.remove(lmax);
        t.add(lmax,cr);
    }
    @Override
    public void f3(List<Car>t){
        Car temp = new Car();
        Car temp1= new Car();
        for(int i=0;i<t.size();i++){
            for(int j=0;j<t.size();j++){
                if(t.get(i).getMaker().compareToIgnoreCase(t.get(j).getMaker())<0){
                    temp=t.get(i);
                    temp1=t.get(j);
                    t.remove(i);
                    t.add(i,temp1);
                    t.remove(j);
                    t.add(j,temp);
                }
                else if(t.get(i).getMaker().compareToIgnoreCase(t.get(j).getMaker())== 0 &&t.get(i).getRate()>t.get(j).getRate()){
                    temp=t.get(i);
                    temp1=t.get(j);
                    t.remove(i);
                    t.add(i,temp1);
                    t.remove(j);
                    t.add(j,temp);
                }
            }
        }
    }
}
