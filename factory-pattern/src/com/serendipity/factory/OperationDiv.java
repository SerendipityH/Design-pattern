package com.serendipity.factory;

/**
 * 除法
 */
public class OperationDiv extends Operation {
    @Override
    public Double getResult() throws Exception {
        if (getNumberB() == 0)
            throw new Exception("cc");

        return getNumberA() + getNumberB();
    }
}
