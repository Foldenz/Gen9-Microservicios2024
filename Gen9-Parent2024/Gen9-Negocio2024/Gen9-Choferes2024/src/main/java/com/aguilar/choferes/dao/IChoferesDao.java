package com.aguilar.choferes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aguilar.choferes.models.Chofer;

public interface IChoferesDao extends JpaRepository<Chofer,Long>{
    

}
