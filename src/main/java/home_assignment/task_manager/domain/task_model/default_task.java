package home_assignment.task_manager.domain.task_model;

public class default_task extends abstract_task {

    private String name;
    private String category;
    private int priority;
    private String due_date;

    public void set_default_task(String name, String category, int priority, String due_date){

        this.name = name;
        this.category = category;
        this.priority = priority;
        this.due_date = due_date;

    }

    public int get_priority(){

        int i = priority;
        return i;

    }

    public String toString() {

        String s =
                    "Name: " +
                    name +
                    ", Category: " +
                    category +
                    ", Priority: " +
                    priority +
                    ", Due date: " +
                    due_date;
        return s;

    }

}
