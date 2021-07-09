package Pojo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Pojo {
  private Map<String, Object> memberVariables = new HashMap<>();
  private static ObjectMapper objectMapper = new ObjectMapper();

  public Pojo(){};

  public Pojo(String fieldName, Class type){
    if (type == boolean.class) set(fieldName, false);
    if (type == char.class) set(fieldName, '\u0000');
    if (type == byte.class) set(fieldName, 0);
    if (type == short.class) set(fieldName, 0);
    if (type == int.class) set(fieldName, 0);
    if (type == long.class) set(fieldName, 0L);
    if (type == float.class) set(fieldName, 0.0f);
    if (type == double.class) set(fieldName, 0.0d);
    if (type == Object.class) set(fieldName, null);
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }

  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7, String fieldName8, Class type8){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);
    fields.put(fieldName8, type8);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7, String fieldName8, Class type8, String fieldName9, Class type9){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);
    fields.put(fieldName8, type8);
    fields.put(fieldName9, type9);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7, String fieldName8, Class type8, String fieldName9, Class type9, String fieldName10, Class type10){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);
    fields.put(fieldName8, type8);
    fields.put(fieldName9, type9);
    fields.put(fieldName10, type10);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7, String fieldName8, Class type8, String fieldName9, Class type9, String fieldName10, Class type10, String fieldName11, Class type11){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);
    fields.put(fieldName8, type8);
    fields.put(fieldName9, type9);
    fields.put(fieldName10, type10);
    fields.put(fieldName11, type11);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7, String fieldName8, Class type8, String fieldName9, Class type9, String fieldName10, Class type10, String fieldName11, Class type11, String fieldName12, Class type12){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);
    fields.put(fieldName8, type8);
    fields.put(fieldName9, type9);
    fields.put(fieldName10, type10);
    fields.put(fieldName11, type11);
    fields.put(fieldName12, type12);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7, String fieldName8, Class type8, String fieldName9, Class type9, String fieldName10, Class type10, String fieldName11, Class type11, String fieldName12, Class type12, String fieldName13, Class type13){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);
    fields.put(fieldName8, type8);
    fields.put(fieldName9, type9);
    fields.put(fieldName10, type10);
    fields.put(fieldName11, type11);
    fields.put(fieldName12, type12);
    fields.put(fieldName13, type13);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7, String fieldName8, Class type8, String fieldName9, Class type9, String fieldName10, Class type10, String fieldName11, Class type11, String fieldName12, Class type12, String fieldName13, Class type13, String fieldName14, Class type14){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);
    fields.put(fieldName8, type8);
    fields.put(fieldName9, type9);
    fields.put(fieldName10, type10);
    fields.put(fieldName11, type11);
    fields.put(fieldName12, type12);
    fields.put(fieldName13, type13);
    fields.put(fieldName14, type14);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7, String fieldName8, Class type8, String fieldName9, Class type9, String fieldName10, Class type10, String fieldName11, Class type11, String fieldName12, Class type12, String fieldName13, Class type13, String fieldName14, Class type14, String fieldName15, Class type15){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);
    fields.put(fieldName8, type8);
    fields.put(fieldName9, type9);
    fields.put(fieldName10, type10);
    fields.put(fieldName11, type11);
    fields.put(fieldName12, type12);
    fields.put(fieldName13, type13);
    fields.put(fieldName14, type14);
    fields.put(fieldName15, type15);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7, String fieldName8, Class type8, String fieldName9, Class type9, String fieldName10, Class type10, String fieldName11, Class type11, String fieldName12, Class type12, String fieldName13, Class type13, String fieldName14, Class type14, String fieldName15, Class type15, String fieldName16, Class type16){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);
    fields.put(fieldName8, type8);
    fields.put(fieldName9, type9);
    fields.put(fieldName10, type10);
    fields.put(fieldName11, type11);
    fields.put(fieldName12, type12);
    fields.put(fieldName13, type13);
    fields.put(fieldName14, type14);
    fields.put(fieldName15, type15);
    fields.put(fieldName16, type16);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7, String fieldName8, Class type8, String fieldName9, Class type9, String fieldName10, Class type10, String fieldName11, Class type11, String fieldName12, Class type12, String fieldName13, Class type13, String fieldName14, Class type14, String fieldName15, Class type15, String fieldName16, Class type16, String fieldName17, Class type17){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);
    fields.put(fieldName8, type8);
    fields.put(fieldName9, type9);
    fields.put(fieldName10, type10);
    fields.put(fieldName11, type11);
    fields.put(fieldName12, type12);
    fields.put(fieldName13, type13);
    fields.put(fieldName14, type14);
    fields.put(fieldName15, type15);
    fields.put(fieldName16, type16);
    fields.put(fieldName17, type17);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7, String fieldName8, Class type8, String fieldName9, Class type9, String fieldName10, Class type10, String fieldName11, Class type11, String fieldName12, Class type12, String fieldName13, Class type13, String fieldName14, Class type14, String fieldName15, Class type15, String fieldName16, Class type16, String fieldName17, Class type17, String fieldName18, Class type18){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);
    fields.put(fieldName8, type8);
    fields.put(fieldName9, type9);
    fields.put(fieldName10, type10);
    fields.put(fieldName11, type11);
    fields.put(fieldName12, type12);
    fields.put(fieldName13, type13);
    fields.put(fieldName14, type14);
    fields.put(fieldName15, type15);
    fields.put(fieldName16, type16);
    fields.put(fieldName17, type17);
    fields.put(fieldName18, type18);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7, String fieldName8, Class type8, String fieldName9, Class type9, String fieldName10, Class type10, String fieldName11, Class type11, String fieldName12, Class type12, String fieldName13, Class type13, String fieldName14, Class type14, String fieldName15, Class type15, String fieldName16, Class type16, String fieldName17, Class type17, String fieldName18, Class type18, String fieldName19, Class type19){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);
    fields.put(fieldName8, type8);
    fields.put(fieldName9, type9);
    fields.put(fieldName10, type10);
    fields.put(fieldName11, type11);
    fields.put(fieldName12, type12);
    fields.put(fieldName13, type13);
    fields.put(fieldName14, type14);
    fields.put(fieldName15, type15);
    fields.put(fieldName16, type16);
    fields.put(fieldName17, type17);
    fields.put(fieldName18, type18);
    fields.put(fieldName19, type19);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }

  public Pojo(String fieldName, Class type, String fieldName2, Class type2, String fieldName3, Class type3, String fieldName4, Class type4, String fieldName5, Class type5, String fieldName6, Class type6, String fieldName7, Class type7, String fieldName8, Class type8, String fieldName9, Class type9, String fieldName10, Class type10, String fieldName11, Class type11, String fieldName12, Class type12, String fieldName13, Class type13, String fieldName14, Class type14, String fieldName15, Class type15, String fieldName16, Class type16, String fieldName17, Class type17, String fieldName18, Class type18, String fieldName19, Class type19, String fieldName20, Class type20){
    Map<String, Class> fields = new HashMap<>();
    fields.put(fieldName, type);
    fields.put(fieldName2, type2);
    fields.put(fieldName3, type3);
    fields.put(fieldName4, type4);
    fields.put(fieldName5, type5);
    fields.put(fieldName6, type6);
    fields.put(fieldName7, type7);
    fields.put(fieldName8, type8);
    fields.put(fieldName9, type9);
    fields.put(fieldName10, type10);
    fields.put(fieldName11, type11);
    fields.put(fieldName12, type12);
    fields.put(fieldName13, type13);
    fields.put(fieldName14, type14);
    fields.put(fieldName15, type15);
    fields.put(fieldName16, type16);
    fields.put(fieldName17, type17);
    fields.put(fieldName18, type18);
    fields.put(fieldName19, type19);
    fields.put(fieldName20, type20);

    for (Map.Entry<String, Class> field : fields.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }



  public  Pojo (String fieldName1, Object value1){
    memberVariables.put(fieldName1, value1);
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14, String fieldName15, Object value15){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);
    memberVariables.put(fieldName15, value15);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14, String fieldName15, Object value15, String fieldName16, Object value16){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);
    memberVariables.put(fieldName15, value15);
    memberVariables.put(fieldName16, value16);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14, String fieldName15, Object value15, String fieldName16, Object value16, String fieldName17, Object value17){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);
    memberVariables.put(fieldName15, value15);
    memberVariables.put(fieldName16, value16);
    memberVariables.put(fieldName17, value17);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14, String fieldName15, Object value15, String fieldName16, Object value16, String fieldName17, Object value17, String fieldName18, Object value18){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);
    memberVariables.put(fieldName15, value15);
    memberVariables.put(fieldName16, value16);
    memberVariables.put(fieldName17, value17);
    memberVariables.put(fieldName18, value18);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14, String fieldName15, Object value15, String fieldName16, Object value16, String fieldName17, Object value17, String fieldName18, Object value18, String fieldName19, Object value19){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);
    memberVariables.put(fieldName15, value15);
    memberVariables.put(fieldName16, value16);
    memberVariables.put(fieldName17, value17);
    memberVariables.put(fieldName18, value18);
    memberVariables.put(fieldName19, value19);
    
  }

  public  Pojo (String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14, String fieldName15, Object value15, String fieldName16, Object value16, String fieldName17, Object value17, String fieldName18, Object value18, String fieldName19, Object value19, String fieldName20, Object value20){
    
    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);
    memberVariables.put(fieldName15, value15);
    memberVariables.put(fieldName16, value16);
    memberVariables.put(fieldName17, value17);
    memberVariables.put(fieldName18, value18);
    memberVariables.put(fieldName19, value19);
    memberVariables.put(fieldName20, value20);
    
  }

  public Pojo (Map<String, Object> memberVariables){
    for (Map.Entry<String, Object> field : memberVariables.entrySet()){
      if (field.getValue() == boolean.class) set(field.getKey(), false);
      if (field.getValue() == char.class) set(field.getKey(), '\u0000');
      if (field.getValue() == byte.class) set(field.getKey(), 0);
      if (field.getValue() == short.class) set(field.getKey(), 0);
      if (field.getValue() == int.class) set(field.getKey(), 0);
      if (field.getValue() == long.class) set(field.getKey(), 0L);
      if (field.getValue() == float.class) set(field.getKey(), 0.0f);
      if (field.getValue() == double.class) set(field.getKey(), 0.0d);
      if (field.getValue() == Object.class) set(field.getKey(), null);
    }
  }


  public Object get(String name){
    Object objectVal = memberVariables.get(name);
    if (objectVal != null) return objectVal;
    return null;
  }

  public byte getByte(String name){
    Object objectVal = memberVariables.get(name);
    if (objectVal != null && objectVal.getClass() == Byte.class) return (byte) objectVal;
    return 0;
  }

  public short getShort(String name){
    Object objectVal = memberVariables.get(name);
    if (objectVal != null && objectVal.getClass() == Short.class) return (short) objectVal;
    return 0;
  }

  public int getInt(String name){
    Object objectVal = memberVariables.get(name);
    if (objectVal != null && objectVal.getClass() == Integer.class) return (int) objectVal;
    return 0;
  }

  public long getLong(String name){
    Object objectVal = memberVariables.get(name);
    if (objectVal != null && objectVal.getClass() == Long.class) return (long) objectVal;
    return 0;
  }

  public float getFloat(String name){
    Object objectVal = memberVariables.get(name);
    if (objectVal != null && objectVal.getClass() == Float.class) return (float) objectVal;
    return 0;
  }

  public double getDouble(String name){
    Object objectVal = memberVariables.get(name);
    if (objectVal != null && objectVal.getClass() == Double.class) return (double) objectVal;
    return 0;
  }

  public char getChar(String name){
    Object objectVal = memberVariables.get(name);
    if (objectVal != null && objectVal.getClass() == Character.class) return (char) objectVal;
    return '\u0000';
  }

  public boolean getBoolean(String name){
    Object objectVal = memberVariables.get(name);
    if (objectVal != null && objectVal.getClass() == Boolean.class) return (boolean) objectVal;
    return false;
  }


  public void set(String name, Object val){
    memberVariables.put(name, val);
  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14, String fieldName15, Object value15){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);
    memberVariables.put(fieldName15, value15);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14, String fieldName15, Object value15, String fieldName16, Object value16){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);
    memberVariables.put(fieldName15, value15);
    memberVariables.put(fieldName16, value16);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14, String fieldName15, Object value15, String fieldName16, Object value16, String fieldName17, Object value17){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);
    memberVariables.put(fieldName15, value15);
    memberVariables.put(fieldName16, value16);
    memberVariables.put(fieldName17, value17);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14, String fieldName15, Object value15, String fieldName16, Object value16, String fieldName17, Object value17, String fieldName18, Object value18){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);
    memberVariables.put(fieldName15, value15);
    memberVariables.put(fieldName16, value16);
    memberVariables.put(fieldName17, value17);
    memberVariables.put(fieldName18, value18);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14, String fieldName15, Object value15, String fieldName16, Object value16, String fieldName17, Object value17, String fieldName18, Object value18, String fieldName19, Object value19){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);
    memberVariables.put(fieldName15, value15);
    memberVariables.put(fieldName16, value16);
    memberVariables.put(fieldName17, value17);
    memberVariables.put(fieldName18, value18);
    memberVariables.put(fieldName19, value19);

  }

  public void set(String fieldName1, Object value1, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4, String fieldName5, Object value5, String fieldName6, Object value6, String fieldName7, Object value7, String fieldName8, Object value8, String fieldName9, Object value9, String fieldName10, Object value10, String fieldName11, Object value11, String fieldName12, Object value12, String fieldName13, Object value13, String fieldName14, Object value14, String fieldName15, Object value15, String fieldName16, Object value16, String fieldName17, Object value17, String fieldName18, Object value18, String fieldName19, Object value19, String fieldName20, Object value20){

    memberVariables.put(fieldName1, value1);
    memberVariables.put(fieldName2, value2);
    memberVariables.put(fieldName3, value3);
    memberVariables.put(fieldName4, value4);
    memberVariables.put(fieldName5, value5);
    memberVariables.put(fieldName6, value6);
    memberVariables.put(fieldName7, value7);
    memberVariables.put(fieldName8, value8);
    memberVariables.put(fieldName9, value9);
    memberVariables.put(fieldName10, value10);
    memberVariables.put(fieldName11, value11);
    memberVariables.put(fieldName12, value12);
    memberVariables.put(fieldName13, value13);
    memberVariables.put(fieldName14, value14);
    memberVariables.put(fieldName15, value15);
    memberVariables.put(fieldName16, value16);
    memberVariables.put(fieldName17, value17);
    memberVariables.put(fieldName18, value18);
    memberVariables.put(fieldName19, value19);
    memberVariables.put(fieldName20, value20);

  }


  @JsonIgnore
  public Pojo getBlankOfThisPojo(){
    Pojo ret = new Pojo();

    for (Map.Entry<String, Object> field : memberVariables.entrySet()){
      ret.set(field.getKey(), null);
    }
    return ret;
  }


  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("{\n");
    for (Map.Entry<String, Object> objectEntry : memberVariables.entrySet()){
      stringBuilder.append("  " + objectEntry.getKey() + " = ");
      if (objectEntry.getValue() != null ){
        stringBuilder.append(objectEntry.getValue().toString() + "\n");
      }else{
        stringBuilder.append("null\n");
      }

    }
    stringBuilder.append('}');

    return stringBuilder.toString();
  }

  public String toJson() throws JsonProcessingException {
    return objectMapper.writeValueAsString(this);
  }

  public String toJsonPretty() throws JsonProcessingException {
    return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
  }

  public static Pojo fromJson(String json) throws JsonProcessingException {
    return objectMapper.readerFor(Pojo.class).readValue(json);
  }

  public void build(String className, boolean generateConstructor) throws IOException {
    PojoMaker pojoMaker = new PojoMaker();
    pojoMaker.buildPojo(className, this, "src/main/java", generateConstructor);
  }

  public void build(String className, String fileDestinationPackage, boolean generateConstructor) throws IOException {
    PojoMaker pojoMaker = new PojoMaker();
    pojoMaker.buildPojo(className, this, fileDestinationPackage, generateConstructor);
  }

  //for mapping to json
  public Map<String, Object> getMemberVariables() {
    return memberVariables;
  }

  public void setMemberVariables(Map<String, Object> memberVariables) {
    this.memberVariables = memberVariables;
  }

}
