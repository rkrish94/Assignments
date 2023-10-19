package week6.day1;

import org.testng.annotations.Test;

public class LearnPriority {
  @Test(priority=1)
  public void edit() {
	  System.out.println("edit");
  }
  @Test(priority=3)
  public void create() {
	  System.out.println("create");
  }
  @Test(priority=0)
  public void merge() {
	  System.out.println("merge");
  }
  @Test(priority=2)
  public void duplicate() {
	  System.out.println("duplicate");
  }
  @Test(priority=-1)
  public void update() {
	  System.out.println("update");
  }
  @Test(priority=4)
  public void delete() {
	  System.out.println("delete");
  }
}
