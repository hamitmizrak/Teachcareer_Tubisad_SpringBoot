package com.hamitmizrak.flower;

import com.hamitmizrak.flower.FlowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFlowerRepository extends JpaRepository<FlowerEntity,Long> {

}
