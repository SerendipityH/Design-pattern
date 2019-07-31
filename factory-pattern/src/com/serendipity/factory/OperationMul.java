package com.serendipity.factory;

public class OperationMul extends Operation {
    @Override
    public Double getResult() {
        return getNumberA() * getNumberB();
    }
}
