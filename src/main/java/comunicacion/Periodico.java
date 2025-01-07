package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas,String fecha, String primicia, String interpretar){
        super(origen, titulo, autor, paginas);
        this.fecha=fecha;
        this.primicia=primicia;
        this.interpretacion=interpretar;
    }


    public int palabrasTotales(int palabrasPagina) {
      return (10*palabrasPagina)*super.getPaginas();
    }
    public String interpretacion(){
        return this.interpretacion;
    
    }
    public String toString(){
            String r = super.getOrigen() + "\n";
            r += super.getTitulo() + "\n";
            r += super.getAutor() + "\n";
            r += String.valueOf(super.getPaginas())+ "\n";
            r += this.fecha + "\n";
            r += this.primicia;
           
            return  r;
        }
    //set 
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public void setPrimicia(String primicia){
        this.primicia=primicia;
    }
    public void setInterpretacion(String interprete){
        this.interpretacion=interprete;
    }
    //gets
    public String getFecha(){
        return this.fecha;

    }
    public String getPrimicia(){
        return this.primicia;

    }
}   
