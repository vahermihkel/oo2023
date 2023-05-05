package ee.mihkel.veebipood;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tellimus {
    @Id
    private int id;
    @ManyToOne
    private Isik tellija; // Isik    KontaktAndmed

    @ManyToMany
    private List<Toode> tooted;
}
