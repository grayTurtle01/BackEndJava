import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;

public class Sonido{
    String fileName;

    public Sonido(String fileName){
        this.fileName = fileName;
    }

    public void playSound(){
         try {
            DataLine.Info daInfo = new DataLine.Info(Clip.class, null);
            try {
                URL sounURL = Sonido.class.getResource(fileName);

                AudioInputStream inputStream = AudioSystem.getAudioInputStream(sounURL);
                DataLine.Info info = new DataLine.Info(Clip.class, inputStream.getFormat());
                Clip clip = (Clip) AudioSystem.getLine(info);
                clip.open(inputStream);
                clip.start();
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            } catch (UnsupportedAudioFileException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
         } catch (Exception e) {
            System.out.println(" => Exception");
          }

    }


}
