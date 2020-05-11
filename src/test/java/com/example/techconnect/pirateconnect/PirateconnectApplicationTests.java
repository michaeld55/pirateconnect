package com.example.techconnect.pirateconnect;

import com.example.techconnect.pirateconnect.models.Pirate;
import com.example.techconnect.pirateconnect.models.Raid;
import com.example.techconnect.pirateconnect.models.Ship;
import com.example.techconnect.pirateconnect.repositories.PirateRepository;
import com.example.techconnect.pirateconnect.repositories.RaidRepository;
import com.example.techconnect.pirateconnect.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateconnectApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate(){
		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);

		Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
		pirateRepository.save(pirate1);

		Raid raid1 = new Raid("Tortuga", 100);
		raidRepository.save(raid1);

		raid1.addPirate(pirate1);
		pirate1.addRaid(raid1);

		pirateRepository.save(pirate1);
		raidRepository.save(raid1);
	}

}
