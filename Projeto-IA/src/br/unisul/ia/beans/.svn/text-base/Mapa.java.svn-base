package br.unisul.ia.beans;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.unisul.ia.grafico.GraphViz;

public class Mapa {
	List<Estado> estados = new ArrayList<Estado>();
	List<Aresta> arestas = new ArrayList<Aresta>();
	List<CorEstado> coresEstados = Arrays.asList(CorEstado.values());

	public void popularEstados() {
		// Região Sul
		Estado rs = new Estado("Rio Grande do Sul", "RS");
		Estado sc = new Estado("Santa Catarina", "SC");
		Estado pr = new Estado("Paraná", "PR");

		// Região Sudeste
		Estado sp = new Estado("São Paulo", "SP");
		Estado mg = new Estado("Minas Gerais", "MG");
		Estado es = new Estado("Espírito Santo", "ES");
		Estado rj = new Estado("Rio de Janeiro", "RJ");

		// Região Centro-Oeste
		Estado ms = new Estado("Mato Grosso do Sul", "MS");
		Estado mt = new Estado("Mato Grosso", "MT");
		Estado go = new Estado("Goiás", "GO");
		Estado df = new Estado("Distrito Federal", "DF");

		// Região Nordeste
		Estado ba = new Estado("Bahia", "BA");
		Estado pe = new Estado("Pernambuco", "PE");
		Estado al = new Estado("Alagoas", "AL");
		Estado se = new Estado("Sergipe", "SE");
		Estado pb = new Estado("Paraíba", "PB");
		Estado pi = new Estado("Piauí", "PI");
		Estado ce = new Estado("Ceará", "CE");
		Estado rn = new Estado("Rio Grande do Norte", "RN");
		Estado ma = new Estado("Maranhão", "MA");

		// Região Norte
		Estado am = new Estado("Amazonas", "AM");
		Estado ap = new Estado("Amapá", "AP");
		Estado ac = new Estado("Acre", "AC");
		Estado pa = new Estado("Pará", "PA");
		Estado rr = new Estado("Roraima", "RR");
		Estado ro = new Estado("Rondônia", "RO");
		Estado to = new Estado("Tocantins", "TO");

		// RS -> SC
		List<Estado> adjacenciaRS = new ArrayList<Estado>();
		adjacenciaRS.add(sc);
		rs.setEstadosVizinhos(adjacenciaRS);

		// SC -> RS, PR
		List<Estado> adjacenciaSC = new ArrayList<Estado>();
		adjacenciaSC.add(pr);
		adjacenciaSC.add(rs);
		sc.setEstadosVizinhos(adjacenciaSC);

		// PR -> SC, SP, MS
		List<Estado> adjacenciaPR = new ArrayList<Estado>();
		adjacenciaPR.add(sc);
		adjacenciaPR.add(sp);
		adjacenciaPR.add(ms);
		pr.setEstadosVizinhos(adjacenciaPR);

		// SP -> PR, RJ, MG, MS
		List<Estado> adjacenciaSP = new ArrayList<Estado>();
		adjacenciaSP.add(pr);
		adjacenciaSP.add(rj);
		adjacenciaSP.add(mg);
		adjacenciaSP.add(ms);
		sp.setEstadosVizinhos(adjacenciaSP);

		// MG -> SP, RJ, ES, GO, BA, MS, DF
		List<Estado> adjacenciaMG = new ArrayList<Estado>();
		adjacenciaMG.add(sp);
		adjacenciaMG.add(rj);
		adjacenciaMG.add(es);
		adjacenciaMG.add(go);
		adjacenciaMG.add(ba);
		adjacenciaMG.add(ms);
		adjacenciaMG.add(df);
		mg.setEstadosVizinhos(adjacenciaMG);

		// ES -> MG, RJ, BA
		List<Estado> adjacenciaES = new ArrayList<Estado>();
		adjacenciaES.add(mg);
		adjacenciaES.add(rj);
		adjacenciaES.add(ba);
		es.setEstadosVizinhos(adjacenciaES);

		// RJ -> SP, MG, ES
		List<Estado> adjacenciaRJ = new ArrayList<Estado>();
		adjacenciaRJ.add(sp);
		adjacenciaRJ.add(mg);
		adjacenciaRJ.add(es);
		rj.setEstadosVizinhos(adjacenciaRJ);

		// MS -> MT, SP, PR, GO, MG
		List<Estado> adjacenciaMS = new ArrayList<Estado>();
		adjacenciaMS.add(mt);
		adjacenciaMS.add(sp);
		adjacenciaMS.add(pr);
		adjacenciaMS.add(go);
		adjacenciaMS.add(mg);
		ms.setEstadosVizinhos(adjacenciaMS);

		// MT -> RO, PA, AM, TO, GO, MS
		List<Estado> adjacenciaMT = new ArrayList<Estado>();
		adjacenciaMT.add(ro);
		adjacenciaMT.add(pa);
		adjacenciaMT.add(am);
		adjacenciaMT.add(to);
		adjacenciaMT.add(go);
		adjacenciaMT.add(ms);
		mt.setEstadosVizinhos(adjacenciaMT);

		// GO -> MS, MG, MT, DF, TO, BA
		List<Estado> adjacenciaGO = new ArrayList<Estado>();
		adjacenciaGO.add(df);
		adjacenciaGO.add(ms);
		adjacenciaGO.add(mg);
		adjacenciaGO.add(mt);
		adjacenciaGO.add(ba);
		adjacenciaGO.add(to);
		go.setEstadosVizinhos(adjacenciaGO);

		// DF -> GO, MG
		List<Estado> adjacenciaDF = new ArrayList<Estado>();
		adjacenciaDF.add(go);
		adjacenciaDF.add(mg);
		df.setEstadosVizinhos(adjacenciaDF);

		// BA -> TO, MG, GO, ES, SE, PI, PE, AL
		List<Estado> adjacenciaBA = new ArrayList<Estado>();
		adjacenciaBA.add(to);
		adjacenciaBA.add(mg);
		adjacenciaBA.add(go);
		adjacenciaBA.add(es);
		adjacenciaBA.add(se);
		adjacenciaBA.add(pi);
		adjacenciaBA.add(pe);
		adjacenciaBA.add(al);
		ba.setEstadosVizinhos(adjacenciaBA);

		// SE -> AL, BA
		List<Estado> adjacenciaSE = new ArrayList<Estado>();
		adjacenciaSE.add(al);
		adjacenciaSE.add(ba);
		se.setEstadosVizinhos(adjacenciaSE);

		// PE -> AL, PB, BA, PI, CE
		List<Estado> adjacenciaPE = new ArrayList<Estado>();
		adjacenciaPE.add(al);
		adjacenciaPE.add(pb);
		adjacenciaPE.add(ba);
		adjacenciaPE.add(pi);
		adjacenciaPE.add(ce);
		pe.setEstadosVizinhos(adjacenciaPE);

		// AL -> SE, PE, BA
		List<Estado> adjacenciaAL = new ArrayList<Estado>();
		adjacenciaAL.add(se);
		adjacenciaAL.add(pe);
		adjacenciaAL.add(ba);
		al.setEstadosVizinhos(adjacenciaAL);

		// CE -> PB, RN, PE, PI
		List<Estado> adjacenciaCE = new ArrayList<Estado>();
		adjacenciaCE.add(pb);
		adjacenciaCE.add(rn);
		adjacenciaCE.add(pe);
		adjacenciaCE.add(pi);
		ce.setEstadosVizinhos(adjacenciaCE);

		// PI -> BA, CE, PE, MA, TO
		List<Estado> adjacenciaPI = new ArrayList<Estado>();
		adjacenciaPI.add(ba);
		adjacenciaPI.add(ce);
		adjacenciaPI.add(pe);
		adjacenciaPI.add(ma);
		adjacenciaPI.add(to);
		pi.setEstadosVizinhos(adjacenciaPI);

		// PB -> RN, PE, CE
		List<Estado> adjacenciaPB = new ArrayList<Estado>();
		adjacenciaPB.add(rn);
		adjacenciaPB.add(pe);
		adjacenciaPB.add(ce);
		pb.setEstadosVizinhos(adjacenciaPB);

		// RN -> PB, CE
		List<Estado> adjacenciaRN = new ArrayList<Estado>();
		adjacenciaRN.add(pb);
		adjacenciaRN.add(ce);
		rn.setEstadosVizinhos(adjacenciaRN);

		// MA -> PI, TO, PA
		List<Estado> adjacenciaMA = new ArrayList<Estado>();
		adjacenciaMA.add(pi);
		adjacenciaMA.add(to);
		adjacenciaMA.add(pa);
		ma.setEstadosVizinhos(adjacenciaMA);

		// AM -> PA, RR, AC, RO, MT
		List<Estado> adjacenciaAM = new ArrayList<Estado>();
		adjacenciaAM.add(pa);
		adjacenciaAM.add(rr);
		adjacenciaAM.add(ac);
		adjacenciaAM.add(ro);
		adjacenciaAM.add(mt);
		am.setEstadosVizinhos(adjacenciaAM);

		// PA -> TO, MA, AP, AM, MT, RR
		List<Estado> adjacenciaPA = new ArrayList<Estado>();
		adjacenciaPA.add(to);
		adjacenciaPA.add(ma);
		adjacenciaPA.add(ap);
		adjacenciaPA.add(am);
		adjacenciaPA.add(mt);
		adjacenciaPA.add(rr);
		pa.setEstadosVizinhos(adjacenciaPA);

		// RR -> PA, AM
		List<Estado> adjacenciaRR = new ArrayList<Estado>();
		adjacenciaRR.add(pa);
		adjacenciaRR.add(am);
		rr.setEstadosVizinhos(adjacenciaRR);

		// AC -> AM, RO
		List<Estado> adjacenciaAC = new ArrayList<Estado>();
		adjacenciaAC.add(am);
		adjacenciaAC.add(ro);
		ac.setEstadosVizinhos(adjacenciaAC);

		// RO -> MT, AM, AC
		List<Estado> adjacenciaRO = new ArrayList<Estado>();
		adjacenciaRO.add(mt);
		adjacenciaRO.add(am);
		adjacenciaRO.add(ac);
		ro.setEstadosVizinhos(adjacenciaRO);

		// AP -> PA
		List<Estado> adjacenciaAP = new ArrayList<Estado>();
		adjacenciaAP.add(pa);
		ap.setEstadosVizinhos(adjacenciaAP);

		// TO -> MA, PI, BA, GO, MT, PA
		List<Estado> adjacenciaTO = new ArrayList<Estado>();
		adjacenciaTO.add(ma);
		adjacenciaTO.add(pi);
		adjacenciaTO.add(ba);
		adjacenciaTO.add(go);
		adjacenciaTO.add(mt);
		adjacenciaTO.add(pa);
		to.setEstadosVizinhos(adjacenciaTO);

		// Região Sul
		estados.add(rs);
		estados.add(sc);
		estados.add(pr);

		// Região Sudeste
		estados.add(sp);
		estados.add(mg);
		estados.add(es);
		estados.add(rj);

		// Região Centro-Oeste
		estados.add(ms);
		estados.add(mt);
		estados.add(go);
		estados.add(df);

		// Região Nordeste
		estados.add(ba);
		estados.add(pe);
		estados.add(al);
		estados.add(se);
		estados.add(pb);
		estados.add(pi);
		estados.add(ce);
		estados.add(rn);
		estados.add(ma);

		// Região Norte
		estados.add(am);
		estados.add(ap);
		estados.add(ac);
		estados.add(pa);
		estados.add(rr);
		estados.add(ro);
		estados.add(to);
	
		// Ordena os estados de forma decrescente em relação ao número de vizinhos
		Collections.sort(estados, new EstadoComparator());
		
		for (Estado estado : estados) {
			for (Estado vizinho : estado.getEstadosVizinhos()) {
				popularArestas(estado, vizinho);
			}
		}
	}

	public void colorirEstados() {
		for (Estado estado : estados) {
			colorirEstado(estado);
			for (Estado vizinho : estado.getEstadosVizinhos()) {
				colorirEstado(vizinho);
			}
		}
	}

	public void popularArestas(Estado estado, Estado vizinho) {
		String nome = estado.getSigla() + " -> " + vizinho.getSigla();

		arestas.add(new Aresta(nome, estado, vizinho));

		Estado estadoOrigem = null;
		for (int i = 0; i < arestas.size(); i++) {
			estadoOrigem = arestas.get(i).getEstadoOrigem();
			if (vizinho.equals(estadoOrigem)) {
				arestas.remove(arestas.size() - 1);
				break;
			}
		}
	}

	public void colorirEstado(Estado estado) {
		CorEstado corEstado = null;
		for (CorEstado cor : coresEstados) {
			boolean podeSerColorido = true;
			for (Estado vizinho : estado.getEstadosVizinhos()) {
				if (vizinho.foiColorido()) {
					if (vizinho.getCorEstado().equals(cor)) {
						podeSerColorido = false;
						break;
					}
				}
			}
			if (podeSerColorido) {
				corEstado = cor;
				break;
			}
		}			
		estado.setCorEstado(corEstado);
	}
	
	private class EstadoComparator implements Comparator<Estado> {
		@Override
		public int compare(Estado estado, Estado outroEstado) {
			return estado.getTotalVizinhos() > outroEstado.getTotalVizinhos() ? -1 : 1;
		}
	}
	
	public void contarEstadosColoridos() {
		int contadorAzul = 0;
		int contadorAmarelo = 0;
		int contadorVerde = 0;
		int contadorVermelho = 0;
		
		for (Estado estado : estados) {
			if (estado.getCorEstado().equals(CorEstado.AZUL))
				contadorAzul++;
			else if (estado.getCorEstado().equals(CorEstado.AMARELO))
				contadorAmarelo++;
			else if (estado.getCorEstado().equals(CorEstado.VERDE))
				contadorVerde++;
			else
				contadorVermelho++;
		}
		
		System.out.println("Estados pintados com a cor Azul: " + contadorAzul);
		System.out.println("Estados pintados com a cor Amarela: " + contadorAmarelo);
		System.out.println("Estados pintados com a cor Verde: " + contadorVerde);
		System.out.println("Estados pintados com a cor Vermelha: " + contadorVermelho);
	}

	public void gerarGrafo(boolean colorir, String nomeArquivo) {
		GraphViz graphViz = new GraphViz();

		graphViz.addln(graphViz.start_graph());

		for (Estado estado : estados) {
			if (colorir) {
				graphViz.addln(estado.getSigla() + "[ color=\""
						+ estado.getCorEstado().getCor() + "\""
						+ ", fontcolor=\"" + "#000000\"" + ", style=filled"
						+ "];");
			} else {
				graphViz.addln(estado.getSigla());
			}
		}

		for (Aresta aresta : arestas) 
			graphViz.addln(aresta.getNome());

		System.out.println(graphViz.getDotSource());
		graphViz.addln(graphViz.end_graph());

		String tipoArquivo = "jpg";

		File arquivo = new File("C:/temp/" + nomeArquivo + "." + tipoArquivo);

		graphViz.writeGraphToFile(
				graphViz.getGraph(graphViz.getDotSource(), tipoArquivo),
				arquivo);
	}
	
	public void equilibrarCores() {
		limparCoresDosEstados();
		
		int mediaDeCores = estados.size() / coresEstados.size();
		int maximoDeCores = mediaDeCores + 1;
		
		List<Estado> estadosPintados = new ArrayList<Estado>();
				
		int contador = 0, posicaoEstado = 0;
		CorEstado corEstado = null, corDisponivel = null;
		
		Estado estadoVigente = null;
		
		Map<CorEstado, Integer> quantidadesPorCor = new HashMap<CorEstado, Integer>();
		quantidadesPorCor.put(CorEstado.AZUL, 0);
		quantidadesPorCor.put(CorEstado.AMARELO, 0);
		quantidadesPorCor.put(CorEstado.VERDE, 0);
		quantidadesPorCor.put(CorEstado.VERMELHO, 0);
		
	    while (estadosPintados.size() != estados.size()) {
	    	estadoVigente = estados.get(posicaoEstado);
	    	
			for (int i = contador; i < coresEstados.size();) {
				corEstado = coresEstados.get(i);
				corDisponivel = this.obterCorDisponivel(quantidadesPorCor, maximoDeCores);				
				if (estadoPodeSerPintado(estadosPintados, estadoVigente, corDisponivel)) {
					estadoVigente.setCorEstado(corDisponivel);
					estados.set(posicaoEstado, estadoVigente);
					estadosPintados.add(estadoVigente);
					quantidadesPorCor.put(corDisponivel, quantidadesPorCor.get(corDisponivel) + 1);
					posicaoEstado++;					
				} else if (estadoPodeSerPintado(estadosPintados, estadoVigente, corEstado)) {
					estadoVigente.setCorEstado(corEstado);
					estados.set(posicaoEstado, estadoVigente);
					estadosPintados.add(estadoVigente);
					quantidadesPorCor.put(corEstado, quantidadesPorCor.get(corEstado) + 1);
					posicaoEstado++;					
				}
				contador = ++i;
				break;
			}
			if (contador == coresEstados.size())
				contador = 0;		
	    }
	}
	
	private void limparCoresDosEstados() {
		for (Estado estado : estados) {
			estado.setCorEstado(null);
		}
	}
	
	private CorEstado obterCorDisponivel(Map<CorEstado, Integer> mapCoresQuantidade, int maximoDeCores) {
		Integer quantidadeAzul = mapCoresQuantidade.get(CorEstado.AZUL);
		Integer quantidadeAmarelo = mapCoresQuantidade.get(CorEstado.AMARELO);
		Integer quantidadeVerde = mapCoresQuantidade.get(CorEstado.VERDE);
	
		if (quantidadeAzul < maximoDeCores)
			return CorEstado.AZUL;
		else if (quantidadeAmarelo < maximoDeCores)
			return CorEstado.AMARELO;
		else if (quantidadeVerde < maximoDeCores)
			return CorEstado.VERDE;
		else	
			return CorEstado.VERMELHO;
	}
	
	private boolean estadoPodeSerPintado(List<Estado> estadosPintados, Estado estado, CorEstado corEstado) {
		if (!estadosPintados.contains(estado)) {
			for (Estado vizinho: estado.getEstadosVizinhos()) {
				if (corEstado.equals(vizinho.getCorEstado()))
					return false;
			}			
		} else 
			return false;
	
		return true;
	}
}