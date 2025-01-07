package comunicacion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos ;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas,String idea, String[] argumento , String conclusion , String referencias, String interpretacion){
        super(origen,titulo,autor,paginas);
        this.idea=idea;
        this.argumentos=argumento;
        this.conclusion=conclusion;
        this.referencias=referencias;
        this.interpretacion=interpretacion;
    }
   
    public int palabrasTotales(int palabrasPagina){
        return(5*palabrasPagina)*super.getPaginas() ;
    }
   
    public String toString() {
        String r = super.getOrigen() + "\n";
        r += super.getTitulo() + "\n";
        r += super.getAutor() + "\n";
        r += String.valueOf(super.getPaginas())+ "\n";
        r += this.idea + "\n";
        r += String.valueOf(this.argumentos.length) + "\n";
        r += this.conclusion + "\n";
        r += this.referencias;
       
        return  r;
    }
    
    public String interpretacion() {
        return this.interpretacion;
    }
    //get 
    public String getIdea(){
        return this.idea;
    }
    public String[] getArgumentos(){
        return this.argumentos;
    }
    public String getConclusion(){
        return this.conclusion;
    }
    public String getReferencias(){
        return this.referencias;
    }
    //set 
    public void setIdea(String idea){
        this.idea=idea;
    }
    public void setArgumentos(String[] arg){
        this.argumentos=arg;

    }
    public void setConclusion(String conclusion){
        this.conclusion=conclusion;

    }
    public void setReferencias(String referencais){
        this.referencias=referencais;
    }
}
