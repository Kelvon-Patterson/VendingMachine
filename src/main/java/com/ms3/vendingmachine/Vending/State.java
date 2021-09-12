package com.ms3.vendingmachine.Vending;

public interface State {
    public void collectCash(int cash);
    public void dispenseChange(int productCode);
    public void dispenseItem(String productCode);
    public void cancelTransaction();
}
