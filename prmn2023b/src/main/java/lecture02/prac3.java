package lecture02;

import java.util.Scanner;
public class prac3 {
    public static void main(String[] args) {
        String[][] list = new String[5][1];
        login l = new login();
        list = l.teigi();

        Scanner input = new Scanner(System.in);
        System.out.print("学籍番号を入力してください");
        String num = input.next();
        l.access(list,num);


    }
}
