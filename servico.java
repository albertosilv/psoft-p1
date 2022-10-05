package servico;

import repositorio.LoteRepository;
import repositorio.ProdutoRepository;

public class servico {
	public servico() {
		super();
		this.loteRepository = new LoteRepository();
		this.prodtRepository = new ProdutoRepository();
	}
	private LoteRepository loteRepository;
	private ProdutoRepository prodtRepository;
}
