package objectwithspring.webservice;

import objectwithspring.business.ReservationService;
import objectwithspring.util.DateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebServiceController {
    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    public WebServiceController(DateUtils dateUtils, ReservationService reservationService) {
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
    }
}
