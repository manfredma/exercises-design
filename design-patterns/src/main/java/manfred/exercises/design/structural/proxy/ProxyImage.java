package manfred.exercises.design.structural.proxy;

/**
 * 代理模式 - 图像代理类，延迟加载真实图像，仅在首次显示时才加载。
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
