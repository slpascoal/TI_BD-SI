/*
/	CLASSES DO GERENCIADOR FINANCEIRO
/	RECEITA DESPESA TRANSACAO
*/

public class GerenciadorFinanceiro {
	private int id;
    private int saldoAtual;
	
	public GerenciadorFinanceiro() {
        this.id = ;//FUNÇÃO PARA FAZER O ID
        this.saldoAtual = -1;
	}
	
	public GerenciadorFinanceiro(String saldoAtual) {
        this.id = ;//FUNÇÃO PARA FAZER O ID
		this.saldoAtual = saldoAtual;
	}

	public int getId() {
		return id;
	}

	public void setId() {
	
    
        //AKI FUNCAO PARA FAZER ID
	
    }

	public String getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(String saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public String toString() {
		return "Gerenciador Financeiro Dados : [id=" + id + ", Saldo Atual=" + saldoAtual + "]";
	}
	
}

public class Receita extends GerenciadorFinanceiro {
	private String resumo;
	private int valor;

	public Receita() {
		this.id = -1;
		this.resumo = "";
		this.valor = -1;
	}

	public Receita(int id, String resumo, int valor) {
		this.id = id;
		this.resumo = resumo;
		this.valor = valor
	}

	public int getId() {
		return id;
	}

	public void setId() {
		thid.id = id;
    }

	public int getValor() {
		return valor;
	}

	public void setValor() {
		this.valor = valor;
    }

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String toString() {
		return "Receita Dados : [valor=" + valor + ", Resumo=" + resumo + "]";
	}
}

public class Despesa extends GerenciadorFinanceiro {
	private String resumo;
	private int valor;

	public Despesa() {
		this.id = -1;
		this.resumo = "";
		this.valor = -1;
	}

	public Despesa(int id, String resumo, int valor) {
		this.id = id;
		this.resumo = resumo;
		this.valor = valor
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		thid.id = id;
    }

	public int getValor() {
		return valor;
	}

	public void setValor() {
		this.valor = valor;
    }

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String toString() {
		return "Despesa Dados : [valor=" + valor + ", Resumo=" + resumo + "]";
	}
}

public class Transacoes extends GerenciadorFinanceiro {
	private String resumo;
	private int valor;

	public Transacoes() {
		this.id = -1;
		this.resumo = "";
		this.valor = -1;
	}

	public Transacoes(int id, String resumo, int valor) {
		this.id = id;
		this.resumo = resumo;
		this.valor = valor
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		thid.id = id;
    }

	public int getValor() {
		return valor;
	}

	public void setValor() {
		this.valor = valor;
    }

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String toString() {
		return "Despesa Dados : [valor=" + valor + ", Resumo=" + resumo + "]";
	}
}