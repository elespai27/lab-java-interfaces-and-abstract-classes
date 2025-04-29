package VideoStreamingService;

public class TvSeries extends Video{
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "TvSeries{" +
                "episodes=" + episodes +
                "} " + super.toString();
    }
}
