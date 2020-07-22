package com.galvanize.endpoint_checkpoint;

import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("movies")

public class MovieController
{
    @GetMapping("/movie")
    public static Movie getMovie()
    {
        Movie movie = new Movie();
        Credit credit = new Credit();
        Person director = new Person();
        Person star = new Person();
        movie.setTitle("Greyhound");
        movie.setMinutes(91);
        movie.setRating(7.1);
        movie.setMetascore(63);
        movie.setDescription("Follows a US Navy Commander on his first war-time assignment in command of a multi-national" +
                " group defending a merchant ship convoy under attack by submarines in early-1942 during the Battle of the Atlantic, only" +
                " months after the U.S. officially entered World War II.");
        movie.setVotes(4224);
        movie.setGross(3232);
        movie.setYear("2020");
        director.setRole("Director");
        director.setFirstName("Aaron");
        director.setLastName("Schneider");
        star.setRole("Star");
        star.setFirstName("Tom");
        star.setLastName("Hanks");

        credit.setPerson(Arrays.asList(director,star));
        movie.setCredit(Arrays.asList(credit));
        return movie;
    }
    @PostMapping("/gross/total")

    public Map<String, Double> getTotal(@RequestBody List<Movie> movies) {
        Map<String, Double> result = new HashMap<String, Double>();
        DecimalFormat df = new DecimalFormat("#.##");

        double sum = 0;

        for (Movie movie : movies) sum += movie.getGross();

        result.put("result", Double.valueOf(df.format(sum)));

        return result;
    }



    }


