package gameoflife.features;

import gameoflife.Evolution;
import gameoflife.World;
import gameoflife.features.PlayingGameOfLifeFeature;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Blinker 1")
@SuppressWarnings("all")
public class PlayingGameOfLifeFeatureBlinker1 extends PlayingGameOfLifeFeature {
  World world;
  
  @Test
  @Order(0)
  @Named("Given a world")
  public void _givenAWorld() {
    StepArguments _stepArguments = new StepArguments("-----\n--X--\n--X--\n--X--\n-----\n");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    World _parseWorld = World.parseWorld(_first);
    this.world = _parseWorld;
  }
  
  @Test
  @Order(1)
  @Named("Then the world evolves into")
  public void _thenTheWorldEvolvesInto() {
    StepArguments _stepArguments = new StepArguments("-----\n-----\n-XXX-\n-----\n-----\n");
    final StepArguments args = _stepArguments;
    Evolution _gameOfLife = Evolution.gameOfLife();
    World _evolve = _gameOfLife.evolve(this.world);
    this.world = _evolve;
    String _first = JnarioIterableExtensions.<String>first(args);
    World _parseWorld = World.parseWorld(_first);
    boolean _doubleArrow = Should.<World>operator_doubleArrow(this.world, _parseWorld);
    Assert.assertTrue("\nExpected world => parseWorld(args.first) but"
     + "\n     world is " + new org.hamcrest.StringDescription().appendValue(this.world).toString()
     + "\n     parseWorld(args.first) is " + new org.hamcrest.StringDescription().appendValue(_parseWorld).toString()
     + "\n     args.first is " + new org.hamcrest.StringDescription().appendValue(_first).toString()
     + "\n     args is " + new org.hamcrest.StringDescription().appendValue(args).toString() + "\n", _doubleArrow);
    
  }
}
