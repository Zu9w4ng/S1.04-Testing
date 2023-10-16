package testing.n1ex1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.n1ex1.MonthList;

public class MonthListTest {

	MonthList monthlist;
	@BeforeEach
	void setUp() {
		monthlist = new MonthList();
	}
	
	@Test
	@DisplayName ("La llista no és nul·la")
	void testNull() {
		assertNotNull(monthlist.getMONTHS());
	}
	
	@Test
	@DisplayName ("La llista té 12 posicions")
	void testPositions() {
		assertEquals(12, monthlist.getMONTHS().size());
	}
	
	@Test
	@DisplayName ("Agost està a la posició 7 de la llista")
	void testAugust() {
		assertEquals("August", monthlist.getMONTHS().get(7));
	}
	
}
