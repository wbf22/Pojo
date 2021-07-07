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
    Set<Map.Entry<String, Object>> setFieldsObjects = pojo.getMemberVariables().entrySet();
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
