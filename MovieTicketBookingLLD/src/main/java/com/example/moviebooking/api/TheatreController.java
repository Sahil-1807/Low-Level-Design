package com.example.moviebooking.api;

import com.example.moviebooking.models.Screen;
import com.example.moviebooking.models.Theatre;
import com.example.moviebooking.services.TheatreService;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class TheatreController {
    private final TheatreService theatreService;

    public String createTheatre(@NonNull final String theatreName){
        return theatreService.createTheatre(theatreName).getId();
    }

    public String createScreenInTheatre(@NonNull final String screeName, @NonNull final String theatreId){
        Theatre theatre = theatreService.getTheatre(theatreId);
        return theatreService.createScreenInTheatre(screeName, theatre).getId();
    }

    public String createSeatInScreen(@NonNull final Integer rowNo, @NonNull final Integer seatNo, @NonNull final String screenId){
        final Screen screen = theatreService.getScreen(screenId);
        return theatreService.createSeatInScreen(rowNo, seatNo, screen).getId();
    }
}
