import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
//노드node 사용하기
public class Ex02T extends Application{


	@Override
	public void start(Stage stage) throws Exception {
		Label label = new Label();
		label.setText("STYLESHEET_CASPIAN");
		
		Pane pane = new Pane();
		pane.getChildren().add(label);
		
		Scene scene = new Scene(pane,500,300);
		
		stage.setScene(scene);
		stage.show();

	}
	public static void main(String[] args) {
		launch(args);
	}
}
