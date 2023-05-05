package ee.mihkel.proovikontrolltoo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Toiduaine {
    @Id
    private Long id;

    private String nimetus;
    private int valk;
    private int rasv;
    private int sysivesik;
}
