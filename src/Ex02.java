import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//node 노드 사용하기
public class Ex02 extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		
		Label text = new Label();//node 글씨
		text.setText("Hello World");
		text.setStyle("-fx-font-size:30; -fx-border-color:yellow;");
		
		StackPane pane = new StackPane();
		pane.getChildren().add(text);
		
		Scene scene = new Scene(pane, 500 , 300);
		stage.setScene(scene);
		stage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}

	

}
