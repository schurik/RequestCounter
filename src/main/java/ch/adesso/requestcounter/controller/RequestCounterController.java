/**
 * 
 */
package ch.adesso.requestcounter.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author buss
 *
 */
@RestController
public class RequestCounterController {

	private static AtomicInteger counter = new AtomicInteger(0);

	@RequestMapping("/requestcount")
	public String count() {
		return String.format("Requests: %d", counter.incrementAndGet());
	}

}
