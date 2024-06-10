package com.ekwateur.test;

import org.ekwateur.clients.IndividualClient;
import org.ekwateur.clients.ProfessionalClient;
import org.ekwateur.services.BillingService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BillingServiceTest {
    @Test
    public void testGenerateBillForProfessionalClientWithHighTurnover() {
        ProfessionalClient proClient = new ProfessionalClient("EKW123456789", 1000, 500, "12345678901234", "Enterprise 1", 20000000);
        BillingService billingService = new BillingService();
        double bill = billingService.generateBill(proClient);
        assertEquals(1000 * 0.110 + 500 * 0.123, bill);
    }

    @Test
    public void testGenerateBillForProfessionalClientWithLowTurnover() {
        ProfessionalClient proClient = new ProfessionalClient("EKW123456789", 1000, 500, "12345678901234", "Enterprise 2", 50000);
        BillingService billingService = new BillingService();
        double bill = billingService.generateBill(proClient);
        assertEquals(1000 * 0.112 + 500 * 0.117, bill);
    }

    @Test
    public void testGenerateBillForIndividualClient() {
        IndividualClient indClient = new IndividualClient("EKW987654321", 800, 300, "Mr.", "Doe", "John");
        BillingService billingService = new BillingService();
        double bill = billingService.generateBill(indClient);
        assertEquals(800 * 0.133 + 300 * 0.108, bill);
    }
}

