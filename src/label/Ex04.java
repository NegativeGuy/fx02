package label;
// 람다식을 쓰지 않은 코드와 람다식을 쓴 코드 비교


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex04 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane anch = new AnchorPane();
		Label lbl = new Label("Value");
		
		lbl.setFont(new Font(32));
		lbl.setRotate(48);
		lbl.setTranslateX(100);
		lbl.setTranslateY(70);
		
		// 람다식 쓰지 않고 정식으로 이벤트 코드 작성-----------------
		EventHandler<MouseEvent> entered = new EventHandler<MouseEvent>() {

			@Override	// alt + shift + s 눌러서 오버라이드 추가
			public void handle(MouseEvent arg0) {
				lbl.setScaleX(1.5); // x축 크기 1.5배 증가
				lbl.setScaleY(1.5); // y축 크기 1.5배 증가
			}
		};
		
		lbl.setOnMouseEntered(entered);
		lbl.setOnMouseExited(new EventHandler<MouseEvent>() {
			// 변수를 따로 만들지 않고 
			// new EventHandler<MouseEvent>()를 바로 적용
			@Override
			public void handle(MouseEvent arg0) {
				lbl.setScaleX(1.0); // x축 크기 원상태로
				lbl.setScaleY(1.0); // y축 크기 원상태로
			}
			
		});
		//---------------------------------
		
		//람다식 적용 코드
		lbl.setOnMousePressed(e->{
			// 마우스로 클릭하면
			lbl.setRotate(0);
			// 텍스트의 회전각도를 원상태(0도)로 돌려놓음
		});
		//---------------------------------
		
		
		anch.getChildren().add(lbl);
		anch.setPrefSize(300, 200);
		
		
		arg0.setScene(new Scene(anch));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
