package gwt.server;


import gwt.client.GreetingService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;


@SuppressWarnings("serial")
public class ServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	public String greetServer(String input) throws IllegalArgumentException {
		String[] inputs = input.split(";");
	
	
		double a = 0, b = 0, c = 0;
		String x1, x2;
		a = Double.parseDouble(inputs[0]);
		b = Double.parseDouble(inputs[1]);
		c = Double.parseDouble(inputs[2]);
		double delta = (b*b)- 4 * a * c;
		if (delta >= 0) {
			x1 = ((-b + Math.sqrt(delta)) / (2 * a)) + "";
			x2 = ((-b - Math.sqrt(delta)) / (2 * a)) + "";
		} 
		
		return "x1=" + x1 + "x2=" + x2;
	}


	
}
