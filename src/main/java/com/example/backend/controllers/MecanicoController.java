/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.backend.controllers;

import java.util.ArrayList;

import com.example.backend.models.MecanicosModel;
import com.example.backend.services.MecanicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Stiven Delgado
 */
@RestController
@RequestMapping("/mecanico")
@CrossOrigin(origins = "http://localhost:4200")
public class MecanicoController {
    @Autowired
    MecanicoService mecanicoService;
    
    @GetMapping()
    public ArrayList<MecanicosModel> obtenerMecanicos(){
    return mecanicoService.obtenerMecanicos();
    }
    
    @PostMapping()
    public MecanicosModel guardarMecanico(@RequestBody MecanicosModel mecanico){
    return this.mecanicoService.guardarMecanico(mecanico);
    }

    /*@GetMapping()
    public ArrayList<MecanicosModel> obtenerMecanicosDisponibles(){
        return mecanicoService.obtenerMecanicosDisponibles();
    }*/
}
