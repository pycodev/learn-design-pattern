package me.pycode.learn._10.CandyMachine;

public class GumballMachine{
    SoldState soldState;
    SoldOutState soldOutState;
    NoQuarterState noQuarterState;
    HasQuarterState hasQuarterState;
    State state = soldOutState;

    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        if (this.count > 0) {
            state = noQuarterState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public SoldOutState getSoldOutState() {
        return soldOutState;
    }

    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    public HasQuarterState getHasQuarterState() {
        return hasQuarterState;
    }


    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        // 内部动作
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot!");
        if (count != 0) {
            count--;
        }
    }

}
