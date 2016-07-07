package jahv.springboot.service;

import org.springframework.stereotype.Service;

/**
 * Created by ahernandez on 7/7/16.
 */
@Service
public class CalculatorService {

    public int add(final int a, final int b) {
        return a + b;
    }
}
