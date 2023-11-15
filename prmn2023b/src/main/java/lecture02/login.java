package lecture02;

import java.util.Scanner;

public class login {
    String[][] teigi() {
        String[][] list = new String[5][2];
        list[0][0] = "B2220000";
        list[0][1] = "andou";
        list[1][0] = "B2220010";
        list[1][1] = "itou";
        list[2][0] = "B2220020";
        list[2][1] = "katou";
        list[3][0] = "B2220040";
        list[3][1] = "satou";
        list[4][0] = "B2220050";
        list[4][1] = "yamada";
        return list;
    }

    void access(String[][] list, String num) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            if (num.equals(list[i][0])) {
                System.out.print("パスワードを入力してください");
                String pass = input.next();
                if(pass.equals(list[i][1])) {
                    System.out.print("ログイン完了");
                } else{
                    System.out.print("不正なアクセス");
                    System.exit(0);
                }
                return;
            }
        }
        System.out.print("error!!");
        System.exit(0);
    }

}
