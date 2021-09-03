package label;
// ImageView, setText, setGraphic를 활용하여 이미지를 추가
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ex02 extends Application{
	
	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		Label lbl = new Label("aaa", new ImageView("/img/search.png"));
		// 위 lbl처럼 객체를 만들면서 동시에
		// 이미지와 텍스트('aaa')를 넣을 수도 있고
		
		// 아래 lbl02처럼 객체 먼저 생성하고 따로 텍스트와 이미지를 추가할 수 있다
		Label lbl02 = new Label();
		lbl02.setText("search");
		
		// 텍스트의 색을 넣음
		lbl02.setTextFill(Color.web("#0076a3"));
		
		// 이미지 추가
		lbl02.setGraphic(new ImageView("/img/search.png"));
		
		
		hbox.getChildren().addAll(lbl, lbl02);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
