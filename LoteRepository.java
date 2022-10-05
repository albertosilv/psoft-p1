package repositorio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import psoft.Lote;

public class LoteRepository {
	static private Map<Integer, Lote> lotes;
	static private int count = 0;
	   public LoteRepository() {
			LoteRepository.lotes = new HashMap<Integer, Lote>();
		}
	   public void inserirProduto(Lote lote)  {
			   LoteRepository.lotes.put(count, lote);
			   count++;	  
	   }
	   
	   public Collection<Lote> listarProdutos() {
		   return LoteRepository.lotes.values();
	   }
	  
}
