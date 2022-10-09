package q4;

public class Produto {
	String nome;
	public double PC;
	public double PV;
	public double L;
	public double D;
	
	public double CalculaMargemLucro(){
		
		double M=0;
		M=(float)((this.PV-(this.PC+this.D))/(this.PV));
		M=(float)M*100;
		return M;
	}
	
}
