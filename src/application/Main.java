package application;

import javax.swing.plaf.synth.SynthSeparatorUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			Button botaoA = new Button("A");
			Button botaoB = new Button("B");
			Button botaoC = new Button("C");

			botaoA.setOnAction(e -> System.out.println("A"));
			botaoB.setOnAction(e -> System.out.println("B"));
			botaoC.setOnAction(e -> System.exit(0));

			VBox box = new VBox();
			box.setSpacing(10);
			box.setAlignment(Pos.CENTER);
			box.getChildren().add(botaoA);
			box.getChildren().add(botaoB);
			box.getChildren().add(botaoC);

			Scene unicaCena = new Scene(box, 150, 150);

			primaryStage.setScene(unicaCena);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
