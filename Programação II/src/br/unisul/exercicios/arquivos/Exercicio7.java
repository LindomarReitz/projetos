package br.unisul.exercicios.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import br.unisul.beans.ResultadoMegaSena;

public class Exercicio7 {
	private static final String ARQUIVO = "c://temp//D_MEGA.htm";
	private static final String ARQUIVO2 = "c:/temp/resultados.xml";
	
	public void escreverArquivoXML(ArrayList<ResultadoMegaSena> resultados) throws IOException {
		FileWriter file = null;
		BufferedWriter buffer = null;
		
		try {
			file = new FileWriter(ARQUIVO2);
			try {
				buffer = new BufferedWriter(file);
				for (ResultadoMegaSena r : resultados) {
					buffer.write("<megasena>");
					buffer.newLine();
					buffer.write("  <concurso>");
					buffer.newLine();
					buffer.write("   <numero>" + r.getNumJogo() + "</numero>");
					buffer.newLine();
					buffer.write("   <data>" + new SimpleDateFormat("dd/MM/yyyy").format(r.getData()) + "</data>");
					buffer.newLine();
					buffer.write("   <dezenas>" + r.getDezenas()[0] + ", " + r.getDezenas()[1] + ", " + r.getDezenas()[2] + ", " +
							r.getDezenas()[3] + ", " + r.getDezenas()[4] + ", " + r.getDezenas()[5] + "</dezenas>");
					buffer.newLine();
					buffer.write("   <sena>");
					buffer.newLine();
					buffer.write("    <ganhadores>" + r.getNumMegaSena() + "</ganhadores>");
					buffer.newLine();
					buffer.write("    <premio>" + r.getPagoMegaSena() + "</premio>");
					buffer.newLine();
					buffer.write("   </sena>");
					buffer.newLine();
					buffer.write("   <quina>");
					buffer.newLine();
					buffer.write("    <ganhadores>" + r.getNumQuina() + "</ganhadores>");
					buffer.newLine();
					buffer.write("    <premio>" + r.getPagoQuina() + "</premio>");
					buffer.newLine();
					buffer.write("   </quina>");
					buffer.newLine();
					buffer.write("   <quadra>");
					buffer.newLine();
					buffer.write("    <ganhadores>" + r.getNumQuadra() + "</ganhadores>");
					buffer.newLine();
					buffer.write("    <premio>" + r.getPagoQuadra() + "</premio>");
					buffer.newLine();
					buffer.write("   </quadra>");
					buffer.newLine();
					buffer.write("   <acumulado>" + r.getValorAcumulado() + "</acumulado>");
					buffer.newLine();
					buffer.write("  </concurso>");
					buffer.newLine();
					buffer.write("</megasena>");
					buffer.newLine();
				}
			} finally {
				buffer.close();
			}
		} finally {
			file.close();
		}
	}
	
	public ArrayList<ResultadoMegaSena> lerArquivoHTML() throws FileNotFoundException, IOException {
		FileReader file = null;
		BufferedReader buffer = null;
		ArrayList<ResultadoMegaSena> resultados = new ArrayList<ResultadoMegaSena>();
		ResultadoMegaSena resultado = new ResultadoMegaSena();
		String acumulado = "", arrecadacao = "";
		String[] valores = new String[6];
		int numJogo = 0, numMegaSena = 0, numQuina = 0, numQuadra= 0;
		int dezena1 = 0, dezena2 = 0, dezena3 = 0, dezena4= 0, dezena5 = 0, dezena6 = 0;
		double pagoMegaSena = 0, pagoQuina = 0, pagoQuadra = 0, valorAcumulado = 0, estimativa = 0, natal = 0;	
		int[] dezenas;
		Date data = null;
		try {
			 file = new FileReader(ARQUIVO);
			 System.out.println("Arquivo Aberto!");
			 try {
				 buffer = new BufferedReader(file);
				 String linha = "";
				 int contaTD = 0;
				 while ((linha = buffer.readLine()) != null) {
					 if (linha.indexOf("<td>") > -1) {
						 contaTD++;
						 switch (contaTD) {
						 case 1: numJogo = Integer.parseInt(parseTag(linha, "td"));
						 		break;
						 			
						 case 2: data = parseDate(parseTag(linha, "td"));
						 		break;
						 		 
						 case 3: dezena1 = Integer.parseInt(parseTag(linha, "td"));
						 		break;
							 
						 case 4: dezena2 = Integer.parseInt(parseTag(linha, "td"));
						 		break;
							 
						 case 5: dezena3 = Integer.parseInt(parseTag(linha, "td"));
					 			break;
					 			
						 case 6: dezena4 = Integer.parseInt(parseTag(linha, "td"));
					 			break;
							  
						 case 7: dezena5 = Integer.parseInt(parseTag(linha, "td"));
					 			break;
					 			
						 case 8: dezena6 = Integer.parseInt(parseTag(linha, "td"));
					 			break;
					 			
						 case 9: arrecadacao = parseTag(linha, "td");
							 	break;
							 	
						 case 10: numMegaSena = Integer.parseInt(parseTag(linha, "td"));
						 		break;
							 
						 case 11: valores[0] = parseTag(linha, "td");
						 		  valores[0] = formatarString(valores[0]);
						 		  pagoMegaSena = Double.parseDouble(valores[0]);
						 		 break;
							 
						 case 12: numQuina = Integer.parseInt(parseTag(linha, "td"));
						 		break;
							 
						 case 13: valores[1] = parseTag(linha, "td");
						 		  valores[1] = formatarString(valores[1]);
						 		  pagoQuina = Double.parseDouble(valores[1]);
						 		break;
							 
						 case 14: numQuadra = Integer.parseInt(parseTag(linha, "td"));
							 	break;
							 	
						 case 15: valores[2] = parseTag(linha, "td"); 
						 		  valores[2] = formatarString(valores[2]);	
							      pagoQuadra = Double.parseDouble(valores[2]);
						 		break;
							 
						 case 16: acumulado = parseTag(linha, "td");
						 		break;
							 
						 case 17: valores[3] = parseTag(linha, "td");
						 		  valores[3] = formatarString(valores[3]);
						 		  valorAcumulado = Double.parseDouble(valores[3]);
						 		break;
						 		
						 case 18: valores[4] = parseTag(linha, "td");
						 		  valores[4] = formatarString(valores[4]);
							 	  estimativa = Double.parseDouble(valores[4]);
						 		break;
							 
						 case 19: valores[5] = parseTag(linha, "td");
						 		  valores[5] = formatarString(valores[5]);	
					 	          natal = Double.parseDouble(valores[5]);
					 	         dezenas = new int []{dezena1, dezena2, dezena3, dezena4, dezena5, dezena6};
						 	resultados.add(new ResultadoMegaSena(numJogo, data, dezenas , numMegaSena, pagoMegaSena,
						 			numQuina, pagoQuina, numQuadra, pagoQuadra, acumulado, valorAcumulado));
						 	contaTD = 0;
						 	break;
						 }
					 }
				 }
			 } finally {
				 buffer.close();
			 }
		} finally {
			file.close();
			System.out.println("Arquivo fechado!");
		}
		return resultados;
	}
	
	private String parseTag(String linha, String tag) {
		String info[] = linha.split("<" + tag + ">");
		String dados[] = info[1].split("</" + tag + ">");
 		return dados[0];
	}
	
	public String formatarString(String valor) {
		valor = valor.replace(".", "");
		valor = valor.replace(",", ".");
		return valor;
	}
	
	private Date parseDate(String data) {
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = (Date)sdf.parse(data);
		} catch (Exception e) {
			System.out.println("Erro ao conveter data!");
		}
		return date;
	}
	
	public static void main(String[] args) {
		Exercicio7 ex7 = new Exercicio7();
		try {
			ex7.escreverArquivoXML(ex7.lerArquivoHTML());
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Erro ao abrir arquivo");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao fazer leitura");
			e.printStackTrace();
		}
	}
}