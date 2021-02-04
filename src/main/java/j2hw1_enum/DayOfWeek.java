package j2hw1_enum;

public enum DayOfWeek {
    MONDAY("Понедельник", 8),
    TUESDAY("Вторник", 8),
    WEDNESDAY("Среда", 8),
    THURSDAY("Четверг", 8),
    FRIDAY("Пятница", 8),
    SATURDAY("Суббота", 0),
    SUNDAY("Воскресенье", 0);

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getWorkingHours() {
        return workingHours;
    }


    private int workingHours;
    private String dayOfWeek;


    DayOfWeek(String dayOfWeek, int workingHours) {
        this.workingHours = workingHours;
        this.dayOfWeek = dayOfWeek;
    }

    public void getWorkingHoursLeft() {

        int getWorkingHoursLeft = 0;
        switch (dayOfWeek) {
            case "Понедельник":
                getWorkingHoursLeft = MONDAY.getWorkingHours() + TUESDAY.getWorkingHours() + WEDNESDAY.getWorkingHours() + THURSDAY.getWorkingHours() + FRIDAY.getWorkingHours() + SATURDAY.getWorkingHours() + SUNDAY.getWorkingHours();
                System.out.println("До конца недели осталось отработать " + getWorkingHoursLeft + " часов");
                break;
            case "Вторник":
                getWorkingHoursLeft = TUESDAY.getWorkingHours() + WEDNESDAY.getWorkingHours() + THURSDAY.getWorkingHours() + FRIDAY.getWorkingHours() + SATURDAY.getWorkingHours() + SUNDAY.getWorkingHours();
                System.out.println("До конца недели осталось отработать " + getWorkingHoursLeft + " часов");
                break;
            case "Среда":
                getWorkingHoursLeft = WEDNESDAY.getWorkingHours() + THURSDAY.getWorkingHours() + FRIDAY.getWorkingHours() + SATURDAY.getWorkingHours() + SUNDAY.getWorkingHours();
                System.out.println("До конца недели осталось отработать " + getWorkingHoursLeft + " часов");
                break;
            case "Четверг":
                getWorkingHoursLeft = THURSDAY.getWorkingHours() + FRIDAY.getWorkingHours() + SATURDAY.getWorkingHours() + SUNDAY.getWorkingHours();
                System.out.println("До конца недели осталось отработать " + getWorkingHoursLeft + " часов");
                break;
            case "Пятница":
                getWorkingHoursLeft = FRIDAY.getWorkingHours() + SATURDAY.getWorkingHours() + SUNDAY.getWorkingHours();
                System.out.println("До конца недели осталось отработать " + getWorkingHoursLeft + " часов");
                break;
            case "Суббота":
                System.out.println("Сегодня выходной");
                break;
            case "Воскресенье":
                System.out.println("Сегодня выходной");
                break;
        }



    }
}



