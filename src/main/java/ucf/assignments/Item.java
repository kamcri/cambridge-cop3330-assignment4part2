/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kameryn Cambridge
 */

package ucf.assignments;

import java.time.LocalDate;

/*
* Describing what an item(task) is. setting description, due dates, and if it is complete.
* Methods that deal with an item
* This is a model
* */
public class Item {

    private String description;
    private LocalDate dueDate;
    boolean completed = false;

    public Item() {
        this.setDueDate(dueDate);
        this.setDescription(description);
        this.setCompleted(completed);
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    //call this method in the "EditItemController"
    public void editItem(List list, Item old, Item newItem){
            for(int i = 0; i < list.itemsList.size(); i ++){
                if(list.itemsList.get(i) == old){
                    list.itemsList.set(i, newItem);
                }
        }
    }


}