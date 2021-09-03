package quiz;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane bp = new BorderPane();
		
		//Top----------------------
		FlowPane fpT = new FlowPane();
		Label lbTHome = new Label("홈");
		Label lbTSoci = new Label("사회");
		Label lbTEcon = new Label("경제");
		Label lbTInte = new Label("국제");
		Label lbTCult = new Label("문화");
		
		fpT.getChildren().addAll(lbTHome, lbTSoci, lbTEcon, lbTInte, lbTCult);
		fpT.setPadding(new Insets(10,20,10,0));
		fpT.setAlignment(Pos.TOP_RIGHT);
		fpT.setHgap(20);
		bp.setTop(fpT);
		
		//Left----------------------
		FlowPane fpL = new FlowPane(Orientation.VERTICAL);
		Label lbLCart = new Label("카테고리");
		Label lbLLabT = new Label("노트북/PC");
		Label lbLCars = new Label("자동차용품");
		Label lbLCell = new Label("휴대폰");
		Label lbLCamp = new Label("캠프/낚시");
		
		fpL.getChildren().addAll(lbLCart, lbLLabT, lbLCars, lbLCell, lbLCamp);
		fpL.setVgap(10);
		fpL.setPadding(new Insets(10));
		bp.setLeft(fpL);
		
		//Center----------------------
		VBox vbox = new VBox(10);	// VBox안의 컨텐츠들간의 간격 10
		vbox.setPadding(new Insets(20)); // VBox 기준으로 밖으로 간격 20
		
		ArrayList<FlowPane> centerList = new ArrayList<FlowPane>();
		centerList.add(new FlowPane(new Label("ID	:	"),new TextField()));
		centerList.add(new FlowPane(new Label("PW	:	"),new PasswordField()));
		
		RadioButton rb1 = new RadioButton("여\t"); // 라디오버튼 생성
		RadioButton rb2 = new RadioButton("남"); // 라디오버튼 생성
		ToggleGroup tg = new ToggleGroup(); // 토글그룹 객체 생성
		rb1.setToggleGroup(tg);	// 라디오버튼을 토글 그룹으로 지정
		rb2.setToggleGroup(tg); // 라디오버튼을 토글 그룹으로 지정
		rb1.setSelected(true);
		centerList.add(new FlowPane(rb1, rb2));
		
		CheckBox cb1 = new CheckBox("게임\t");
		CheckBox cb2 = new CheckBox("공부");
		cb1.setSelected(true);
		centerList.add(new FlowPane(cb1, cb2));
		
		centerList.add(new FlowPane(new Label("하고 싶은 말")));
		
		TextArea tf = new TextArea();
		tf.setPrefSize(250, 150);
		centerList.add(new FlowPane(tf));
		
		vbox.getChildren().addAll(centerList);
		bp.setCenter(vbox);
		
		//Right----------------------
		GridPane gp = new GridPane();

		TextField tfR1 = new TextField();
		tfR1.setPrefSize(100, 20);
		PasswordField pfR1 = new PasswordField();
		pfR1.setPrefSize(100, 20);
		Button btnLogin = new Button("로그인");
		btnLogin.setPrefSize(60, 50);
		
		gp.add(tfR1, 0, 0);
		gp.add(pfR1, 0, 1);
		gp.add(btnLogin, 1, 0, 1, 2);

		gp.setPadding(new Insets(20));
		bp.setRight(gp);
		
		
		arg0.setTitle("Quiz01");
		arg0.setScene(new Scene(bp, 600, 400));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
