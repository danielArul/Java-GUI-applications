package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
        String firstName=firstNameField.getText().trim();
        String lastName=lastNameField.getText().trim();
        String phoneNumber=phoneNumberField.getText().trim();
        String notes=notesField.getText().trim();

        if(firstName.isEmpty()){
            firstName="NOT SPECIFIED";

        }
        if(lastName.isEmpty()){
            lastName="NOT SPECIFIED";

        }
        if(phoneNumber.isEmpty()){
            phoneNumber="NOT SPECIFIED";

        }
        if(notes.isEmpty()){
            notes="NOT SPECIFIED";

        }

        Contact newContact=new Contact(firstName,lastName,phoneNumber,notes);
        return newContact;
    }

    public void editContact(Contact contact){
        firstNameField.setText(contact.getFirstName());
        lastNameField.setText(contact.getLastName());
        phoneNumberField.setText(contact.getPhoneNumber());
        notesField.setText(contact.getNotes());

    }

    public void updateContact(Contact contact){
        contact.setFirstName(firstNameField.getText());
        contact.setLastName(lastNameField.getText());
        contact.setPhoneNumber(phoneNumberField.getText());
        contact.setNotes(notesField.getText());
    }
}
