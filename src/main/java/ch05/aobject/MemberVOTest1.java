package ch05.aobject;

public class MemberVOTest1 {
    public static void main(String[] args) {
        //객체배열은 주소번지를 두 번 접근해야 함.
        MemberVO[] mvos = new MemberVO[3];
        MemberVO[] mvo1 = new MemberVO[]{null, null, null};
        for (MemberVO mvo: mvos){
            System.out.println(mvo);
        }
        for (MemberVO mvo: mvo1){
            System.out.println(mvo);
        }

        MemberVO mvo = new MemberVO();
        mvo.setMem_id("kiwi");
        mvo.setMem_id("apple");
        mvo.setMem_id("tomato");
        mvos[0] = mvo;
        //this.mem_id = mem_id


        mvos[0] = new MemberVO();
        mvos[0].setMem_id("kiwi");

        mvos[1] = new MemberVO();
        mvos[1].setMem_id("apple");

        mvos[2] = new MemberVO();
        mvos[2].setMem_id("tomato");
        System.out.println(mvos[0].getMem_id());
        System.out.println(mvos[1].getMem_id());
        System.out.println(mvos[2].getMem_id());

    }
}
