package j2hw_lesson1;

public class Racetrack implements Valuable {


    private double racetrackSpeed;

    public Racetrack (double racetrackSpeed) {
        this.racetrackSpeed= racetrackSpeed;
    }
    public double getRacetrackLength() {
        return racetrackSpeed;
    }

    public void setRacetrackLength(double racetrackLength) {
        this.racetrackSpeed= racetrackSpeed;
    }


    @Override
    public void measure(double value) {
        if (value <racetrackSpeed ){
            System.out.println("Препятствие беговая дорожка не пройдено");
    } else if(value>=racetrackSpeed) {
            System.out.println("Препятствие беговая дорожка пройдено успешно");
        }

}

    @Override
    public void getInfo() {
        System.out.println("Для прохождения беговой дорожки надо бежать со скоростью выше "+ racetrackSpeed+" км/ч");
    }

}
