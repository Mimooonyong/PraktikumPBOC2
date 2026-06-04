import java.util.HashMap;

public class MahasiswaMap {
    public static void main(String[] args) {
        //Objek HashMap Mahasiswa
        HashMap<Integer, String> Mahasiswa = new HashMap<Integer, String>();

        // Mengisi nilai Map
        Mahasiswa.put(001, "Rota");
        Mahasiswa.put(002, "Frea");
        Mahasiswa.put(003, "Orcu");
        Mahasiswa.put(004, "Glacus");
        Mahasiswa.put(005, "Brachi");

        // Implementasi lambda pada HashMap
        Mahasiswa.forEach((key, value) -> System.out.println("NIM " + key + " : " + value));
    }
}
