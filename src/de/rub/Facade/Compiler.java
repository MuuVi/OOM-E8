package de.rub.Facade;

public class Compiler {
    private Parser parser = new Parser();
    private Assembler assembler = new Assembler();
    private Linker linker = new Linker();

    public void compile(String sourceFile){
        parser.parse(sourceFile);
        compileInternal(sourceFile);
    }
    private void compileInternal(String sourceFile){
        assembler.assemble(sourceFile);
        linker.link(sourceFile);
    }
}
