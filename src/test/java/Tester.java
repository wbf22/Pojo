import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
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

    System.out.println(pojo.toString());

  }

  @Test
  public void typicalUseTest() throws IOException {
    Pojo student = new Pojo("fullName", String.class, "age", int.class, "grade", int.class, "ageInMilliseconds", long.class);
    student.build("Student", true);

  }

  @Test
  public void typicalUseTest2() throws IOException {
    Pojo student = new Pojo("fullName", String.class, "age", int.class, "grade", int.class, "ageInMilliseconds", long.class);
    student.

  }



}
