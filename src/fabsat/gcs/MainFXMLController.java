/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package fabsat.gcs;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
/**
 * FXML Controller class
 *
 * @author peyal
 */
public class MainFXMLController implements Initializable {


    @FXML
    private AnchorPane scanButtonClicked;
    @FXML
    private ComboBox<?> comPortComboBox;
    @FXML
    private Button scanButtonclicked;
    @FXML
    private TextField sendDataField;
    @FXML
    private Button sendButtonClicked;
    @FXML
    private Label missionTime;
    @FXML
    private LineChart<?, ?> altitudechart;
    @FXML
    private NumberAxis y;
    @FXML
    private CategoryAxis x;
    @FXML
    private LineChart<?, ?> voltageChart;
    @FXML
    private NumberAxis y1;
    @FXML
    private CategoryAxis x1;
    @FXML
    private LineChart<?, ?> titleXChart;
    @FXML
    private NumberAxis y11;
    @FXML
    private CategoryAxis x11;
    @FXML
    private LineChart<?, ?> titlYChart;
    @FXML
    private NumberAxis y111;
    @FXML
    private CategoryAxis x111;
    @FXML
    private LineChart<?, ?> altitudechart1;
    @FXML
    private NumberAxis y3;
    @FXML
    private CategoryAxis x3;
    @FXML
    private LineChart<?, ?> temperatureChart;
    @FXML
    private NumberAxis y2;
    @FXML
    private CategoryAxis x2;
    @FXML
    private LineChart<?, ?> pressureChart;
    @FXML
    private NumberAxis y21;
    @FXML
    private CategoryAxis x21;
    @FXML
    private RadioButton modeF;
    @FXML
    private RadioButton modeS;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void scanButtonClicked(MouseEvent event) {
    }

    @FXML
    private void scanButtonclicked(ActionEvent event) {
    }

    @FXML
    private void sendDataField(ActionEvent event) {
    }

    @FXML
    private void sendButtonClicked(ActionEvent event) {
    }

}
