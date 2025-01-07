package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen,String[] letras , String interpretacion){
        super(origen);
        this.letras=letras;
        this.interpretacion=interpretacion;
    }
    public int cantidadLetras(){
        return this.letras.length;
    }
    
    public String interpretacion() {
        return this.interpretacion;

        
    }
   
    public String toString() {
       
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < letras.length; i++) {
            sb.append(letras[i]); 
            if (i < letras.length - 1) {
                sb.append(", "); 
            }
        }

        return sb.toString(); 
    }
}

