package tracker;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackerController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/intervals")
    public Interval[] intervals() {
        return new Interval[]{
            new Interval(counter.incrementAndGet(), 9, 10, 12, 15),
            new Interval(counter.incrementAndGet(), 12, 45, 16, 0),
            new Interval(counter.incrementAndGet(), 16, 15, 17, 45)
        };
    }
}
