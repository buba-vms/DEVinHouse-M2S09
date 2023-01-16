package tech.devinhouse.entity;


import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity(name = "pessoas")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String nome;

    @NotNull
    private String email;


    //@Column serve quando nome da variavel é diferente no Java ou no SQL

    private Boolean status;

}
