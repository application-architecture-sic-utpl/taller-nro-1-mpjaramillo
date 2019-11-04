package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimilarityJaro {

    @Test
    public void similar() {
        var tweet1 = "Hola mundo";
        var tweet2 = "Hola mundo";

        TweetSimilarity tsJaro = new TweetSimilarity("jarowinkler");
        assertEquals(1.0,
                tsJaro.similarity(tweet1, tweet2), 0.1);

    }
}
