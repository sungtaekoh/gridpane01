import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//버튼 만들기
public class Ex03 extends Application{
	

	@Override
	public void start(Stage stage) throws Exception {
		
		Label label = new Label();
		label.setText(Integer.toString(num));
		label.setStyle("-fx-font-size:30;");
		
		Button button = new Button();
		button.setText("add");
		button.setStyle("-fx-font-size: 15;");
		button.setOnAction(e->{
			num++;
			label.setText(Integer.toString(num));
		});//람다식.버튼을 눌럿을때 이 안의 코드들이 실행된다

		StackPane pane = new StackPane();
		pane.getChildren().addAll(label,button);
		/*
		 pane.getChildren().add(label);
		pane.getChildren().add(button);
		*/
		
		StackPane.setAlignment(button, Pos.BOTTOM_CENTER);//노드 글씨 위치변경
		
		Scene scene = new Scene(pane,150,150);
		
		stage.setScene(scene);
		stage.show();
	}
	
	int num =0;
	
public static void main(String[] args) {
		launch(args);
	}

}
