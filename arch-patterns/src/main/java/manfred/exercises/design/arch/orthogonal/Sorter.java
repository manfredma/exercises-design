package manfred.exercises.design.arch.orthogonal;

/**
 * 正交设计排序工具类，按身高对实现了 {@link Highly} 接口的对象进行冒泡排序。
 */
public class Sorter {

    public static void sortStudentsByHeight(Highly[] highlyArray) {
        for (int y = 0; y < highlyArray.length - 1; y++) {
            for (int x = 1; x < highlyArray.length - y; x++) {
                if (highlyArray[x].getHeight() < highlyArray[x - 1].getHeight()) {
                    swap(highlyArray, x, x - 1);
                }
            }
        }
    }

    private static void swap(Highly[] highlyArray, int index1, int index2) {
        Highly temp = highlyArray[index1];
        highlyArray[index1] = highlyArray[index2];
        highlyArray[index2] = temp;
    }
}
