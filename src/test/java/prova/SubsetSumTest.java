package prova;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSumTest {

    @Test
    public void shouldReturn_subsetMaxSum() {
        Integer[] set = new Integer[] {2,-4,6,8,-10,100,-6,5};
        ArrayList<Integer> setTest = new ArrayList<>(Arrays.asList(set));
        SubsetSum subsetSum = new SubsetSum(setTest);

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("2", "-4", "**6", "8", "-10", "100**", "-6", "5"));

        Assert.assertEquals(expected, subsetSum.subsetMaxSum());
    }

    @Test
    public void shouldReturn_subsetNullOrEmpty() {
        Integer[] set = new Integer[] {0};
        ArrayList<Integer> setTest = new ArrayList<>(Arrays.asList(set));
        SubsetSum subsetSum = new SubsetSum(setTest);

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Conjunto NULO ou VAZIO"));

        Assert.assertEquals(expected, subsetSum.subsetMaxSum());
    }
}