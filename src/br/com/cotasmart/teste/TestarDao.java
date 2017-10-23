package br.com.cotasmart.teste;

import br.com.cotasmart.dao.FornecedorDao;
import br.com.cotasmart.modelo.Fornecedor;

public class TestarDao {

	public static void main(String[] args) {
		
		Fornecedor f = new Fornecedor();
		f.setCodFornecedor((long) 9);
		f.setNome("TESTE 04");
		f.setTelefone1("3388-1515");
		f.setTelefone2("3388-1515");
		f.setTelefone3("3388-1515");
		f.setCnpj("0000000000000");
		f.setEndereco("Q4 00");
		
		FornecedorDao dao = new FornecedorDao();
		dao.altera(f);
		
		System.out.println("Conectado");


	}

}
