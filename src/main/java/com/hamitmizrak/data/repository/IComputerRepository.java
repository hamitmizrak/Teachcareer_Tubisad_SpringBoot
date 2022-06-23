package com.hamitmizrak.data.repository;

import com.hamitmizrak.data.entity.ComputerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComputerRepository extends CrudRepository<ComputerEntity,Long> {
}
