package ee.mihkel.primitiivid;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ToodeListController {
    List<Toode> tooted = new ArrayList<>(Arrays.asList(
            new Toode(1,"Koola", 1.5, true),
            new Toode(2,"Fanta", 1.0, false),
            new Toode(3,"Sprite", 1.7, true),
            new Toode(4,"Vichy", 2.0, true),
            new Toode(5,"Vitamin well", 2.5, true)
    ));

    @GetMapping("tooted")
    public List<Toode> saaTooted() {
        return tooted;
    }

    @DeleteMapping("kustuta-toode/{index}")
    public List<Toode> kustutaToode(@PathVariable int index) {
        tooted.remove(index);
        return tooted;
    }

    @DeleteMapping("kustuta-toode-variant-2/{index}")
    public String kustutaToodeVariant2(@PathVariable int index) {
        tooted.remove(index);
        return "Toode kustutatud!";
    }

    @PostMapping("lisa-toode/{id}/{nimi}/{hind}/{aktiivne}")
    public List<Toode> lisaToode(
            @PathVariable int id,
            @PathVariable String nimi,
            @PathVariable double hind,
            @PathVariable boolean aktiivne) {
        tooted.add(new Toode(id, nimi, hind, aktiivne));
        return tooted;
    }

//    import org.springframework.web.bind.annotation.RequestParam;
    @PostMapping("lisa-toode")
    public List<Toode> lisaToodeURLParameetritega(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam double hind,
            @RequestParam boolean aktiivne) {
        tooted.add(new Toode(id, nimi, hind, aktiivne));
        return tooted;
    }
    // localhost:8080/lisa-toode?id=8&nimi=Mullivesi&hind=2.3&aktiivne=true

    @PatchMapping("hind-dollaritesse/{kurss}")
    public List<Toode> hindDollaritesse(@PathVariable double kurss) {
//        for (int i = 0; i < tooted.size(); i++) {
//            double vanaHind = tooted.get(i).getHind();
//            double uusHind = vanaHind * kurss;
//            tooted.get(i).setHind(uusHind);
//        } // sobib nii For Each (ülal) kui Enhanced For tsükkel
        for (Toode toode : tooted) {
            double vanaHind = toode.getHind();
            double uusHind = vanaHind * kurss;
            toode.setHind(uusHind);
        }
        return tooted;
    }

    @GetMapping("ostukorvi-kogusumma")
    public double ostukorviKogusumma(@RequestBody List<Toode> tooted) {
        double sum = 0;
        for (Toode toode: tooted) {
            sum = sum + toode.getHind();
            // sum += toode.getHind();
        }
        return sum;
    }
}
