import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Pojo {
  private Map<String, Boolean> bools = new HashMap<>();
  private Map<String, Character> chars = new HashMap<>();
  private Map<String, Byte> bytes = new HashMap<>();
  private Map<String, Short> shorts = new HashMap<>();
  private Map<String, Integer> ints = new HashMap<>();
  private Map<String, Long> longs = new HashMap<>();
  private Map<String, Float> floats = new HashMap<>();
  private Map<String, Double> doubles = new HashMap<>();
  private Map<String, Object> objects = new HashMap<>();
  private static ObjectMapper objectMapper = new ObjectMapper();

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

  public Pojo(Map<String, Class> fields){
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

  public void constructor(String fieldName, Object value, String fieldName2, Object value2, String fieldName3, Object value3, String fieldName4, Object value4){

  }

  public Object get(String name){
    Boolean boolVal = bools.get(name);
    Character charVal = chars.get(name);
    Byte byteVal = bytes.get(name);
    Short shortVal = shorts.get(name);
    Integer intVal = ints.get(name);
    Long longVal = longs.get(name);
    Float floatVal = floats.get(name);
    Double doubleVal = doubles.get(name);
    Object objectVal = objects.get(name);
    if (boolVal != null) return boolVal.booleanValue();
    if (charVal != null) return charVal.charValue();
    if (byteVal != null) return byteVal.byteValue();
    if (shortVal != null) return shortVal.shortValue();
    if (intVal != null) return intVal.intValue();
    if (longVal != null) return longVal.longValue();
    if (floatVal != null) return floatVal.floatValue();
    if (doubleVal != null) return doubleVal.doubleValue();
    if (objectVal != null) return objectVal;

    return null;
  }

  public void set(String name, boolean val){
    bools.put(name, val);
  }

  public void set(String name, char val){
    chars.put(name, val);
  }

  public void set(String name, byte val){
    bytes.put(name, val);
  }

  public void set(String name, short val){
    shorts.put(name, val);
  }

  public void set(String name, int val){
    ints.put(name, val);
  }

  public void set(String name, long val){
    longs.put(name, val);
  }

  public void set(String name, float val){
    floats.put(name, val);
  }

  public void set(String name, double val){
    doubles.put(name, val);
  }

  public void set(String name, Object val){
    objects.put(name, val);
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("{\n");
    for (Map.Entry<String, Boolean> booleanEntry : bools.entrySet()) stringBuilder.append("  " + booleanEntry.getKey() + "=" + booleanEntry.getValue() + "\n");
    for (Map.Entry<String, Character> characterEntry : chars.entrySet()) stringBuilder.append("  " + characterEntry.getKey() + "=" + characterEntry.getValue() + "\n");
    for (Map.Entry<String, Byte> byteEntry : bytes.entrySet()) stringBuilder.append("  " + byteEntry.getKey() + "=" + byteEntry.getValue() + "\n");
    for (Map.Entry<String, Short> shortEntry : shorts.entrySet()) stringBuilder.append("  " + shortEntry.getKey() + "=" + shortEntry.getValue() + "\n");
    for (Map.Entry<String, Integer> integerEntry : ints.entrySet()) stringBuilder.append("  " + integerEntry.getKey() + "=" + integerEntry.getValue() + "\n");
    for (Map.Entry<String, Long> longEntry : longs.entrySet()) stringBuilder.append("  " + longEntry.getKey() + "=" + longEntry.getValue() + "\n");
    for (Map.Entry<String, Float> floatEntry : floats.entrySet()) stringBuilder.append("  " + floatEntry.getKey() + "=" + floatEntry.getValue() + "\n");
    for (Map.Entry<String, Double> doubleEntry : doubles.entrySet()) stringBuilder.append("  " + doubleEntry.getKey() + "=" + doubleEntry.getValue() + "\n");
    for (Map.Entry<String, Object> objectEntry : objects.entrySet()) stringBuilder.append("  " + objectEntry.getKey() + "=" + objectEntry.getValue().toString() + "\n");
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
    pojoMaker.buildPojo(className, this, "src/main/java/generated/pojos", generateConstructor);
  }

  public void build(String className, String fileDestinationPackage, boolean generateConstructor) throws IOException {
    PojoMaker pojoMaker = new PojoMaker();
    pojoMaker.buildPojo(className, this, fileDestinationPackage, generateConstructor);
  }

  //for mapping to json
  public Map<String, Boolean> getBools() {
    return bools;
  }

  public void setBools(Map<String, Boolean> bools) {
    this.bools = bools;
  }

  public Map<String, Character> getChars() {
    return chars;
  }

  public void setChars(Map<String, Character> chars) {
    this.chars = chars;
  }

  public Map<String, Byte> getBytes() {
    return bytes;
  }

  public void setBytes(Map<String, Byte> bytes) {
    this.bytes = bytes;
  }

  public Map<String, Short> getShorts() {
    return shorts;
  }

  public void setShorts(Map<String, Short> shorts) {
    this.shorts = shorts;
  }

  public Map<String, Integer> getInts() {
    return ints;
  }

  public void setInts(Map<String, Integer> ints) {
    this.ints = ints;
  }

  public Map<String, Long> getLongs() {
    return longs;
  }

  public void setLongs(Map<String, Long> longs) {
    this.longs = longs;
  }

  public Map<String, Float> getFloats() {
    return floats;
  }

  public void setFloats(Map<String, Float> floats) {
    this.floats = floats;
  }

  public Map<String, Double> getDoubles() {
    return doubles;
  }

  public void setDoubles(Map<String, Double> doubles) {
    this.doubles = doubles;
  }

  public Map<String, Object> getObjects() {
    return objects;
  }

  public void setObjects(Map<String, Object> objects) {
    this.objects = objects;
  }
}
