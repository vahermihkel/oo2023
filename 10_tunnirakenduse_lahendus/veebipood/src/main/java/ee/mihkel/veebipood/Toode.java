package ee.mihkel.veebipood;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Toode {
    private int id;
    private String nimi;
    private double hind;

}
