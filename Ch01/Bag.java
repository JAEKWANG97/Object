public class Bag {

    public Bag(long amount) {
        this(null,amount);
    }

    public Bag(Invitation invitation , long amount){
        this.invitation = invitation;
        this.amount = amount;
    }
    private Long amount;
    private final Invitation invitation;
    private Ticket ticket;

    public Long hold(Ticket ticket){
        if(hasInvitation()){
            setTicket(ticket);
            return 0L;
        }else{
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }

    }

    public boolean hasInvitation(){
        return invitation != null;
    }

    public boolean hasTicket(){
        return ticket != null;
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmout(Long amount) {
        this.amount += amount;
    }
}
