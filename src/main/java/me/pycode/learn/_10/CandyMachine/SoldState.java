package me.pycode.learn._10.CandyMachine;

public class SoldState implements State {

    private  GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait , we're already giving you a gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turn the crank.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you a another gumball.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.count > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
