package onedigitalinnovation.gof;

import onedigitalinnovation.gof.singleton.SingletonEager;
import onedigitalinnovation.gof.singleton.SingletonLazy;
import onedigitalinnovation.gof.singleton.SingletonLazyHolder;
import onedigitalinnovation.gof.strategy.Comportamento;
import onedigitalinnovation.gof.strategy.ComportamentoAgresivo;
import onedigitalinnovation.gof.strategy.ComportamentoDefensivo;
import onedigitalinnovation.gof.strategy.ComportamentoNormal;
import onedigitalinnovation.gof.strategy.Robo;

public class Test {

    public static void main(String[] args){

        //* 
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgresivo();

        Robo robo = new Robo();
        
        robo.setComportamento(normal);

        robo.mover();
    }
}
