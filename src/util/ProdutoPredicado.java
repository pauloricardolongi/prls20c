package util;

import java.util.function.Predicate;

import entidades.Produto;

public class ProdutoPredicado implements Predicate<Produto> {

	@Override
	public boolean test(Produto j) {
		
		return j.getPreco() >= 100.0;
	}

}
