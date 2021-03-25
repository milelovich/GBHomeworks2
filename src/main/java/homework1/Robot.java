package homework1;

public class Robot implements Action {

    int distance;
    int height;

    public Robot(int distance, int height) {
        this.distance = distance;
        this.height = height;
    }


    public void run(int distance){
        //      if (distance > )
        System.out.println("Robot is running on distance" + distance);
    }

    public void jump(int height){
        System.out.println("Robot is jumping on height" + height);
    }
}
