package label;
// 사용자가 특정 필드에 문자 혹은 이미지를 삽입 할 수 있도록 하는 것

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		Label lbl = new Label("lbl test");
		hbox.getChildren().addAll(lbl);
		
		hbox.setPrefSize(300, 200);
		hbox.setStyle("-fx-background-color:green");
		
		lbl.setPrefSize(200, 30);
		lbl.setStyle("-fx-background-color:yellow");
		lbl.setAlignment(Pos.CENTER_RIGHT); 
		// 레이블 내에서 텍스트의 위치
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
