package toggleButton;
// 이미지를 토글버튼으로 사용
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex03 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();

		// 객체 생성 시 동시에 이미지와 텍스트 추가하기
		ToggleButton tb1 = new ToggleButton("내용", new ImageView("/img/magi.png"));
		
		// 객체 먼저 생성하고 따로 버튼에 이미지 넣기(setGraphic)
		ToggleButton tb2 = new ToggleButton();
		tb2.setGraphic(new ImageView("/img/magi.png"));
		tb2.setText("내용");
		
		hbox.getChildren().addAll(tb1, tb2);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
