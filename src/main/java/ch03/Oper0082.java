package ch03;
class Y {
    int ival;
}
public class Oper0082 {
    public static void main(String[] args) {
        Y y1 = new Y();
        Y y2 = y1;
        y2.ival = 100;
        System.out.println(y1 == y2);//false출력됨
        System.out.println(y1.ival+", "+y2.ival);
        System.out.println(y1+", "+y2);
    }
}
