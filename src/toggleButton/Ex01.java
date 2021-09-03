package toggleButton;
//클릭하면 들어가서 멈춰있는 버튼, 다시 클릭하면 처음모습으로 바뀜
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox(10);
		ToggleButton toggleBtn = new ToggleButton("Toggle Button");
		
		hbox.getChildren().addAll(toggleBtn);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
