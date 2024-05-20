package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        //객체지향 프로그래밍
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.volumeUp();
        player.volumeUp();
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();
        player.status();
        player.off();
    }
}
