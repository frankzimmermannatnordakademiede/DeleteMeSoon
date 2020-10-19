package primes;

import static org.junit.Assert.*;

import org.junit.Test;

import de.nordakademie.primes.PrimeTester;

public class TestPrime {

	private PrimeTester out = new PrimeTester();
	@Test
	public void test() {
		assertFalse(out.isPrime(1));
	}
	
	@Test
	public void test2() {
		assertTrue(out.isPrime(2));
	}
	@Test
	public void test4() {
		assertFalse(out.isPrime(4));
	}
		@Test
	public void test63() {
		assertFalse(out.isPrime(63));
	}
	
	@Test
	public void test67(){
	assertTrue(out.isPrime(67));
	}


}
