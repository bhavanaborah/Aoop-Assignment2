package	application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class a2q1 extends Application{

	GridPane grid ;
	Scene scene;
	Text scenetitle;
	Label username;
	TextField userTextField;
	Label pw;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Application stage

		primaryStage.setTitle("Login Application");
		primaryStage.show();


		//Creating a GridPane layout

		grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));

		scene = new Scene( grid ,300 , 275);
		primaryStage.setScene(scene);

		//Adding text , labels and TextFields

		scenetitle = new Text("Application Login Page ");
		scenetitle.setFont(Font.font("Tahome", FontWeight.NORMAL , 20));
		grid.add(scenetitle , 0, 0 ,2 ,1);


		username = new Label("User Name : ");
		grid.add(username, 0, 1);

		userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		pw = new Label("Password : ");
		grid.add(pw, 0, 2);
		PasswordField passwordField = new PasswordField();
		//		grid.getChildren().add(passwordField);
		grid.add(passwordField, 1, 2);

		Button b = new Button("Submit");
		grid.add(b, 1, 3);

		Label outLabel = new Label("Output: ");
		grid.add(outLabel, 0, 4);

		TextField buttField = new TextField();		
		grid.add(buttField, 1, 4);
		b.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				if(userTextField.getText().equals("user") && passwordField.getText().equals("pass")) {
					buttField.setText("Login Success");
				}else {
					buttField.setText("Login Failed");
				}
			}
		});
	}
}