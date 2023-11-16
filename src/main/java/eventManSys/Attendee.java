package eventManSys;

public class Attendee {

    private String attendeeName, email, ticketType;

    public Attendee(String attendeeName, String email, String ticketType) {
        this.attendeeName = attendeeName;
        this.email = email;
        this.ticketType = ticketType;
    }

//    Getters and Setters
    public String getAttendeeName() {
        return attendeeName;
    }

    public String getEmail() {
        return email;
    }

    public String getticketType() {
        return ticketType;
    }

    public void setAttendeeName(String attendeeName) {
        this.attendeeName = attendeeName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
}
