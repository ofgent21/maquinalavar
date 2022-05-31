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
				System.out.println("DIGITE UMA OPÇÃO VÁLIDA");
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
				System.out.println("CONFIGURAÇÃO DA MÁQUINA DE LAVAR");
				tela.l2();

				System.out.print("Código: ");
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

				System.out.print("Duração do Estágio 1 - Lavação Pesada: ");
				edMaquinaLavacaoPesada = in.next();
				in.nextLine();

				System.out.print("Duração do Estágio 2 - Lavação Normal: ");
				edMaquinaLavacaoNormal = in.next();
				in.nextLine();

				System.out.print("Duração do Estágio 3 - Lavação Rápida: ");
				edMaquinaLavacaoLeve = in.next();
				in.nextLine();

				System.out.print("Duração do Estágio 4 - Enxague: ");
				edMaquinaEnxague = in.next();
				in.nextLine();

				System.out.print("Duração do Estágio 5 - Centrifuga: ");
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

					System.out.println("Total de Máquinas Registradas: " + configura.size());

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
				System.out.println("=========== SIMULADOR DE MÁQUINAS ============");
				tela.l2();
				tela.l0();
				System.out.println("=====  1 - SIMULAÇÃO MÁQUINA INDIVIDUAL ");
				tela.l0();
				System.out.println("=====  2 - SIMULAÇÃO TODAS AS MÁQUINAS==");
				tela.l0();
				tela.l0();
				System.out.println("=====  Selecione sua opção =============");
				tela.l0();
				tela.l0();
				int opSimular = in.nextInt();
				in.nextLine();
				switch (opSimular) {
				case 1: {
					tela.l0();
					System.out.println("=====  1 - SIMULAÇÃO MÁQUINA INDIVIDUAL ");
					tela.l2();
					tela.l0();
					System.out.println("Informe a máquina para simulação: ");
					tela.l0();
					String smi = in.next();
					tela.l0();
					in.nextLine();

					for (int i = 0; i < configura.size(); i++) {

						configuraMaquina simulaIndividual = configura.get(i);

						if (smi.equals(simulaIndividual.getMaquinaModelo())) {
							String nMA = simulaIndividual.getMaquinaModelo();
							tela.l2();
							System.out.println(" A máquina " + nMA + " foi localizada ");
							tela.l2();
							tela.estagio();
							int etapaProcesso = in.nextInt();
							in.nextLine();
							switch (etapaProcesso) {
							case 1: {
								tela.l2();
								System.out.println("SIMULAÇÃO DO ESTÁGIO 1  DA MÁQUINA " + nMA + " INICIADA");
								tela.l1();
								configuraMaquina.simuladorEstagio1();
								tela.l1();
								System.out.println(
										"Simulação do estágio 1 da máquina " + nMA + " \n concluído com sucesso!");
								tela.l2();

							}
							case 2: {
								tela.l2();
								System.out.println("SIMULAÇÃO DO ESTÁGIO 2 DA MÁQUINA " + nMA + " INICIADA");
								tela.l1();
								configuraMaquina.simuladorEstagio2();
								tela.l1();
								System.out.println(
										"Simulação do estágio 2 da máquina " + nMA + " \n concluído com sucesso!");
								tela.l2();

							}
							case 3: {
								tela.l2();
								System.out.println("SIMULAÇÃO DO ESTÁGIO 3 DA MÁQUINA " + nMA + " INICIADA");
								tela.l1();
								configuraMaquina.simuladorEstagio3();
								tela.l1();
								System.out.println(
										"Simulação do estágio 3 da máquina " + nMA + " \n concluído com sucesso!");
								tela.l2();
							}
							case 4: {
								tela.l2();
								System.out.println("SIMULAÇÃO DO ESTÁGIO 4 DA MÁQUINA " + nMA + " INICIADA");
								tela.l1();
								configuraMaquina.simuladorEstagio4();
								tela.l1();
								System.out.println(
										"Simulação do estágio 4 da máquina " + nMA + " \n concluído com sucesso!");
								tela.l2();
							}
							case 5: {
								tela.l2();
								System.out.println("SIMULAÇÃO DO ESTÁGIO 5 DA MÁQUINA " + nMA + " INICIADA");
								tela.l1();
								configuraMaquina.simuladorEstagio5();
								tela.l1();
								System.out.println(
										"Simulação do estágio 5 da máquina " + nMA + " \n concluído com sucesso!");
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
					System.out.println("=====  2 - SIMULAÇÃO TODAS AS MÁQUINAS");
					tela.l2();

					tela.estagio();
					int etapaProcessoTodas = in.nextInt();
					in.nextLine();

					for (int i = 0; i < configura.size(); i++) {
						configuraMaquina simulaTodasl = configura.get(i);
						String nMA = simulaTodasl.getMaquinaModelo();
						System.out.println(" A máquina " + nMA + " foi localizada ");
						tela.l0();

						switch (etapaProcessoTodas) {
						case 1: {
							tela.l2();
							System.out.println("SIMULAÇÃO DO ESTÁGIO 1 DA MÁQUINA " + nMA + " INICIADA");
							tela.l1();
							configuraMaquina.simuladorEstagio1();
							tela.l1();
							System.out.println(
									"Simulação do estágio 1 da máquina " + nMA + " \n concluído com sucesso!");
							tela.l2();

						}
						case 2: {
							tela.l2();
							System.out.println("SIMULAÇÃO DO ESTÁGIO 2 DA MÁQUINA " + nMA + " INICIADA");
							tela.l1();
							configuraMaquina.simuladorEstagio2();
							tela.l1();
							System.out.println(
									"Simulação do estágio 2 da máquina " + nMA + " \n concluído com sucesso!");
							tela.l2();

						}
						case 3: {
							tela.l2();
							System.out.println("SIMULAÇÃO DO ESTÁGIO 3 DA MÁQUINA " + nMA + " INICIADA");
							tela.l1();
							configuraMaquina.simuladorEstagio3();
							tela.l1();
							System.out.println(
									"Simulação do estágio 3 da máquina " + nMA + " \n concluído com sucesso!");
							tela.l2();
						}
						case 4: {
							tela.l2();
							System.out.println("SIMULAÇÃO DO ESTÁGIO 4 DA MÁQUINA " + nMA + " INICIADA");
							tela.l1();
							configuraMaquina.simuladorEstagio4();
							tela.l1();
							System.out.println(
									"Simulação do estágio 4 da máquina " + nMA + " \n concluído com sucesso!");
							tela.l2();
						}
						case 5: {
							tela.l2();
							System.out.println("SIMULAÇÃO DO ESTÁGIO 5 DA MÁQUINA " + nMA + " INICIADA");
							tela.l1();
							configuraMaquina.simuladorEstagio5();
							tela.l1();
							System.out.println(
									"Simulação do estágio 5 da máquina " + nMA + " \n concluído com sucesso!");
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
				System.out.println("============= LISTAGEM DE MÁQUINAS ===========");
				for (configuraMaquina lista : configura) {
					tela.l1();
					System.out.println(lista);
					tela.l1();
				}
				System.out.println("Total de Máquinas registradas: " + configura.size());
				break;
			} // fim do Case 3 MENU

			case 4: {
				tela.l2();
				System.out.println("============= MODO Edição Máquinas  ===========");
				tela.l2();
				System.out.println("Insira o código da Maquina para edição: ");
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
							System.out.println(" MODO EDIÇAO DE CÓDIGO DA MÁQUINA ");
							tela.l2();
							System.out.println("Insira o novo código modelo : " + mM);
							String novoModelo = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaModelo(novoModelo);
								tela.mok();
							}
							break;
						}

						case 2: {
							tela.l2();
							System.out.println(" MODO EDIÇAO DE MODELO DA MÁQUINA " + mM);
							tela.l2();
							System.out.println("Descrição do Modelo Atual: " + ucodTemp.getMaquinaNome());
							tela.l1();

							System.out.println("Insira a nova descrição de nome: ");
							String novoNome = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaNome(novoNome);
								tela.mok();
							}
							break;

						}

						case 3: {
							tela.l2();
							System.out.println(" MODO EDIÇAO DE VOLTAGEM DA MÁQUINA " + mM);
							tela.l2();
							System.out.println("Voltagem Atual: " + ucodTemp.getMaquinaVoltagem());
							tela.l1();
							System.out.println("Insira a nova voltagem: ");
							String novoVoltagem = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaVoltagem(novoVoltagem);
								tela.mok();
							}
							break;
						}

						case 4: {
							tela.l2();
							System.out.println(" MODO EDIÇAO CAPACIDADE DE KG  " + mM);
							tela.l2();
							System.out.println("Capacidade Atual: " + ucodTemp.getMaquinaCapacidadeKg());
							tela.l1();
							System.out.println("Insira a nova capacidade de Kg: ");
							String novoKg = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaCapacidadeKg(novoKg);
								tela.mok();
							}
							break;
						}

						case 5: {
							tela.l2();
							System.out.println(" MODO EDIÇAO DE Duração do Estágio 1 - Lavação Pesada " + mM);
							tela.l2();
							System.out.println("Duração Atual: " + ucodTemp.getMaquinaLavacaoPesada());
							tela.l1();
							System.out.println("Insira a nova duração Estagio 1: ");
							String novoEstagioUm = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaLavacaoPesada(novoEstagioUm);
								tela.mok();
							}
							break;
						}

						case 6: {
							tela.l2();
							System.out.println(" MODO EDIÇAO DE Duração do Estágio 2 - Lavação Normal " + mM);
							tela.l2();
							System.out.println("Duracao Atual: " + ucodTemp.getMaquinaLavacaoNormal());
							tela.l1();
							System.out.println("Insira a nova duração Estagio 2: ");
							String novoEstagioDois = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaLavacaoNormal(novoEstagioDois);
								tela.mok();
							}
							break;
						}

						case 7: {
							tela.l2();
							System.out.println(" MODO EDIÇAO DE Duração do Estágio 3 - Lavação Rápida " + mM);
							tela.l2();
							System.out.println("Duracao Atual: " + ucodTemp.getMaquinaLavacaoLeve());
							tela.l1();
							System.out.println("Insira a nova duração Estagio 3: ");
							String novoEstagioTres = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaLavacaoLeve(novoEstagioTres);
								tela.mok();
							}
							break;
						}

						case 8: {
							tela.l2();
							System.out.println(" MODO EDIÇAO DE Duração do Estágio 4 - Enxague " + mM);
							tela.l2();
							System.out.println("Duração Atual: " + ucodTemp.getMaquinaEnxague());
							tela.l1();
							System.out.println("Insira a nova duração Estagio 4: ");
							String novoEstagioQuatro = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaEnxague(novoEstagioQuatro);
								tela.mok();
							}
							break;
						}

						case 9: {
							tela.l2();
							System.out.println(" MODO EDIÇAO DE Duração do Estágio 5 - Centrifuga " + mM);
							tela.l2();
							System.out.println("Duração Atual: " + ucodTemp.getMaquinaCentrifuga());
							tela.l1();
							System.out.println("Insira a nova duração Estagio 5: ");
							String novoEstagioCinco = in.next();
							in.nextLine();
							System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");

							int opConfirma = in.nextInt();

							if (opConfirma == 1) {
								ucodTemp.setMaquinaCentrifuga(novoEstagioCinco);
								tela.mok();
							}
							break;
						}

						case 99: {
							tela.l2();
							System.out.println("================= ATENÇÃO !!!!!!!! ========");
							System.out.println("==== MODO EXCLUSÃO DE MÁQUINA == " + mM);
							tela.l2();
							System.out.println("====== ATENÇÃO ======== MODO EXCLUSÃO =======");
							tela.l1();
							tela.l1();
							System.out.println("Tem certeza : 999 - SIM   Qualquer tecla - NÃO");

							int excluiMaquina = in.nextInt();
							in.nextLine();

							if (excluiMaquina == 999) {

								configura.remove(i);

								tela.l2();
								tela.mok();
							}
							break;
						}

						}// fim do switch de opção para edição de máquinas

					} // fim do encontrou modelo para edição

				} // fim do FOR EACH para localizacao de Máquinas

			} // fim do case 4 MENU
			case 99999: {
				
			        for (int rodamaquina = 0; rodamaquina < 5; rodamaquina++) {
				
				configuraMaquina registromodelo = new configuraMaquina("Modelo"+rodamaquina, Integer.toString(rodamaquina), "Voltagem"+rodamaquina,
						"Capacidade "+rodamaquina, "Pesada"+rodamaquina, "Normal"+rodamaquina, "LavacaoLeve"+rodamaquina,
						"Enxague"+rodamaquina, "Centrifuga"+rodamaquina);

				configura.add(registromodelo);
				}
				tela.l1();

				System.out.println("Total de Máquinas Registradas: " + configura.size());

				tela.l1();
			}
			} // fim switch op MENU

		} // fim while MENU
	}

	
	
}
