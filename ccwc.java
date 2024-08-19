import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ccwc {
  public static void main(String args[]) {
      switch(args[0]) {
        case "-c":
          File file = new File(args[1]);
          try (FileInputStream fis = new FileInputStream(file)) {
          byte[] fileBytes = new byte[(int) file.length()];
          fis.read(fileBytes);
          System.out.println(fileBytes.length + " " + args[1]);
          }
          catch(IOException e) {
            e.printStackTrace();
          }
      }
  }
}
