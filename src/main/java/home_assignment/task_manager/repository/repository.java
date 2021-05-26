package home_assignment.task_manager.repository;

import home_assignment.task_manager.database.database;
import home_assignment.task_manager.domain.task_model.current_task;
import home_assignment.task_manager.domain.task_model.default_task;

public class repository extends task_repository {

    @Override
    void save_task(database database, default_task default_task, current_task current_task){
        // add default and current task to database
        String task_string = default_task.toString() + " " + current_task.toString();
        database.add_task(task_string);
    }

    @Override
    void delete_task(database database, default_task default_task, current_task current_task){
        // find default and/or current task in database and delete the entry
        String task_string = default_task.toString() + " " + current_task.toString();
        database.remove_task(database.get_index(task_string));
    }

    @Override
    void new_task(database database, default_task default_task, current_task current_task){
        String task_string = default_task.toString() + " " + current_task.toString();
        database.new_task(database.get_index(task_string));
    }

    @Override
    void complete_task(database database, default_task default_task, current_task current_task){
        String task_string = default_task.toString() + " " + current_task.toString();
        database.complete_task(database.get_index(task_string));
    }

}
