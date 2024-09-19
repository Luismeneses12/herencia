public class administrador extends  personal {
    //atributos
    String dependencia ;
    String titulo ;
    // metodos


    public administrador() {

    }

    public administrador(int idpersonal, String nombre, String ciudad, String apellido, String genero, int estrato, String dependencia, String titulo) {
        super(idpersonal, nombre, ciudad, apellido, genero, estrato);
        this.dependencia = dependencia;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
