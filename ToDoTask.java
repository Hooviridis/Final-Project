import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ToDoTask{

   private String task;
   private LocalDate dateDue;
   private String timeOfTask;
   private LocalDate dateAdded;
   
   public ToDoTask(String task){
         this.task = task;
         
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	      LocalDate date = LocalDate.now();
         this.dateAdded = date;
   }
   
   public void setTimeDue(String time){
      timeOfTask = time;
   }
   
   public void setDateDue(String due){
       DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
       dateDue = LocalDate.parse(due, format);      
   }
   
   public String getTask(){
      return task;
   }
   
   public LocalDate getDateDue(){
      return dateDue;
   }
   
   public String getTimeOfTask(){
      return timeOfTask;
   }

   public LocalDate getDateAdded(){
      return dateAdded;
   }
   
   public String toString(){
      String str = "";
      str += "Task: " + getTask();
      str += "\nDate: " + getDateDue();
      str += "\nTime of Task: " + getTimeOfTask();
      str += "\nDate Added: " + getDateAdded();
      
      return str;
   }
   
   public boolean equals(ToDoTask t2){
      return (this.task == t2.getTask()  && this.dateDue.equals(t2.getDateDue()) && this.timeOfTask == t2.getTimeOfTask() && this.dateAdded.equals(t2.getDateAdded()));
   }

}