package com.medconnect.model;

import com.medconnect.dto.cidade.CadastroCidadeDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.security.PrivateKey;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor

@Entity
@Table(name="t_mdct_cidade")
@EntityListeners(AuditingEntityListener.class)
public class Cidade {
    @Id
    @GeneratedValue
    @Column(name="id_cidade")
    private Long idCidade;

    @Column(name="nm_cidade", length = 60)
    private String nome;

    @Column(name="cd_ibge")
    private Integer codigoIBGE;

    @Column(name="nr_ddd")
    private Integer ddd;

    @OneToMany(mappedBy = "cidade")
    private List<Bairro> bairros = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="id_estado")
    private Estado estado;

    public Cidade(CadastroCidadeDto cidadeDto) {
        this.nome = cidadeDto.nome();
        this.codigoIBGE = cidadeDto.codigoIBGE();
        this.ddd = cidadeDto.ddd();
    }
}
