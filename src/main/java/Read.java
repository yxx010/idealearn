import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Read {


    public Read() throws FileNotFoundException {

    }
    public static void main (String [] args) throws IOException {
        FileInputStream f = new FileInputStream("src/main/resources/test");
        int size = f.available();
        f.read();
       // f.readAllBytes​();


        //System.out.println(f.read(b));
        for(int i=0; i< size; i++){
            System.out.print((char)f.read() + "");
        }

    }

}
