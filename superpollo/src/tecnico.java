public class tecnico extends planta{
    //atributos
    float nivel ;
     float salario ;
     //metodos  construtor basio
      public  void  tecnico (){}
    // metodo construtor


    public tecnico(float nivel, float salario) {
        this.nivel = nivel;
        this.salario = salario;
    }

    public tecnico(int idpersonal, String nombre, String ciudad, String apellido, String genero, int estrato, String dependencia, String titulo, String fechadevV, float nivel, float salario) {
        super(idpersonal, nombre, ciudad, apellido, genero, estrato, dependencia, titulo, fechadevV);
        this.nivel = nivel;
        this.salario = salario;
    }

    public float getNivel() {
        return nivel;
    }

    public float getSalario() {
        return salario;
    }

    public void setNivel(float nivel) {
        this.nivel = nivel;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float liquidartecn (float  mesesDias){
        float salario  = 0 ;
        //float lidacion = ((((365 / mesesDias) + 1) / 360 * 15) / mesesDias * salario);
        float lidacion = salario / mesesDias * 365 / 15   ;
        float lidacion1 = lidacion;
        System.out.println("liquidacionn de vacaciones "+ lidacion1);
        return lidacion1;
    }

}
