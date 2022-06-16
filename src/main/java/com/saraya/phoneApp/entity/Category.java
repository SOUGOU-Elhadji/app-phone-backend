/*package com.saraya.phoneApp.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Category {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Enumerated(EnumType.STRING)
    private ConditionPhone conditionPhone;
    @OneToMany(targetEntity = Phone.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_category", referencedColumnName = "id")
    @ToString.Exclude
    private Collection<Phone> phones;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Category category = (Category) o;
        return id != null && Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
*/