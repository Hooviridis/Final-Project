import java.util.Date;
import java.util.ArrayList;

public class Test{

   public static void main(String[] args){
      ToDoTask item = new ToDoTask("Take out the Trash");
      
      item.setDateDue("08/08/2018");
      item.setTimeDue("06:30 PM");
      
      System.out.println(item);
      
      ToDoList list = new ToDoList("Chores");
      list.add(item);
      
      ToDoTask item2 = new ToDoTask("Clean Kitchen");
      item2.setDateDue("08/08/2018");
      item2.setTimeDue("06:45 PM");
      
      ToDoTask item3 = new ToDoTask("Make Dinner");
      item3.setDateDue("08/08/2018");
      item3.setTimeDue("05:45 PM");
      
      System.out.println(item.equals(item2));
      System.out.println(item.equals(item));
      

      list.add(item2);
      list.add(item3);
      System.out.println();
      System.out.println(list.getTask(1));
  /*    
      ArrayList<ToDoList> lists = new ArrayList<ToDoList>();
      
      lists.add(list);
      lists.add(list);
      lists.add(list);
      lists.add(list);
      
      System.out.println("\n" + lists.get(2));
      System.out.println(lists.size());
      
      */
      System.out.println(list);
      list.remove(item2);
      System.out.println(list);
      
   }

}