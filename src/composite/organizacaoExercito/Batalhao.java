package composite.organizacaoExercito;

import java.util.ArrayList;
import java.util.List;

public class Batalhao implements ExercitoComposite {
    private List<ExercitoComposite> unidades = new ArrayList<>();

    public void adicionarUnidade(ExercitoComposite exercitoComposite){
        unidades.add(exercitoComposite);
    }
    @Override
    public int mostrarPoder(){
        int total = 0;
        for (ExercitoComposite unidade : unidades){
            total += unidade.mostrarPoder();
        }
        return total;
    }

}
