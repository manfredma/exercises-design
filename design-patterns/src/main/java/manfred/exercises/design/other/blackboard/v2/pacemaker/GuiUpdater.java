package manfred.exercises.design.other.blackboard.v2.pacemaker;

/**
 * GUI 更新器，在指定的更新间隔内启动线程持续刷新界面数据。
 */
public class GuiUpdater implements Runnable {
    public static final int UPDATE_INTERVAL = 500;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(UPDATE_INTERVAL);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            PacemakerController.updateGUI();
        }
    }
}
