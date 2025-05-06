package com.pharmacy.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produit {
    @Id
    private long id;
}
