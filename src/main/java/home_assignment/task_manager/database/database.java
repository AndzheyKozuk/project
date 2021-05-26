package home_assignment.task_manager.database;

import java.util.ArrayList;

public final class database {

    //default_task
    //private static final String name = "Task_1";
    //private static final String category = "none";
    //private static final int priority = 0;
    //private static final String due_date = "Monday";

    //current_task
    //private static final String current_name = "Task_0";
    //private static final boolean repeatable = false;
    //private static final String date = "24.05.21";
    //private static final String time = "Morning";

    private ArrayList<String> all_tasks = new ArrayList<>();
    public ArrayList<String> pending_box = new ArrayList<>();
    public ArrayList<String> done_box = new ArrayList<>();

    public int get_index(String task){
        int i = 0;
        i = all_tasks.indexOf(task);
        return i;
    }

    public void add_task(String task){
        this.all_tasks.add(task);
    }

    public void remove_task(int i){
        this.all_tasks.remove(i);
    }

    public void new_task(int i) {
        //moves an entry from all tasks to pending
        this.pending_box.add(all_tasks.get(i));
    }

    public void complete_task(int i) {
        //moves an entry from pending to done
        this.done_box.add(pending_box.get(i));
        this.pending_box.remove(i);
    }


}
