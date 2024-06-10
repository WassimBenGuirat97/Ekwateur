# Ekwateur Billing System

## Description

This project is a backend application designed to calculate the monthly billing amount for Ekwateur customers. The system supports two types of customers: professional clients and individual clients. Each customer can consume two types of energy: electricity and gas, with billing calculated based on their consumption.

## Features

- **Customer Types**:
  - **Professional Clients**:
    - Reference Client (EKW + 9 numeric characters)
    - SIRET Number
    - Company Name
    - CA
  - **Individual Clients**:
    - Reference Client (EKW + 9 numeric characters)
    - Title
    - Last Name
    - First Name

- **Energy Types**:
  - Electricity
  - Gas

- **Pricing**:
  - For individual clients: 
    - Electricity: €0.133 per kWh
    - Gas: €0.108 per kWh
  - For professional clients:
    - CA > €1,000,000:
      - Electricity: €0.110 per kWh
      - Gas: €0.123 per kWh
    - CA ≤ €1,000,000:
      - Electricity: €0.112 per kWh
      - Gas: €0.117 per kWh

## Technical Details

- **Java Version**: 17
- **Build Tool**: Maven
- **Logging**: `java.util.logging`
- **Localization**: Supports dynamic language and currency display based on locale settings.

## Getting Started

### Prerequisites

- Java 17
- Maven

### Installation

1. Clone the repository:

    git clone https://github.com/WassimBenGuirat97/Ekwateur.git

2. Build the project using Maven:

    mvn clean install

### Project Structure
#### src/main/java/org/ekwateur:
Main.java: Entry point of the application.

#### src/main/java/org/ekwateur/clients:
Client.java: Abstract class representing a generic client.  
ProfessionalClient.java: Class representing a professional client.  
IndividualClient.java: Class representing an individual client.  

#### src/main/java/org/ekwateur/services:
BillingService.java: Service class responsible for generating bills.

#### src/main/java/org/ekwateur/utils:
LocalizationService.java: Service class for handling localization and currency.

#### src/main/java/org/ekwateur/logging:
LoggerService.java: Service class for logging.

#### src/main/java/org/ekwateur/exceptions:
BillingException.java: Custom exception class for billing-related errors.

#### src/main/java/com/ekwateur/test:
BillingServiceTest.java: Contains unit tests


#### src/main/resources:

messages_fr.properties: Localization file for French.  
messages_de.properties: Localization file for German.  
messages_es.properties: Localization file for Spanish.  
messages_lu.properties: Localization file for Luxembourg.  

### Running the Application

Run the `Main` class:  

mvn exec:java -Dexec.mainClass="org.ekwateur.Main"  

### Usage
The application generates a bill for both professional and individual clients based on their energy consumption. The messages displayed, including currency symbols, are localized based on the system's default locale.

## Example Output

Facture générée: 154.3 €  
Facture générée: 123.6 €
### Logging
All log messages are written to billing_system.log in the root directory. The logging includes error messages for any exceptions encountered.  

### Future Enhancements
Adding more customer types.  
Supporting more energy types.  
Adding a web interface for the application.  
