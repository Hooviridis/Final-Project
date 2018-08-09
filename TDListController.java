import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class TDListController {

    @FXML
    private ListView<ToDoList> toDoLists;

    @FXML
    private TextField title;

    @FXML
    private Button newList;

    @FXML
    private Button newItem;

    @FXML
    private TextField dateField;

    @FXML
    private Button dueDate;

    @FXML
    private TextField timeField;

    @FXML
    private Button taskTime;
    
    @FXML
    private ListView<ToDoTask> listItems;
    
    
    public void buttonListener(ActionEvent e){
      if(e.getSource() == newList){
         title.setText("New List Clicked");
      }else if(e.getSource() == newItem){
         title.setText("New Item Clicked");
      }else if(e.getSource() == dueDate){
         dateField.setText("Due Date Clicked");
      }else if(e.getSource() == taskTime){
         timeField.setText("Task Time Clicked");  
      }
      
    }

}



