package ch06;
//메서드 오버라이딩 : 전제조건이 서로 상속관계에 있거나 구현체 클래스 관계
//선어부를 손댈 수 없다.(파라미터, 리턴타입)
//메서드 오버로딩 : 무조건 파라미터 갯수가 다르거나 타입이 다르면
class C1{
    C1Main cm = null;
    //생성자 - 메서드 오버로딩 규칙 적용됨
    C1(C1Main cm){
        this.cm = cm;
        System.out.println(this.cm.nickName);
    }

}
public class C1Main {
    String nickName = null;
    public static void main(String[] args) {
        C1Main cm = new C1Main();
        C1 c1 = new C1(cm);



    }
}
