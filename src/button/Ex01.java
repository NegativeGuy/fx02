package button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		Pane canvas = new Pane();
		Button btn = new Button();
		
		// setGraphic으로 이미지 바로 불러오기
		btn.setGraphic(new ImageView("/img/smilerere.png")); // 이미지 불러오기
		btn.setLayoutX(90);	// 위치 설정
		btn.setLayoutY(90);	// 위치 설정
		
		
		Button btn02 = new Button();
		// 이미지 객체 따로 만들고 이미지 불러오기 (이미지 사이즈 조정하기 위해)
		ImageView img = new ImageView("/img/smilerere.png");
		img.setFitHeight(40); // 이미지 높이 사이즈 조정
		img.setFitWidth(40);  // 이미지 넓이 사이즈 조정
		btn02.setGraphic(img);// 이미지 불러오기
		
		//이미지 테두리선 없애기
		btn02.setStyle("-fx-background-color:transparent;-fx-padding: 10 10 10 10;");
		
		// 마우스 프레스(누른상태) 시 이미지 살짝 아래로 내리기(패딩값으로 조정) 
		btn02.setOnMousePressed(e->{
			btn02.setStyle("-fx-background-color:transparent;-fx-padding: 15 10 10 10;");
		});
		// 마우스 릴리즈(땐상태) 시 이미지 원위치(패딩값으로 조정)
		btn02.setOnMouseReleased(e->{
			btn02.setStyle("-fx-background-color:transparent;-fx-padding: 10 10 10 10;");	
		});
		
		// 클릭시 경고창
		btn.setOnAction(e->{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("경~고");
			alert.setHeaderText("버튼 이벤트");
			alert.setContentText("버튼을 클릭했습니다");
			alert.show();
		});
		
		
		canvas.getChildren().addAll(btn, btn02);
		canvas.setPrefSize(400, 400);
		
		arg0.setScene(new Scene(canvas));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
