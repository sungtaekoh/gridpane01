import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ex01 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		try {
			
			// stage > scene > container> node
			
			Pane pane = new Pane();
			
			Scene scene = new Scene(pane, 300/*가로*/, 500/*세로*/);
			
		   stage.setScene(scene);
		   
		   stage.show();
		   stage.setTitle("Rin's Program");//프로그램 이름
		   stage.setResizable(false);//true 사이즈 조정 가능,false 사이즈 조정 불가능
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
