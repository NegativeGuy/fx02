package radio;
// 사용자가 클릭을 통해 여러가지 항목 중 하나의 항목을 선택할 수 있도록 해주는 기능
// 중복 선택 불가능(한가지만 선택이 가능)
// 예) ()남 ()여 선택, ()예 ()아니오 선택 등
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox(10);
		
		RadioButton rd1 = new RadioButton("rb1");
		RadioButton rd2 = new RadioButton("rb2");
		// 라디오 버튼1, 2 생성
		
		hbox.getChildren().addAll(rd1, rd2);
		// 라디오버튼2개를 hbox에 추가
		hbox.setPrefSize(300, 200);
		// hbox 크기 설정
		
		ToggleGroup tg = new ToggleGroup();
		// toggleGroup 객체 생성
		// 라디오버튼 2개를 ToggleGroup에 각각 추가
		rd1.setToggleGroup(tg);
		rd2.setToggleGroup(tg);
		// 그럼 하나의 그룹으로 묶여서 둘 중 하나만 선택할 수 있게 됨
		
		rd1.setText("10대"); //버튼 옆에 해당 텍스트가 표기됨
		rd1.setSelected(true); // 처음부터 체크된 상태로 설정
		
		rd1.setStyle("-fx-background-color:red");
		rd2.setStyle("-fx-background-color:red");		
		
		hbox.setPadding( new Insets(20) ); //테두리 간격 20 추가
		//hbox.setStyle("-fx-background-color:red");
		
		HBox.setMargin(rd2, new Insets(50,20,20,50));//(위,오른,아래,왼)
		// Margin : 해당 개체(rd2)의 위치에 내부간격을 주어 배치
		
		arg0.setScene( new Scene(hbox) );
		
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
