package by.epam.les07.main;
import java.util.ArrayList;

import java.util.List;

class Avia {
    private String aviaName;
    private ArrayList<Airline> airlineList = new ArrayList<>();
 
    
   
	Avia(String aviaName) {
		this.aviaName = aviaName;
	}


	void addAirlineToAviaList(Airline airline) {
		 airlineList.add(airline);
		
	}
 
   List<Airline> getListByDestination(String specDestination) {
        List<Airline> list = new ArrayList<>();
        for (Airline c : airlineList) {
            if (c.getDestination() == specDestination ) {
                list.add(c);
            }
        }
        
        return list;
    }
 
    List<Airline> getListByDay(String specDay) {
        List<Airline> list = new ArrayList<>();
        for (Airline c : airlineList) {
            if (c.getDay() == specDay ) {
                list.add(c);
            }
        }
      
       
        return list;
    }
 
    List<Airline> getListByDiapasond(double diapazonStart, String specDay) {
        List<Airline> list = new ArrayList<>();
        for (Airline c : airlineList) {
            if ((c.getTime() >= diapazonStart)&&(c.getDay()==specDay)) {
                list.add(c);
            }
        }
 
        return list;
    }



	
	
	}


	
	
 
 


