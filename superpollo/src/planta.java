public class planta extends  administrador{
    String FechadevV;
    // metodo


    public planta() {
    }

    public planta(int idpersonal, String nombre, String ciudad, String apellido, String genero, int estrato, String dependencia, String titulo, String fechadevV) {
        super(idpersonal, nombre, ciudad, apellido, genero, estrato, dependencia, titulo);
        FechadevV = fechadevV;
    }

    public String getFechadevV() {
        return FechadevV;
    }

    public void setFechadevV(String fechadevV) {
        FechadevV = fechadevV;
    }

}
