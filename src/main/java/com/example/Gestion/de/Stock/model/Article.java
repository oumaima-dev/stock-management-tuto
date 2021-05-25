package com.example.Gestion.de.Stock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Article extends AbstractEntity{

    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaireHt;
    private BigDecimal prixUnitaireTtc;
    private BigDecimal tauxTva;
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;
}
