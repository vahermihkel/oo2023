package ee.mihkel.proovikontrolltoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ToiduaineController {

    @Autowired
    ToiduaineRepository toiduaineRepository;

    @Autowired
    ToidukomponentRepository toidukomponentRepository;
    // ToidukomponentRepository toidukomponentRepository = new ToidukomponentRepository();

    // localhost:8080/leia-rasva-alusel2?alg=1&l6pp=5
    @GetMapping("leia-rasva-alusel2")
    public List<Toiduaine> leiaRasvaAlusel2(
            @RequestParam int alg,
            @RequestParam int l6pp
    ) {
        List<Toiduaine> toiduained = toiduaineRepository.findAll();
        List<Toiduaine> tagastatavadToiduained = new ArrayList<>();
        for (int i = 0; i < toiduained.size(); i++) {
            if (toiduained.get(i).getRasv() > alg && toiduained.get(i).getRasv() < l6pp) {
                tagastatavadToiduained.add(toiduained.get(i));
            }
        }
        return tagastatavadToiduained;
    }

    // localhost:8080/leia-rasva-alusel?alg=1&l6pp=5
    @GetMapping("leia-rasva-alusel")
    public List<Toiduaine> leiaRasvaAlusel(
            @RequestParam int alg,
            @RequestParam int l6pp
    ) {
        return toiduaineRepository.findByRasvIsBetween(alg, l6pp);
    }

    // localhost:8080/leia-nime-alusel2?nimetus=kartul
    @GetMapping("leia-nime-alusel2")
    public Toiduaine leiaNimeAlusel2(
            @RequestParam String nimetus
    ) {
        List<Toiduaine> toiduained = toiduaineRepository.findAll();
        for (int i = 0; i < toiduained.size(); i++) {
            if (toiduained.get(i).getNimetus().equals(nimetus)) {
                return toiduained.get(i);
            }
        }
        return null;
    }

    // localhost:8080/leia-nime-alusel?nimetus=kartul
    @GetMapping("leia-nime-alusel")
    public Toiduaine leiaNimeAlusel(
            @RequestParam String nimetus
    ) {
        return toiduaineRepository.findByNimetus(nimetus);
    }

    // localhost:8080/kustuta-toiduaine?id=1
    @GetMapping("kustuta-toiduaine")
    public List<Toiduaine> kustutaToiduaine(
            @RequestParam Long id
    ) {
        toiduaineRepository.deleteById(id);
        return toiduaineRepository.findAll();
    }

    // localhost:8080/saa-rasv?id=1
    @GetMapping("saa-rasv")
    public int saaRasv(
            @RequestParam Long id
    ) {
        Toidukomponent toidukomponent = toidukomponentRepository.findById(id).get();
        int rasv = toidukomponent.getToiduaine().getRasv() * toidukomponent.getKogus() / 100;
        return rasv;
    }

    // localhost:8080/lisa-toidukomponent?id=1&toiduaineId=8&kogus=100
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

    // localhost:8080/lisa-toiduaine?id=8&nimetus=kartul&valk=5&rasv=2&sysivesik=93
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
