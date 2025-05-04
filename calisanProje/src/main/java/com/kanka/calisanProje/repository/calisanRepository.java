package com.kanka.calisanProje.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kanka.calisanProje.model.calisan;

@Repository
public interface calisanRepository extends JpaRepository<calisan,Long> {

}
