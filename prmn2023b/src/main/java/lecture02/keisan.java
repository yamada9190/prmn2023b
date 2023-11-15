package lecture02;

public class keisan {

    int sum(int[] num) {
        int x = 0;
        for (int j = 0; j < 5; j++) {
            x += num[j];
        }
        System.out.printf("合計値：%d", x);
        return x;
    }
    void judge(int x){
        if(x >= 100){
            System.out.println("great!!");
        }else if(x >= 50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
