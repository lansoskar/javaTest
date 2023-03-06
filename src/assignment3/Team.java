package assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Team {
   private ArrayList<TeamMember> members = new ArrayList<>();

    /**
     * 
     * @param m an instance of TeamMember
     * Adds a teammember to the instance field members
     */
    public void addTeamMember(TeamMember m) {
        //TODO Delete line below, and implement this method
        members.add(m);
    }
    
    // Nothing to do here!
    public void addTeamMembers(ArrayList<TeamMember> t) {
        members.addAll(t);
    }
    
    // Nothing to do here!
    public ArrayList<TeamMember> getAllMembers() {
        return members;
    }
    
    /**
     * 
     * @param m the TeamMember to remove
     * @return if a TeamMember was removed
     */
    public boolean removeTeamMember(TeamMember m){
        //TODO Delete line below, and implement this method
        members.remove(m);
        System.out.println(m + " was removed");
        return true;
    }

    /**
     * 
     * @return the next available id
     * The id must start at 0. If a member is removed from the list,
     * the id must be freed for the next member.
     * The next id must always be the smallest possible id number
     * 
     * * This is hard. Skip this for now if you don't know how to do it
     */
    
    public int getNextId() {
        //TODO Delete line below, and implement this method
        throw new UnsupportedOperationException();


    }

    /**
     * 
     * @param role, a String representing the role of the TeamMember
     * @return an ArrayList of all TeamMember that has the specified role
     */
    public ArrayList<TeamMember> retriveMembersByRole(String role) {
        //TODO Delete line below, and implement this method
        ArrayList<TeamMember> filteredByRole = new ArrayList<>();
        for (TeamMember x: members) {
            if (Objects.equals(role, x.getRole())) { // tjekker for match
                filteredByRole.add(x);
            }
        }
        return filteredByRole;
    }

    /**
     * Sort the TeamMember list in ascending order by name
     * * This is hard. Skip this for now if you don't know how to do it
     */
    public void sortByNameAsc() {
        //TODO Delete line below, and implement this method
        Collections.sort(members, new Comparator<TeamMember>() {
            @Override
            public int compare(TeamMember o1, TeamMember o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }); // laver collections sort og comparator på names
    }

    /**
     * Sort the TeamMember list in descending order by role
     * 
     * * This is hard. Skip this for now if you don't know how to do it
     */
    public void sortByRoleDesc() {
        //TODO Delete line below, and implement this method
        Collections.sort(members, new Comparator<TeamMember>() {
            @Override
            public int compare(TeamMember o1, TeamMember o2) {
                return o2.getRole().compareTo(o1.getRole());
            }
        }); // laver collections sort og comparator på roles, omvendt for at få descending
    }
    
}
