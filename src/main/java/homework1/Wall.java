package homework1;

public class Wall implements Barriers {

    int wallHeight;
    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public void doIt() {
        // должен вызывать у участника свой метод jump -?????? не знаю, как реализовать
    }
}
