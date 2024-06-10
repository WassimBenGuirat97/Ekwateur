package org.ekwateur.clients;

public class IndividualClient extends Client {
    private String title;
    private String lastName;
    private String firstName;

    public IndividualClient(String reference, double electricityConsumption, double gasConsumption, String title, String lastName, String firstName) {
        super(reference, electricityConsumption, gasConsumption);
        this.title = title;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public double calculateBill() {
        double electricityRate = 0.133;
        double gasRate = 0.108;
        return (getElectricityConsumption() * electricityRate) + (getGasConsumption() * gasRate);
    }
}

