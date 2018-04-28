package io.arukas.demo1;

public class Context {

    private Strategy strategy;


    public void factory(String strategyType) {

        if (strategyType.equals("Win")) {
            strategy = new ConcreteStrategyA();
        } else {
            strategy = new ConcreteStrategyB();
        }

    }

    /**
     * 执行策略
     */
    public void contextInterface() {
        strategy.algorithmLogic();
    }

}
