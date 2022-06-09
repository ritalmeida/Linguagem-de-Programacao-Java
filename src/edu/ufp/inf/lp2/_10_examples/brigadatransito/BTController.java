package edu.ufp.inf.lp2._10_examples.brigadatransito;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class BTController implements Initializable {

    public TextField registrationField;
    public TextField modelField;
    public TextField brandField;
    public TextField cylindersField;

    public TableView<Vehicle> vehicleTable;
    public TableColumn<Vehicle, String> registrationCol;
    public TableColumn<Vehicle, String> brandCol;
    public TableColumn<Vehicle, String> modelCol;
    public TableColumn<Vehicle, String> cylindersCol;

    private static final String PATH_VEHICLES = "//data//vehicles.txt";
    private static final String FILE_DELIMITER = ";";
    private static final String PATH_BIN = ".//data//data_bt.bin";

    private ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

    //Método para inicialização dos elementos da tabela vehiclesTable,
    //do arraylist venhiclesArrayList e do objecto bt, relativo à classe
    //TransitPolice
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        registrationCol.setCellValueFactory(new PropertyValueFactory<>("registration"));
        registrationCol.setCellFactory(TextFieldTableCell.forTableColumn());
        brandCol.setCellValueFactory(new PropertyValueFactory<>("brand"));
        brandCol.setCellFactory(TextFieldTableCell.forTableColumn());
        modelCol.setCellValueFactory(new PropertyValueFactory<>("model"));
        modelCol.setCellFactory(TextFieldTableCell.forTableColumn());
        cylindersCol.setCellValueFactory(new PropertyValueFactory<>("cylinders"));
        cylindersCol.setCellFactory(TextFieldTableCell.forTableColumn());
    }

    //Handler para ação do botão de abertura do ficheiro de texto, referente aos dados dos ceículos
    public void handleReadFileAction(ActionEvent actionEvent) {
        vehicleTable.getItems().clear();
        try {
            vehicleTable.getItems().addAll(readVehiclesFromFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleReadBinFileAction(ActionEvent actionEvent) {
    }

    public void handleSaveFileAction(ActionEvent actionEvent) {
    }

    public void handleSaveBinFileAction(ActionEvent actionEvent) {
    }

    public void handleExitAction(ActionEvent actionEvent) {
    }

    public void handleEditVehicleAction(TableColumn.CellEditEvent<Vehicle, String> vehicleStringCellEditEvent) {
    }

    public void handleAddVehicleAction(ActionEvent actionEvent) {

        Vehicle v = new Vehicle(registrationField.getText(), brandField.getText(), modelField.getText(), Integer.parseInt(cylindersField.getText()));
        vehicleTable.getItems().add(v);
        registrationField.setText("");
        brandField.setText("");
        modelField.setText("");
        cylindersField.setText("");
        vehicleArrayList.add(v);
    }

    public void handleSelectVehicleAction(ActionEvent actionEvent) {
    }

    public void handleSelectDriverAction(ActionEvent actionEvent) {
    }

    private void saveVehiclesToFile() {
        PrintWriter pw = openPrintWriter(PATH_VEHICLES);
        if(pw != null){
            pw.write("Registration"+FILE_DELIMITER+"Brand"+FILE_DELIMITER+"Model"+FILE_DELIMITER+"Cylinders\n");
            for(Vehicle v : vehicleTable.getItems()){
                pw.write(v.getRegistration()+FILE_DELIMITER+v.getBrand()+FILE_DELIMITER+v.getModel()+FILE_DELIMITER+v.getCylinders()+"\n");
            }
            pw.close();
        }
    }

    //Método para escrita do ficheiro de texto, no path indicado
    private PrintWriter openPrintWriter(String path) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        return pw;
    }

    private ArrayList<Vehicle> readVehiclesFromFile() throws IOException {
        if(!vehicleArrayList.isEmpty())
            vehicleArrayList.clear();
        BufferedReader br = openBufferedReader(PATH_VEHICLES);
        if (br != null) {
            br.readLine();
            String line = br.readLine();
            while (line != null) {
                String[] dFields = line.split(FILE_DELIMITER);
                Vehicle v = new Vehicle(dFields[0], dFields[1], dFields[2], Integer.parseInt(dFields[3]));
                System.out.println(v);
                vehicleArrayList.add(v);
                line = br.readLine();
            }
            br.close();
        }
        return vehicleArrayList;
    }

    //Método para leitura do ficheiro de texto, no path indicado
    private BufferedReader openBufferedReader(String path) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            return br;
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        return null;
    }
}
