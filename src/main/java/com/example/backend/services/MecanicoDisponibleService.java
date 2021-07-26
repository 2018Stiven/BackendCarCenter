package com.example.backend.services;

import com.example.backend.models.MecanicosModel;
import com.example.backend.repositories.MecanicoDisponibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MecanicoDisponibleService {

    @Autowired
    MecanicoDisponibleRepository mecanicoDisponibleRepository;


    /*public ArrayList<MecanicosModel>obtenerMecanicosDisponibles(){
        return (ArrayList<MecanicosModel>) mecanicoDisponibleRepository.findByDisponible("Libres");
    }*/



}
