package home_assignment.task_manager.domain.task_model;

import java.time.LocalDate;
import java.time.LocalTime;

import static java.lang.String.valueOf;

public class current_task extends default_task {

    private String name;
    private boolean repeatable;
    private String date;
    private String time;

    public void set_current_task(String name, boolean repeatable, String date, String time) {
        this.name = name;
        this.repeatable = repeatable;
        this.date = date;
        this.time = time;
    }

    public boolean get_repeatable(){

        boolean a = repeatable;
        return a;

    }

    public String toString() {

        String str =
                    "Name: " +
                    name +
                    ", Repeatable: " +
                    repeatable +
                    ", Date: " +
                    date +
                    ", Time: " +
                    time;
        return str;

    }

    public void set_current_time() {
        LocalDate Date = LocalDate.now();
        this.date = valueOf(Date);
        LocalTime localtime = LocalTime.now();
        this.time = localtime.toString();
    }
}
