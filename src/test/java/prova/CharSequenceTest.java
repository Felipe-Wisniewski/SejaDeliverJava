package prova;

import org.junit.Assert;
import org.junit.Test;

public class CharSequenceTest {

    @Test
    public void shouldReturn_biggerSequence() {
        CharSequence charSeq = new CharSequence("preessaaao");

        Assert.assertEquals("aaa", charSeq.getBiggerSequence());
    }

    @Test
    public void shouldReturn_null() {
        CharSequence charNull = new CharSequence("paralelepipedo");

        Assert.assertEquals("Não possue sequência!", charNull.getBiggerSequence());
    }
}