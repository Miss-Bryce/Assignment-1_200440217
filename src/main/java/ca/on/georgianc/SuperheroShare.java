package ca.on.georgianc;

public class SuperheroShare {

    private String superhero;
    private int percentageShare;

    public SuperheroShare (String superhero,int percentageShare){
        setSuperHero(superhero);
        setPercentageShare(percentageShare);
    }

    public String getSuperhero() {
        return superhero;
    }

    public void setSuperHero(String superHero) {
        this.superhero = superHero;
    }

    public int getPercentageShare() {
        return percentageShare;
    }

    public void setPercentageShare(int percentageShare) {
        this.percentageShare = percentageShare;
    }

    @Override
    public String toString() {
        return "SuperheroShare{" +
                "superhero='" + superhero + '\'' +
                ", percentageShare=" + percentageShare +
                '}';
    }
}
