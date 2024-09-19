import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // para qu ele usuario digite la entrada de datos
        Scanner lea = new Scanner (System.in);
        //   rpimer metodos saber si se puede ingresar los datos numericos
        personal p1 = new personal();
        System.out.println("digite el salario de la persona ");
        float salario = lea.nextFloat();
        // aca se hace la operacion donde se calcula el presio a pagar por las eps si es trabajador
        p1.epsa(salario);
        System.out.println("el salario del empelado es "+salario );
        System.out.println(("el valor a pagar por su salario a la eps es :   ")+p1.epsa(salario));
        // valor a pagar por la arl  que es valor a pagar por el epmleador
personal arl1 = new personal();
        System.out.println( " digite por favor el nivel de  arl  del empleado  de 1 a tres sindo unos menor riesgo y tres mayor riesgo ");
 int nivel= lea.nextInt();
 arl1.arl(nivel,salario);
        System.out.println("el valpor a pagar  por la arl es "+arl1.arl(nivel,salario));
//calculo de caja  por el salrio
        personal caja1 = new personal();
        caja1.caja(1,salario);
        System.out.print("la caja al año por una persona es "+caja1.caja(0, salario));
        System.out.println();
//calcular  ifbc
        personal ninos1 = new personal();
        ninos1.icbf(salario);
        System.out.println("la cuaota del ifcb es : "+ninos1.icbf(salario));
  // calcular salario mas  trasporte
         personal trasn = new personal();
         trasn.auxT(salario);
        System.out.println("el salario con transporte es :  "+trasn.auxT(salario));
//herencia  gps
        gps pos = new gps(1234,"luis","medellin","mas","h",2,"abogado","12-oct-20013","22",13,120000,salario);
        System.out.println("el valor de pos por arl es :."+pos.arl(2,salario));
        System.out.println("se calcula el vlaor de la eps "+pos.epsa(salario));
//herencia profesores
        profesores pro1 = new profesores(1,salario);
        pro1.calcusueldo(salario);
        System.out.println("calcular sueldo por el valor d elas horas"+pro1.calcusueldo(salario));
// herencia profes liquidacion de vacaciones
    profesores pro2 = new profesores(nivel,salario);
        System.out.println("digite los dias  dias trabajados  ");
    int mesesDias  = lea.nextInt();
    pro2.liquidar(mesesDias);
    // metodo para mostrar la infomcacion de dodcentes
    docentes doc  = new docentes();
    doc.unidadacademica = "a";
    doc.ariaformacion = "b";
    doc.tituloprofesional = "a";
// vamos a imprrimir una formilario lamando a la super
        horascatedras horasc = new horascatedras();
        //quemando algunos datos
        System.out.println("apellido ");
        String  apellido = lea.next();
        horasc.apellido = apellido;
        System.out.println("aria de formacion ");
        String ariaformacion = lea.next();
        horasc.ariaformacion=  ariaformacion;
        System.out.println("ultimo titulo ");
       String ultimotitulo = lea.next();
        horasc.ultimotitulo= ultimotitulo;
        System.out.println("digite el estrato ");
        int Estrato = lea.nextInt();
        horasc.Estrato = Estrato;
        System.out.println( " el salario ");
        horasc.salrio = salario;
        System.out.println(" digite el nuemro de horas ");
         int numhoras = lea.nextInt(); ;
        horasc.numhoras = numhoras;
        horasc.epsa(salario);
        horasc.arl(nivel,salario);
        horasc.icbf(salario);
        // imprimiendo en pantalla   algunos datos quemados
        System.out.println("apellido del trabajador "+horasc.apellido);
        System.out.println("ocupacion actual "+horasc.ariaformacion);
        System.out.println("ultimo titulo "+horasc.ultimotitulo);
        System.out.println("estrado"+horasc.Estrato);
        System.out.println("salario"+salario);
        System.out.println("numeros de horas "+horasc.numhoras);
        System.out.println("valor a pagar por la eps "+horasc.epsa(salario));
        System.out.println("valor  a pargar por la arl "+horasc.arl(nivel,salario));
        System.out.println("cuata vienestar familiar "+horasc.icbf(salario));
        //  liquidacion  :prima , vacacionmes ,censatias y interes d ela censantias ;
        //  nomina : arl caja y  salario , auxilio de traporte y novedads y dscuento salud y ´ pencion
        // segurida social : salud  y pencion del  empleado y ppor el empleadpor  y comta sena y
    }
}