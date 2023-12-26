package tr.edu.medipol.yazilimaraclari.webservis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciWebServis {

    private static final List<String> OGRENCI_LISTESI = new ArrayList<>();
    static {
        OGRENCI_LISTESI.add("Erdem Buke");
        OGRENCI_LISTESI.add("Enes Buke");
        OGRENCI_LISTESI.add("Seyma Dalar");
        OGRENCI_LISTESI.add("Emrah Guney");
    }

    @GetMapping("/") // localhost:8081/ogrenci/
    public List<String> listele() {
        return OGRENCI_LISTESI;
    }


}
