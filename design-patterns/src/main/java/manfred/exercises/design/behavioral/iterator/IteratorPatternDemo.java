package manfred.exercises.design.behavioral.iterator;

/**
 * 迭代器模式演示：通过迭代器顺序访问名字仓库中的所有元素。
 */
public class IteratorPatternDemo {

   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();

      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      }
   }
}
