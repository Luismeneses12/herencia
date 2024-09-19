public class gps extends administrador{
    //atributos
    String fecha;
     float Numeses ;
     float  valorcontr ;
     float salario ;
// metodos
    public gps() {
    }

    public gps(int idpersonal, String nombre, String ciudad, String apellido, String genero, int estrato, String dependencia, String titulo, String fecha, float numeses, float valorcontr, float salario) {
        super(idpersonal, nombre, ciudad, apellido, genero, estrato, dependencia, titulo);
        this.fecha = fecha;
        Numeses = numeses;
        this.valorcontr = valorcontr;
        this.salario = salario;
    }

    public String getFecha() {
        return fecha;
    }

    public float getNumeses() {
        return Numeses;
    }

    public float getValorcontr() {
        return valorcontr;
    }

    public float getSalario() {
        return salario;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNumeses(float numeses) {
        Numeses = numeses;
    }

    public void setValorcontr(float valorcontr) {
        this.valorcontr = valorcontr;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
