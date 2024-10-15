package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_object()
    {
        Team t1 = new Team();
        assertTrue(t1.equals(t1));
    }

    @Test
    public void different_classes()
    {
        Team t1 = new Team();
        String str = "Not a team";
        assertTrue(!t1.equals(str));
    }

    @Test
    public void both_name_and_members_match()
    {
        Team t1 = new Team();
        t1.setName("Team A");
        t1.addMember("Alice");

        Team t2 = new Team();
        t2.setName("Team A");
        t2.addMember("Alice");

        assertTrue(t1.equals(t2));
    }

    @Test
    public void only_names_match()
    {
        Team t1 = new Team();
        t1.setName("Team A");
        t1.addMember("Alice");

        Team t2 = new Team();
        t2.setName("Team A");
        t2.addMember("Bob");

        assertTrue(!t1.equals(t2));
    }

    @Test
    public void only_members_match()
    {
        Team t1 = new Team();
        t1.setName("Team A");
        t1.addMember("Alice");

        Team t2 = new Team();
        t2.setName("Team B");
        t2.addMember("Alice");

        assertTrue(!t1.equals(t2));
    }

    @Test
    public void neither_match()
    {
        Team t1 = new Team();
        t1.setName("Team A");
        t1.addMember("Alice");

        Team t2 = new Team();
        t2.setName("Team B");
        t2.addMember("Bob");

        assertTrue(!t1.equals(t2));
    }

    @Test
    public void hash_code_check()
    {
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

}