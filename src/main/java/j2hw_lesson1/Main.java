package j2hw_lesson1;

public class Main {
    public static void main(String[] args) {


        RunJumpable [] runjumpArray = {new Cat(55,3), new Robot(80,6), new Man(45,2)};
        Valuable [] obstacleArray ={new Wall(2), new Racetrack(50)};


        for (Valuable v: obstacleArray) {
            v.getInfo();
            for (RunJumpable j : runjumpArray) {

               if (v.equals(obstacleArray[0])) {
               j.jump();
                v.measure(j.getJumpHight());
               } else if (v.equals(obstacleArray[1])){

                j.run();
                v.measure(j.getRunSpeed());}

            }

        }




    }
}
