 
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
 

public class app extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    
    @Override
    public void start(Stage primaryStage) throws IOException {

        
        Parent root = FXMLLoader.load(getClass().getResource("app.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("BDE Adess");
        Image icon = new Image("logo.png");
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("Appuyez sur échap pour sortir");
        primaryStage.getIcons().add(icon);
        primaryStage.show();
    }
}