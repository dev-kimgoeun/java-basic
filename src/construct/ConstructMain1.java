package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("USER1", 34, 99);
        MemberConstruct member2 = new MemberConstruct("USER2", 43, 39);

        MemberConstruct[] members = {member1,member2};

        for (MemberConstruct member : members) {
            System.out.println("이름 : "+member.name + " 나이 : "+ member.age + " 성적 : " + member.grade);
        }
    }
}
