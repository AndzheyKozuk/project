package home_assignment.task_manager.repository;

import home_assignment.task_manager.database.database;
import home_assignment.task_manager.domain.task_model.current_task;
import home_assignment.task_manager.domain.task_model.default_task;

public class task_repository {

    void save_task(database database, default_task default_task, current_task current_task) {}
    void delete_task(database database, default_task default_task, current_task current_task)  {}
    void new_task(database database, default_task default_task, current_task current_task) {}
    void complete_task(database database, default_task default_task, current_task current_task)  {}

}
