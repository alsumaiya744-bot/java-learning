import java.lang.reflect.Field;
public class Injector
 {
     public static void injectDependencies(Object obj) {

        try {

            Class<?> cls = obj.getClass();

            Field[] fields = cls.getDeclaredFields();

            for (Field field : fields) {

                if (field.isAnnotationPresent(Inject.class)) {

                    Class<?> dependencyClass =Class.forName(field.getType().getName());

                    Object dependencyObject = dependencyClass.getDeclaredConstructor().newInstance();

                    field.setAccessible(true);

                    field.set(obj, dependencyObject);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
