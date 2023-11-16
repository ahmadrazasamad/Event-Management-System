package eventManSys;

import java.util.ArrayList;
import java.util.List;

public class Festival {

    private String festivalName, festivalDate;
    static int totalNoOfAttendees = 0;
    List<Stage> stageList = new ArrayList();
    List<Artist> artistList = new ArrayList();
    List<Attendee> attendeeList = new ArrayList();

    public Festival(String festivalName, String festivalDate) {
        this.festivalName = festivalName;
        this.festivalDate = festivalDate;
    }

//    Getters and Setters
    public String getFestivalName() {
        return festivalName;
    }

    public String getFestivalDate() {
        return festivalDate;
    }

    public void setFestivalName(String festivalName) {
        this.festivalName = festivalName;
    }

    public void setFestivalDate(String festivalDate) {
        this.festivalDate = festivalDate;
    }

    public void addArtist(Artist artist) {
        artistList.add(artist);
    }

    public void addStage(Stage stage) {
        stageList.add(stage);
    }

    public void generateSchedule() { // it is like a menu of the festival
        System.out.println(festivalName + " Schedule: ");
        for (Stage stage : stageList) {
            System.out.println("Stage Name: " + stage.getStageName() + "\nStage Location: " + stage.getLocation() + "\nCapacity: " + stage.getCapacity());

            System.out.println("Scheduled Performances: ");

            for (Artist artist : artistList) {
                if (artist.getStage() == stage) {
                    System.out.println("Artist: " + artist.getArtistName() + "\nGenre: " + artist.getGenre() + "\nAlbum: " + artist.getAlbum());
                }
            }
        }
    }

    public void sellTicket(Attendee attendee) {
        attendeeList.add(attendee);
        totalNoOfAttendees++;
    }

    public void printListOfAttendees() { // printing attendee details
        for (Attendee attendee : attendeeList) {
            System.out.println("o}" + attendee.getAttendeeName() + " - " + attendee.getEmail());
        }
    }

    public static void printTotalNoOfAttendees() {
        System.out.println("The total number of attendees are " + totalNoOfAttendees);
    }
}
