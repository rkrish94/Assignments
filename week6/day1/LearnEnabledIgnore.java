package week6.day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnEnabledIgnore {
	@Test
	public void edit() {
		System.out.println("edit");
	}

	@Test
	public void create() {
		System.out.println("create");
	}

	@Test
	public void merge() {
		System.out.println("merge");
	}

	@Ignore
	@Test
	public void duplicate() {
		System.out.println("duplicate");
	}

	@Test(enabled=false)
	public void update() {
		System.out.println("update");
	}

	@Test
	public void delete() {
		System.out.println("delete");
	}
}
