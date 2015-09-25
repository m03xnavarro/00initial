
public class Persona {

	public int idPersona;
	public String nom;
	public int alcada;
	public Persona(
	int idPersona, String nombre, int altura) {
	this.idPersona = idPersona;
	this.nom = nombre;
	this.alcada = altura;}
	@Override
	public String toString() {
	return "Persona-> ID: "+idPersona+" Nom: "+nom+" Alçada: "+alcada+"\n";
	}

}
