package baac.ig;

import java.util.Hashtable;
import java.util.Map;

public class TestMarchandise {

	public static void main(String[] args) {
		Hashtable<Long, String >mapMarchandise  = new Hashtable<Long,String >();
		mapMarchandise.put(20L,"CHIPS");
		mapMarchandise.put(19L,"BONBON");
		mapMarchandise.put(18L,"CHIC");
		mapMarchandise.put(17L, "SUCRE");
		mapMarchandise.put(16L, "FRUIT");
		mapMarchandise.put(15L, "SAVON");
		mapMarchandise.put(14L, "SERVIETTE");
		mapMarchandise.put(13L, "SAC");
		mapMarchandise.put(12L, "SARDINNE");
		mapMarchandise.put(11L, "PILCHARD");
		mapMarchandise.put(10L, "NIDO");
		mapMarchandise.put(9L, "ORANGE");
		mapMarchandise.put(8L, "POMME");
		mapMarchandise.put(7L, "RAISIN");
		mapMarchandise.put(6L, "PATATE");
		mapMarchandise.put(5L, "CERES");
		mapMarchandise.put(4L, "FRUITICANA");
		mapMarchandise.put(3L, "SEL");
		mapMarchandise.put(2L, "POIVRE");
		mapMarchandise.put(1L, "NEOCODIAN");
	for (Map.Entry mapentry : mapMarchandise.entrySet()) {
		if(mapentry.getValue().equals("PILCHARD"))
		System.out.println("cle:" +mapentry.getKey()
		+" | valeur : " + mapentry.getValue());

	}
	}
}
