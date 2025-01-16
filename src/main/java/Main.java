public class Main {
    public static void main(String[] args) {
        AgriChain agriChain = new AgriChain();

        // Daftarkan petani
        Farmer petani1 = new Farmer("Budi Santoso", "Wilayah A");
        Farmer petani2 = new Farmer("Siti Aminah", "Wilayah B");
        agriChain.daftarPetani(petani1);
        agriChain.daftarPetani(petani2);

        // Tambah data hasil panen
        petani1.tambahHasilPanen("Gandum", 100);
        petani1.tambahHasilPanen("Jagung", 50);
        petani2.tambahHasilPanen("Padi", 200);
        petani2.tambahHasilPanen("Jagung", 30);

        // Tampilkan data hasil panen
        petani1.tampilkanDataPanen();
        petani2.tampilkanDataPanen();

        // Tampilkan semua petani
        agriChain.tampilkanDaftarPetani();

        // Jadwalkan penanaman
        agriChain.jadwalPenanaman("Gandum", "Musim Semi");

        // Analisis data produksi
        agriChain.analisisProduksi();
    }
}md