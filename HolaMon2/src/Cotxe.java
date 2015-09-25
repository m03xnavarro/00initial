public class Cotxe {
	String marca;
	String model;
	int cilindrada;
	int cilindres;
	double potenciaFiscal;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCilindres() {
		return cilindres;
	}

	public void setCilindres(int cilindres) {
		this.cilindres = cilindres;
	}

	public double getPotenciaFiscal() {
		return potenciaFiscal;
	}

	public void setPotenciaFiscal(double potenciaFiscal) {
		this.potenciaFiscal = potenciaFiscal;
	}

	public double calPotFis(){
		return(0.08 * this.cilindres * Math.pow(
				(this.cilindrada / this.cilindres), 0.6));
	}
	
	public void calculaPotenciaFiscal() {
		this.potenciaFiscal = (0.08 * this.cilindres * Math.pow(
				(this.cilindrada / this.cilindres), 0.6));
	}
}
