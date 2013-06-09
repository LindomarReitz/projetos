package com.exemplo.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exemplo.spring.beans.Tarefa;

@Controller
public class TarefaController {
	private List<Tarefa> tarefas = new ArrayList<Tarefa>();
	@RequestMapping("cadastrarTarefa")
	public String cadastrarTarefa() {
		return "tarefas/cadastro-tarefa";
	}
	
	@RequestMapping("adicionarTarefa")
	public String adicionarTarefa(Tarefa tarefa) {
		tarefas.add(tarefa);
		System.out.println("Descrição: " + tarefa.getDescricao());
		
		return "tarefas/tarefa-adicionada";
	}
	
	@RequestMapping("listarTarefas")
	public String listarTarefas(Model model) {
		model.addAttribute("tarefa", tarefas.get(0));
		return "tarefas/lista-tarefa";
	}
	
	@RequestMapping("mostrarTarefa")
	public String atualizarTarefa(Long id, Model model) {
		for (int i = 0; i < tarefas.size(); i++) {
			if (tarefas.get(i).getId() == id) {
				model.addAttribute("tarefa", tarefas.get(i));
			}
		}
		return "tarefas/atualizar-tarefa";
	}
	
	@RequestMapping("atualizarTarefa")
	public String atualizarTarefa(Tarefa tarefa) {
		tarefas.set(0, tarefa);
		return "forward:listarTarefas";
	}
}