package de.rub.Facade;

public class Parser {
    private Scanner scanner = new Scanner();

    public void parse(String sourceFile){
        scanner.scan(sourceFile);
    }
}
