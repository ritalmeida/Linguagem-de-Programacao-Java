package edu.ufp.inf.lp2._08_gui_javafx.loginjavafxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class LoginFXMLController {
    /**
     * For the controller to be able to access the Text label, its name should be the same in the fxml and css
     */
    @FXML
    private Text textActionTarget;

    /**
     *
     * @param event
     */
    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {

        textActionTarget.setText("Sign in button calling Controller->handleSubmitButtonAction()");
    }

    /**
     *
     * @param event
     */
    @FXML
    protected void handleSubmitButtonAction2(ActionEvent event) {

        textActionTarget.setText("Sign in button calling Controller->handleSubmitButtonAction2()");
    }
}
