package programmer.zama.now.application;

import programmer.zama.now.data.Application;
import programmer.zama.now.data.Constant;
import programmer.zama.now.data.Country;
import programmer.zama.now.util.MathUtil;

// Belajar Static Keyword (ini cara manggilnya )
public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.Application);
        System.out.println(Constant.Version);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city= new Country.City();
        city.setName("Subang");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);

    }

}
