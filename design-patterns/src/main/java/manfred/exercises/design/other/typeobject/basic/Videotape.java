package manfred.exercises.design.other.typeobject.basic;

/**
 * 录像带类，持有对 Movie 类型对象的引用。
 * 代表可被租借的具体物品，通过类型对象共享电影属性数据。
 */
public class Videotape {

    private final Movie movie;

    private Customer renter;

    private boolean isRented = false;

    public Videotape(Movie movie) {
        this.movie = movie;
    }

    public void rentTo(Customer customer) {
        System.out.println(customer.getName() + " rental " + movie.getTitle());
        isRented = true;
        this.renter = customer;
        renter.chargeForRental(this.movie.getRentalPrice());
    }

    public Customer getRenter() {
        return renter;
    }

    public Movie getMovie() {
        return movie;
    }

    public boolean isRented() {
        return isRented;
    }
}
