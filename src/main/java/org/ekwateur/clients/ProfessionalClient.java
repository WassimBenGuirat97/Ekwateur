package org.ekwateur.clients;

public class ProfessionalClient extends Client {
    private String siret;
    private String businessName;
    private double ca;

    public ProfessionalClient(String reference, double electricityConsumption, double gasConsumption, String siret, String businessName, double ca) {
        super(reference, electricityConsumption, gasConsumption);
        this.siret = siret;
        this.businessName = businessName;
        this.ca = ca;
    }

    @Override
    public double calculateBill() {
        double electricityRate = (ca > 1000000) ? 0.110 : 0.112;
        double gasRate = (ca > 1000000) ? 0.123 : 0.117;
        return (getElectricityConsumption() * electricityRate) + (getGasConsumption() * gasRate);
    }
}

