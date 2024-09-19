public class personal {
    // atributos
 public  int idpersonal ;
 public  String nombre ;
 public  String apellido ;
 public String ciudad ;
 public  String genero ;
 public  int Estrato ;
    //metodos
    public  personal (){}
    // metodo constructor

    public personal(int idpersonal, String nombre, String ciudad, String apellido, String genero, int estrato) {
        this.idpersonal = idpersonal;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.apellido = apellido;
        this.genero = genero;
        Estrato = estrato;
    }

    public int getIdpersonal() {
        return idpersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getGenero() {
        return genero;
    }

    public int getEstrato() {
        return Estrato;
    }

    public void setIdpersonal(int idpersonal) {
        this.idpersonal = idpersonal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstrato(int estrato) {
        Estrato = estrato;
    }
 public  void dg (String nombre , String apellido){


 }
// metodos calculados
// returna mas a delante con las sub clases
 public  float epsa  ( float salario  ){
         float epsa1 = salario * 4 / 100 ;
         return  epsa1;
        }
 public  float Calpencion (  float  salario ){
        float  pencion = salario   *  4 / 100 ;
        return  pencion ;
 }
//arl  nivel 1 empleador n1 0.522 , n2 1,044, n3 2,43
public  double arl (int nivel , double salario ) {

    double pagar  = 0  ;


        if (nivel == 1) {
         pagar = salario * 0.5 / 100;
        ;
    } else if (nivel == 2) {
         pagar = salario * 1 / 100;
    } else if (nivel == 3) {
         pagar = salario * 2.4/ 100;
    } else if (nivel == 4) {
        pagar = salario * 4.3  /100;
        } else if (nivel == 5) {
            pagar = salario * 6.9 /100;
        }
    return pagar ;
}
// calcular la cota sena  se calciula d  ela siguente manera
    // numero de trabajadores cd ela empresa
public  void sena (){
int trad = 0 ;
int numero  = 15;
int resultado ;

     if (trad < numero ){
         System.out.println(" no se debe contratar  trabajadores "  );
     }
     else if( trad > numero ){
         System.out.println("se debe contratar  dos  praticantes por cada 30 trabajdores  ");
     }
}
// promedio caja de compesason
public float caja (float  caja, float salario  ){
 caja = 0 ;
        caja = salario * 4/100;

    return caja;
}
//
public  float icbf(float salario    ){
         float ninos = salario * 3/100;
        return ninos ;
}
public float auxT (float salario ){

    return (int) (salario + 80000);
}


}










