public class horascatedras extends  docentes {
    String ultimotitulo ;
    float numhoras ;
    float valorContrato ;
    float salrio ;
    // metodos

    public horascatedras() {
    }

    public horascatedras(int idpersonal, String nombre, String ciudad, String apellido, String genero, int estrato, String ariaformacion, String tituloprofesional, String unidadacademica, String ultimotitulo, float salrio, float valorContrato, float numhoras) {
        super(idpersonal, nombre, ciudad, apellido, genero, estrato, ariaformacion, tituloprofesional, unidadacademica);
        this.ultimotitulo = ultimotitulo;
        this.salrio = salrio;
        this.valorContrato = valorContrato;
        this.numhoras = numhoras;
    }

    public String getUltimotitulo() {
        return ultimotitulo;
    }

    public float getNumhoras() {
        return numhoras;
    }

    public float getValorContrato() {
        return valorContrato;
    }

    public float getSalrio() {
        return salrio;
    }

    public void setUltimotitulo(String ultimotitulo) {
        this.ultimotitulo = ultimotitulo;
    }

    public void setNumhoras(float numhoras) {
        this.numhoras = numhoras;
    }

    public void setValorContrato(float valorContrato) {
        this.valorContrato = valorContrato;
    }

    public void setSalrio(float salrio) {
        this.salrio = salrio;
    }
}
