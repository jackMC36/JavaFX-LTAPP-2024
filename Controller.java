
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Controller {

    @FXML
    private ImageView slot;


    private RotateTransition rotate;

    @FXML
    public void PlayWheel() throws InterruptedException {
        rotate = new RotateTransition();
        rotate.setNode(slot);
        rotate.setDuration(Duration.millis(1400));
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setByAngle(360);
        rotate.play();
    }

    @FXML 
    public void Stop() {
        Timeline timeline = new Timeline(
            new KeyFrame(Duration.seconds(0), new KeyValue(rotate.rateProperty(), 1)),
            new KeyFrame(Duration.seconds(3), new KeyValue(rotate.rateProperty(), 0))
        );
        timeline.play();

    }
   
}