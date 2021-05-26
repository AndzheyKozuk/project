package home_assignment.task_manager.domain.task_model;


import home_assignment.task_manager.database.database;

public abstract class abstract_task implements task_interface {


    @Override
    public void show_task(default_task default_task, current_task current_task) {
        System.out.println(default_task.toString() + " " + current_task.toString());
    }

    public void show_task(default_task default_task) {
        current_task current_task = new current_task();
        current_task.set_current_task("current_name",false, "today", "now");
        show_task(default_task, current_task);
    }

    public void show_task(current_task current_task) {
        default_task default_task = new default_task();
        default_task.set_default_task("none", "none", 0, "none");
        show_task(default_task, current_task);
    }

    @Override
    public boolean compare_priority(default_task task_0, default_task task_1) {
        boolean h = false;
        if (task_0.get_priority() < task_1.get_priority()) {
            h = false;
            System.out.println("The task below is of higher priority. \n" + task_1.toString());
        }
        if (task_0.get_priority() == task_1.get_priority()) {
            h = false;
            System.out.println("Both tasks are of equal priority.");
        }
        if (task_0.get_priority() >= task_1.get_priority()) {
            h = true;
            System.out.println("The task below is of higher priority. \n" + task_0.toString());
        }
        return h;
    }

    @Override
    public void get_next(database database){
        System.out.println(database.pending_box.get(0));
    }



}
