package tr.edu.medipol.yazilimaraclari.webservis;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciWebServis {

    // Record kendi icinde consturctor getter setter gibi cogu seyi olusturur
    public record Ogrenci(String adSoyad, String numara) {
    }


    private static final List<Ogrenci> OGRENCI_LISTESI = new ArrayList<>();

//    static {
//        // Nesne olusturdugumuz icin otomatik json yapisina ceviriyor Spring Boot.
//        OGRENCI_LISTESI.add(new Ogrenci("Erdem Buke", "1"));
//        OGRENCI_LISTESI.add(new Ogrenci("Enes Buke", "2"));
//        OGRENCI_LISTESI.add(new Ogrenci("Seyma Dalar", "3"));
//        OGRENCI_LISTESI.add(new Ogrenci("Emrah Guney", "4"));
//    }

    @GetMapping("/") // localhost:8081/ogrenci/
    public List<Ogrenci> listele() {
        return OGRENCI_LISTESI;
    }

    @GetMapping("/{no}")
    public Ogrenci bul(@PathVariable String no) {
        for (Ogrenci ogr : OGRENCI_LISTESI) {
            if(ogr.numara.equals(no))
                return ogr;
        }
        return null;
    }

    @PostMapping("/")
    public Ogrenci ekle(@RequestBody Ogrenci ogrenci) {
        OGRENCI_LISTESI.add(ogrenci);
        return ogrenci;
    }

    @DeleteMapping("/{no}")
    public boolean sil(@PathVariable String no) {
        Ogrenci ogrenci = bul(no);
        if (ogrenci != null) {
            OGRENCI_LISTESI.remove(ogrenci);
            return true;
        }
        return false;
    }


}
