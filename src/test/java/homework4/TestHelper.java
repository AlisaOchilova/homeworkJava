package homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public class TestHelper {
    public static void main(String[] args){

        Cat cat1 = new Cat(AnymalsType.CAT);
        Cat cat2 = new Cat(AnymalsType.CAT1);

        Dog dog1 = new Dog(AnymalsType.DOG);
        Dog dog2 = new Dog(AnymalsType.DOG1);

        List list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);
        list.add(dog1);
        list.add(dog2);

        Set set = new HashSet(list);


        HashSet<Abc> set = new HashSet<Abc>();
        for (int i = 0; i < 10; i++)
            set.add(new Abc());
        System.out.println(set.contains(new Abc()));


        Map map = new HashMap();
        map.put(“Кошка”, cat1);
        map.put(“Кошка”, cat2);
        map.put(“Собака”, dog1);
        map.put(“Собака”, dog2);





    };
}
