import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LOOK {
	private ArrayList<Integer> listns;
	private int nmov = 0;
	
	public LOOK(ArrayList<Integer> listns){
		this.listns = listns;
	}
	
	public void sheduling(int ci){
		listns.add(0, ci);
		int inicio = 0;
		
		Collections.sort (listns, new Comparator() {
            public int compare(Object o1, Object o2) {
                Integer p1 = (Integer) o1;
                Integer p2 = (Integer) o2;
                return p1 < p2 ? -1 : (p1 > p2 ? +1 : 0);
            }
        });
		
		for(int i = 0; i < listns.size(); i++){
			if( ci == listns.get(i)){
				inicio = i;
				break;
			}
		}
		
		nmov += Math.abs(listns.get(listns.size()-1) - listns.get(inicio));
		
		nmov += Math.abs(listns.get(listns.size()-1) - listns.get(0));
		
		/*for(int i = inicio; i < listns.size() - 1; i++){
			nmov += Math.abs(listns.get(i+1) - listns.get(i));
		}
		
		nmov += Math.abs(listns.get(inicio-1) - listns.get(listns.size()-1));
		for(int i = inicio - 1; i > 0 ; i--){
			nmov += Math.abs(listns.get(i) - listns.get(i-1));
		}
	
		*/
		
		System.out.println("LOOK: A distancia total de busca -> "+nmov);
	}
	
}
