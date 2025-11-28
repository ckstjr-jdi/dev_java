package ch02;

import javax.swing.*;

public class UIVariable1 {
    public static void main(String[] args) {
        //윈도우가 제공하는 창을 구현한 클래스가 JFrame이다.
        JFrame jf = new JFrame();
        //JFrame클래스에는 setSize와 setVisible메서드가 선언되어 있음.
        //인스턴스변수 호출이 가능하다.
        //호출할 때는 파라미터의 타입과 갯수를 맞추어야 한다.
        //insert here
        //창의 가로크기를 정하는 변수를 선언하시오
        int width = 500;
        //창의 세로크기를 정하는 변수도 선언하시오
        int heigth = 500;
        jf.setSize(width, heigth);
        boolean isView = true;
        isView = false;
        isView = true;
        //jf.setVisible(상수값 대신에 변수를 쓰시오.);
        jf.setVisible(isView);
    }
}