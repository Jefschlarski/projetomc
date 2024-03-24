package com.projetomc.projetomc.resources;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.projetomc.projetomc.domain.Categoria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @GetMapping
    public List<Categoria> get(){
        Categoria cat = new Categoria(1, "Informatica");
        Categoria cat2 = new Categoria(2, "Escritorio");

        List<Categoria> cats = List.of(cat, cat2);

        return cats;
    }

}
