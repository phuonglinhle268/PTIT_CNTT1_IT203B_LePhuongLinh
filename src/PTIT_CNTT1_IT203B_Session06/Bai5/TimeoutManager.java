package PTIT_CNTT1_IT203B_Session06.Bai5;

public class TimeoutManager implements Runnable{
    TicketPool[] pools;

    public TimeoutManager(TicketPool[] pools){
        this.pools = pools;
    }

    @Override
    public void run(){
        while (true){
            try {
                for (TicketPool pool : pools){
                    pool.releaseExpiredTickets();
                }
                Thread.sleep(1000);
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
