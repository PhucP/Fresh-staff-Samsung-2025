package org.example.DesignPattern.Facade;

public class VideoConverterFacade {
    public void ConvertVideo(String fileName, String format){
        VideoFile videoFile = new VideoFile();
        videoFile.renderVideoFile(fileName);
        BitrateReader bitrateReader = new BitrateReader();
        bitrateReader.renderBitrateFile(fileName);
        CodecFactory codecFactory = new CodecFactory();
        codecFactory.loadCodec(fileName);
        SaveVideoFile saveVideoFile = new SaveVideoFile();
        saveVideoFile.saveVideoFile(fileName);
    }
}
