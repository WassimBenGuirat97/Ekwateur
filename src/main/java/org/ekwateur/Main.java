package org.ekwateur;

import org.ekwateur.clients.IndividualClient;
import org.ekwateur.clients.ProfessionalClient;
import org.ekwateur.exceptions.BillingException;
import org.ekwateur.logging.LoggerService;
import org.ekwateur.services.BillingService;
import org.ekwateur.utils.Localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

            Locale defaultLocale = Locale.getDefault();
            Localization localizationService = new Localization(defaultLocale);

            BillingService billingService = new BillingService();

            IndividualClient indClient = new IndividualClient("EKW010203040", 800, 300, "Mr.", "Ben Guirat", "Wassimf");
            ProfessionalClient proClientSupCa = new ProfessionalClient("EKW123456789", 1560, 452, "12345678901234", "Enterprise 1", 1200000);
            ProfessionalClient proClientInfCa = new ProfessionalClient("EKW987654321", 1266, 432, "98765432109876", "Enterprise 2", 800000);

            double indBill = billingService.generateBill(indClient);
            double proBillSupCa = billingService.generateBill(proClientSupCa);
            double proBillInfCa = billingService.generateBill(proClientInfCa);

            String billingMessage = localizationService.getMessage("billingMessage");
            String currency = localizationService.getCurrencySymbol();

        System.out.println(billingMessage  + indBill + currency)  ;
        System.out.println(billingMessage  + proBillSupCa + currency);
        System.out.println(billingMessage  + proBillInfCa + currency);

        System.out.println(defaultLocale.getCountry());
    }
    }
