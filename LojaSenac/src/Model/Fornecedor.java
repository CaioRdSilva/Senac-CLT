package Model;

public class Fornecedor {
	private String CNPJ;
	private String telefone;
	private String nome;
	
	public Fornecedor() {
		super();
	}
	public Fornecedor(String CNPJ, String telefone, String nome) {
		super();
		this.CNPJ = CNPJ;
		this.telefone = telefone;
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	
	
}
