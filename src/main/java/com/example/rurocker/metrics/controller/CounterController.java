package com.example.rurocker.metrics.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rurocker.metrics.dto.CounterDto;

import io.micrometer.core.annotation.Timed;

/**
 * Controller for counter.
 * 
 * @author ricky
 *
 */
@RestController
public class CounterController {

	private AtomicInteger atomicInteger = new AtomicInteger();

	@Timed(value = "get.counter.requests", histogram = true, percentiles = { 0.95, 0.99 }, extraTags = { "version",
			"v1" })
	@GetMapping(path = "/counter")
	public CounterDto getCounter(@RequestParam("message") String message) {
		CounterDto dto = new CounterDto();
		dto.setMessage(message);
		dto.setCounter(atomicInteger.incrementAndGet());
		dto.setTimestamp(System.currentTimeMillis());
		return dto;
	}
}
