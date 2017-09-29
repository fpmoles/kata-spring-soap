# Kata Spring SOAP
The purpose of this kata is to leverage Spring to make a SOAP call.
Leveraging jaxb to generate java classes from the WSDL and then leverage the WebServiceGatewaySupport framework from Spring to make the SOAP call.

## Directions for use
1. clone the repository
2. execute mvn generate-sources
3. run the project
4. make a POST to http://localhost:8080/actions/convert with the following RequestBody
{     "amount": 1.00,     "fromCurrencyType": "USD", "toCurrencyType": "GBP" }

Ensure you have your Accept and Content-Type headers set to application/json

