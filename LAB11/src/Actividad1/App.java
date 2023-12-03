package Actividad1;

public class App {
   public static void main(String[] args) throws Exception{
	   Persona p1 = new Persona("fernando","Av.ejercito","123");
	   Persona p2 = new Persona("gabriel","Av.venezuela","456");
	   Persona p3 = new Persona("daniel","Av.eeuu","789");
	   Goodies g1 = new Goodies(1,"g1",(float)1.20);
	   Goodies g2 = new Goodies(2,"g2",(float)1.30);
	   Goodies g3 = new Goodies(3,"g3",(float)1.10);
	   Procedencia pp1 = new Procedencia("Arequipa","umacollo");
	   Procedencia pp2 = new Procedencia("Tacna","Esperanza");
	   Estudiante e1 = new Estudiante("keny","Av.1","123","sistemas",pp1);
	   Estudiante e2 = new Estudiante("russell","Av.2","456","medicina",pp2);
	   Estudiante e3 = new Estudiante("adrian","Av.3","789","psico",pp1);
	   
       Integer[] x = {0,1,2,3,4};
       Verificadora<Integer> ver = new Verificadora<Integer>(x);
       Persona[] grupopersonas = {p1,p2,p3};
       Goodies[] grupogoodies = {g1,g2,g3};
       Estudiante[] grupoestudiante = {e1,e2,e3};
       
       Verificadora<Persona> verpersonas = new Verificadora<Persona>(grupopersonas);
       Verificadora<Goodies> vergoodies = new Verificadora<Goodies>(grupogoodies);
       Verificadora<Estudiante> verestudiantes = new Verificadora<Estudiante>(grupoestudiante);
       
       String msg = verpersonas.contiene(new Persona("fernando","",""))? "SI tiene fernando" : "NO tiene fernando";
       System.out.println(msg);
       msg = vergoodies.contiene(new Goodies(1,"",0))? "SI tiene goodies de id 1" : "NO tiene goodies de id 1";
       System.out.println(msg);
       msg = verestudiantes.contiene(new Estudiante("russell","","","",pp1))? "SI tiene russell del pp1" : "NO tiene russell del pp1";
       System.out.println(msg);
       
   }
} 