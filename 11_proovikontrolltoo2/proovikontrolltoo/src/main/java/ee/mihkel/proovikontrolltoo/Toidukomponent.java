package ee.mihkel.proovikontrolltoo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Toidukomponent {
    @Id
    private Long id;

    @ManyToOne
    private Toiduaine toiduaine;
    private int kogus;

    // Isik1 ja Kontaktandmed1
    // Isik2 ja Kontaktandmed2

    // Isik1 KontaktAndmed1
    // Isik2 KontaktAndmed1
}
