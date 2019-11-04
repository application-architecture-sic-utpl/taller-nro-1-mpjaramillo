package ec.edu.utpl.sic.arqapl.metrics;

import org.apache.commons.text.similarity.JaroWinklerDistance;

public class JaroWinkler implements Similaritable {

        @Override
        public double similarity(String text1, String text2) {
            var jarowinkler = new JaroWinklerDistance();
            var similarity = jarowinkler.apply(text1, text2);

            return similarity;
        }

    @Override
    public void algorithm(String name) {
        if(name.toLowerCase().equals("jarowinkler")){
            JaroWinkler obj = new JaroWinkler();
        }
    }
}
