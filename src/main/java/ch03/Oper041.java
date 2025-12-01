package ch03;

public class Oper041 {
    public static void main(String[] args) {
        int a = 2;//호출하면 값이 나온다
        //출력이 먼저야? 아니면 증가연산자가 먼저 처리되는거야
        System.out.println(a++);//출력이 먼저다 : 2, 연산이 먼저다 : 3
        a = 2;
        System.out.println(++a);//3
    }
}
