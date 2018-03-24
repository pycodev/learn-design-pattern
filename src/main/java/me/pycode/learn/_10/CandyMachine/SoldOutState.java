package me.pycode.learn._10.CandyMachine;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sold out!");
//        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("there is no quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("sold out!");
    }

    @Override
    public void dispense() {
        System.out.println("sold out!");
    }
}
