package homework1;

public class Track implements Barriers {

    int trackDistance;
    public Track(int trackDistance) {
        this.trackDistance = trackDistance;
    }

    @Override
    public void doIt() {
        // должен вызывать у участника свой метод run -?????? не знаю, как реализовать
    }
}
