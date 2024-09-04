package com.aguilar.camiones.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aguilar.camiones.models.Camion;

public interface ICamionesDao extends JpaRepository <Camion, Long> {

}
