/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.backend.repositories;

import com.example.backend.models.MecanicosModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *
 * @author bswnnm
 */
@Repository
public interface MecanicoRepository extends CrudRepository<MecanicosModel, Long> {

}
