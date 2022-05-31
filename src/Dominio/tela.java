package Dominio;

public class tela {

	public static void menu() {
		l2();
		System.out.println("           MENU DE SIMULAÇÃO");
		l2();
		l0();
		System.out.println(" 1 - Configurar a máquina de lavar ");
		System.out.println(" 2 - Simular a máquina de lavar");
		System.out.println(" 3 - Lista máquinas");
		System.out.println(" 4 - Abre modo Edição de Máquinas");
		System.out.println(" 0 - Sair");
		l0();
		System.out.println("Digite o código: ");
	}
	
	public static void estagio() {
		l2();
		System.out.println("     QUAL ESTÁGIO VOCÊ DESEJA COMEÇAR");
		l2();
		System.out.println("1 - Lavação Pesada");
		System.out.println("2 - Lavação Normal");
		System.out.println("3 - Lavação Leve");
		System.out.println("4 - Enxague");
		System.out.println("5 - Centrifuga");
		l0();
		System.out.println("Selecione o estágio inicial: ");
		
	}

	public static void tfinal() {
		l0();
		l2();
		l2();
		l1();
		l1();
		System.out.println("---- OBRIGADO POR UTILIZAR O SIMULADOR -------");
		l1();
		l1();
		l2();
		l2();
				
	}
	
	public static void tEdicaoMaquina() {
	System.out.println(" 1 - Modelo");
	System.out.println(" 2 - Nome");
	System.out.println(" 3 - Voltagem (220v ou 110v)");
	System.out.println(" 4 - Quantos kg");
	System.out.println(" 5 - Duração do Estágio 1 - Lavação Pesada");
	System.out.println(" 6 - Duração do Estágio 2 - Lavação Normal");
	System.out.println(" 7 - Duração do Estágio 3 - Lavação Rápida");
	System.out.println(" 8 - Duração do Estágio 4 - Enxague");
	System.out.println(" 9 - Duração do Estágio 5 - Centrifuga");
	System.out.println("99 - Exclusão da Máquina");
	l1();
	System.out.println("Digite o código: ");
	}
	
	
	public static void mok() {
		System.out.println("======= Registro Alterado com Sucesso ====================");
	}
	
	public static void mop() {
		System.out.println("======== Confirma a Operação? 1 - (Sim) 2 - (Não) ========");
	}
	
	public static void l0() {
		System.out.println("");
	}

	public static void l1() {
		System.out.println("----------------------------------------------");
	}

	public static void l2() {
		System.out.println("==============================================");
	}

}
