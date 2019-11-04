package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import static org.junit.Assert.*;
import org.junit.Test;

public class TweetSimilarityTest {
    public TweetSimilarityTest() {
    }

    @Test
    public void similar() {
        var tweet1 = "Hola mundo";
        var tweet2 = "Hola mundo";
        TweetSimilarity tsJaccard = new TweetSimilarity("jaccard");
        assertEquals(1.0,
                tsJaccard.similarity(tweet1, tweet2), 0.1);

    }
}
