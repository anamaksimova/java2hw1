package j2hw_lesson1;

public class Wall implements Valuable{
    public void setWallHight(double wallHight) {
        this.wallHight = wallHight;
    }

    private double wallHight;

    public double getWallHight() {
        return wallHight;
    }

    public Wall(double wallHight) {
        this.wallHight = wallHight;

    }


    @Override
    public void measure(double value) {
        if (value <=wallHight ){
            System.out.println("Препятствие стена не пройдено");

        } else if(value > wallHight){
            System.out.println("Препятствие стена пройдено успешно");
        }

    }

    @Override
    public void getInfo() {
        System.out.println("Для прохождения стены надо прыгать выше высоты стены, которая равна "+ wallHight+" м");
    }
}
