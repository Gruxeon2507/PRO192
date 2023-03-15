/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource_manager;

/**
 *
 * @author Nguyen Hoang Minh
 */
import java.util.Scanner;

class Resource_Manager {

    String id;
    String name;
    int age;
    String subject;

    public Resource_Manager(String id, String name, int age, String subject) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + age + "\t" + subject;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

}

public class Main_Resource_Manenger {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Resource_Manager[] obj = new Resource_Manager[30];
        String xid;
        String xname;
        int xage;
        String xsubj;

        for (int i = 0; i < 4; i++) {
            System.out.println("id= ");
            xid = sc.next();
            System.out.println("name= ");
            xname = sc.next();
            System.out.println("age=");
            xage = sc.nextInt();
            System.out.println("subject=");
            xsubj = sc.next();
            obj[i] = new Resource_Manager(xid, xname, xage, xsubj);
            obj[i].setAge(setvalueage(obj[i]));
        }
        for (Resource_Manager var : obj) {
            System.out.println(var);
            System.out.println("Find result: ");
            find_name(obj,"HA");
        }

    }

    static int setvalueage(Resource_Manager obj) {
        if (obj.getAge() >= 30) {
            return obj.getAge() * 2;
        } else {
            return obj.getAge();
        }
    }
    static void find_name(Resource_Manager[] obj, String nameFind){
         for (Resource_Manager var : obj){
             if (var.getName().equals(nameFind))
                 System.out.println(var);
         }
    }
}

/**
 * @param args the command line arguments
 */
