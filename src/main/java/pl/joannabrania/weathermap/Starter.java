package pl.joannabrania.weathermap;

import pl.joannabrania.weathermap.controllers.MainController;

public class Starter {
    public static void main(String[] args) {

        new MainController().start();               //jest to stworzenie obiektu, ale bez przypisania
     //   long time = 1487246400;
    //    LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(time, 0, ZoneOffset.UTC);
    //    System.out.println(localDateTime.getDayOfWeek());

     //  LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.UTC);
      //System.out.println(localDateTime.getDayOfMonth());
       // LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(0,0,ZoneOffset.UTC);
////        System.out.println(Pattern.matches("[0-9]{2}-[0-9]{3}","32-050"));
//        System.out.println(Pattern.matches("(\\(?(\\+|00)?48\\)?)? ?(([0-9]{3}[ -]?){3})","516-485-012"));
//        System.out.println(Pattern.matches("(\\+?48)? ?[0-9]{9}","48516485012"));
//        System.out.println(Pattern.matches("[A-Z][a-z]{2,} [A-Z][a-z]{2,}","Joanna Brania"));
//        System.out.println(Pattern.matches("[A-Z][a-z]+ [A-Z][a-z]+","Joanna Brania"));
      //  System.out.println(Pattern.matches("[A-Z][a-z]+ [A-Z][a-z]+","J Brania"));/  System.out.println(Pattern.matches("[A-ZŁĆĘĄŻŹÓĆ][a-złćęążźó]{2,36} [A-ZŁĆĘĄŻĆŹÓ][a-złćęążźó]{2,50}+","Łukasz Brania"));
 //    System.out.println(Pattern.matches("\\d" ,"u"));

    }
}
