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
import java.util.Scanner;

public class Manager_SS {

    public static void main(String[] args) {
        Student[] obj = new Student[100];
        String id = "";
        String name = "";
        double score = 0;
                int number=0;
        InputMany(id, name, score, obj,number);
        OutputMany(obj,number);

        AnoInterface obj1 = new AnoInterface() {
            public void Find(Student obj[]) {
                int x;
                Scanner sc = new Scanner(System.in);
                System.out.println("1.find by name \n2.find by id\n3.findbyscore");
                x = sc.nextInt();
                sc.nextLine();
                switch (x) {
                    case 1:
                        String namefind;
                        System.out.println("Insert name to find: ");
                        namefind = sc.next();
                        for (int i = 0; i < obj.length; i++) {
                            if (obj[i].getName().equalsIgnoreCase(namefind)) {
                                System.out.println(obj[i]);
                            }
                        }
                        break;
                    case 2:
                        String idfind;
                        System.out.println("Insert id to find: ");
                        idfind = sc.next();
                        for (int i = 0; i < obj.length; i++) {
                            if (obj[i].getId().equalsIgnoreCase(idfind)) {
                                System.out.println(obj[i]);
                            }
                        }
                        break;
                    case 3:
                        double scorefind;
                        System.out.println("Insert score to find: ");
                        scorefind = sc.nextDouble();
                        for (int i = 0; i < obj.length; i++) {
                            if (obj[i].getScore() == scorefind) {
                                System.out.println(obj[i]);
                            }
                        }
                        break;   
                }
            }
        };
        obj1.Find(obj);

    }

    public static void InputMany(String id, String name, double score, Student[] obj,int number) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Enter number of students: ");
        n = sc.nextInt();
        number=n;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Input id: ");
            id = sc.nextLine();
            System.out.println("Input name: ");
            name = sc.nextLine();
            System.out.println("Input score: ");
            score = sc.nextDouble();
            sc.nextLine();
            obj[i] = new Student(id, name, score);
        }
    }

    public static void OutputMany(Student[] obj,int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(obj[i]);
        }
    }
}
