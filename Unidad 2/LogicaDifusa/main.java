package LogicaDifusa;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;

public class main {

    public static void main(String[] args) {
    	String fileName;
    	FIS fis=null;
    	
    	fileName = "C:\\Users\\kevin\\Documents\\Kevin\\TEC\\Workspace\\IA2019\\src\\LogicaDifusa\\logica.fcl";
    	fis = FIS.load(fileName,true);
    	if(fis == null) {
    		System.out.println("Hubo un error al cargar el archivo");
    	}else {
    		// Definimos las entradas y las salidas 
    		//(el dominio es sobre clasificacion de hoteles en base a estas variables)
            fis.setVariable("limpieza", 9.0);
            fis.setVariable("comodidad", 9.0);
            fis.setVariable("servicios", 9.0);

            // Evaluamos las reglas
            fis.evaluate();

            // Obtenemos el valor de la salida
            double puntaje = fis.getVariable("puntaje").getValue();
            
       
            System.out.println("El puntaje del hotel es: " + puntaje );
            
            //Se muestran las graficas
            JFuzzyChart.get().chart(fis);
           
    	}   	
    }    	
}
   
