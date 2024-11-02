package model;

public class Receipt {

    private int ID;
    private Cashier cashier;
    private Patient patient;
    private double amount;
    private int type;
    //0 ==> Operatiom
    //1 ===> Report
    private int itemID; //Operation/Report ID
}
