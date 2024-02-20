
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Controller {

    @FXML
    private ImageView slot;

    @FXML
    public void PlayWheel() throws InterruptedException {
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(slot);
        rotate.setDuration(Duration.millis(1000));
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setByAngle(360);
        rotate.play();
    }

    @FXML void SlowDown(){
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(slot);
        rotate.setDuration(Duration.millis(5000));
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setByAngle(360);
        rotate.play();
    }
   
}