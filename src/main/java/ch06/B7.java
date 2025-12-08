package ch06;

public class B7 {
    public static void main(String[] args) {
        String s = null;
        //System.out.println(null.toString());
        //아래 조건을 만족했을 때만 실행문이 실행됨
        if(s!=null){
            System.out.println(s.toString());
        }
        System.out.println("여기");
    }
}
