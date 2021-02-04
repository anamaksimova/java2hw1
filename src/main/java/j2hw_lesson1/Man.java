package j2hw_lesson1;

public class Man implements RunJumpable{
    public double getRunSpeed() {
        return runSpeed;
    }

    public double getJumpHight() {
        return jumpHight;
    }

    private double runSpeed;
    private double jumpHight;

    public Man(double runSpeed, double jumpHight) {
        this.runSpeed = runSpeed;
        this.jumpHight=jumpHight;
    }




    @Override
    public void run() {
        System.out.println("Человек бегает со скоростью "+ getRunSpeed() +" км/ч");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает на высоту " + getJumpHight() + " м");

    }
}
