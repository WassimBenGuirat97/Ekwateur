package org.ekwateur.clients;

public abstract class Client {
    private String reference;
    private double electricityConsumption;
    private double gasConsumption;

   protected Client(String reference, double electricityConsumption, double gasConsumption) {
        this.reference = reference;
        this.electricityConsumption = electricityConsumption;
        this.gasConsumption = gasConsumption;
    }

    public String getReference() {
        return reference;
    }

    public double getElectricityConsumption() {
        return electricityConsumption;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public abstract double calculateBill();
}

