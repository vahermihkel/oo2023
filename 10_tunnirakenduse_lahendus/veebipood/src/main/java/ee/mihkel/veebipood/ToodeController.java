package ee.mihkel.veebipood;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ToodeController {
    List<Toode> tooted = new ArrayList<>(Arrays.asList(
            new Toode(1, "Koola", 1.5),
            new Toode(2, "Fanta", 1.0),
            new Toode(3, "Sprite", 1.7),
            new Toode(4, "Vichy", 2.0),
            new Toode(5, "Vitamin well", 2.5)
    ));

    // GET    api.err.ee/tooted
    // GET    localhost:8080/tooted
    @GetMapping("tooted")
    public List<Toode> saaTooted() {
        return tooted;
    }

    // 404 --- valesti kirjutatud või olen juba valmis aga pole rakendusele restarti teinud
//    "status": 405,
//   "error": "Method Not Allowed",    -----> meetodi tüüp on vale DELETE asemel on tehtud nt GET
    // DELETE localhost:8080/kustuta-toode/1
    @DeleteMapping("kustuta-toode/{index}")
    public String kustutaToode(@PathVariable int index) {
        tooted.remove(index);
        return "Toode kustutatud!";
    }

    // POST localhost:8080/lisa-toode?id=1&nimi=Coca&hind=1.1
    @PostMapping("lisa-toode")
    public List<Toode> lisaToode(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam double hind) {
        tooted.add(new Toode(id, nimi, hind));
        return tooted;
    }
}
