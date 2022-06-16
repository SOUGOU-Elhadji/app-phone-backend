package com.saraya.phoneApp.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String mark;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String imageUrl;
    @Enumerated(EnumType.STRING)
    private ConditionPhone category;
    /*@Column(nullable = false)
    private String color;*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Phone phone = (Phone) o;
        return id != null && Objects.equals(id, phone.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
