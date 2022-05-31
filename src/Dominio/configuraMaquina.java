package Dominio;

public class configuraMaquina {

	private String maquinaNome;
	private String maquinaModelo;
	private String maquinaVoltagem;
	private String maquinaCapacidadeKg;
	private String maquinaLavacaoPesada;
	private String maquinaLavacaoNormal;
	private String maquinaLavacaoLeve;
	private String maquinaEnxague;
	private String maquinaCentrifuga;

	public String getMaquinaNome() {
		return maquinaNome;
	}

	public void setMaquinaNome(String maquinaNome) {
		this.maquinaNome = maquinaNome;
	}

	public String getMaquinaModelo() {
		return maquinaModelo;
	}

	public void setMaquinaModelo(String maquinaModelo) {
		this.maquinaModelo = maquinaModelo;
	}

	public String getMaquinaVoltagem() {
		return maquinaVoltagem;
	}

	public void setMaquinaVoltagem(String maquinaVoltagem) {
		this.maquinaVoltagem = maquinaVoltagem;
	}

	public String getMaquinaCapacidadeKg() {
		return maquinaCapacidadeKg;
	}

	public void setMaquinaCapacidadeKg(String maquinaCapacidadeKg) {
		this.maquinaCapacidadeKg = maquinaCapacidadeKg;
	}

	public String getMaquinaLavacaoPesada() {
		return maquinaLavacaoPesada;
	}

	public void setMaquinaLavacaoPesada(String maquinaLavacaoPesada) {
		this.maquinaLavacaoPesada = maquinaLavacaoPesada;
	}

	public String getMaquinaLavacaoNormal() {
		return maquinaLavacaoNormal;
	}

	public void setMaquinaLavacaoNormal(String maquinaLavacaoNormal) {
		this.maquinaLavacaoNormal = maquinaLavacaoNormal;
	}

	public String getMaquinaLavacaoLeve() {
		return maquinaLavacaoLeve;
	}

	public void setMaquinaLavacaoLeve(String maquinaLavacaoLeve) {
		this.maquinaLavacaoLeve = maquinaLavacaoLeve;
	}

	public String getMaquinaEnxague() {
		return maquinaEnxague;
	}

	public void setMaquinaEnxague(String maquinaEnxague) {
		this.maquinaEnxague = maquinaEnxague;
	}

	public String getMaquinaCentrifuga() {
		return maquinaCentrifuga;
	}

	public void setMaquinaCentrifuga(String maquinaCentrifuga) {
		this.maquinaCentrifuga = maquinaCentrifuga;
	}

	public configuraMaquina(String maquinaNome, String maquinaModelo, String maquinaVoltagem,
			String maquinaCapacidadeKg, String maquinaLavacaoPesada, String maquinaLavacaoNormal,
			String maquinaLavacaoLeve, String maquinaEnxague, String maquinaCentrifuga) {
		super();
		this.maquinaNome = maquinaNome;
		this.maquinaModelo = maquinaModelo;
		this.maquinaVoltagem = maquinaVoltagem;
		this.maquinaCapacidadeKg = maquinaCapacidadeKg;
		this.maquinaLavacaoPesada = maquinaLavacaoPesada;
		this.maquinaLavacaoNormal = maquinaLavacaoNormal;
		this.maquinaLavacaoLeve = maquinaLavacaoLeve;
		this.maquinaEnxague = maquinaEnxague;
		this.maquinaCentrifuga = maquinaCentrifuga;
	}

	@Override
	public String toString() {
		return " Código: " + maquinaModelo + "\n Modelo: " + maquinaNome + " \n Voltagem: " + maquinaVoltagem
				+ "\n Quantos kg?: " + maquinaCapacidadeKg + "\n Duração do Estagio 1 - Lavacao Pesada: "
				+ maquinaLavacaoPesada + "\n Duração do Estagio 2 - Normal: " + maquinaLavacaoNormal
				+ "\n Duração do Estagio 3 - Rápida: " + maquinaLavacaoLeve + "\n Duração do Estagio 4 - Enxague:"
				+ maquinaEnxague + "\n Duração do Estagio 5 - Centrifuga:" + maquinaCentrifuga;
	}

	public static void simuladorEstagio1() throws InterruptedException {
		tela.l0();
		System.out.println("================== Aguarde ===================");
		// int tempo = in.nextInt();
		int perc = 0;
		for (int i = 1; perc < 100; i++) {
			// perc = (i * 100) / tempo;
			perc = (i * 100) / 5;
			Thread.sleep(500);
			System.out.println("Estágio 1 - Em Lavação Pesada: " + perc + " %");
		}

	}
	
	public static int soma(int num1,int num2) {
		int soma1=num1+num2;
				
	return soma1;
	}
			
	public static void simuladorEstagio2() throws InterruptedException {
		tela.l0();
		System.out.println("================== Aguarde ===================");
		// int tempo = in.nextInt();
		int perc = 0;
		for (int i = 1; perc < 100; i++) {
			// perc = (i * 100) / tempo;
			perc = (i * 100) / 5;
			Thread.sleep(500);
			System.out.println("Estágio 2 - Em Lavação Nomal: " + perc + " %");
		}
	}

	public static void simuladorEstagio3() throws InterruptedException {
		tela.l0();
		System.out.println("================== Aguarde ===================");
		// int tempo = in.nextInt();
		int perc = 0;
		for (int i = 1; perc < 100; i++) {
			// perc = (i * 100) / tempo;
			perc = (i * 100) / 5;
			Thread.sleep(500);
			System.out.println("Estágio 3 - Em Lavação Leve: " + perc + " %");
		}
	}

	public static void simuladorEstagio4() throws InterruptedException {
		tela.l0();
		System.out.println("================== Aguarde ===================");
		// int tempo = in.nextInt();
		int perc = 0;
		for (int i = 1; perc < 100; i++) {
			// perc = (i * 100) / tempo;
			perc = (i * 100) / 5;
			Thread.sleep(500);
			System.out.println("Estágio 4 - Em Enxague: " + perc + " %");
		}
	}

	public static void simuladorEstagio5() throws InterruptedException {
		tela.l0();
		System.out.println("================== Aguarde ===================");
		// int tempo = in.nextInt();
		int perc = 0;
		for (int i = 1; perc < 100; i++) {
			// perc = (i * 100) / tempo;
			perc = (i * 100) / 5;
			Thread.sleep(500);
			System.out.println("Estágio 5 - Em Centrifuga: " + perc + " %");
		}
	}

}// end class
