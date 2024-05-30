package poly.ex.Sende;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String a) {
        System.out.println("메일을 발송합니다 : " + a);
    }
}
