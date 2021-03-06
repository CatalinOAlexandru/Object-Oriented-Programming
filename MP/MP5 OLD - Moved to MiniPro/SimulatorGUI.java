 



import java.util.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SimulatorGUI extends Application
{

	public static void main(String[] START)
	{
		launch(START);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
		primaryStage.setTitle("Mini-Project");
		primaryStage.setScene(new Scene(root, 644, 400));
		primaryStage.show();
	}

}