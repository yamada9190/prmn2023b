package lecture02;

import java.util.Scanner;
public class pra2_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("氏名を入力");
        String name1 = input.next();
        System.out.println("学籍番号を入力");
        int num = input.nextInt();
        System.out.println("氏名:" + name1 + ",学籍番号:b" + num);
    }
}
