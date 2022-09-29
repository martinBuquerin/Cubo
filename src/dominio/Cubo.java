
package dominio;

/**
 *
 * @author Martín
 */
public class Cubo {
    private float alto;
    private float ancho;
    private float profundo;

    public Cubo() {
    }

    public Cubo(float alto, float ancho, float profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getProfundo() {
        return profundo;
    }

    public void setProfundo(float profundo) {
        this.profundo = profundo;
    }

    public float calculo(float al ,float an,float prof){
        float resultado = al * an * prof;
        
        return resultado;
    }
    
    
    
    @Override
    public String toString() {
        return "Cubo{" + "alto=" + alto + ", ancho=" + ancho + ", profundo=" + profundo + '}';
    }
    
    
    
}
