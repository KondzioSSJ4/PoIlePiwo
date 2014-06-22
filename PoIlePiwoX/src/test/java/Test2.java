import static org.junit.Assert.*;
import lib.data.Item;

import org.junit.Assert;
import org.junit.Test;


public class Test2 {

	@Test
	public void test() {
		Item it = new Item(-1,"Mas�o","Nabia�","NA","NA",10,(float) 2.70);
		String[] odp = {"-1","Mas�o","Nabia�","NA","NA","10","2.7"};
		Assert.assertArrayEquals(odp, it.getDataAsStrings());
		Assert.assertEquals("Mas�o",it.getNazwa());
		Assert.assertEquals("Nabia�",it.getKategoria());
		Assert.assertEquals((float) 2.7 , it.getCena(),0.001);
	}

}
