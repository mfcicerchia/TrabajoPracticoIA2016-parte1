package frsf.cidisi.exercise.tpia2016.search;

import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;

/**
 * Represent the internal state of the Agent.
 */
public class EstadoAgenteGuia extends SearchBasedAgentState {
	
	//TODO: Setup Variables
    //private Other habitacionesVisitadas;
    //private Other PosicionAgente;
	

    public EstadoAgenteGuia() {
    
    	//TODO: Complete Method
    	/*
			// habitacionesVisitadas = initData0;
			// PosicionAgente = initData1;
        */
        this.initState();
    }

    /**
     * This method clones the state of the agent. It's used in the search
     * process, when creating the search tree.
     */
    @Override
    public SearchBasedAgentState clone() {
        
		//TODO: Complete Method
		
        return null;
    }

    /**
     * This method is used to update the Agent State when a Perception is
     * received by the Simulator.
     */
    @Override
    public void updateState(Perception p) {
        
        //TODO: Complete Method
    }

    /**
     * This method is optional, and sets the initial state of the agent.
     */
    @Override
    public void initState() {
        
	//TODO: Complete Method

    }

    /**
     * This method returns the String representation of the agent state.
     */
    @Override
    public String toString() {
        String str = "";

        //TODO: Complete Method

        return str;
    }

    /**
     * This method is used in the search process to verify if the node already
     * exists in the actual search.
     */
    @Override
    public boolean equals(Object obj) {
       
       //TODO: Complete Method
        
        return true;
    }

    //TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
   	
//     public Other gethabitacionesVisitadas(){
//        return habitacionesVisitadas;
//     }
//     public void sethabitacionesVisitadas(Other arg){
//        habitacionesVisitadas = arg;
//     }
//     public Other getPosicionAgente(){
//        return PosicionAgente;
//     }
//     public void setPosicionAgente(Other arg){
//        PosicionAgente = arg;
//     }
	
}

