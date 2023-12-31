package Assignment_Redo;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class PasswordPopup {

		
	public static void display(String title, String password) {
		Stage window = new Stage();
		//requires window to be dealt with
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
			
		Label label = new Label();
		label.setText("Your password is: " + password);
		Button close = new Button("Close the window");
		close.setOnAction(e -> window.close());
			
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, close);
		layout.setAlignment(Pos.CENTER);
			
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
			
		}

	}



