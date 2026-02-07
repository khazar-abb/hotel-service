package AbstractionInheritancePolymorphism.MediaPlayer;

public class Main {
    static void main() {

        Media m_01 = new Movie();
        Media m_02 = new Music();
        Media m_03 = new Podcast();

        Media[] mediaList = {m_01, m_02, m_03};

        for (int i = 0; i < mediaList.length; i++){
            mediaList[i].play();
        }
    }
}