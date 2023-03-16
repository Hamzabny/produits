package com.iset.produits.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<com.example.produits.entities.Produit, Long> {
}