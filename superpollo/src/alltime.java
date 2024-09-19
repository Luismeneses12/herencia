public class alltime extends  docentes {
    String  categoria ;
    float puntos;
    float salario ;

    public alltime() {
    }

    public alltime(int idpersonal, String nombre, String ciudad, String apellido, String genero, int estrato, String ariaformacion, String tituloprofesional, String unidadacademica, String categoria, float puntos, float salario) {
        super(idpersonal, nombre, ciudad, apellido, genero, estrato, ariaformacion, tituloprofesional, unidadacademica);
        this.categoria = categoria;
        this.puntos = puntos;
        this.salario = salario;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPuntos() {
        return puntos;
    }

    public float getSalario() {
        return salario;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPuntos(float puntos) {
        this.puntos = puntos;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


}
