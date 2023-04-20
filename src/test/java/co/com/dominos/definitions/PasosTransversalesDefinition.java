package co.com.dominos.definitions;


import io.cucumber.java.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actors.*;



public class PasosTransversalesDefinition {

    @ParameterType(".*")
    public Actor actor(String actorName) {return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
        }


}
