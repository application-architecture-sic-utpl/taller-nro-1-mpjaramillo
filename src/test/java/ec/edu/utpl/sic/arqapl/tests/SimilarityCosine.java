package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimilarityCosine {

    @Test
    public void similar() {
        var tweet1 = "Hola mundo";
        var tweet2 = "Hola mundo";
        TweetSimilarity tsCosine = new TweetSimilarity("cosine");

        assertEquals(1.0,
                tsCosine.similarity(tweet1, tweet2), 0.1);

    }
}
