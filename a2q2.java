package application; 

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.*;  
import javafx.scene.layout.BorderPane;  
import javafx.stage.Stage;  
public class a2q2 extends Application {  
    public static void main(String[] args) {  
    launch(args);  
        }  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
       
        BorderPane root = new BorderPane();  
        Scene scene = new Scene(root,300,300);  
        MenuBar menubar = new MenuBar();  
        
        Menu FileMenu = new Menu("File"); 
        
        MenuItem filemenu1 = new MenuItem("New");  
        MenuItem filemenu2 = new MenuItem("Open");  
        MenuItem filemenu3 = new MenuItem("Save");
        
        Menu EditMenu = new Menu("Edit"); 
        
        MenuItem EditMenu1 = new MenuItem("Cut");  
        MenuItem EditMenu2 = new MenuItem("Copy");  
        MenuItem EditMenu3 = new MenuItem("Paste");  
        
        
        Menu HelpMenu = new Menu("Help");
        MenuItem helpmenu1 = new MenuItem("Help Centre");  
        MenuItem helpmenu2 = new MenuItem("About Us");  
       
        
        
        
        root.setTop(menubar);  
        
        EditMenu.getItems().addAll(EditMenu1,EditMenu2,EditMenu3);  
        
        FileMenu.getItems().addAll(filemenu1,filemenu2,filemenu3); 
        
        HelpMenu.getItems().addAll(helpmenu1, helpmenu2 );
        
        menubar.getMenus().addAll(FileMenu,EditMenu,HelpMenu);  
        
       
        primaryStage.setScene(scene);  
        primaryStage.show();  
          
    }     
}  