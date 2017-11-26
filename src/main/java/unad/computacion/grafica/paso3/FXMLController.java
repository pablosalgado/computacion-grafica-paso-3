package unad.computacion.grafica.paso3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class FXMLController implements Initializable {
        
    @FXML
    private Canvas canvas;
    
    private GraphicsContext gc;
    
    @FXML
    private void handleButtonLinea(ActionEvent event) {   
        gc.clearRect(0, 0, 300, 250);
        gc.strokeLine(40, 10, 10, 40);
    }
    
    @FXML
    private void handleButtonCirculo(ActionEvent event) {        
        gc.clearRect(0, 0, 300, 250);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
     }

    @FXML
    private void handleButtonPoligono(ActionEvent event) {        
        gc.clearRect(0, 0, 300, 250);
        gc.fillPolygon(
                new double[]{10, 40, 10, 40},
                new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(
                new double[]{60, 90, 60, 90},
                new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(
                new double[]{110, 140, 110, 140},
                new double[]{210, 210, 240, 240}, 4);
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gc = canvas.getGraphicsContext2D();        
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
    }    
}
