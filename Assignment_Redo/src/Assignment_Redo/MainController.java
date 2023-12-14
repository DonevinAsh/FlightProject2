package Assignment_Redo;

import java.io.IOException;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.*;
import javafx.util.Callback;


public class MainController {
	
	//User Data
		@FXML private TextField firstNameTextField;
		@FXML private TextField lastNameTextField;
		@FXML private TextField addressTextField;
		@FXML private TextField zipCodeTextField;
		@FXML private TextField stateTextField;
		@FXML private TextField usernameTextField;
		@FXML private TextField passwordTextField;
		@FXML private TextField emailTextField;
		@FXML private TextField ssnTextField;
		@FXML private TextField securityTextField;
		
		Connection conn = SQLConnection.getConnection();

}
