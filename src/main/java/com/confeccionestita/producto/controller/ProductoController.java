package com.confeccionestita.producto.controller;

import com.confeccionestita.producto.entity.*;
import com.confeccionestita.producto.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @Autowired
    private IColorService colorService;

    @Autowired
    private ITallaService tallaService;

    @Autowired
    private ITemporadaService temporadaService;

    @Autowired
    private IMaterialService materialService;

    @Autowired
    private ICEspecificaService especificaService;

    @Autowired
    private ICPrincipalService principalService;



    @GetMapping("/")
    public String listProducts(Model model) {


        model.addAttribute("titulo","Nuestros productos");
        model.addAttribute("menu","Opciones");

        return "table";
    }


    @ModelAttribute("productos")
    public List<Producto> listProducts() {
        return productoService.listAll();
    }

    @GetMapping("/productos/editar/{id}")
    public String editProduct(@PathVariable("id") Integer id, Model model) {
        Producto producto = productoService.findByProductoId(id);
        System.out.println(producto.getCategoriaTalla().getCategoriaTallaId());
        model.addAttribute("producto",producto);
        model.addAttribute("titulo","Editar Producto");
        return "edit";
    }

    @PostMapping("/productos/editar/{producto}")
    public String actualizarProducto(@ModelAttribute("producto") Producto productoEditar) {
        Producto producto = productoService.save(productoEditar);
        return "redirect:/";
    }

    @GetMapping("/productos/crear")
    public String createProducto(Model model) {
        model.addAttribute("titulo","Nuevo Producto");
        model.addAttribute("productoNuevo",new Producto());
        return "new";
    }

    @PostMapping("/productos/crear")
    public String crearProducto(@ModelAttribute("productoNuevo") Producto nuevoProducto) {
        Producto producto = productoService.save(nuevoProducto);
        System.out.println(producto.getProductoId()+""+producto.getStockProducto()+producto.getCategoriaTalla());
        return "redirect:/";
    }

    @PostMapping("/productos/delete/{id}")
    public String deleteProducto(@PathVariable Integer id){
        productoService.delete(id);

        return "redirect:/";
    }

    @ModelAttribute("colores")
    public List<CategoriaColor> getColores(){
        return colorService.findAll();
    }

    @ModelAttribute("tallas")
    public List<CategoriaTalla> getTallas() {
        return tallaService.findAll();
    }

    @ModelAttribute("temporadas")
    public List<CategoriaTemporada> getTemporadas() {
        return temporadaService.findAll();
    }

    @ModelAttribute("materiales")
    public List<CategoriaMaterial> getMateriales() {
        return materialService.findAll();
    }

    @ModelAttribute("categoriasEspecificas")
    public List<CategoriaEspecifica> getCategoriasEspecificas() {
        return especificaService.findAll();
    }

    @ModelAttribute("categoriasPrincipales")
    public List<CategoriaPrincipal> getCategoriasPrincipales() {
        return principalService.findAll();
    }


}
