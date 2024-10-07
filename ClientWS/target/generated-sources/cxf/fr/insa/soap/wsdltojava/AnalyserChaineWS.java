package fr.insa.soap.wsdltojava;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.2
 * 2024-10-07T11:48:33.579+02:00
 * Generated source version: 3.4.2
 *
 */
@WebService(targetNamespace = "http://soap.insa.fr/", name = "AnalyserChaineWS")
@XmlSeeAlso({ObjectFactory.class})
public interface AnalyserChaineWS {

    @WebMethod
    @Action(input = "http://soap.insa.fr/AnalyserChaineWS/compareRequest", output = "http://soap.insa.fr/AnalyserChaineWS/compareResponse")
    @RequestWrapper(localName = "compare", targetNamespace = "http://soap.insa.fr/", className = "fr.insa.soap.wsdltojava.Compare")
    @ResponseWrapper(localName = "compareResponse", targetNamespace = "http://soap.insa.fr/", className = "fr.insa.soap.wsdltojava.CompareResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int compare(

        @WebParam(name = "chain", targetNamespace = "")
        java.lang.String chain
    );
}
