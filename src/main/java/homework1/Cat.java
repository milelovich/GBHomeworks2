package homework1;

public class Cat implements Action {

    int distance;
    int height;

    public Cat(int distance, int height) {
        this.distance = distance;
        this.height = height;
    }

    public void run(int distance){
        System.out.println("Cat is running on distance" + distance);
    }
    public void jump(int height){
        System.out.println("Cat is jumping on height" + height);
    }
}
