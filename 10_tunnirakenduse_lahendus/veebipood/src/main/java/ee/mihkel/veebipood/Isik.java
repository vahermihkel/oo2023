package ee.mihkel.veebipood;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Isik {
    @Id
    private int id;
    private String eesnimi;
    private String perenimi;
    private Date loomiseAeg;
}
