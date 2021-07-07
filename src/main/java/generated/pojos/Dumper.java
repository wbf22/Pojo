package generated.pojos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Dumper {

  private static BufferedWriter bufferedWriter;

  public static void main(String args[]) throws IOException {

    String outPutFile = "src/main/java/generated/pojos" + "/" + "dump" + ".java";
    FileWriter outFile = new FileWriter(new File(outPutFile), false);
    bufferedWriter = new BufferedWriter(outFile);


    for (int i = 1; i < 22; i++){
      writeFunction(i);
    }

    bufferedWriter.close();

  }


  public static void writeFunction(int i) throws IOException {
    bufferedWriter.write("public static Pojo.Pojo constructor(");
    for (int j = 1; j < i - 1; j++){
      bufferedWriter.write("String fieldName" + j + ",");
      bufferedWriter.write(" Object value" + j + ", ");
    }
    bufferedWriter.write("String fieldName" + (i - 1) + ",");
    bufferedWriter.write(" Object value" + (i - 1));


    bufferedWriter.write("){\n");
    bufferedWriter.write("  Pojo.Pojo ret = new Pojo.Pojo();\n");
    bufferedWriter.write("  Map<String, Object> objects = new HashMap<>();\n");

    for (int j = 1; j < i; j++){
      bufferedWriter.write("  objects.put(fieldName" + j);
      bufferedWriter.write(", value" + j);
      bufferedWriter.write(");\n");
    }


    bufferedWriter.write("  ret.setObjects(objects);\n");
    bufferedWriter.write("  return ret;\n");

    bufferedWriter.write("}\n\n");

  }



}
