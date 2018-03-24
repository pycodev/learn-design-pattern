package me.pycode.learn._10.CandyMachine;

public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
