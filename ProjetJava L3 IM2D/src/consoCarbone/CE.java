package consoCarbone;

// Enumération CE

public enum CE {
	A(0.005),
	B(0.01),
	C(0.02),
	D(0.035),
	E(0.055),
	F(0.08),
	G(0.1) ;
	
	public double alpha; 
	
	//Constructeur d'alpha
	
	private CE(double alpha) {
	this.alpha = alpha;
	}
	
	//Autre manniere de rediger 
	//private CE(double a) {
	//alpha = a;
	//}
}

