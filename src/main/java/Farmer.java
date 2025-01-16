import java.util.HashMap;
import java.util.Map;

public class Farmer {
    private String nama;
    private String lokasi;
    private Map<String, Integer> dataPanen; // Nama tanaman -> Jumlah (kg)

    public Farmer(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.dataPanen = new HashMap<>();
    }

    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public Map<String, Integer> getDataPanen() {
        return dataPanen;
    }

    public void tambahHasilPanen(String tanaman, int jumlah) {
        dataPanen.put(tanaman, dataPanen.getOrDefault(tanaman, 0) + jumlah);
    }

    public void tampilkanDataPanen() {
        System.out.println("Data panen untuk " + nama + ":");
        for (Map.Entry<String, Integer> entry : dataPanen.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " kg");
        }
    }
}