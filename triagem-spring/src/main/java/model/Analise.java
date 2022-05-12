package model;

import lombok.*;
import model.generic.AbstractEntity;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Analise extends AbstractEntity {

    String classe_processo;
    String assunto_processo;
    String parte_1;
    String parte_2;
    String prioridade_processo;
    String justica_gratuita;
    String segredo_justica;
    String pedido_liminar;
    Double valor_causa;
    Boolean disponivel;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "peticao_id")
    Peticao peticao;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Analise analise = (Analise) o;
        return getId() != null && Objects.equals(getId(), analise.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
