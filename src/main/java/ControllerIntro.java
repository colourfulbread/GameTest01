import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerIntro {
    @FXML
    private Button btn_start;
    @FXML
    private Button btn_Exit;

    public void on_btn_start_clicked(ActionEvent e) throws IOException {
        Stage currentStage=(Stage)btn_start.getScene().getWindow();
        currentStage.close(); //关闭当前窗口
        Pane root= FXMLLoader.load(getClass().getResource("Game.fxml"));
        Stage newStage=new Stage();
        newStage.setTitle("flying reimu!");
        newStage.setScene(new Scene(root));
        newStage.show();
    }

    public void on_btn_Exit_clicked(ActionEvent e) throws IOException {
        Stage currentStage=(Stage)btn_Exit.getScene().getWindow();
        currentStage.close(); //关闭当前窗口

    }
}
