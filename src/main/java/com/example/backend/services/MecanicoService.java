/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.backend.services;

import java.util.ArrayList;

import com.example.backend.models.MecanicosModel;
import com.example.backend.repositories.MecanicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

/**
 *
 * @author Stiven Delgado
 */
@Service
public class MecanicoService {
    
    @Autowired
    MecanicoRepository mecanicoRepository;
    
    public ArrayList<MecanicosModel>obtenerMecanicos(){
    return (ArrayList<MecanicosModel>) mecanicoRepository.findAll();
    }

    public MecanicosModel guardarMecanico(MecanicosModel mecanico){
        return mecanicoRepository.save(mecanico);
    }


}
