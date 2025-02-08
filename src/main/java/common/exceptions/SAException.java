package common.exceptions;

import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;

public class SAException extends SOAPFaultException {
   private static final long serialVersionUID = 5067456836242850281L;

   public SAException(String message) {
      super(createSoapFault(message));
   }

   private static SOAPFault createSoapFault(String message) {
      try {
          SOAPFactory factory = SOAPFactory.newInstance();
          SOAPFault fault = factory.createFault();
          fault.setFaultCode(SOAPConstants.SOAP_SENDER_FAULT);
          fault.setFaultString(message);
          fault.setFaultActor("Server A");
          return fault;
      } catch (SOAPException e) {
          throw new RuntimeException("Error creando SOAPFaultException", e);
      }
  }
}