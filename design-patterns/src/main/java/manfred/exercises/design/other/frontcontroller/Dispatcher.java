package manfred.exercises.design.other.frontcontroller;

/**
 * 分发器，根据请求类型将请求派发到对应的视图进行处理。
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
