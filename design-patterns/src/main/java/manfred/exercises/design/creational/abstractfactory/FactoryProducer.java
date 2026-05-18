package manfred.exercises.design.creational.abstractfactory;

/**
 * 工厂生产者，根据选择返回对应的具体工厂实例。
 */
public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
      } else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      return null;
   }
}
