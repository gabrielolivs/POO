
public class Depositar extends Transacao{
	public Depositar(Conta conta, Agencia agencia, String data_transacao, Agencia agencia_transacao, float valor) {
		super(conta, agencia, data_transacao, agencia_transacao, valor);
	    
	}

	public void deposito(Conta conta) {
	conta.setSaldo(valor);
	}
}
