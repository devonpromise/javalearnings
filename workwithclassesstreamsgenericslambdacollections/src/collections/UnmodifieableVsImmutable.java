package collections;

import java.util.*;

public class UnmodifieableVsImmutable {

    public static void main(String[] args){
        Map<String, Integer > mutableCountryToPopulation = new HashMap<>();
        mutableCountryToPopulation.put("UK", 67);
        mutableCountryToPopulation.put("USA", 328);

        Map<String, Integer> unmodifiableCountryToPop = Collections.unmodifiableMap(mutableCountryToPopulation);

        Map<String, Integer> copiedCountryToPop = Map.copyOf(mutableCountryToPopulation);

        System.out.println("copiedCountry  = " + copiedCountryToPop);
      //  copiedCountryToPop.put("Germany", 83)    ;
        System.out.println("UnmodifiableCountryToPop = " + unmodifiableCountryToPop);
        mutableCountryToPopulation.put("Germany", 83);
        System.out.println("copiedCountry  = " + copiedCountryToPop);
        System.out.println("UnmodifiableCountryToPop = " + unmodifiableCountryToPop);

        Map<String, Integer> countryToPopulation = Map.of("UK", 67, "USA", 382);
        System.out.println("countryToPopulation = " + countryToPopulation);


        //Empty Collections
        List<String> list = Collections.emptyList();
        Map<Integer, String> map = Collections.emptyMap();
        Set<Integer> set = Collections.emptySet();

        //Singletons - immutable single value collections
            // use when you want to pass a single value to a method that takes a collection
        List<String> list1 = Collections.singletonList("one");
        Map<Integer, String> map1 = Collections.singletonMap(1, "one");
        Set<Integer> set1 = Collections.singleton(1);

        //Collections factories
        List<String> list2 = List.of("UK", "USA");

        //Immutable copies//
        //Modifying countries does not modify immutableCountries
        Collection<String> countries = new ArrayList<>();
        countries.add("UK");
        countries.add("USA");

        List<String> immutableCountries = List.copyOf(countries);

        Map<String, Integer> populations = new HashMap<>();
        populations.put("UK", 67); populations.put("USA", 328);

        Map<String, Integer> immutablePopulations = Map.copyOf(populations);

        //UnmodifiableViews
        // Modifying countries is the only way to modify countriesView
        List<String> countries1 = new ArrayList<>();
        countries1.add("UK"); countries1.add("USA");

        List<String> countriesView = Collections.unmodifiableList(countries1);


    }
}
