package laboratorio_programacion_samuel_edwin;

import java.util.Random;

public class Tablero {

    public String[] imagenesDuplicadas(String[] imagenesOriginales) {
        int tamanioOg = imagenesOriginales.length;
        String duplicadas[] = new String[tamanioOg * 2];

        for (int i = 0; i < tamanioOg; i++) {
            duplicadas[i] = imagenesOriginales[i];
            duplicadas[i + tamanioOg] = imagenesOriginales[i];
        }

        return duplicadas;
    }

    public String[] imagenesMezcladas(String[] imagenesDuplicadas) {
        Random random = new Random();

        int tamanioDup = imagenesDuplicadas.length;
        String mezcladas[] = new String[tamanioDup];

        for (int i = 0; i < tamanioDup; i++) {
            mezcladas[i] = imagenesDuplicadas[i];
        }

        int tamanioMezcladas = mezcladas.length;

        for (int i = 0; i < tamanioMezcladas; i++) {
            int j = random.nextInt(tamanioMezcladas);

            String temp = mezcladas[i];
            mezcladas[i] = mezcladas[j];
            mezcladas[j] = temp;
        }

        return mezcladas;
    }

}
