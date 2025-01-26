package com.example.moviebooking.api;

import com.example.moviebooking.services.TheatreService;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class TheatreController {
    private final TheatreService theatreService;

    public String createTheatre(@NonNull final String theatreName){
        return theatreService.createTheatre(theatreName).getId();
    }
}
