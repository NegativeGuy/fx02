package checkbox;
// 사용자가 클릭을 통해 체크를 표시하거나 없앨 수 있는데 
// 라디오 버튼과는 별도로 다중 선택이 가능하다.
// 예) 취미선택 : []영화 []음악 []독서 등

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex01 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox vbox = new VBox(10);//안쪽 사이 거리
		CheckBox chk1 = new CheckBox("오락");
		CheckBox chk2 = new CheckBox("게임");
		
		chk2.setSelected(true);	// 체크 된 상태로 생성됨
		
//		chk1.setText("오락");
//		chk2.setText("게임");
		
		vbox.getChildren().addAll(chk1, chk2);
		
		arg0.setScene(new Scene(vbox,300,200));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}







