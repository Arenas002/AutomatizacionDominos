package co.com.dominos.definitions;


import co.com.dominos.tasks.*;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import org.apache.log4j.PropertyConfigurator;
import static co.com.dominos.enums.Diccionario.URL_BASE;
import static co.com.dominos.enums.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;


public class RecogerTiendaDefinition {

    @Dado("que el {actor} se encuentra en el aplicativo")
    public void queElUsuarioSeEncuentraEnElAplicativo(Actor actor) {
        PropertyConfigurator.configure(LOG4J_PROPERTIES_FILE_PATH.getValue());
        actor.attemptsTo(AbrirPagina.enUrl(URL_BASE.getValor())
        );
    }
    @Cuando("el usuario selecciona una tienda para realizar el pedido")
    public void elUsuarioSeleccionaUnaTiendaParaRealizarElPedido() {

    }
    @Entonces("el usuario es redirigido al menu principal")
    public void elUsuarioEsRedirigidoAlMenuPrincipal() {

    }
}
