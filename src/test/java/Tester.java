import java.io.IOException;
import java.util.ArrayList;

import Pojo.Pojo;
import Pojo.PojoMaker;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {


  @Test
  public void experiment() throws IOException {
    var num1 = new var(1);
    var num2 = new var(2);
    var num3 = num1.add(num2);

    var pojo = new var(new Pojo("random", "junk"));
    var pojo2 = new var(new Pojo("random", "junk2"));
//    var pojo3 = pojo.add(pojo2);

  }

  @Test
  public void testEachType(){
    Pojo pojo = new Pojo("var", String.class);
    pojo.set("b", true);
    pojo.set("c", 'b');
    pojo.set("by", (byte) 0);
    pojo.set("sh", (short) 0);
    pojo.set("in", 0);
    pojo.set("l", 1L);
    pojo.set("f", 1f);
    pojo.set("d", 2d);
    pojo.set("s", "hello");

    System.out.println(pojo);

  }

  @Test
  public void typicalUseTest() throws IOException {
    Pojo student = new Pojo("fullName", String.class, "age", int.class, "grade", int.class, "ageInMilliseconds", long.class);
    student.build("Student", true);

  }

  @Test
  public void typicalUseTest2() throws IOException {
    Pojo student = new Pojo("fullName", "Bradly Davis", "age", 1, "grade", 1, "ageInMilliseconds", 20000000);
    System.out.println(student);
    int age = student.getInt("age");
    System.out.println("age=" + age);
    System.out.println(student.toJsonPretty());

  }

  @Test
  public void typicalUseTest3(){
    Pojo student1 = new Pojo("fullName", "Bradly Davis", "age", 1, "grade", 1, "ageInMilliseconds", 10000000);
    Pojo student2 = new Pojo("fullName", "John Johnson", "age", 3, "grade", 1, "ageInMilliseconds", 30000000);
    Pojo student3 = new Pojo("fullName", "Sam Kelper", "age", 2, "grade", 1, "ageInMilliseconds", 20000000);
    Pojo student4 = new Pojo("fullName", "Harry Dungun", "age", 16, "grade", 1, "ageInMilliseconds", 160000000);
    Pojo student5 = new Pojo("fullName", "Kelsie Davis", "age", 5, "grade", 1, "ageInMilliseconds", 50000000);
    Pojo student6 = new Pojo("fullName", "Chelsie Monson", "age", 3, "grade", 1, "ageInMilliseconds", 30000000);

    ArrayList<Pojo> students = new ArrayList<>();
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    students.add(student5);
    students.add(student6);

    for (Pojo student : students){
      System.out.println(student.get("fullName"));
    }

  }

  @Test
  public void typicalUseTest4(){
    Pojo student = new Pojo("fullName", "Bradly Davis", "age", null, "grade", 1, "ageInMilliseconds", 10000000);
    Pojo student1 = student.getBlankOfThisPojo();
    student1.set("fullname", "Darly Cunnings", "age", 23);
    Pojo student2 = student.getBlankOfThisPojo();
    student2.set("fullname", "Berkly Thompson");

    System.out.println(student);
    System.out.println(student1);
    System.out.println(student2);


  }

  @Test
  public void typicalUseTest5() throws JsonProcessingException {
    Pojo student = new Pojo("fullName", "Bradly Davis", "age", null, "grade", 1, "ageInMilliseconds", 10000000);
    String json = student.toJson();
    Pojo extracted = Pojo.fromJson(json);
    System.out.println(extracted);


  }


  @Test
  public void typicalUseTestVar(){
    var num1 = new var(1.0d);
    var num2 = new var(2.0d);
    var num3 = num1.add(num2);
    var num4 = num1.divideBy(num2);
    var num5 = num1.multiplyBy(num2);
    var num6 = num1.powerOf(num2);
    var num7 = num1.rootOf(num2);
    assertEquals(num3, 3.0d);
    assertEquals(num4, 0.5d);
    assertEquals(num5, 2.0d);
    assertEquals(num6, 1.0d);
    assertEquals(num7, 1.0d);


  }


}
