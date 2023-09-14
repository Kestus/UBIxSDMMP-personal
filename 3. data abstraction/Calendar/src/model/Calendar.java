package model;

import org.junit.Test;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calendar {
    private Date currentDate;
    private String email;
    private List<Entry> entryList;

    public Calendar(Date currentDate, String email){
        this.currentDate = currentDate;
        this.email = email;
        this.entryList = new ArrayList<>();
    }

    // GETTERS
    public Date getCurrentDate() {
        return currentDate;
    }
    public String getEmail() {
        return email;
    }
    public List<Entry> getEntryList(){
        return entryList;
    }
    public List<String> getEntryNames(){
        return entryList.stream().map(Entry::getLabel).collect(Collectors.toList());
    }
    public List<Meeting> getMeetings(){
        List<Meeting> meetingsList = new ArrayList<>();
        for (Entry entry : entryList){
            if (entry instanceof Meeting){
                meetingsList.add((Meeting) entry);
            }
        }
        return meetingsList;
    }


    public void addEntry(Entry entry){
        if (!entryList.contains(entry)){
            entryList.add(entry);
        }
    }
    public void removeEntry(Entry entry){
        if (entryList.contains(entry)){
            entryList.remove(entry);
        }
    }

    public Entry getEntryByName(String name){
        for (Entry entry : entryList){
            if (entry.getLabel().equals(name)){
                return entry;
            }
        }
        return null;
    }
    public Entry getFirstEntry(){
        return entryList.iterator().next();
    }
    public Entry getSoonestEntry(){
        return sortEntries().iterator().next();
    }

    private List<Entry> sortEntries(){
        List<Entry> unsortedList = entryList;
        List<Entry> sortedList = new ArrayList<>();

        while (unsortedList.size() != 0){
            Entry earliestEntry = unsortedList.iterator().next();

            for (Entry entry : unsortedList) {
                if (entry.getTime().getTimeValue() < earliestEntry.getTime().getTimeValue()){
                    earliestEntry = entry;
                }
            }

            sortedList.add(earliestEntry);
            unsortedList.remove(earliestEntry);
        }

        return sortedList;
    }



}
