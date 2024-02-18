package de.telran.corinaHelp;

import de.telran.carinaHelp.ArrayListWorkUtil;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ArrayListWorkUtilTest {
    List<String> strings = Arrays.asList("QA","помогают","программистам","тестировать","программы");
    List<String> strings1 = Arrays.asList("AA","BB","CC","AA","DD","AA","BB");
    List<Integer> numbers = Arrays.asList(2,15,24,19,11,33,26,22);
    @Test
    void concatenateStringsTest() {
        String expectedResult = "QAпомогаютпрограммистамтестироватьпрограммы";
        String result = ArrayListWorkUtil.concatenateStrings(strings);

        Assert.assertEquals(expectedResult,result);

    }

    @Test
    void findMaxOrMinTest() {
        int expMinNum = 2;
        int expMaxNum = 33;

        int minResult = ArrayListWorkUtil.findMaxOrMin(numbers,false);
        Assert.assertEquals(expMinNum,minResult);
        int maxResult = ArrayListWorkUtil.findMaxOrMin(numbers,true);
        Assert.assertEquals(expMaxNum, maxResult);


    }

    @Test
    void maxLengthString() {
        int expLength = 13;
        int maxLength = ArrayListWorkUtil.maxLengthString(strings);
        Assert.assertEquals(expLength, maxLength);
    }

    @Test
    void findLengthString() {
        int length = 9;
        List<String> expList = Arrays.asList("программы");
        List<String> resultList = ArrayListWorkUtil.findLengthString(strings,length);
        Assert.assertEquals(expList,resultList);
    }

    @Test
    void oddNumbers() {
        List<Integer> expList = Arrays.asList(15,19,11,33);
        List<Integer> resultList = ArrayListWorkUtil.oddNumbers(numbers);
        Assert.assertEquals(expList,resultList);
    }

    @Test
    void deleteDublicate() {
        List<String> expList = Arrays.asList("AA","BB","CC","DD");
        List<String> resultList = ArrayListWorkUtil.deleteDublicate(strings1);
        Assert.assertEquals(expList,resultList);
    }
}