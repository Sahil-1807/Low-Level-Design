package com.example.moviebooking.api;

import com.example.moviebooking.models.Seat;
import com.example.moviebooking.models.Show;
import com.example.moviebooking.services.BookingService;
import com.example.moviebooking.services.ShowService;
import com.example.moviebooking.services.TheatreService;
import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class BookingController {
    private final ShowService showService;
    private final BookingService bookingService;
    private final TheatreService theatreService;

    public String createBooking(@NonNull final String userId, @NonNull final String showId,
                                @NonNull final List<String> seatsIds) {
        final Show show = showService.getShow(showId);
        final List<Seat> seats = seatsIds.stream().map(theatreService::getSeat).collect(Collectors.toList());
        return bookingService.createBooking(userId, show, seats).getId();
    }
}