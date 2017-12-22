package org.itsimulator.germes.app.rest.service;

import java.util.List;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.test.JerseyTest;
import org.itsimulator.germes.app.rest.service.config.JerseyConfig;
import org.junit.Test;
import static org.junit.Assert.*;

import jersey.repackaged.com.google.common.collect.Lists;


public class CityResourceTest extends JerseyTest {

	protected Application configure() {
		return new JerseyConfig();
	}
	
	@Test
	public void testFindSitiesSuccess() {
		List<?> cities = target("cities").request().get(List.class);
		assertNotNull(cities);
		assertTrue(cities.contains("Odessa"));
		assertTrue(cities.contains("Kiyv"));
	}
}
