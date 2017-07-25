import java.util.ArrayList;

public class FCFS {
	
	private ArrayList<Integer> listns;
	private int nmov = 0;
	
	public FCFS(ArrayList<Integer> listns ){
		this.listns = listns;
	}
	
	public void sheduling(int ci){
		
		nmov = Math.abs(listns.get(0) - ci);
		for(int i = 0 ; i < listns.size() -1;i++ ){
			nmov  += Math.abs(listns.get(i+1) - listns.get(i));
		}
		
		System.out.println("FCFS: A distancia total de busca -> "+nmov);	
		}
}
