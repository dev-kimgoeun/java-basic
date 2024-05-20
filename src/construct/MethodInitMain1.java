package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 20;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 42;
        member2.grade = 99;

        MemberInit [] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름 : " + member.name + ", 나이 : "+member.age + ", 성적 : " + member.grade);
        }
    }
}
