
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ex01T extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		
		Pane pane = new Pane();
		Scene scene = new Scene(pane,300,500);
		stage.setScene(scene);
		
		stage.setTitle("sungtaek's mono");
		stage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

	
}
