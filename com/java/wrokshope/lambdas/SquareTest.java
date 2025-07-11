package com.java.wrokshope.lambdas;

public class SquareTest {

    public void testsquare(){
        Square square=(int x) ->x*x;
        Assertion.assertEquals(36,square.findsquare(6));
    }
}
