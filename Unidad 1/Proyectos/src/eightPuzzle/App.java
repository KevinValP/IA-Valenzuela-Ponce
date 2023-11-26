/**
 * Created by HABDOLLA on 1/13/2016.
 * Edited (copied and modified) by KeVVuN
 */

package eightPuzzle;


public class App {
    final static private String EASY = "134862705";
    final static private String MEDIUM = "281043765";
    final static private String HARD = "756408132";
    final static private String GOAL_STATE = "123804765";



    public static void main(String[] args) {
        String rootState = HARD;
        long startTime = System.currentTimeMillis();

        SearchTree search = new SearchTree(new Node(rootState), GOAL_STATE);
        
        //Busqueda primero en anchura:
        //search.breadthFirstSearch();
        
        //Busqueda primero en profundidad:
        //search.depthFirstSearch();
        	
        //Busqueda de costo uniforme
        //search.uniformCostSearch();
        
        //Busqueda primero el mejor
        search.bestFirstSearch();

        long finishTime = System.currentTimeMillis();
        long totalTime = finishTime - startTime;
        System.out.println("Tiempo  :" + totalTime + " Milisegundos");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


    }
}
