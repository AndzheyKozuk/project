package home_assignment.task_manager.application;

import home_assignment.task_manager.domain.task_model.current_task;
import home_assignment.task_manager.domain.task_model.default_task;

public class application {

    //default_task
    private static final String name = "Task_1";
    private static final String category = "none";
    private static final int priority = 0;
    private static final String due_date = "Monday";

    //current_task
    private static final String current_name = "Task_0";
    private static final boolean repeatable = false;
    private static final String date = "24.05.21";
    private static final String time = "Morning";



    public static void main(String[] args) {

        default_task default_task = new default_task();
        current_task current_task = new current_task();

        default_task.set_default_task(name, category, priority, due_date);
        System.out.println("Default task - " + default_task.toString());

        current_task.set_current_task(current_name, repeatable, date, time);
        //current_task.set_current_time();
        System.out.println("Current task - " + current_task.toString());

        String task = default_task.toString() + ", " + current_task.toString();
        System.out.println("Task - " + task);

    }

}
