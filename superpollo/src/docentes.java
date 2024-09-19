public class docentes  extends  personal{
    //atributos
    String  ariaformacion ;
    String  tituloprofesional ;
    String   unidadacademica ;
    // metodos


    public docentes() {
    }

    public  docentes(int idpersonal, String nombre, String ciudad, String apellido, String genero, int estrato, String ariaformacion, String tituloprofesional, String unidadacademica) {
        super(idpersonal, nombre, ciudad, apellido, genero, estrato);
        this.ariaformacion = ariaformacion;
        this.tituloprofesional = tituloprofesional;
        this.unidadacademica = unidadacademica;
    }

    public String getAriaformacion() {
        return ariaformacion;
    }

    public String getTituloprofesional() {
        return tituloprofesional;
    }

    public String getUnidadacademica() {
        return unidadacademica;
    }

    public void setAriaformacion(String ariaformacion) {
        this.ariaformacion = ariaformacion;
    }

    public void setTituloprofesional(String tituloprofesional) {
        this.tituloprofesional = tituloprofesional;
    }

    public void setUnidadacademica(String unidadacademica) {
        this.unidadacademica = unidadacademica;
    }


}
