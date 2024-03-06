import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoArrayList {
    public static void main(String[] args) {
        String aula1 = "Modelando aula de Vetor";
        String aula2 = "Apredendo sobre lista";
        String aula3 = "Trabalhando com classe e método";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);
//        for (int i=0; i< aulas.size(); i++){
//            System.out.println(aulas.get(i));
//        }
//
        //  foreach

//        for (String aula : aulas) {
//          System.out.println(aula);
//        }

        //foreach lambda

        aulas.forEach((nova -> {
            System.out.println(nova);
        }));

        //ordenação
        Collections.sort(aulas);

    }
}
