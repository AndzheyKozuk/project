package home_assignment.task_manager.domain.task_model;


import home_assignment.task_manager.database.database;

public interface task_interface {

    void show_task(default_task default_task, current_task current_task); // get a string of an assigned field values
    boolean compare_priority(default_task task_0, default_task task_1); // compares priority of a given couple
    void get_next(database database); // next few tasks from pending database


}
