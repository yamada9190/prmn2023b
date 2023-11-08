package lecture02;

public class enter {
    String name;
    int num;
    enter(String name , int num){
        this.name = name;
        this.num = num;
    }
    void mes(String name_n , int num_n){
        if(name.equals(name_n)){
            if(num == num_n){
                System.out.println("ログイン成功。");
            }
        }else{
            System.out.println("ログイン失敗・");
        }
    }
}
