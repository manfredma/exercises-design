package manfred.exercises.design.other.typeobject.basic;

/**
 * 电影类，作为类型对象（TypeClass）存储电影标题和租赁价格。
 * 多个 Videotape 实例可共享同一个 Movie 类型对象。
 */
public class Movie {

    private final String title;

    private final double rentalPrice;

    public Movie(String title, double rentalPrice) {
        this.title = title;
        this.rentalPrice = rentalPrice;
    }

    public String getTitle() {
        return title;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

}
