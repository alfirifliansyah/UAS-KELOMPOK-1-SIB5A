import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgriChain {
    private List<Farmer> daftarPetani;

    public AgriChain() {
        this.daftarPetani = new ArrayList<>();
    }

    public void daftarPetani(Farmer petani) {
        daftarPetani.add(petani);
        System.out.println(petani.getNama() + " telah terdaftar.");
    }

    public void tampilkanDaftarPetani() {
        System.out.println("Daftar Petani Terdaftar:");
        for (Farmer petani : daftarPetani) {
            System.out.println("- " + petani.getNama() + " (Lokasi: " + petani.getLokasi() + ")");
        }
    }

    public void jadwalPenanaman(String tanaman, String musim) {
        System.out.println("Menjadwalkan penanaman " + tanaman + " pada musim " + musim + ".");
    }

    public void analisisProduksi() {
        System.out.println("Data Produksi Gabungan:");
        Map<String, Integer> totalProduksi = new HashMap<>();
        for (Farmer petani : daftarPetani) {
            for (Map.Entry<String, Integer> entry : petani.getDataPanen().entrySet()) {
                totalProduksi.put(entry.getKey(), totalProduksi.getOrDefault(entry.getKey(), 0) + entry.getValue());
            }
        }
        for (Map.Entry<String, Integer> entry : totalProduksi.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " kg");
        }
    }
}