package io.github.lcseferreira.clientes.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data // ToString, EqualsAndHashCode, Getter, Setter, RequiredArgsConstructor
@NoArgsConstructor // Constructor sem argumentos
@AllArgsConstructor // Constructor de todas propriedade
public class Relatorios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "resumo_aluno", columnDefinition = "TEXT")
    private String resumoAluno;

    @Column(name = "outras_infos", columnDefinition = "TEXT")
    private String outrasInfos;

    @Column(name = "relatorio_medico", columnDefinition = "TEXT")
    private String relatorioMedico;

    @Column(name = "relatorio_pedagogico", columnDefinition = "TEXT")
    private String relatorioPedagogico;
}
