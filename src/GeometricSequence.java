//class that implements checking whether sequence taken from file is geometric sequence

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class GeometricSequence {

    private List data = new ArrayList();
    private double q;

    public void loadData(Reader input) throws IOException, NumberFormatException {
        data.clear();
        final BufferedReader in = new BufferedReader(input);
        for (String line = in.readLine(); line != null; line = in.readLine()) {
            for (StringTokenizer tokens = new StringTokenizer(line, ","); tokens.hasMoreTokens(); ) {
                data.add(new Double(tokens.nextToken().trim()));
            }
        }
        in.close();
    }

    protected List inputData() {
        return Collections.unmodifiableList(data);
    }

    public double calcQ(double delta) {
        final List qs = new ArrayList();

        for (int i = 0; i<data.size()-1; i++){
            qs.add(new Double(((Double) data.get(i)).doubleValue() / ((Double) data.get(i + 1))));
        }

        final double min = ((Double) Collections.min(qs)).doubleValue();
        final double max = ((Double) Collections.max(qs)).doubleValue();

        if(max - min <= delta){
            return (min + max) / 2.0;
        }

        throw new IllegalStateException("This is not geometric sequence");
    }
}
