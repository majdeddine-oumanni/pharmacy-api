package com.pharmacy.api.repository;

import com.pharmacy.api.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Produit, Long> {
}
