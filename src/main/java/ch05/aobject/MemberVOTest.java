package ch05.aobject;

public class MemberVOTest {
    public static void main(String[] args) {
        MemberVO mvo = new MemberVO();
        //접근제한자(access modifier)가 private - 캡슐화
        mvo.mem_id = "kiwi";
    }
}
