package com.example.backend.controllers;

import com.example.backend.models.MecanicosModel;
import com.example.backend.services.MecanicoDisponibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/disponible")
@CrossOrigin(origins = "http://localhost:4200")
public class MecanicoDisponibleController {

    @Autowired
    MecanicoDisponibleService mecanicoDisponibleService;
/*
    @GetMapping()
    public ArrayList<MecanicosModel> obtenerMecanicosDisponibles(){
        return mecanicoDisponibleService.obtenerMecanicosDisponibles();
    }*/
}
