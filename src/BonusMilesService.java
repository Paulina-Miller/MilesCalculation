public class BonusMilesService {

    public int calculate(int ticketPrice) {
        if (ticketPrice < 0) {
            ticketPrice = 0;
        }
        return ticketPrice / 20;
    }

}
