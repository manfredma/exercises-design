package manfred.exercises.design.other.frontcontroller;

/**
 * 前端控制器模式演示类，展示前端控制器统一处理请求并路由到对应视图的流程。
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
