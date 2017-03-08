package chapter3.collections.set;

import java.util.HashSet;

public class PessoaHashSet {

	private String nome;
	
	public PessoaHashSet(String nome) {
		super();
		this.nome = nome;
	}

	public static void main(String[] args) {
		HashSet<PessoaHashSet> hash = new HashSet<>();
		hash.add(new PessoaHashSet("LUIZ"));
		hash.add(new PessoaHashSet("GUSTAVO"));
		hash.add(new PessoaHashSet("OLIVEIRA"));
		hash.add(new PessoaHashSet("COSTA"));
		
		for (PessoaHashSet element : hash) {
			System.out.println(element.nome);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaHashSet other = (PessoaHashSet) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
