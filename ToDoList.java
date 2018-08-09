import java.util.ArrayList;

public class ToDoList{

   private String nameOfList;
   private ArrayList<ToDoTask> list;   
   
   public ToDoList(String name){
      nameOfList = name;
      list = new ArrayList<ToDoTask>();
   }
   
   public String getName(){
      return nameOfList;
   }
   
   public void add(ToDoTask task){
      list.add(task);
   }
   
   public ToDoTask getTask(int i){
      return list.get(i);
   }
   
   public String toString(){
      String str = "";
      str += "-----"+getName()+"-----\n";
      
      for(int i = 0; i<list.size(); i++){
         str += "\n"+list.get(i).toString()+"\n";
      }
      
      return str;
   }
   
   public void remove(ToDoTask task){
      for(int i=0; i<list.size(); i++){
         if(list.get(i).equals(task)){
            list.remove(i);
         }
      }
   
   }


}