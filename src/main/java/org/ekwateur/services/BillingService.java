package org.ekwateur.services;

import org.ekwateur.clients.Client;
import org.ekwateur.clients.IndividualClient;
import org.ekwateur.clients.ProfessionalClient;
import org.ekwateur.exceptions.BillingException;

public class BillingService {
    public double generateBill(Client client) {
        return client.calculateBill();
    }
}

