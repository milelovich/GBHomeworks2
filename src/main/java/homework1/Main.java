package homework1;

import com.sun.codemodel.internal.JForEach;
import sun.tools.jconsole.inspector.XObject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Robot robot1 = new Robot(11,11);
        Human human1 = new Human(11,11);
        Cat cat1 = new Cat(11,11);

        Wall wall1 = new Wall(8);
        Track track1 = new Track(8);

        Object[] competitors = new Object[5];
        competitors[0] = robot1;
        competitors[1] = human1;
        competitors[2] = cat1;

        Object[] barriers = new Object[2];
        barriers[0] = wall1;
        barriers[1] = track1;

        for (int i = 0; i < competitors.length; i++){
            for(int j = 0; i<barriers.length; j++){

                //    barriers[i]

                //      стена[index].height() _сравнение кот[index].run()

            }
        }


    }


}
