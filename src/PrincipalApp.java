/**
 * Esta clase no tengo ni zorra de lo que hace 
 * @author Juan Carlos
 *
 */
public class PrincipalApp {
	    private String frase;
	    /**
	     * 
	     * @param frase
	     */
	    public void BuscaPalabra(String frase) {
	        this.frase = frase;
	    }
	    /**
	     * este es el constructor
	     * @return
	     */
		public String getFrase() {
			return frase;
		}

		public void setFrase(String frase) {
			this.frase = frase;
		}
		public boolean buscarPalabra(String palabra) {
			/**
			 * este es el metodo
			 */
			int indice = this.frase.indexOf(palabra);
		    return indice != -1;  
		}
	}
