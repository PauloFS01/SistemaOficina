package br.oficina.classes;


public abstract class EstadoOS {
	private Status status;
	
	//template method
	public void next(OrdemDeServico os) {
		if(verificaEstado(os)) {
			os.setStatus(this.status);
		}else {
			System.out.println("Você não pode finalizar essa OS");
		}
		
	}
	
	public boolean verificaEstado(OrdemDeServico os) {
		return (os.getStatus()==Status.ABERTA)?true:false;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	
}
