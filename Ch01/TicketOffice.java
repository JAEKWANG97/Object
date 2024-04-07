import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount , Ticket ... tickets){
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellTicketTo(Audience audience) {
        plusAmout(audience.buy(getTicket()));

    }

    public Ticket getTicket(){
        return tickets.remove(0);
    }

    private void minusAmout(Long amout){
        this.amount -= amount;
    }

    private void plusAmout(Long amount) {
        this.amount += amount;
    }


}
