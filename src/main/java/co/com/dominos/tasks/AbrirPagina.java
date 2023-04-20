package co.com.dominos.tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;

public class AbrirPagina implements Task {

    private final String url;
    public AbrirPagina(String url) {
        this.url = url;
    }

    public static AbrirPagina enUrl(String url){
        return Tasks.instrumented(AbrirPagina.class,url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}
