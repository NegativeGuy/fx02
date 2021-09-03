package label;
// setWrapText, setRotate, setTranslateX,Y를 활용하여 
// 텍스트에 다양한 기능을 추가

// 이벤트 처리
// 이벤트 처리는 특정 이벤트(예:클릭)가 발생 할 때만 코드가 실행되기 때문에
// 메인 코드와는 별개로 동작한다(쓰래드)

// 람다식 활용

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex03 extends Application{
	static int i=0;
	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		
		Label lbl = new Label("A label that needs to be wrapped");
		hbox.getChildren().add(lbl);
		hbox.setPrefSize(100, 100);
		
		// 창을 벗어날 정도의 글씨 길이라면 setWrapText하게 되면
		// 창 크기에 맞춰서 아래줄로 글씨가 표시됨
		lbl.setWrapText(true);
		lbl.setFont(new Font(20));
		
		// 글씨 회전(각도)
		lbl.setRotate(45);
		
		// 글씨가 창 밖으로 나가버린 경우 xyz축을 이용해 이동시킴
		lbl.setTranslateY(50);
		
		//이벤트 처리하기------------
		// 이벤트 처리는 특정 이벤트(예:클릭)가 발생 할 때만 코드가 실행되기 때문에
		// 메인 코드와는 별개로 동작한다(쓰래드)
		
		// 클릭하면 글씨 회전을 0으로
		lbl.setOnMouseClicked(e->{
			// 맨 위에 static int i=0; 을 먼저 선언하고
			// if문으로 i의 값을 바꿔주면 클릭할 때마다 i값이 바뀌면서
			// 계속 반복할 수 있다
			if(i==1) {				
				lbl.setRotate(0);
				lbl.setTranslateY(0);
				i=0;
			}else {
				lbl.setRotate(45);
				lbl.setTranslateY(50);
				i=1;
			}
		});
		
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
