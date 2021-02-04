package j2hw_lesson1;

public class Cat implements RunJumpable{
    public Cat(double runSpeed, double jumpHight) {
        this.runSpeed = runSpeed;
        this.jumpHight = jumpHight;
    }

    public double getRunSpeed() {
        return runSpeed;
    }

    public double getJumpHight() {
        return jumpHight;
    }

    private double runSpeed;
    private double jumpHight;
    @Override
    public void run() {
        System.out.println("Кот бегает со скоростью "+ getRunSpeed() +" км/ч");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает на высоту " + getJumpHight() + " м");


    }
}
