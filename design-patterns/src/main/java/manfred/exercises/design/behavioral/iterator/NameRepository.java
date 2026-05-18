package manfred.exercises.design.behavioral.iterator;

/**
 * 名字仓库，实现 Container 接口并提供内部迭代器遍历名字数组。
 */
public class NameRepository implements Container {
   public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
         if(index < names.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }
   }
}
