package comunicacion;

public class Fabula extends Escrito{
    private String ensenanzas;
    private String interpretacion;
    public Fabula(String origen , String titulo , String autor , int paginas , String ensenanza,String interpreta){
        super(origen, titulo, autor, paginas);
        this.ensenanzas=ensenanza;
        this.interpretacion=interpreta;
    }
    public String toString(){
        String r = super.getOrigen() + "\n";
		r += super.getTitulo() + "\n";
		r += super.getAutor() + "\n";
        r += String.valueOf(super.getPaginas())+ "\n";
        r += this.ensenanzas;
       
		return  r;
    }
    public String interpretacion(){
        return this.interpretacion;
    }
    public int palabrasTotales(int numero){
        return(numero*super.getPaginas());
    }
    //get 
    public String getEnsenanza(){
        return this.ensenanzas;
    }
    public string getInterpretacion(){
        return this.interpretacion;
    }
}
