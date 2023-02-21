package cls.q195.ex2;

import java.util.Scanner;

class Information{
    private final String name;
    private final String num;
    private final String add;

    public Information(String name, String num, String add){
        this.name = name;
        this.num = num;
        this.add = add;
    }
    public String getName() {
        return name;
    }
    public String getNum() {
        return num;
    }
    public String getAdd() {
        return add;
    }

    public void print(){
        System.out.println("name : " + getName());
        System.out.println("tel : " + getNum());
        System.out.println("addr : " + getAdd());
    }
}


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String num = sc.next();
        String add = sc.next();
        sc.close();
        Information inf = new Information(name,num,add);
        inf.print();
    }
}
