package tests;

import com.clss.primeFactor;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class primeFactorTest  {

    List<Integer> divisors ;

    primeFactor factor;

    @Before
    public void setUp() throws Exception {
        divisors =new ArrayList<Integer>();
        factor = new primeFactor();
    }


    @Test
    public void  number1_result1()throws Exception {

       assertEquals(addlist(1),1);

    }

    @Test
    public void  number2_result2()throws Exception {

        assertEquals(addlist(2),2);

    }

    @Test
    public void  number3_result3()throws Exception {

        assertEquals(addlist(3),3);

    }
    @Test
    public void  number4_result2_2()throws Exception {
             assertEquals(addlist(2,2),4);

    }

    @org.junit.Test
    public void  number5_result5()throws Exception {


        assertEquals(addlist(5),5);

    }

    @Test
    public void  number6_result2_3()throws Exception {



        assertEquals(addlist(2,3),6);

    }

    @Test
    public void  number8_result2_2_2()throws Exception {


        assertEquals(addlist(2,2,2),8);

    }

    @Test
    public void  number9_result3_3()throws Exception {


        assertEquals(addlist(3,3),9);

    }
    @Test

    public void  number10_result2_5()throws Exception {


        assertEquals(addlist(2,5),10);

    }

    public List<Integer>  addlist(int ... multiplicadores){
        for (int c :multiplicadores)
            divisors.add(c);
    return divisors;
    }

       public void  assertEquals(List<Integer> divisors, int numero ){
        Assert.assertEquals(divisors, factor.generate(numero));
    }

}