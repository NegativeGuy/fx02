package textfield;
// 텍스트 입력 창 만들기

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(20));
		
		// 텍스트 입력창
		TextField tf = new TextField();
		tf.setText("test");	//검색창 안에 텍스트 삽입
		
		// 비밀번호 입력창, 텍스트가 점으로 표시됨
		PasswordField pf = new PasswordField();
		pf.setText("abcd1234");
		
		// 클릭하면 목록이 보이는 선택 창
		ComboBox<String> cb = new ComboBox<String>();
		cb.getItems().addAll("공부","놀기","멍타기");
		cb.setValue("목록");
		
		// 여러줄의 텍스트를 쓸 수 있는 창
		TextArea ta = new TextArea();
		ta.setPrefSize(100, 30);
		
		// 날짜 선택 창, 달력에서 날짜를 클릭하면 그 날짜가 입력창에 뜸
		DatePicker dp = new DatePicker();
		
		
		
		hbox.getChildren().addAll(tf, pf, cb, ta, dp);
		hbox.setPrefSize(600, 200);
		
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
