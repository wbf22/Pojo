import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojoMaker {

  private BufferedWriter bufferedWriter;


  public String buildPojo(String name, Pojo pojo, String outputDirectory, boolean constructor) throws IOException {
    StringBuilder stringBuilder = new StringBuilder();

    String packageName = getPackage(outputDirectory);
    if (packageName != null){
      stringBuilder.append("package ");
      stringBuilder.append(packageName);
      stringBuilder.append(";\n\n");
    }

    stringBuilder.append("public class ");
    stringBuilder.append(name);
    stringBuilder.append(" {\n");
    stringBuilder.append("\n");

    //fields
    Set<Map.Entry<String, Boolean>> setFieldsBool = pojo.getBools().entrySet();
    for (Map.Entry<String, Boolean> field : setFieldsBool){
      stringBuilder.append("  private boolean ");
      stringBuilder.append(field.getKey());
      stringBuilder.append(";\n");
    }

    Set<Map.Entry<String, Character>> setFieldsChar = pojo.getChars().entrySet();
    for (Map.Entry<String, Character> field : setFieldsChar){
      stringBuilder.append("  private char ");
      stringBuilder.append(field.getKey());
      stringBuilder.append(";\n");
    }

    Set<Map.Entry<String, Byte>> setFieldsByte = pojo.getBytes().entrySet();
    for (Map.Entry<String, Byte> field : setFieldsByte){
      stringBuilder.append("  private byte ");
      stringBuilder.append(field.getKey());
      stringBuilder.append(";\n");
    }

    Set<Map.Entry<String, Short>> setFieldsShort = pojo.getShorts().entrySet();
    for (Map.Entry<String, Short> field : setFieldsShort){
      stringBuilder.append("  private short ");
      stringBuilder.append(field.getKey());
      stringBuilder.append(";\n");
    }

    Set<Map.Entry<String, Integer>> setFieldsInts = pojo.getInts().entrySet();
    for (Map.Entry<String, Integer> field : setFieldsInts){
      stringBuilder.append("  private int ");
      stringBuilder.append(field.getKey());
      stringBuilder.append(";\n");
    }

    Set<Map.Entry<String, Long>> setFieldsLongs = pojo.getLongs().entrySet();
    for (Map.Entry<String, Long> field : setFieldsLongs){
      stringBuilder.append("  private long ");
      stringBuilder.append(field.getKey());
      stringBuilder.append(";\n");
    }

    Set<Map.Entry<String, Float>> setFieldsFloats = pojo.getFloats().entrySet();
    for (Map.Entry<String, Float> field : setFieldsFloats){
      stringBuilder.append("  private float ");
      stringBuilder.append(field.getKey());
      stringBuilder.append(";\n");
    }

    Set<Map.Entry<String, Double>> setFieldsDoubles = pojo.getDoubles().entrySet();
    for (Map.Entry<String, Double> field : setFieldsDoubles){
      stringBuilder.append("  private double ");
      stringBuilder.append(field.getKey());
      stringBuilder.append(";\n");
    }

    Set<Map.Entry<String, Object>> setFieldsObjects = pojo.getObjects().entrySet();
    for (Map.Entry<String, Object> field : setFieldsObjects){
      stringBuilder.append("  private ");
      stringBuilder.append(field.getValue().getClass().getName());
      stringBuilder.append(" ");
      stringBuilder.append(field.getKey());
      stringBuilder.append(";\n");
    }


    //constructor
    if (constructor){
      stringBuilder.append("\n");
      stringBuilder.append("\n");
      stringBuilder.append("  public ");
      stringBuilder.append(name);
      stringBuilder.append("()");
      stringBuilder.append(" {}\n");
    }

    stringBuilder.append("\n");

    //getter setters
    for (Map.Entry<String, Boolean> field : setFieldsBool){
      stringBuilder.append(generateGetterSetter(field.getKey(), boolean.class.getName()));
    }

    for (Map.Entry<String, Character> field : setFieldsChar){
      stringBuilder.append(generateGetterSetter(field.getKey(), char.class.getName()));
    }

    for (Map.Entry<String, Byte> field : setFieldsByte){
      stringBuilder.append(generateGetterSetter(field.getKey(), byte.class.getName()));
    }

    for (Map.Entry<String, Short> field : setFieldsShort){
      stringBuilder.append(generateGetterSetter(field.getKey(), short.class.getName()));
    }

    for (Map.Entry<String, Integer> field : setFieldsInts){
      stringBuilder.append(generateGetterSetter(field.getKey(), int.class.getName()));
    }

    for (Map.Entry<String, Long> field : setFieldsLongs){
      stringBuilder.append(generateGetterSetter(field.getKey(), long.class.getName()));
    }

    for (Map.Entry<String, Float> field : setFieldsFloats){
      stringBuilder.append(generateGetterSetter(field.getKey(), float.class.getName()));
    }

    for (Map.Entry<String, Double> field : setFieldsDoubles){
      stringBuilder.append(generateGetterSetter(field.getKey(), double.class.getName()));
    }

    for (Map.Entry<String, Object> field : setFieldsObjects){
      stringBuilder.append(generateGetterSetter(field.getKey(), field.getValue().getClass().getName()));
    }

    stringBuilder.append("\n");
    stringBuilder.append("}");

    setUpBufferedWriter(name, outputDirectory);
    bufferedWriter.write(stringBuilder.toString());
    bufferedWriter.close();

    return stringBuilder.toString();
  }

  private String generateGetterSetter(String fieldName, String typeName){
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("  public ");
    stringBuilder.append(typeName);
    stringBuilder.append(" get");
    stringBuilder.append(fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1));
    stringBuilder.append("()");
    stringBuilder.append(" {\n");
    stringBuilder.append("    return ");
    stringBuilder.append(fieldName);
    stringBuilder.append(";\n");
    stringBuilder.append("  }\n\n");

    stringBuilder.append("  public void");
    stringBuilder.append(" set");
    stringBuilder.append(fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1));
    stringBuilder.append("(");
    stringBuilder.append(typeName);
    stringBuilder.append(" ");
    stringBuilder.append(fieldName);
    stringBuilder.append(")");
    stringBuilder.append(" {\n");
    stringBuilder.append("    this. ");
    stringBuilder.append(fieldName);
    stringBuilder.append(" = ");
    stringBuilder.append(fieldName);
    stringBuilder.append(";\n");
    stringBuilder.append("  }\n\n");

    return stringBuilder.toString();


  }

  private void setUpBufferedWriter(String pojoName, String outputDirectory) throws IOException {
    String outPutFile = outputDirectory + "/" + pojoName + ".java";
    FileWriter outFile = new FileWriter(new File(outPutFile), false);
    bufferedWriter = new BufferedWriter(outFile);
  }

  private String getPackage(String outputDirectory){
    String packageName;
    if (outputDirectory.contains("src/main/java/")){
      packageName = outputDirectory.substring(14);
      packageName = packageName.replace('/', '.');
      return packageName;
    }

    return null;
  }

  public String pojoToJson(Pojo pojo) throws JsonProcessingException {
    String str = "";

    ObjectMapper mapper = new ObjectMapper();

    str = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
    return str;
  }

  public Pojo jsonToPojo(String json){
    return null;
  }



}
