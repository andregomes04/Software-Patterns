package Contactos;

import java.io.File;
import java.util.List;

public class ContactsImple implements ContactStorageInterface {

    private File filename;

    public ContactsImple(File filename) {
        this.filename = filename;
    }

    public String fileType() {
        String[] typeSplit = filename.getName().split("\\.");
        if (typeSplit.length > 1) {
            return "Txt";
        } else {
            return "Binary";
        }
    }
    
    @Override
    public List<Contact> loadContacts() {

        String storageType = "ContactsStorage" + fileType();

        try {
            ContactStorageInterface specStorage = (ContactStorageInterface) Class.forName("Contactos." + storageType).getConstructor(File.class).newInstance(filename);
            return specStorage.loadContacts();

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            System.exit(1);
        }
        return null;
    }

    @Override
    public boolean saveContacts(List<Contact> list) {

        String storageType = "ContactsStorage" + fileType();

        try {
            ContactStorageInterface specStorage = (ContactStorageInterface) Class.forName("Contactos." + storageType).getConstructor(File.class).newInstance(filename);
            return specStorage.saveContacts(list);

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            System.exit(1);
        }
        return true;
    }   
}
