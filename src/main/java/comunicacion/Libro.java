package comunicacion;
public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen , String titulo , String autor , int paginas ,String ayudante, String editorial, String edicion, String interpretacion){
        super(origen,titulo,autor,paginas);
        this.co_autor=ayudante;
        this.editorial=editorial;
        this.edicion=edicion;
        this.interpretacion=interpretacion;
    }
    public String interpretacion(){
        return this.interpretacion;
    }
    public int palabrasTotales(int palabras){
        return (2*palabras)*super.getPaginas();
        
    }
    public String toString(){
        String r = super.getOrigen() + "\n";
		r += super.getTitulo() + "\n";
		r += super.getAutor() + "\n";
        r += String.valueOf(super.getPaginas())+ "\n";
        r += this.co_autor + "\n";
        r += this.editorial + "\n";
        r+= this.edicion;
		return  r;
    }
    //sets 
    public void setco_autor(String auro){
        this.co_autor=auro;

    }
    public void setEditorial(String editor){
        this.editorial=editor;
    }
    public void setEdicion(String edition){
        this.edicion=edition;
    }
    public void setInterpretacion(String inter){
        this.interpretacion=inter;
    }
    //gets
    public String getco_autor(){
        return this.co_autor;
    }
    public String getEditorial(){
        return this.editorial;

    }
    public String getEdicion(){
        return this.edicion;
    }
}
   
