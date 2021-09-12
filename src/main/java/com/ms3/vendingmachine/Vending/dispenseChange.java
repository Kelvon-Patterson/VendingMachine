package com.ms3.vendingmachine.Vending;

public class dispenseChange implements State{
    private VendingMachine vendingMachine;
    @Override
    public void collectCash(int cash) {

    }

    @Override
    public void dispenseChange(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void dispenseItem(String productCode) {

    }

    @Override
    public void cancelTransaction() {

    }
}
