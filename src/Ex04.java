import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//그리드펜gridpane을 이용하여 바둑판 만들기
public class Ex04 extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		
		GridPane grid = new GridPane();
	/*			
		for(int y =0; y < 10 ; y++) {
			for(int x=0; x<10;x++) {
				Label label = new Label();
				label.setStyle("-fx-border-color:black;-fx-font-size:15;");
				label.setText("("+x+","+y+")");
				grid.addRow(y,label);
			}
		}
		*/
		Label label1 = new Label("A");
		Label label2 = new Label("B");
		Label label3 = new Label("C");
		
		label1.setStyle("-fx-border-color:black; -fx-font-size:30;");
		label2.setStyle("-fx-border-color:black; -fx-font-size:30;");
		label3.setStyle("-fx-border-color:black; -fx-font-size:30;");
		
//		grid.add(/*노드*/,/*컬럼인덱스*/,/*로우인덱스*/,/*1이상이여한다*/ ,/*1이상이여야한다*/);
		grid.add(label1, 0, 0, 1, 1);
		grid.add(label2, 0, 1, 1, 1);
		grid.add(label3, 1, 0, 1, 2);
		
		grid.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(grid, 400, 400);
		stage.setScene(scene);
		
		
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
		
	}
}
/*
 * 	Label label11 = new Label("Hello");
		Label label12 = new Label("World");
		
//grid.addColumn(0, label11,label12);//세로,위에서 아래로 정렬
grid.addRow(0, label11,label12);//가로, 왼에서 오른쪽으로 정렬
grid.setHgap(10);//공간이 생기게 한다 가로사이의 공간
//grid.setVgap(10);//공간이 생기게 한다 세로사이의 공간

*/
