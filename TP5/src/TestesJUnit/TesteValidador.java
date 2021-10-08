package TestesJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Interface.Validador;

class TesteValidador {
	Validador val = new Validador();	
	@Test
	void testValidaCpf() {
		assertTrue(val.validaCpf("34278101007"));
		assertFalse(val.validaCpf("00000000000"));
		assertFalse(val.validaCpf("342781010073"));
		assertFalse(val.validaCpf("3427810100"));
	}

	@Test
	void testValidaId() {
		assertTrue(val.validaId("098"));
		assertFalse(val.validaId("2"));
		assertFalse(val.validaId("31"));
		assertFalse(val.validaId("0201"));
	}

	@Test
	void testValidaGenero() {
		assertTrue(val.validaGenero('F'));
		assertTrue(val.validaGenero('M'));
		assertFalse(val.validaGenero('a'));
		assertFalse(val.validaGenero('B'));
		assertFalse(val.validaGenero('1'));
	}

	@Test
	void testValidaTamanho() {
		assertTrue(val.validaTamanho("PP"));
		assertTrue(val.validaTamanho("P"));
		assertTrue(val.validaTamanho("M"));
		assertTrue(val.validaTamanho("G"));
		assertTrue(val.validaTamanho("GG"));
		assertFalse(val.validaTamanho("dd"));
		assertFalse(val.validaTamanho("D"));
		assertFalse(val.validaTamanho("1"));
	}

}
