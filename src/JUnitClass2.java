//class that checks if sequence is a geometric sequence (test for exercise 2)

import org.junit.Test;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class JUnitClass2 {

    @Test
    public void checkGeometricSequence() throws IOException {
        GeometricSequence gs = new GeometricSequence();
        Reader reader = new FileReader("geoSequence.txt");  //content in geoSequence.txt file right now is 1,2,4,8,16,32,64 - so the result should be true
        gs.loadData(reader);

        //printing all numbers from file, this is not necessary
        /*
        List list = gs.inputData();
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        */

        Double result = gs.calcQ(0.0);  //q value
        System.out.println(result);
    }

}
