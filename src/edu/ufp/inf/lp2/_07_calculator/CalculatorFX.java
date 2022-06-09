package edu.ufp.inf.lp2._07_calculator;

import edu.ufp.inf.lp2._07_calculator.*;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorFX extends Application {

    private static final String[][] template = {

            {"7", "8", "9", "/"},
            {"4", "5", "6", "*"},
            {"1", "2", "3", "-"},
            {"0", ".", "=", "+"},
            {"C"}
    };

    private TextField display;
    private Calculator.Op currOp = Calculator.Op.NOOP;
    private Calculator calc = new Calculator();

    //flag to assert that the person clicked the equals(=) button and closed the operation
    private boolean closedOperation = false;
    //value in memory
    private Double valueInMemory = Double.MIN_VALUE;
    //value used to update the TextField using a binding
    private final SimpleDoubleProperty displayValue = new SimpleDoubleProperty();
    //the number of decimal digits in the input
    private int nDecimals = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX CalculatorFX");
        primaryStage.setResizable(false);
        VBox layout = this.createLayout();
        primaryStage.setScene(new Scene(layout, 240, 330));
        primaryStage.show();
    }

    private VBox createLayout() {
        // VBox alinha os componentes verticalmente e permite determinar o espaçamento entre eles (20)
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(25, 25, 25, 25));
        TilePane buttons = createButtons();

        display = createDisplay();

        layout.getChildren().addAll(display, buttons);
        layout.setStyle("-fx-base: black;");
        return layout;
    }

    private TilePane createButtons() {
        // Um painel com tiles para os botões
        TilePane buttons = new TilePane();
        // A quantidade de espaço vertical entre cada bloco numa coluna.
        buttons.setVgap(10);
        // A quantidade de espaço horizontal entre cada bloco numa linha.
        buttons.setHgap(10);
//        buttons.setPrefColumns(template[0].length);
        for (String[] r : template) {
            for (String s : r) {

                Button btn = new Button(s);
                // btn.setText(s);
                // Define tamanho do botão
                btn.setPrefWidth(40);
                btn.setPrefHeight(40);
                // Define o tamanho da fonte
                btn.setStyle("-fx-font-size: 1.4em; ");
                if (s.matches("[0-9]")) {
                    setNumericButtonListener(s, btn);
                } else {
                    switch (s) {
                        case "C":
                            setClearButtonListener(btn);
                            break;
                        case "=":
                            setEqualsButtonListener(btn);
                            break;
                        case ".":
                            setDotButtonListener(btn);
                            break;
                        default:
                            setOperationButtonListener(btn, s);
                            break;
                    }
                }
                buttons.getChildren().add(btn);
            }

        }
        return buttons;
    }

    private TextField createDisplay() {
        TextField display = new TextField();
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setEditable(false);
        display.textProperty().bind(Bindings.format("%.1f", displayValue));
        return display;
    }

    private void setOperationButtonListener(Button btn, String s) {
        // Cor de fundo do botão
        btn.setStyle("-fx-base: yellow;");
        btn.setOnAction(actionEvent -> {
            if (currOp != Calculator.Op.NOOP) {
                //there is a second value, we can do the operation
                this.valueInMemory = calc.makeOperation(currOp, this.displayValue.get());
                this.displayValue.set(this.valueInMemory);
                this.closedOperation = true;
            }else{
                //currOp == No_operation
                if(this.closedOperation){
                    //the user set the equals operation and now pressed another operation
                    this.displayValue.set(0); //reset the textview
                    this.closedOperation = false;
                }else{
                    // user was previously inserting numbers, the second number is
                    // still missing and we can not do the operation for now
                    // so we save this number, and define the operation
                    this.valueInMemory = this.displayValue.get(); //save the value
                    this.displayValue.set(0); //reset the textview
                    calc.setValueInMem(this.valueInMemory);
                }
            }
            //set operation
            switch (s){
                case "+":
                    this.currOp = Calculator.Op.SUM;
                    break;
                case "-":
                    this.currOp = Calculator.Op.SUBTRACT;
                    break;
                case "*":
                    this.currOp = Calculator.Op.MULTIPLY;
                    break;
                case "/":
                    this.currOp = Calculator.Op.DIVIDE;
                    break;
            }
            // we either closed an operation and require a new number or we defined an operation
            // and require a second value. Either way we the new number starts with nDecimals = 0
            nDecimals = 0;
        });
    }
    //define the action after clicking the Numeric[0-9] button
    private void setNumericButtonListener(String s, Button btn) {
        btn.setOnAction(actionEvent -> {
            if (nDecimals > 0){
                displayValue.set((displayValue.getValue() + (Integer.parseInt(s)/Math.pow(10, nDecimals))));
                nDecimals++;
            }else {
                displayValue.set((displayValue.getValue() *10) + (Integer.parseInt(s)));
            }
        });
    }
    //define the action after clicking the equals(=) button
    private void setEqualsButtonListener(Button btn) {
        btn.setStyle("-fx-base: violet;");
        btn.setOnAction(actionEvent -> {
            if (currOp != Calculator.Op.NOOP){
                this.valueInMemory = calc.makeOperation(currOp, displayValue.getValue());
                displayValue.set(this.valueInMemory);
                nDecimals = 0;
                currOp = Calculator.Op.NOOP;
            }
        });
    }
    //define the action after clicking the clear(C) button
    private void setClearButtonListener(Button btn) {
        btn.setOnAction(actionEvent -> {
            displayValue.set(0.0);
            nDecimals = 0;
            currOp = Calculator.Op.NOOP;
        });
    }

    //define the action after clicking the dot(.) button
    private void setDotButtonListener(Button btn) {
        btn.setOnAction(actionEvent -> {
            if (nDecimals == 0) {
                nDecimals = 1;
            }
        });
    }
}
