/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_SS;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class Student {
    private String id;
    private String name;
    private double score;
    public Student(){
        id="";
        name="";
        score=0;
    }
    public Student(String id, String name, double score){
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }
    @Override
     public String toString(){
         return id+"\t"+name+"\t"+score;
     }
}
