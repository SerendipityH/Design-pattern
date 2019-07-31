package com.serendipity.factory;

//简单工厂模式
public class OperationFactory {
    private static Operation createOperate(String operate) {
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }

    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("+");
        operate.setNumberA(1.0);
        operate.setNumberB(2.0);
        try {
            System.out.println(operate.getResult());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
