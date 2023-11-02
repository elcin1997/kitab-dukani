package com.example.kitabdukani.repository;

import com.example.kitabdukani.dommain.Kitab;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KitabRepository extends JpaRepository<Kitab,Integer> {
    List<Kitab> findKitabByMuellif_Id(Integer id);
}
