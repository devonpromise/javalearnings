package io.javabrains.moviecatalogservice.resources;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import io.javabrains.moviecatalogservice.models.Movie;
import io.javabrains.moviecatalogservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userid}")
    public List<CatalogItem> getCatalog(@PathVariable("userid")  String userId){

        RestTemplate restTemplate = new RestTemplate();
        //Movie movie = restTemplate.getForObject("http://localhost:8081/movies/1", Movie.class);

        List<Rating> ratings= Arrays.asList(
           new Rating("1234", 4),
           new Rating("5678", 5)
        );

        return ratings.stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://localhost:8081/movies/"+ rating.getMovieId(), Movie.class);
            return new CatalogItem( movie.getName(),"Desc", rating.getRating()) ;
        }).collect(Collectors.toList());

//        return ratings.stream().map(rating ->
//
//           //
//            new CatalogItem(movie.getName(),"Desc", rating.getRating());
//
//        )
//        .collect(Collectors.toList());


        // get all rated movie IDs

        // for each movieID, call movie

        // put them all together
//        return Collections.singletonList(
//                new CatalogItem("Transfomer", "Test", 4));
        
    }
}
