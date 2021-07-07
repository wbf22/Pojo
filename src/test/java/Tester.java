import java.io.IOException;
import java.util.ArrayList;

import Pojo.Pojo;
import Pojo.PojoMaker;
import org.junit.jupiter.api.Test;

public class Tester {


  @Test
  public void experiment() throws IOException {
    PojoMaker pojoMaker = new PojoMaker();
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

    System.out.println(pojoMaker.pojoToJson(pojo));
    System.out.println(pojoMaker.buildPojo("Empty", pojo, "src/main/java/generated/pojos", false));
    String json = pojo.toJson();
    System.out.println(json);

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





}
