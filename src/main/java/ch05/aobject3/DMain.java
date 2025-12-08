package ch05.aobject3;
// DMain.java -> D1.class, D2.class, DMain.class
class D1{

}
class D2{

}
public class DMain {
    public static void main(String[] args) {
        D1 d1 = new D1();
        System.out.println(d1);
        D1 d11 = d1;
        System.out.println(d11);
        System.out.println(d1 == d11);//true
        System.out.println(d1.equals(d11));//true
    }
}
