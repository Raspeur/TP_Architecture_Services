package fr.insa.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="analyser")
public class AnalyserChaineWS {
	@WebMethod(operationName="compare")
	public int analyser(@WebParam(name="chain") String chaine) {
		return chaine.length();
	}
}
