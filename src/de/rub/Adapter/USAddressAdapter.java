package de.rub.Adapter;

public class USAddressAdapter extends USAddress implements AddressValidator{
    @Override
    public boolean isGueltig(String adresse, String plz, String bundesland) {
        return isValidUSAddress(adresse, plz, bundesland);
    }
}
