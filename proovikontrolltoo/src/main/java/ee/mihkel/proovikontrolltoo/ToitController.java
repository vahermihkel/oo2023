package ee.mihkel.proovikontrolltoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ToitController {

    @Autowired
    ToitRepository toitRepository;

    // localhost:8080/toidu-valgud?nimetus=voileib
    @GetMapping("toidu-valgud")
    public int toiduValgud(
            @RequestParam String nimetus
    ) {
        Toit toit = toitRepository.findById(nimetus).get();
        List<Toidukomponent> toidukomponendid = toit.getToidukomponendid();
        int valk = 0;
        for (Toidukomponent t: toidukomponendid) {
//            valk = valk + t.getToiduaine().getValk() * t.getKogus() / 100;
            valk += t.getToiduaine().getValk() * t.getKogus() / 100;
        }
        return valk;
    }

    @GetMapping("saa-toiduained")
    public List<Toiduaine> saaToiduAined(
            @RequestParam String nimetus
    ) {
        Toit toit = toitRepository.findById(nimetus).get();
        List<Toidukomponent> toidukomponendid = toit.getToidukomponendid();
        int kogus = 0;
        for (Toidukomponent t: toidukomponendid) {
            kogus += t.getKogus();
        }
        return new ArrayList<>();
    }
}


//* Koosta klass toidu jaoks (nimetus, toidukomponendid).
// Toidule käsklused küsimaks sisalduvate valkude, rasvade ja süsivesikute kogust.

// Loo retsepti järgi toit (nt. kartulisalat), küsi salatis leiduvate toitainete kogused.

// Koosta klass, kus näidatakse valitud toidu etteantud koguse (nt. 5 kg kartulisalati)
// jaoks vajalikud toiduained.
