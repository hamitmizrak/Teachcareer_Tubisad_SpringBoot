package com.hamitmizrak.data.repository;

import com.hamitmizrak.data.entity.FlowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFlowerRepository extends JpaRepository<FlowerEntity,Long> {

}
