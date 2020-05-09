package sample;

import javafx.fxml.FXML;
import sample.datamodel.Contact;
import javafx.scene.control.TextField;

public class ContactController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField phoneNumberField;

    @FXML
    private TextField notesField;

    public Contact getNewContact(){
        String firstName=firstNameField.getText();
        String lastName=lastNameField.getText();
        String phoneNumber=phoneNumberField.getText();
        String notes=notesField.getText();

        Contact newContact=new Contact(firstName,lastName,phoneNumber,notes);
        return newContact;
    }
}
