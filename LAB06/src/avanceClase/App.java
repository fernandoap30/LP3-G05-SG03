package avanceClase;

public class App {
	 public static void main(String[] args) throws Exception {
	 EmpleadoAsalariado empAsalariado = new EmpleadoAsalariado();
	 EmpleadoPorComision empPorComision = new EmpleadoPorComision();
	 EmpleadoPorHoras empPorHoras = new EmpleadoPorHoras();
	 EmpleadoBaseMasComision empBaseMasComision = new EmpleadoBaseMasComision();
	 Empleado[] empleados = new Empleado[4];
	 empleados[0] = empAsalariado;
	 empleados[1] = empPorComision;
	 empleados[2] = empPorHoras;
	 empleados[3] = empBaseMasComision;
	 for( Empleado empPolimorfico : empleados){
	 empPolimorfico.ingreso();
	 }
	 int count=0;
	 for( Empleado empPolimorfico : empleados){
	  empPolimorfico.ingreso();
	  if(empPolimorfico instanceof EmpleadoBaseMasComision)
	  count++;
	 }
	 System.out.println("\nEn el arreglo de empleados hay: "+count+" empleadosBaseMasComision");

	 int count2=0;
	 for( Empleado empPolimorfico : empleados){
	  empPolimorfico.ingreso();
	  if(empPolimorfico instanceof EmpleadoBaseMasComision){
		  count2++;
		  EmpleadoBaseMasComision objEmpleadoBaseMasComision;
		  objEmpleadoBaseMasComision = (EmpleadoBaseMasComision) empPolimorfico;
		  objEmpleadoBaseMasComision.especifico();
		  }
		 }
	 System.out.println("\nEn el arreglo de empleados hay: "+count+" empleadosBaseMasComision");
	 
	 for(int i=0; i<empleados.length; i++)
		 System.out.println(empleados[i].getClass().getSimpleName());
	 }
	}