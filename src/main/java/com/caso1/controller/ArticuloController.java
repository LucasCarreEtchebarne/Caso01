package com.caso1.controller;

import com.caso1.domain.Articulo;
import com.caso1.service.ArticuloService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articulo")
public class ArticuloController {

    private final ArticuloService articuloService;

    public ArticuloController(ArticuloService articuloService) {
        this.articuloService = articuloService;
    }

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = articuloService.getArticulos();
        model.addAttribute("articulos", lista);
        model.addAttribute("totalArticulos", lista.size());
        return "/articulo/listado";
    }

    // Abre la pantalla de modificación (Pregunta 13)
    @GetMapping("/modificar/{idArticulo}")
    public String modificar(Articulo articulo, Model model) {
        articulo = articuloService.getArticulo(articulo.getIdArticulo());
        model.addAttribute("articulo", articulo);
        return "/articulo/modifica";
    }
}