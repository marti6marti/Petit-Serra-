package service.serviceEspais;

import model.institute.Institut;
import model.space.Espai;

public class MostraEspais implements ShowEspais {
    @Override
    public void mostrarespais(Institut ins) {
        for (Espai espai : ins.getEspais()){
            System.out.println(espai);
        }
    }
}
