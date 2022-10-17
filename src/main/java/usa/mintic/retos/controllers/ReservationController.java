package usa.mintic.retos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import usa.mintic.retos.model.Reservation;
import usa.mintic.retos.model.reports.Status;
import usa.mintic.retos.model.reports.Clients;
import usa.mintic.retos.services.ReservationService;

import java.util.List;

@RestController
@RequestMapping("api/Reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation c){
        return reservationService.save(c);
    }

    @GetMapping("/report-dates/{dateA}/{dateB}")
    public List<Reservation> getByDates(@PathVariable("dateA")String da,@PathVariable("dateB")String db ){
        return reservationService.getReservationsByPeriod(da,db);
    }
    @GetMapping("/report-status")
    public Status getByStatus(){
        return reservationService.getReportByStatus();
    }
    @GetMapping("/report-clients")
    public List<Clients> getTopClients(){
        return reservationService.getTopclients();
    }





}
