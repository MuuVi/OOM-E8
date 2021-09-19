package de.rub.Adapter;

public class DEAddress implements AddressValidator{
    @Override
    public boolean isGueltig(String adresse, String plz, String bundesland) {
        if (plz.length() != 5){
            System.out.println("Die Postleitzahl muss 5 stellig sein!");
            return false;
        }
        else
            return true;
    }
}
