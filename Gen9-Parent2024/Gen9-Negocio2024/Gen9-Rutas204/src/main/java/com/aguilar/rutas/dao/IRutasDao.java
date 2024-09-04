package com.aguilar.rutas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aguilar.rutas.models.Ruta;

public interface IRutasDao extends JpaRepository<Ruta,Long>{
    

}
