package eventManSys;

public class EventSystem {

    public static void main(String[] args) {
        Festival festival = new Festival("Coachella Music Festival", "2nd Nov, 2023");

        Stage stage = new Stage("Sahara Tent", "Coachella Valley", 420);

        Artist artist = new Artist("Artist name", "genre", "album");
        artist.setStage(stage);

        festival.addArtist(artist);
        festival.addStage(stage);
        
        festival.generateSchedule();

        Attendee attendee1 = new Attendee("Me", "me@eamail.com", "Regular");
        Attendee attendee2 = new Attendee("My friend", "friend@gmail.com", "VIP");
        
        festival.sellTicket(attendee1);
        festival.sellTicket(attendee2);
        
        festival.printListOfAttendees();
        Festival.printTotalNoOfAttendees();
    }
}
