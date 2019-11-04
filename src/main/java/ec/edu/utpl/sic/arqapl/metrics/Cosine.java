package ec.edu.utpl.sic.arqapl.metrics;

import org.apache.commons.text.similarity.CosineDistance;

public class Cosine implements Similaritable {
    @Override
    public double similarity(String text1, String text2) {
        var cosine = new CosineDistance();
        var similarity = 1.0 - cosine.apply(text1, text2);

        return similarity;
    }
    @Override
    public void algorithm(String name) {
        if(name.toLowerCase().equals("cosine")){
            Cosine obj = new Cosine();
        }
    }
}
