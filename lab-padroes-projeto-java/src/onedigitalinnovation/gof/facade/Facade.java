package onedigitalinnovation.gof.facade;

import onedigitalinnovation.subsistema.crm.CrmService;
import onedigitalinnovation.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);

        CrmService.gravarCliente(nome, cep, nome, cep);
    }

}
