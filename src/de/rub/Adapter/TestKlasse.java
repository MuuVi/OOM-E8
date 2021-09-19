package de.rub.Adapter;

public class TestKlasse {

    public static void main(String[] args) {
        USAddressAdapter USAddress = new USAddressAdapter();
        AddressValidator validator = new DEAddress();
        boolean valid = false;
        valid = validator.isGueltig("Universitätsstr. 150", "44801", "NRW");
        System.out.println(valid);
        valid = validator.isGueltig("Universitätsstr. 150", "44801", "NW");
        System.out.println(valid);
        validator = USAddress;
        valid = validator.isGueltig("1600 Pennsylvania Ave NW, Washington", "20500", "DC");
        System.out.println(valid);
    }
}
