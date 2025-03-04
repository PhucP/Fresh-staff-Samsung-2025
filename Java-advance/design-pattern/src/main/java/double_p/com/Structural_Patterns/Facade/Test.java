package double_p.com.Structural_Patterns.Facade;

public class Test {
    public static void main(String[] args) {
        VideoConverterFacade videoConverterFacade = new VideoConverterFacade();
        videoConverterFacade.ConvertVideo("no.1", "");
    }
}
