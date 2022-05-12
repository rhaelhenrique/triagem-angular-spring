package model;

import lombok.*;
import model.generic.AbstractEntity;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.persistence.OneToOne;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Peticao extends AbstractEntity{

    String texto_pdf;

    @OneToOne(mappedBy = "peticao")
    Analise analise;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Peticao peticao = (Peticao) o;
        return getId() != null && Objects.equals(getId(), peticao.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
