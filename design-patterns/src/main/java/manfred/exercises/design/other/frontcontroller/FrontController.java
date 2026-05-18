package manfred.exercises.design.other.frontcontroller;

/**
 * 前端控制器，集中处理所有请求的入口点。
 * 负责请求跟踪、用户身份验证，并将验证通过的请求转发给分发器。
 */
public class FrontController {

    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request) {
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
