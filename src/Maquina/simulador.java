package Maquina;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Dominio.configuraMaquina;
import Dominio.tela;

public class simulador {

	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner in = new Scanner(System.in);

		String edMaquinaNome, edMaquinaModelo, edMaquinaVoltagem, edMaquinaCapacidadeKg, edMaquinaLavacaoPesada,
				edMaquinaLavacaoNormal, edMaquinaLavacaoLeve, edMaquinaEnxague, edMaquinaCentrifuga = "";

		int op = 0;
		int saiMenu = 1;

		ArrayList<configuraMaquina> configura = new ArrayList<configuraMaquina>();

		while (saiMenu != 0) {
			tela.menu();
			try {
				op = in.nextInt();
				in.nextLine();
			} catch (Exception e) {
				in.next();
				System.out.println("DIGITE UMA OP��O V�LIDA");
				continue;
			}
			// finally {

			// }

			switch (op) {

			case 0: {
				saiMenu = 0;
				in.close();
				tela.tfinal();
				break;
			}

			case 1: {
				tela.l2();
				System.out.println("CONFIGURA��O DA M�QUINA DE LAVAR");
				tela.l2();

				System.out.print("C�digo: ");
				edMaquinaModelo = in.next();
				in.nextLine();

				System.out.print("Modelo:  ");
				edMaquinaNome = in.next();
				in.nextLine();

				System.out.print("Voltagem (220v ou 110v): ");
				edMaquinaVoltagem = in.next();
				in.nextLine();

				System.out.print("Quantos kg: ");
				edMaquinaCapacidadeKg = in.next();
				in.nextLine();

				System.out.print("Dura��o do Est�gio 1 - Lava��o Pesada: ");
				edMaquinaLavacaoPesada = in.next();
				in.nextLine();

				System.out.print("Dura��o do Est�gio 2 - Lava��o Normal: ");
				edMaquinaLavacaoNormal = in.next();
				in.nextLine();

				System.out.print("Dura��o do Est�gio 3 - Lava��o R�pida: ");
				edMaquinaLavacaoLeve = in.next();
				in.nextLine();

				System.out.print("Dura��o do Est�gio 4 - Enxague: ");
				edMaquinaEnxague = in.next();
				in.nextLine();

				System.out.print("Dura��o do Est�gio 5 - Centrifuga: ");
				edMaquinaCentrifuga = in.next();
				in.nextLine();

				tela.mop();

				op = in.nextInt();
				in.nextLine();

				if (op == 1) {

					configuraMaquina registro = new configuraMaquina(edMaquinaNome, edMaquinaModelo, edMaquinaVoltagem,
							edMaquinaCapacidadeKg, edMaquinaLavacaoPesada, edMaquinaLavacaoNormal, edMaquinaLavacaoLeve,
							edMaquinaEnxague, edMaquinaCentrifuga);

					configura.add(registro);

					tela.l1();

					System.out.println("Total de M�quinas Registradas: " + configura.size());

					tela.l1();
				}

				else {

					break;
				}
				break;
			} // fim do case 1 MENU
			case 2: {
				tela.l2();
				tela.l0();
				System.out.println("=========== SIMULADOR DE M�QUINAS ============");
				tela.l2();
				tela.l0();
				System.out.println("=====  1 - SIMULA��O M�QUINA INDIVIDUAL ");
				tela.l0();
				System.out.println("=====  2 - SIMULA��O TODAS AS M�QUINAS==");
				tela.l0();
				tela.l0();
				System.out.println("=====  Selecione sua op��o =============");
				tela.l0();
				tela.l0();
				int opSimular = in.nextInt();
				in.nextLine();
				switch (opSimular) {
				case 1: {
					tela.l0();
					System.out.println("=====  1 - SIMULA��O M�QUINA INDIVIDUAL ");
					tela.l2();
					tela.l0();
					System.out.println("Informe a m�quina para simula��o: ");
					tela.l0();
					String smi = in.next();
					tela.l0();
					in.nextLine();

					for (int i = 0; i < configura.size(); i++) {

						configuraMaquina simulaIndividual = configura.get(i);

						if (smi.equals(simulaIndividual.getMaquinaModelo())) {
							String nMA = simulaIndividual.getMaquinaModelo();
							tela.l2();
							System.out.println(" A m�quina " + nMA + " foi localizada ");
							tela.l2();
							tela.estagio();
							int etapaProcesso = in.nextInt();
							in.nextLine();
							switch (etapaProcesso) {
							case 1: {
								tela.l2();
								System.out.println("SIMULA��O DO EST�GIO 1  DA M�QUINA " + nMA + " INICIADA");
								tela.l1();
								configuraMaquina.simuladorEstagio1();
								tela.l1();
								System.out.println(
										"Simula��o do est�gio 1 da m�quina " + nMA + " \n conclu�do com sucesso!");
								tela.l2();

							}
							case 2: {
								tela.l2();
								System.out.println("SIMULA��O DO EST�GIO 2 DA M�QUINA " + nMA + " INICIADA");
								tela.l1();
								configuraMaquina.simuladorEstagio2();
								tela.l1();
								System.out.println(
										"Simula��o do est�gio 2 da m�quina " + nMA + " \n conclu�do com sucesso!");
								tela.l2();

							}
							case 3: {
								tela.l2();
								System.out.println("SIMULA��O DO EST�GIO 3 DA M�QUINA " + nMA + " INICIADA");
								tela.l1();
								configuraMaquina.simuladorEstagio3();
								tela.l1();
								System.out.println(
										"Simula��o do est�gio 3 da m�quina " + nMA + " \n conclu�do com sucesso!");
								tela.l2();
							}
							case 4: {
								tela.l2();
								System.out.println("SIMULA��O DO EST�GIO 4 DA M�QUINA " + nMA + " INICIADA");
								tela.l1();
								configuraMaquina.simuladorEstagio4();
								tela.l1();
								System.out.println(
										"Simula��o do est�gio 4 da m�quina " + nMA + " \n conclu�do com sucesso!");
								tela.l2();
							}
							case 5: {
								tela.l2();
								System.out.println("SIMULA��O DO EST�GIO 5 DA M�QUINA " + nMA + " INICIADA");
								tela.l1();
								configuraMaquina.simuladorEstagio5();
								tela.l1();
								System.out.println(
										"Simula��o do est�gio 5 da m�quina " + nMA + " \n conclu�do com sucesso!");
								tela.l2();
							}
								break;
							}
						}
					}
					break;
				}
				case 2: {
					tela.l2();
					System.out.println("=====  2 - SIMULA��O TODAS AS M�QUINAS");
					tela.l2();

					tela.estagio();
					int etapaProcessoTodas = in.nextInt();
					in.nextLine();

					for (int i = 0; i < configura.size(); i++) {
						configuraMaquina simulaTodasl = configura.get(i);
						String nMA = simulaTodasl.getMaquinaModelo();
						System.out.println(" A m�quina " + nMA + " foi localizada ");
						tela.l0();

						switch (etapaProcessoTodas) {
						case 1: {
							tela.l2();
							System.out.println("SIMULA��O DO EST�GIO 1 DA M�QUINA " + nMA + " INICIADA");
							tela.l1();
							configuraMaquina.simuladorEstagio1();
							tela.l1();
							System.out.println(
									"Simula��o do est�gio 1 da m�quina " + nMA + " \n conclu�do com sucesso!");
							tela.l2();

						}
						case 2: {
							tela.l2();
							System.out.println("SIMULA��O DO EST�GIO 2 DA M�QUINA " + nMA + " INICIADA");
							tela.l1();
							configuraMaquina.simuladorEstagio2();
							tela.l1();
							System.out.println(
									"Simula��o do est�gio 2 da m�quina " + nMA + " \n conclu�do com sucesso!");
							tela.l2();

						}
						case 3: {
							tela.l2();
							System.out.println("SIMULA��O DO EST�GIO 3 DA M�QUINA " + nMA + " INICIADA");
							tela.l1();
							configuraMaquina.simuladorEstagio3();
							tela.l1();
							System.out.println(
									"Simula��o do est�gio 3 da m�quina " + nMA + " \n conclu�do com sucesso!");
							tela.l2();
						}
						case 4: {
							tela.l2();
							System.out.println("SIMULA��O DO EST�GIO 4 DA M�QUINA " + nMA + " INICIADA");
							tela.l1();
							configuraMaquina.simuladorEstagio4();
							tela.l1();
							System.out.println(
									"Simula��o do est�gio 4 da m�quina " + nMA + " \n conclu�do com sucesso!");
							tela.l2();
						}
						case 5: {
							tela.l2();
							System.out.println("SIMULA��O DO EST�GIO 5 DA M�QUINA " + nMA + " INICIADA");
							tela.l1();
							configuraMaquina.simuladorEstagio5();
							tela.l1();
							System.out.println(
									"Simula��o do est�gio 5 da m�quina " + nMA + " \n conclu�do com sucesso!");
							tela.l2();
						}
							break;
						}

					} //// fim for de todas

					break;
				}
				}

				break;
			} // fim do case 2 MENU

			case 3: {
				tela.l2();
				System.out.println("============= LISTAGEM DE M�QUINAS ===========");
				for (configuraMaquina lista : configura) {
					tela.l1();
					System.out.println(lista);
					tela.l1();
				}
				System.out.println("Total de M�quinas registradas: " + configura.size());
				break;
			} // fim do Case 3 MENU

			case 4: {
				tela.l2();
				System.out.println("============= MODO Edi��o M�quinas  ===========");
				tela.l2();
				System.out.println("Insira o c�digo da Maquina para edi��o: ");
				String oplm = in.next();
				in.nextLine();
				for (int i = 0; i < configura.size(); i++) {
					configuraMaquina ucodTemp = configura.get(i);

					if (oplm.equals(ucodTemp.getMaquinaModelo())) {
						String mM = ucodTemp.getMaquinaModelo();
						tela.tEdicaoMaquina();
						int swoplm = in.nextInt();
						in.nextLine();
						switch (swoplm) {
						case 1: {
							tela.l2();
							System.out.println(" MODO EDI�AO DE C�DIGO DA M�QUINA ");
							tela.l2();
							System.out.println("Insira o novo c�digo modelo : " + mM);
							String novoModelo = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERA��O: 1 - Sim   2 - N�o");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaModelo(novoModelo);
								tela.mok();
							}
							break;
						}

						case 2: {
							tela.l2();
							System.out.println(" MODO EDI�AO DE MODELO DA M�QUINA " + mM);
							tela.l2();
							System.out.println("Descri��o do Modelo Atual: " + ucodTemp.getMaquinaNome());
							tela.l1();

							System.out.println("Insira a nova descri��o de nome: ");
							String novoNome = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERA��O: 1 - Sim   2 - N�o");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaNome(novoNome);
								tela.mok();
							}
							break;

						}

						case 3: {
							tela.l2();
							System.out.println(" MODO EDI�AO DE VOLTAGEM DA M�QUINA " + mM);
							tela.l2();
							System.out.println("Voltagem Atual: " + ucodTemp.getMaquinaVoltagem());
							tela.l1();
							System.out.println("Insira a nova voltagem: ");
							String novoVoltagem = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERA��O: 1 - Sim   2 - N�o");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaVoltagem(novoVoltagem);
								tela.mok();
							}
							break;
						}

						case 4: {
							tela.l2();
							System.out.println(" MODO EDI�AO CAPACIDADE DE KG  " + mM);
							tela.l2();
							System.out.println("Capacidade Atual: " + ucodTemp.getMaquinaCapacidadeKg());
							tela.l1();
							System.out.println("Insira a nova capacidade de Kg: ");
							String novoKg = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERA��O: 1 - Sim   2 - N�o");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaCapacidadeKg(novoKg);
								tela.mok();
							}
							break;
						}

						case 5: {
							tela.l2();
							System.out.println(" MODO EDI�AO DE Dura��o do Est�gio 1 - Lava��o Pesada " + mM);
							tela.l2();
							System.out.println("Dura��o Atual: " + ucodTemp.getMaquinaLavacaoPesada());
							tela.l1();
							System.out.println("Insira a nova dura��o Estagio 1: ");
							String novoEstagioUm = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERA��O: 1 - Sim   2 - N�o");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaLavacaoPesada(novoEstagioUm);
								tela.mok();
							}
							break;
						}

						case 6: {
							tela.l2();
							System.out.println(" MODO EDI�AO DE Dura��o do Est�gio 2 - Lava��o Normal " + mM);
							tela.l2();
							System.out.println("Duracao Atual: " + ucodTemp.getMaquinaLavacaoNormal());
							tela.l1();
							System.out.println("Insira a nova dura��o Estagio 2: ");
							String novoEstagioDois = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERA��O: 1 - Sim   2 - N�o");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaLavacaoNormal(novoEstagioDois);
								tela.mok();
							}
							break;
						}

						case 7: {
							tela.l2();
							System.out.println(" MODO EDI�AO DE Dura��o do Est�gio 3 - Lava��o R�pida " + mM);
							tela.l2();
							System.out.println("Duracao Atual: " + ucodTemp.getMaquinaLavacaoLeve());
							tela.l1();
							System.out.println("Insira a nova dura��o Estagio 3: ");
							String novoEstagioTres = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERA��O: 1 - Sim   2 - N�o");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaLavacaoLeve(novoEstagioTres);
								tela.mok();
							}
							break;
						}

						case 8: {
							tela.l2();
							System.out.println(" MODO EDI�AO DE Dura��o do Est�gio 4 - Enxague " + mM);
							tela.l2();
							System.out.println("Dura��o Atual: " + ucodTemp.getMaquinaEnxague());
							tela.l1();
							System.out.println("Insira a nova dura��o Estagio 4: ");
							String novoEstagioQuatro = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERA��O: 1 - Sim   2 - N�o");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaEnxague(novoEstagioQuatro);
								tela.mok();
							}
							break;
						}

						case 9: {
							tela.l2();
							System.out.println(" MODO EDI�AO DE Dura��o do Est�gio 5 - Centrifuga " + mM);
							tela.l2();
							System.out.println("Dura��o Atual: " + ucodTemp.getMaquinaCentrifuga());
							tela.l1();
							System.out.println("Insira a nova dura��o Estagio 5: ");
							String novoEstagioCinco = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERA��O: 1 - Sim   2 - N�o");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaCentrifuga(novoEstagioCinco);
								tela.mok();
							}
							break;
						}

						case 99: {
							tela.l2();
							System.out.println("================= ATEN��O !!!!!!!! ========");
							System.out.println("==== MODO EXCLUS�O DE M�QUINA == " + mM);
							tela.l2();
							System.out.println("====== ATEN��O ======== MODO EXCLUS�O =======");
							tela.l1();
							tela.l1();
							System.out.println("Tem certeza : 999 - SIM   Qualquer tecla - N�O");

							int excluiMaquina = in.nextInt();
							in.nextLine();

							if (excluiMaquina == 999) {

								configura.remove(i);

								tela.l2();
								tela.mok();
							}
							break;
						}

						}// fim do switch de op��o para edi��o de m�quinas

					} // fim do encontrou modelo para edi��o

				} // fim do FOR EACH para localizacao de M�quinas

			} // fim do case 4 MENU
			case 99999: {
				
			        for (int rodamaquina = 0; rodamaquina < 5; rodamaquina++) {
				
				configuraMaquina registromodelo = new configuraMaquina("Modelo"+rodamaquina, Integer.toString(rodamaquina), "Voltagem"+rodamaquina,
						"Capacidade "+rodamaquina, "Pesada"+rodamaquina, "Normal"+rodamaquina, "LavacaoLeve"+rodamaquina,
						"Enxague"+rodamaquina, "Centrifuga"+rodamaquina);

				configura.add(registromodelo);
				}
				tela.l1();

				System.out.println("Total de M�quinas Registradas: " + configura.size());

				tela.l1();
			}
			} // fim switch op MENU

		} // fim while MENU
	}

	
	
}
