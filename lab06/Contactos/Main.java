package Contactos;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        Agenda ag = new Agenda();

        //------------------------------- TXT -------------------------

        File filename = new File("contacts1.txt");
        ContactStorageInterface store = new ContactsImple(filename);
        System.out.println("******************* TXT FILE *******************");
        System.out.println("Open and load...");
        ag.openAndLoad(store);

        System.out.println("\ngetByName: " + ag.getByName("Hugo Francisco"));

        System.out.println("\nAdd Ines Moreira...");
        ag.add(new Contact("Ines Moreira", 923567245));
        System.out.println("\ngetByName: " + ag.getByName("Ines Moreira"));

        System.out.println("\nRemoving Hugo Francisco...");
        ag.remove(ag.getByName("Hugo Francisco"));

        System.out.printf("\nRaquel Costa exists?");
        if (ag.exist(ag.getByName("Raquel Costa")) == true) {
            System.out.printf(" Yes\n");
        } else {
            System.out.printf(" No\n");
        }

        System.out.printf("\nHugo Francisco exists?");
        if (ag.exist(ag.getByName("Hugo Francisco")) == true) {
            System.out.printf(" Yes\n");
        } else {
            System.out.printf(" No\n");
        }

        ag.add(new Contact("Hugo Francisco", 923456123));

        System.out.println("Save and Close...");
        ag.saveAndClose(store);

        //-------------------------------------------------------------

        System.out.println("**************** BINARY FILE **********************");
        String file = "contacts"; 
       

        //-------------------------------- BINARY --------------------------

        File fileN = new File(file);
        ContactStorageInterface csb = new ContactsImple(fileN);
        ag.openAndLoad(csb);


        System.out.println("getByName: " + (ag.getByName("Ze Manel")));

        System.out.println("Add Maria Joao");
        ag.add(new Contact("Maria Joao", 923234421));

        System.out.printf("\nMaria Joao exists?");
        if (ag.exist(ag.getByName("Maria Joao")) == true) {
            System.out.printf(" Yes\n");
        } else {
            System.out.printf(" No\n");
        }

        System.out.printf("\nPedro Duarte exists?");
        if (ag.exist(ag.getByName("Pedro Duarte")) == true) {
            System.out.printf(" Yes\n");
        } else {
            System.out.printf(" No\n");
        }

        System.out.println("\nRemove Pedro Duarte");
        ag.remove(ag.getByName("Pedro Duarte"));

        System.out.printf("\nPedro Duarte exists?");
        if (ag.exist(ag.getByName("Pedro Duarte")) == true) {
            System.out.printf(" Yes\n");
        } else {
            System.out.printf(" No\n");
        }

        System.out.printf("\nAntonio Vasconcelos exists?");
        if (ag.exist(ag.getByName("Antonio Vasconcelos")) == true) {
            System.out.printf(" Yes\n");
        } else {
            System.out.printf(" No\n");
        }

        ag.add(new Contact("Pedro Duarte", 916767543));

        System.out.println("Save and Close...");
        ag.saveAndClose(csb);
                
    }
}
