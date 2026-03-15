package PTIT_CNTT1_IT203B_Session06.Bai1;

import java.util.ArrayList;
import java.util.List;

public class TicketPool {
    String roomName;
    List<Ticket> tickets;

    public TicketPool(String roomName, int totalTickets) {
        this.roomName = roomName;
        tickets = new ArrayList<>();

        for (int i=1; i <= totalTickets; i++){
            String id = roomName + " - " + String.format("%03d", i);
            tickets.add(new Ticket(id, roomName));
        }
    }

    //bán một vé trong phòng.
    //Nếu còn vé chưa bán thì đánh dấu vé đó là đã bán và trả về vé, nếu hết vé thì trả về null.
    public synchronized Ticket sellTicket(){
        for (Ticket t : tickets){
            if (!t.isSold()){
                t.setSold(true);
                return t;
            }
        }
        return null;
    }

    //đếm xem trong phòng còn bao nhiêu vé chưa bán
    public  int getRemainingTickets(){
        int count = 0;
        for (Ticket t : tickets){
            if (!t.isSold()){
                count++;
            }
        }
        return count;
    }

}
