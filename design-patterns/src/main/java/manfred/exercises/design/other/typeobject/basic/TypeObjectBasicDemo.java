package manfred.exercises.design.other.typeobject.basic;

/**
 * 类型对象模式基础示例演示入口。
 * 展示多个 Videotape 实例共享同一个 Movie 类型对象，并分别租借给不同客户的场景。
 */
public class TypeObjectBasicDemo {
    public static void main(String[] args) {
        Customer john = new Customer("John");
        Customer sue = new Customer("Sue");

        // TypeObject - Star Wars, The Terminator, Independence Day
        Movie starWars = new Movie("Star Wars", 100.0);
        Movie terminator = new Movie("The Terminator", 200);
        Movie independenceDay = new Movie("Independence Day", 300);

        Videotape starWarsVideotapeForJohn = new Videotape(starWars);
        starWarsVideotapeForJohn.rentTo(john);
        Videotape starWarsVideotapeForSue = new Videotape(starWars);
        starWarsVideotapeForSue.rentTo(sue);
        Videotape terminatorVideotapeForJohn = new Videotape(terminator);
        terminatorVideotapeForJohn.rentTo(john);
        Videotape independenceDayVideotapeForSue = new Videotape(independenceDay);
        independenceDayVideotapeForSue.rentTo(sue);
    }
}
