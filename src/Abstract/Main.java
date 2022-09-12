package Abstract;

public class Main {

    public static void main(String[] args) {
        Guitar g = new Guitar();
        Violin v = new Violin();
        Drum d = new Drum();

        g.play();
        v.play();
        d.play();
    }
}
