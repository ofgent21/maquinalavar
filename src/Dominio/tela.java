package Dominio;

public class tela {

	public static void menu() {
		l2();
		System.out.println("           MENU DE SIMULA��O");
		l2();
		l0();
		System.out.println(" 1 - Configurar a m�quina de lavar ");
		System.out.println(" 2 - Simular a m�quina de lavar");
		System.out.println(" 3 - Lista m�quinas");
		System.out.println(" 4 - Abre modo Edi��o de M�quinas");
		System.out.println(" 0 - Sair");
		l0();
		System.out.println("Digite o c�digo: ");
	}
	
	public static void estagio() {
		l2();
		System.out.println("     QUAL EST�GIO VOC� DESEJA COME�AR");
		l2();
		System.out.println("1 - Lava��o Pesada");
		System.out.println("2 - Lava��o Normal");
		System.out.println("3 - Lava��o Leve");
		System.out.println("4 - Enxague");
		System.out.println("5 - Centrifuga");
		l0();
		System.out.println("Selecione o est�gio inicial: ");
		
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
	System.out.println(" 5 - Dura��o do Est�gio 1 - Lava��o Pesada");
	System.out.println(" 6 - Dura��o do Est�gio 2 - Lava��o Normal");
	System.out.println(" 7 - Dura��o do Est�gio 3 - Lava��o R�pida");
	System.out.println(" 8 - Dura��o do Est�gio 4 - Enxague");
	System.out.println(" 9 - Dura��o do Est�gio 5 - Centrifuga");
	System.out.println("99 - Exclus�o da M�quina");
	l1();
	System.out.println("Digite o c�digo: ");
	}
	
	
	public static void mok() {
		System.out.println("======= Registro Alterado com Sucesso ====================");
	}
	
	public static void mop() {
		System.out.println("======== Confirma a Opera��o? 1 - (Sim) 2 - (N�o) ========");
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
