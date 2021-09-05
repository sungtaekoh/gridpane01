import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ex03T extends Application {
	@Override
	public void start(Stage stage) throws Exception {
	
		Label label = new Label();
		label.setStyle("-fx-font-size:30;");
		label.setText(Integer.toString(num));
		
		Button button = new Button();
		button.setStyle("-fx-font-size:20;");
		button.setText("add");
		button.setOnAction(e->{
			num++;
			label.setText(Integer.toString(num));
		});
		
		StackPane pane = new StackPane();
		pane.getChildren().addAll(label,button);
		StackPane.setAlignment(button,Pos.BOTTOM_CENTER);
		
		Scene scene = new Scene(pane, 150,150);
		
		stage.setScene(scene);
		stage.show();
	}

	int num = 0;
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
