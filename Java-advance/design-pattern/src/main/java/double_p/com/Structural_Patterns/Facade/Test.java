package org.example.DesignPattern.Facade;

public class Test {
    public static void main(String[] args) {
        VideoConverterFacade videoConverterFacade = new VideoConverterFacade();
        videoConverterFacade.ConvertVideo("no.1", "");
    }
}
