package tr.edu.medipol.yazilimaraclari.webservis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciWebServis {

    // Record kendi icinde consturctor getter setter gibi cogu seyi olusturur
    public record Ogrenci(String adSoyad, String numara) { }


    private static final List<Ogrenci> OGRENCI_LISTESI = new ArrayList<>();

    static {
        // Nesne olusturdugumuz icin otomatik json yapisina ceviriyor Spring Boot.
        OGRENCI_LISTESI.add(new Ogrenci("Erdem Buke", "1"));
        OGRENCI_LISTESI.add(new Ogrenci("Enes Buke", "2"));
        OGRENCI_LISTESI.add(new Ogrenci("Seyma Dalar", "3"));
        OGRENCI_LISTESI.add(new Ogrenci("Emrah Guney", "4"));
    }

    @GetMapping("/") // localhost:8081/ogrenci/
    public List<Ogrenci> listele() {
        return OGRENCI_LISTESI;
    }


}
