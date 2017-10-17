package com.darwinit.learning.assertj;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static com.darwinit.learning.assertj.DummyAssert.assertThat;

public class DummyTest {

	@Test
	public void test() {
		assertThat(new Dummy()).isNotNull();
	}

	@Test
	public void assignValue() {
		Dummy dummy=new Dummy();
		dummy.setValue(10);
		assertThat(dummy).hasValue(10).hasValue2(0);
	}
	
}
