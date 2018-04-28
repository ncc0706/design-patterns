package io.arukas.demo1;

public class ConcreteStrategyA implements Strategy{
    @Override
    public void algorithmLogic() {
        System.out.println("执行策略A.");
    }
}