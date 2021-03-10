import javafx.application.*;
import javafx.stage.*;
import jdk.internal.org.objectweb.asm.Label;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class PizzaOrder extends Application
{
    public static void main(String[] args) {
        launch(args);
    }

    Stage stage;
    TextField txtName;
    TextField txtPhone;
    TextField txtAddress;
    RadioButton rdoSmall;
    RadioButton rdoMedium;
    RadioButton rdoLarge;
    RadioButton rdoThin;
    RadioButton rdoThick;
    CheckBox chkPepperoni;
    CheckBox chkMushrooms;
    CheckBox chkAnchovies;

    @Override public void start(Stage primaryStage)
    {
        stage = primaryStage;

        // Create the name label and text field
        Label lblName = new Label("Name:");
        txtName = new TextField();
        txtName.setMinWidth(100);
        txtName.setPrefWidth(120);
        txtName.setMinWidth(200);
        txtName.setPromptText("Enter the name here");

        // Create the phone number label and text field
        Label lblPhone = new Label("Phone Number:");
        txtPhone = new TextField();
        txtPhone.setMinWidth(60);
        txtPhone.setPrefWidth(120);
        txtPhone.setMinWidth(180);
        txtPhone.setPromptText("Enter the phone number here");

         // Create the name label and text field
         Label lblAddress = new Label("Address:");
         txtAddress = new TextField();
         txtAddress.setMinWidth(100);
         txtAddress.setPrefWidth(200);
         txtAddress.setMinWidth(300);
         txtAddress.setPromptText("Enter the address here");

        // Create the size pane
        Label lblSize = new Label("Size");
        rdoSmall = new RadioButton("Small");
        rdoMedium = new RadioButton("Medium");
        rdoLarge = new RadioButton("Large");
        rdoMedium.setSelected(true);
        ToggleGroup groupSize = new ToggleGroup();
        rdoSmall.setToggleGroup(groupSize);
        rdoMedium.setToggleGroup(groupSize):
        rdoLarge.setToggleGroup(groupSize);

        VBox paneSize = new VBox(lblSize, rdoSmall, rdoMedium, rdoLarge);
        paneSize.setSpacing(10);

        // Create the crustpane
        Label lblCrust = new Label("Crust");
        rdoThin = new RadioButton("Thin");
        rdoThick = new RadioButton("Thick");
        rdoMedium.setSelected(true);
        ToggleGroup groupSize = new ToggleGroup();
        rdoSmall.setToggleGroup(groupSize);
        rdoMedium.setToggleGroup(groupSize):
        rdoLarge.setToggleGroup(groupSize);

        VBox paneSize = new VBox(lblSize, rdoSmall, rdoMedium, rdoLarge);
        paneSize.setSpacing(10);




    }
}