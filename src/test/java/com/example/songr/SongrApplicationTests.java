package com.example.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;

@SpringBootTest
class SongrApplicationTests {

	/*-------------class11---------*/
	Album a=new Album("Anti","Rihanna",13,2616,"https://upload.wikimedia.org/wikipedia/en/3/32/Rihanna_-_Anti.png");
	@Test
	void testInGetter() {
		String ExpectedTitle="Anti";
		String ExpectedArtist="Rihanna";
		int ExpectedSongCount=13;
		int ExpectedLength=2616;
		String ExpectedImageUrl="https://upload.wikimedia.org/wikipedia/en/3/32/Rihanna_-_Anti.png";
		assertEquals(ExpectedTitle,a.getTitle());
		assertEquals(ExpectedArtist,a.getArtist());
		assertEquals(ExpectedSongCount,a.getSongCount());
		assertEquals(ExpectedLength,a.getLength());
		assertEquals(ExpectedImageUrl,a.getImageUrl());

	}
	@Test
	void testInSetter() {

		a.setTitle("A");
		a.setArtist("R");
		a.setSongCount(1);
		a.setLength(2);
		a.setImageUrl("htt");
		String ExpectedTitle="A";
		String ExpectedArtist="R";
		int ExpectedSongCount=1;
		int ExpectedLength=2;
		String ExpectedImageUrl="htt";

		assertEquals(ExpectedTitle,a.getTitle());
		assertEquals(ExpectedArtist,a.getArtist());
		assertEquals(ExpectedSongCount,a.getSongCount());
		assertEquals(ExpectedLength,a.getLength());
		assertEquals(ExpectedImageUrl,a.getImageUrl());

	}
/*------------------------------------------------------------------------------------------*/
}
