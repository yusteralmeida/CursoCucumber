package br.ce.yuster.servicos;

import br.ce.yuster.entidades.Filme;
import br.ce.yuster.entidades.NotaAluguel;
import br.com.yuster.utils.DateUtils;

public class AluguelService {

	public NotaAluguel alugar(Filme filme) {
		if (filme.getEstoque() == 0)
			throw new RuntimeException("Filme sem estoque");
		NotaAluguel nota = new NotaAluguel();
		nota.setDataEntrega(DateUtils.obterDataComDiferencaDias(1));
		nota.setPreco(filme.getAluguel());
		filme.setEstoque(filme.getEstoque() - 1);
		return nota;
	}

}
