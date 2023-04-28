package ee.mihkel.veebipood;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity       // andmebaasitabeliks defineerimine
public class Toode { // andmebaasi nimi on classi nimi
    @Id    // primaarvõtmega
    private int id;
    // private Long id;  2.1miljardit
    // standard on panna andmebaasi ID Long
    private String nimi;
    private double hind;

}
