package jahv.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/travel")
public class TravelController {

    @RequestMapping("/destiny")
    public List<String> getDestiny() {
        return new ArrayList<String>(Arrays.asList(
                "Mexico",
                "Puebla",
                "DF"));
    }
}
