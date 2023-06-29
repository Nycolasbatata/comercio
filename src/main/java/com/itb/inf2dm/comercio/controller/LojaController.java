package com.itb.inf2dm.comercio.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		
		Produto p1 = new Produto();
		p1.setId = (20l);
		p1.setNome("rtx 3060");
		p1.setCodigoBarras("JHDYEJOUSNEU5411");
		p1.setPreco(3654.12);
		p1.setDescricao("COMPUTADOR TERABYTE");
		p1.setStatus(true);
		
		listaDeProdutos.add(p1);
		
		
		Produto p2 = new Produto();
		p2.setId = (21l);
		p2.setNome("rx 6750 xt");
		p2.setCodigoBarras("JHDYEJOUSNEU25411");
		p2.setPreco(3654.12);
		p2.setDescricao("COMPUTADOR PICHAU GAMER");
		p2.setStatus(false);
		
	    listaDeProdutos.add(p2);
	
    model.addAttribute("listaDeProdutos", listaDeProdutos);
	
	return "produtos";
	}
	@GetMapping("/novo-prod")
	public String novoProduto() {
		return "novo-prod";
	}

}
