package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        // TODO: Replace Chris G. with your name as shown on
        // <https://bit.ly/cs156-f24-teams>
        assertEquals("Shivani M.", Developer.getName());
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    
    @Test
    public void getGithubId_returns_correct_githubId() 
    {
	assertEquals("shivanimadhan", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f24-13", t.getName());
	assertTrue(t.getMembers().contains("Shivani M."), "Team should contain Shivani M.");
	assertTrue(t.getMembers().contains("Emily Z."), "Team should contain Emily Z.");
	assertTrue(t.getMembers().contains("Anvitha K."), "Team should contain Anvitha K.");
	assertTrue(t.getMembers().contains("Steven J."), "Team should contain Steven J.");
	assertTrue(t.getMembers().contains("Andy S."), "Team should contain Andy S.");
	assertTrue(t.getMembers().contains("David Q."), "Team should contain David Q.");
    }
}
