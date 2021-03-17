package theory.java.generics;

import lombok.extern.slf4j.Slf4j;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

@Slf4j
public class TeamTest {

    Team<FootballPlayer> footballFirstTeam = new Team<>("first football");
    Team<FootballPlayer> footballSecondTeam = new Team<>("second football");

    @Test
    void matchResult() {
        footballFirstTeam.matchResult(footballSecondTeam, 2, 0);
        MatcherAssert.assertThat("The team should have one win", footballFirstTeam.won, Matchers.equalTo(1));
        log.info("The team should have one win");
        MatcherAssert.assertThat("The team should have one defeat", footballSecondTeam.lost, Matchers.equalTo(1));
        log.info("The team should have one defeat");
    }
}