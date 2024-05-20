package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        //절차 지향 프로그래밍 메서드 생성

        MusicPlayerData data = new MusicPlayerData();

        //음악플레이어 켜기
        on(data);

        //볼륨증가
        volumeUp(data);
        volumeUp(data);
        volumeUp(data);

        //볼륨감소
        volumeDown(data);

        //음악 플레이어 상태
        status(data);

        //음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off (MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("볼륨을 증가합니다. "+data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("볼륨을 감소합니다." + data.volume);
    }

    static void status (MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 on, 볼륨 : " + data.volume );
        }else {
            System.out.println("음악 플레이어 off");
        }
    }
}
