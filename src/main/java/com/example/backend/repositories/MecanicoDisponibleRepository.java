package com.example.backend.repositories;

import com.example.backend.models.MecanicosModel;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface MecanicoDisponibleRepository extends CrudRepository<MecanicosModel, Long> {

    //ArrayList<MecanicosModel> findByDisponible(String disponible);
}
