package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        // TODO: Change this to your name
        // You may use just the name that is used on <https://bit.ly/cs156-f24-teams>
        // i.e. your first name, or your first and initial of last name

        return "Shivani M.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        // TODO: Change this to your github id
        return "shivanimadhan";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        // TODO: Change this to your team name
        Team team = new Team("f24-13");
        team.addMember("Andy S.");
        team.addMember("Emily Z.");
        team.addMember("Shivani M.");
        team.addMember("David Q.");
        team.addMember("Steven J.");
        team.addMember("Anvitha K.");
        return team;
    }
}
