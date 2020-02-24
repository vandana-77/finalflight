package flight.flightmanagement;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.corejava.flightdao.FlightDAOImpl;
import com.capgemini.corejava.flightdto.FlightDTO;

public class FlightTest {
	FlightDAOImpl d=null;

	@Before
	public void setup()
	{
		d=new FlightDAOImpl();
	
	}
	
	@Test
	public void test()
	{
		FlightDTO dt=new FlightDTO();
		d.addFlight(dt);
		dt.setFlightNumber(456);
		dt.setFlightModel("indigo");
		dt.setCarrierName("vandy");
		dt.setSeatCapacity(56);
		Collection<FlightDTO> l=d.listFlight();
      		assertEquals(1,l.size());
	}

	}
