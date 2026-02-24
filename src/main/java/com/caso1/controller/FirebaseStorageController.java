package com.caso1.controller;

import com.caso1.domain.Articulo;
import com.caso1.service.ArticuloService;
import com.caso1.service.FirebaseStorageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/firebase")
public class FirebaseStorageController {

    private final FirebaseStorageService firebaseStorageService;
    private final ArticuloService articuloService;

    public FirebaseStorageController(FirebaseStorageService firebaseStorageService,
                                     ArticuloService articuloService) {
        this.firebaseStorageService = firebaseStorageService;
        this.articuloService = articuloService;
    }

    @PostMapping("/cargarImagen")
    public String cargarImagen(@RequestParam("archivo") MultipartFile archivo,
                               Articulo articulo,
                               RedirectAttributes redirectAttributes) {

        if (archivo != null && !archivo.isEmpty()) {
            
            String urlImagen = firebaseStorageService.cargaImagen(archivo, "articulo", articulo.getIdArticulo());
            articulo.setImagenArticulo(urlImagen);
        }

        articuloService.save(articulo);
        redirectAttributes.addFlashAttribute("exito", "Imagen actualizada correctamente");
        return "redirect:/articulo/listado";
    }
}
