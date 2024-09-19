public class ocasionales extends  docentes{
     String ultimotitulo ;
     float numerodemeses ;
     float salario ;

    public ocasionales() {
    }

    public ocasionales(int idpersonal, String nombre, String ciudad, String apellido, String genero, int estrato, String ariaformacion, String tituloprofesional, String unidadacademica, String ultimotitulo, float numerodemeses, float salario) {
        super(idpersonal, nombre, ciudad, apellido, genero, estrato, ariaformacion, tituloprofesional, unidadacademica);
        this.ultimotitulo = ultimotitulo;
        this.numerodemeses = numerodemeses;
        this.salario = salario;
    }

    public String getUltimotitulo() {
        return ultimotitulo;
    }

    public float getNumerodemeses() {
        return numerodemeses;
    }

    public float getSalario() {
        return salario;
    }

    public void setUltimotitulo(String ultimotitulo) {
        this.ultimotitulo = ultimotitulo;
    }

    public void setNumerodemeses(float numerodemeses) {
        this.numerodemeses = numerodemeses;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
