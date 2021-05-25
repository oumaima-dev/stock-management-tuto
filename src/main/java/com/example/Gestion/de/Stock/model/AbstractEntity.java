package com.example.Gestion.de.Stock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;


@Data
@MappedSuperclass
//Designates a class whose mapping information is applied to the entities that inherit from it.
// A mapped superclass has no separate table defined for it.
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @CreatedDate
    @Column(name = "creationDate", nullable = false)
    @JsonIgnore  // ignore that field in serialization and deserialization
    private Instant creationDate;

    // Instant ==> Moment in UTC

    @LastModifiedDate
    @Column(name = "lastModifiedDate", nullable = false)
    @JsonIgnore // ignore that field in serialization and deserialization
    private Instant lastModifiedDate;
}
