 
import java.io.IOException;

import org.w3c.dom.events.Event;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;
 

public class app extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("app.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();

        Scene scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {

                    case SPACE: System.out.println("SPACE");;
                        break;
                
                    default: System.out.println("Wrong Key");
                        break;
                }            }
            
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("BDE Adess");
        Image icon = new Image("logo.png");
        primaryStage.getIcons().add(icon);


        primaryStage.show();
    }
}