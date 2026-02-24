package com.caso1.service;

import com.caso1.domain.Articulo;
import com.caso1.repository.ArticuloRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ArticuloService {

    private final ArticuloRepository articuloRepository;

    public ArticuloService(ArticuloRepository articuloRepository) {
        this.articuloRepository = articuloRepository;
    }

    public List<Articulo> getArticulos() {
        return articuloRepository.findAll();
    }

    public Articulo getArticulo(Integer idArticulo) {
        return articuloRepository.findById(idArticulo).orElse(null);
    }

    public void save(Articulo articulo) {
        articuloRepository.save(articulo);
    }

    public void delete(Integer idArticulo) {
        articuloRepository.deleteById(idArticulo);
    }
}