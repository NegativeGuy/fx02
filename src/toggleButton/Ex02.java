package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		// 가로로 박스들이 나열되는 레이아웃
		
		ToggleButton tb1 = new ToggleButton("111");
		ToggleButton tb2 = new ToggleButton("222");
		ToggleButton tb3 = new ToggleButton("333");
		
		ToggleGroup tg = new ToggleGroup();
		// 토글그룹 객체를 생성(중복 선택 불가 기능)
		tb1.setToggleGroup(tg);
		tb2.setToggleGroup(tg);
		tb3.setToggleGroup(tg);
		// 3개의 토클버튼을 그룹으로 묶어 줌
		
		tb2.setSelected(true);	// 선택(클릭)된체로 생성
		
		hbox.getChildren().addAll(tb1, tb2, tb3);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
