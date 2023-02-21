package cls.q196.ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
    private String name;
    private String tel;
    private String addr;

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getAddr() {
        return addr;
    }

    public Person(String name, String tel, String addr) {
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }

    public void print() {
        System.out.println("name : " + getName());
        System.out.println("tel : " + getTel());
        System.out.println("addr : " + getAddr());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] person = new Person[3];

        for (int i = 0; i < person.length; i++) {
            person[i] = new Person(sc.next(), sc.next(), sc.next());
        }
        sc.close();

        new Main().sort(person);

        person[0].print();
    }

    public void sort(Person person[]) {
        Arrays.sort(person, Comparator.comparing(Person::getName));
    }
}