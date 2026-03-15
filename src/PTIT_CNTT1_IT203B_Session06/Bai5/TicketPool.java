package PTIT_CNTT1_IT203B_Session06.Bai5;

import java.util.ArrayList;
import java.util.List;

public class TicketPool {
    String roomName;
    List<Ticket> tickets;

    public TicketPool(String roomName, int capacity){
        this.roomName = roomName;
        tickets = new ArrayList<>();

        for (int i=1; i<=capacity; i++){
            String id = roomName + " - " + String.format("%03d",i);
            tickets.add(new Ticket(id, roomName));
        }
    }

    //vé giữ, ghi lại tgian hết hạn
    public synchronized Ticket holdTicket(String counterName, boolean isVIP){
        long now = System.currentTimeMillis();

        for (Ticket t : tickets){
            if (!t.isSold() && !t.isHeld()){
                t.setHeld(true);
                t.setVIP(isVIP);
                t.setHeldBy(counterName);
                t.setHoldExpiryTime(now + 5000);

                System.out.println(counterName+": Đã giữ vé "+t.getTicketId()+(isVIP ? " (VIP)":"")+  ". Thanh toán trong 5s");
                return t;
            }
        }
        return null;
    }

    // bán vé đang giữ (khi khách thanh toán)
    public synchronized boolean sellHeldTicket(Ticket t, String counterName){
        if (t != null && t.isHeld() && counterName.equals(t.getHeldBy())){
            t.setSold(true);
            t.setHeld(false);
            System.out.println(counterName+": Thanh toán thành công vé "+t.getTicketId());
            return true;
        }
        return false;
    }

    //trả các vé hết hạn giữ
    public  synchronized void releaseExpiredTickets(){
        long now = System.currentTimeMillis();
        for (Ticket t: tickets){
            if (t.isHeld() && now > t.getHoldExpiryTime()){
                t.setHeld(false);
                t.setHeldBy(null);

                System.out.println("TimeoutManager: Vé " + t.getTicketId() + " hết hạn giữ, đã trả lại kho");
            }
        }
    }
}
