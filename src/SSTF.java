import java.util.ArrayList;

public class SSTF {

	private ArrayList<Integer> listns;
	private int nmov = 0;

	public SSTF(ArrayList<Integer> listns) {
		this.listns = listns;
	}

	public void sheduling(int ci) {
		listns.add(0, ci);
		while (listns.size() > 1) {
			int menor = Math.abs(listns.get(1) - listns.get(0));
			int indice = 1;
			for (int j = 1; j < listns.size(); j++) {
				if (menor > Math.abs(listns.get(j) - listns.get(0))) {
					menor = Math.abs(listns.get(j) - listns.get(0));
					indice = j;
				}
			}
				
				nmov += menor;
				int aux = listns.get(indice);		
				listns.remove(indice);
				listns.remove(0);
				listns.add(0, aux);
		}
		
		System.out.println("SSTF: A distancia total de busca -> "+nmov);
	}
}
