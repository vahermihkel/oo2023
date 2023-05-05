package ee.mihkel.proovikontrolltoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToiduaineController {

    @Autowired
    ToiduaineRepository toiduaineRepository;

    @Autowired
    ToidukomponentRepository toidukomponentRepository;
    // ToidukomponentRepository toidukomponentRepository = new ToidukomponentRepository();


    // localhost:8080/lisa-toidukomponent?id=1&toiduaineId=1&kogus=100
    @GetMapping("lisa-toidukomponent")
    public List<Toidukomponent> lisaToidukomponent(
            @RequestParam Long id,
            @RequestParam Long toiduaineId,
            @RequestParam int kogus
    ) {
        Toiduaine toiduaine = toiduaineRepository.findById(toiduaineId).get();
        toidukomponentRepository.save(new Toidukomponent(id, toiduaine,kogus));
        return toidukomponentRepository.findAll();
    }

    // localhost:8080/lisa-toiduaine?id=1&nimetus=kartul&valk=5&rasv=2&sysivesik=93
    @GetMapping("lisa-toiduaine")
    public List<Toiduaine> lisaToiduaine(
            @RequestParam Long id,
            @RequestParam String nimetus,
            @RequestParam int valk,
            @RequestParam int rasv,
            @RequestParam int sysivesik
    ) throws Exception {
        if (valk + rasv + sysivesik > 100) {
            // Unhandled exception: java.lang.Exception
            throw new Exception("Protsent ei saa olla üle saja!");
        }
        toiduaineRepository.save(new Toiduaine(id, nimetus, valk, rasv, sysivesik));
        return toiduaineRepository.findAll();
    }
}

//* Koosta uus Spring rakendus. Koosta klass toiduaine tarbeks
// (nimetus, valkude, rasvade ja süsivesikute protsent).
// Loo API otspunkti kaudu - loodava instantsi protsent
// kokku ei saa ületada 100 - muidu antakse veateade.
// Loo mõni toiduaine (nt. kartul, hapukoor, vorst).
// Koosta klass toidukomponendi tarbeks (kogus, viit toiduainele).
// Loo mõned toidukomponendid (nt. 100 g kartuleid, 30 g hapukoort, 50 g vorsti).
// Lisa toidukomponendile käsklus selle sees leiduva rasvakoguse arvutamiseks.

//* Koosta uus klass, kus on toiduainete listid ning kus saab toiduaineid objektide
// API otspunktide kaudu lisada ja kustutada, nime järgi andmeid vaadata ning
// rasvaprotsendivahemiku järgi otsida.

//* Koosta klass toidu jaoks (nimetus, toidukomponendid).
// Toidule käsklused küsimaks sisalduvate valkude, rasvade ja süsivesikute kogust.
// Loo retsepti järgi toit (nt. kartulisalat), küsi salatis leiduvate toitainete kogused.
// Koosta klass, kus näidatakse valitud toidu etteantud koguse (nt. 5 kg kartulisalati)
// jaoks vajalikud toiduained.
