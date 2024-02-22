
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Controller {

    @FXML
    private ImageView slot;
    @FXML
    private ImageView Win;
    @FXML
    private ImageView WinText;

    Image WinImage = new Image(getClass().getResourceAsStream("pika.jpeg"));
    Image WinTextImage = new Image(getClass().getResourceAsStream("WinText.png"));

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
        timeline.setOnFinished(event -> {
            WinImage();
            WinText();
        });
        timeline.play();
    }

    public void WinImage(){
        Win.setImage(WinImage);
        Win.setOpacity(0);
        Win.setVisible(true);
        FadeTransition fade = new FadeTransition();
        fade.setNode(Win);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.setDuration(Duration.seconds(3));
        fade.play();
    }
    

    public void WinText() {
        WinText.setImage(WinTextImage);
        WinText.setOpacity(0);
        WinText.setVisible(true);

        FadeTransition fade = new FadeTransition();
        fade.setNode(WinText);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.setDuration(Duration.seconds(3));
        fade.play();
    }
    
}