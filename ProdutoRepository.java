package repositorio;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import psoft.Produto;
public class ProdutoRepository {
   static private Map<Integer, Produto> produtos;
   static private int count = 0;
   public ProdutoRepository() {
		this.produtos = new HashMap<Integer, Produto>();
	}
   public void inserirProduto(Produto prod) throws Exception {
	   if(!this.verificarExistenciaProduto(prod)) {
		   this.produtos.put(count, prod);
		   count++;
	   }else {
		   throw new Exception("Produto já cadastrado");
	   }
	  
   }
   
   public Collection<Produto> listarProdutos() {
	   return this.produtos.values();
   }
   
   private boolean verificarExistenciaProduto(Produto prod) {
	   	boolean veri = false;
	   	for(int i = 0;i<this.produtos.size();i++) {
	   		if(produtos.get(i).getNome()==prod.getNome()) {
	   			veri = true;
	   					break;
	   		}
	   	}
	   	return veri;
   }
   
    

}
