package ee.mihkel.proovikontrolltoo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Toit {

    @Id
    private String nimetus;

    @ManyToMany
    private List<Toidukomponent> toidukomponendid;
}
