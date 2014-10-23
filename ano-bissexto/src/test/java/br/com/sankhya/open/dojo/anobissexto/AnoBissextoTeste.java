package br.com.sankhya.open.dojo.anobissexto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnoBissextoTeste {
	
	
	private AnoBissexto anoBissexto;

	@Before
	public void init(){
		anoBissexto = new AnoBissexto();
	}
	
	@Test
	public void naoBissexto(){
		assertFalse(anoBissexto.ehBissexto(2011));
		assertFalse(anoBissexto.ehBissexto(1742));
		assertFalse(anoBissexto.ehBissexto(1889));
		assertFalse(anoBissexto.ehBissexto(1951));
		assertFalse(anoBissexto.ehBissexto(1900));
		assertFalse(anoBissexto.ehBissexto(200));
		
		assertFalse(anoBissexto.ehBissexto(-1));
	}

	@Test
	public void ehBissexto(){	
		assertTrue(anoBissexto.ehBissexto(2012));
		assertTrue(anoBissexto.ehBissexto(2000));
		assertTrue(anoBissexto.ehBissexto(1600));
		assertTrue(anoBissexto.ehBissexto(1732));
		assertTrue(anoBissexto.ehBissexto(1888));
		assertTrue(anoBissexto.ehBissexto(1944));
		assertTrue(anoBissexto.ehBissexto(2008));
		assertTrue(anoBissexto.ehBissexto(500*400));
		assertTrue(anoBissexto.ehBissexto(80*400));
		assertTrue(anoBissexto.ehBissexto(-400));
		assertTrue(anoBissexto.ehBissexto(-800));
	}
}
