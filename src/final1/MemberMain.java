package final1;

public class MemberMain {
    public static void main(String[] args) {

        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("myID", "LEE");
        member.print();
    }
}
