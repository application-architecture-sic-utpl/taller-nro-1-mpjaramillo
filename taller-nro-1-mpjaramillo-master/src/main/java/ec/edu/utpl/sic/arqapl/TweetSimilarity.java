package ec.edu.utpl.sic.arqapl;


import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import ec.edu.utpl.sic.arqapl.metrics.Jaccard;
import ec.edu.utpl.sic.arqapl.metrics.JaroWinkler;
import ec.edu.utpl.sic.arqapl.metrics.Similaritable;

public class TweetSimilarity {
    private Similaritable algorithmName;

    public TweetSimilarity() {
        algorithmName = new JaroWinkler();
    }
    public TweetSimilarity(String name){
        if(name.toLowerCase().equals("jarowinkler")){
            algorithmName = new JaroWinkler();
        }else if(name.toLowerCase().equals("jaccard")){
            algorithmName = new Jaccard();
        }else if(name.toLowerCase().equals("cosine")){
            algorithmName = new Cosine();
        }
    }



    public double similarity(String tweet1, String tweet2) {
        return algorithmName.similarity(tweet1, tweet2);
    }
}
