package tablaPersona;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TablaPersonas extends Application {

    @Override
    public void start(Stage stage) throws Exception {
    	Parent root = FXMLLoader.load(this.getClass().getResource("/fxml/tablaPersonas2.fxml"));
    	Scene scene = new Scene( root, 300, 275);
    	
    	stage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/533/533864.png"));
        stage.setTitle("PERSONAS");
        stage.setHeight(600);
        stage.setWidth(800);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
		launch(args);
	}
}
