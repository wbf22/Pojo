import java.math.BigDecimal;
import java.util.*;

public class var {
  private Object value;
  private Class type;

  public var(Object object){
    this.value = object;
    type = object.getClass();
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
    this.type = value.getClass();
  }

  public Class getType() {
    return type;
  }


  public var add(var num2){
    if (this.type == Character.class){
      return new var((char) value + (char) num2.getValue());
    }
    if (this.type == Byte.class){
      return new var((byte) value + (byte) num2.getValue());
    }
    if (this.type == Short.class){
      return new var((short) value + (short) num2.getValue());
    }
    if (this.type == Integer.class){
      return new var((int) value + (int) num2.getValue());
    }
    if (this.type == Long.class){
      return new var((long) value + (long) num2.getValue());
    }
    if (this.type == Float.class){
      return new var((float) value + (float) num2.getValue());
    }
    if (this.type == Double.class){
      return new var((double) value + (double) num2.getValue());
    }
    if (this.type == String.class){
      return new var((String) value + (String) num2.getValue());
    }
    throw new RuntimeException("Operator '+' cannot be applied to '" + type.getName() + "', '" + num2.getType().getName() + "'");
  }

  public var subtract(var num2){
    if (this.type == Character.class){
      return new var((char) value - (char) num2.getValue());
    }
    if (this.type == Byte.class){
      return new var((byte) value - (byte) num2.getValue());
    }
    if (this.type == Short.class){
      return new var((short) value - (short) num2.getValue());
    }
    if (this.type == Integer.class){
      return new var((int) value - (int) num2.getValue());
    }
    if (this.type == Long.class){
      return new var((long) value - (long) num2.getValue());
    }
    if (this.type == Float.class){
      return new var((float) value - (float) num2.getValue());
    }
    if (this.type == Double.class){
      return new var((double) value - (double) num2.getValue());
    }
    throw new RuntimeException("Operator '-' cannot be applied to '" + type.getName() + "', '" + num2.getType().getName() + "'");
  }

  public var divideBy(var num2){
    if (this.type == Character.class){
      return new var((char) value / (char) num2.getValue());
    }
    if (this.type == Byte.class){
      return new var((byte) value / (byte) num2.getValue());
    }
    if (this.type == Short.class){
      return new var((short) value / (short) num2.getValue());
    }
    if (this.type == Integer.class){
      return new var((int) value / (int) num2.getValue());
    }
    if (this.type == Long.class){
      return new var((long) value / (long) num2.getValue());
    }
    if (this.type == Float.class){
      return new var((float) value / (float) num2.getValue());
    }
    if (this.type == Double.class){
      return new var((double) value / (double) num2.getValue());
    }
    throw new RuntimeException("Operator '/' cannot be applied to '" + type.getName() + "', '" + num2.getType().getName() + "'");
  }

  public var multiplyBy(var num2){
    if (this.type == Character.class){
      return new var((char) value * (char) num2.getValue());
    }
    if (this.type == Byte.class){
      return new var((byte) value * (byte) num2.getValue());
    }
    if (this.type == Short.class){
      return new var((short) value * (short) num2.getValue());
    }
    if (this.type == Integer.class){
      return new var((int) value * (int) num2.getValue());
    }
    if (this.type == Long.class){
      return new var((long) value * (long) num2.getValue());
    }
    if (this.type == Float.class){
      return new var((float) value * (float) num2.getValue());
    }
    if (this.type == Double.class){
      return new var((double) value * (double) num2.getValue());
    }
    throw new RuntimeException("Operator '*' cannot be applied to '" + type.getName() + "', '" + num2.getType().getName() + "'");
  }

  public var powerOf(var num2){
    if (this.type == Character.class){
      return new var(Math.pow((char) value , (char) num2.getValue()));
    }
    if (this.type == Byte.class){
      return new var(Math.pow((byte) value , (byte) num2.getValue()));
    }
    if (this.type == Short.class){
      return new var(Math.pow((short) value , (short) num2.getValue()));
    }
    if (this.type == Integer.class){
      return new var(Math.pow((int) value , (int) num2.getValue()));
    }
    if (this.type == Long.class){
      return new var(Math.pow((long) value , (long) num2.getValue()));
    }
    if (this.type == Float.class){
      return new var(Math.pow((float) value , (float) num2.getValue()));
    }
    if (this.type == Double.class){
      return new var(Math.pow((double) value , (double) num2.getValue()));
    }
    throw new RuntimeException("Operator '^' cannot be applied to '" + type.getName() + "', '" + num2.getType().getName() + "'");
  }

  public var rootOf(var num2){
    if (this.type == Character.class){
      return new var(Math.pow((char) value , (char) (1.0f / (char) num2.getValue())));
    }
    if (this.type == Byte.class){
      return new var(Math.pow((byte) value , (byte) (1.0f / (byte) num2.getValue())));
    }
    if (this.type == Short.class){
      return new var(Math.pow((short) value , (short) (1.0f / (short) num2.getValue())));
    }
    if (this.type == Integer.class){
      return new var(Math.pow((int) value , (int) (1.0f / (int) num2.getValue())));
    }
    if (this.type == Long.class){
      return new var(Math.pow((long) value , (long) (1.0f / (long) num2.getValue())));
    }
    if (this.type == Float.class){
      return new var(Math.pow((float) value , (float) (1.0f / (float) num2.getValue())));
    }
    if (this.type == Double.class){
      return new var(Math.pow((double) value , (double) (1.0f / (double) num2.getValue())));
    }
    throw new RuntimeException("Operator '^' cannot be applied to '" + type.getName() + "', '" + num2.getType().getName() + "'");
  }

  @Override
  public boolean equals(Object obj) {
    if (obj.getClass() == Character.class){
      return (char) value == (char) obj;
    }
    if (obj.getClass() == Byte.class){
      return (byte) value == (byte) obj;
    }
    if (obj.getClass() == Short.class){
      return (short) value == (short) obj;
    }
    if (obj.getClass() == Integer.class){
      return (int) value == (int) obj;
    }
    if (obj.getClass() == Long.class){
      return (long) value == (long) obj;
    }
    if (obj.getClass() == Float.class){
      return (float) value == (float) obj;
    }
    if (obj.getClass() == Double.class){
      return (double) value == (double) obj;
    }
    if (obj.getClass() == String.class){
      return value.toString().equals(obj.toString());
    }
    if (obj.getClass() == BigDecimal.class){
      return BigDecimal.valueOf((double)value).equals(BigDecimal.valueOf((double) obj));
    }
    return super.equals(obj);

  }

  @Override
  public String toString() {
    return value.toString();
  }

  public boolean getBoolean(){
    return (boolean) value;
  }

  public char getChar(){
    return (char) value;
  }

  public byte getByte(){
    return (byte) value;
  }

  public short getShort(){
    return (short) value;
  }

  public int getInt(){
    return (int) value;
  }

  public long getLong(){
    return (long) value;
  }

  public float getFloat(){
    return (float) value;
  }

  public double getDouble(){
    return (double) value;
  }

  public BigDecimal getBigDecimal(){
    if (this.type == Character.class){
      return BigDecimal.valueOf((char)value);
    }
    if (this.type == Byte.class){
      return BigDecimal.valueOf((Byte)value);
    }
    if (this.type == Short.class){
      return BigDecimal.valueOf((Short)value);
    }
    if (this.type == Integer.class){
      return BigDecimal.valueOf((Integer)value);
    }
    if (this.type == Long.class){
      return BigDecimal.valueOf((Long)value);
    }
    if (this.type == Float.class){
      return BigDecimal.valueOf((Float)value);
    }
    if (this.type == Double.class){
      return BigDecimal.valueOf((Double)value);
    }
    throw new RuntimeException("Cannot convert '" + type.getName() + "' to java.math.BigDecimal");
  }


  public ArrayList<Object> getArrayListObject(){
    return (ArrayList<Object>) value;
  }

  public ArrayList<Boolean> getArrayListBoolean(){
    return (ArrayList<Boolean>) value;
  }

  public ArrayList<Character> getArrayListChar(){
    return (ArrayList<Character>) value;
  }

  public ArrayList<Byte> getArrayListByte(){
    return (ArrayList<Byte>) value;
  }

  public ArrayList<Short> getArrayListShort(){
    return (ArrayList<Short>) value;
  }

  public ArrayList<Integer> getArrayListInt(){
    return (ArrayList<Integer>) value;
  }

  public ArrayList<Long> getArrayListLong(){
    return (ArrayList<Long>) value;
  }

  public ArrayList<Float> getArrayListFloat(){
    return (ArrayList<Float>) value;
  }

  public ArrayList<Double> getArrayListDouble(){
    return (ArrayList<Double>) value;
  }

  public ArrayList<String> getArrayListString(){
    return (ArrayList<String>) value;
  }

  public ArrayList<BigDecimal> getArrayListBigDecimal(){
    return (ArrayList<BigDecimal>) value;
  }


  public Set<Object> getSetObject(){
    return (Set<Object>) value;
  }

  public Set<Boolean> getSetBoolean(){
    return (Set<Boolean>) value;
  }

  public Set<Character> getSetChar(){
    return (Set<Character>) value;
  }

  public Set<Byte> getSetByte(){
    return (Set<Byte>) value;
  }

  public Set<Short> getSetShort(){
    return (Set<Short>) value;
  }

  public Set<Integer> getSetInt(){
    return (Set<Integer>) value;
  }

  public Set<Long> getSetLong(){
    return (Set<Long>) value;
  }

  public Set<Float> getSetFloat(){
    return (Set<Float>) value;
  }

  public Set<Double> getSetDouble(){
    return (Set<Double>) value;
  }

  public Set<String> getSetString(){
    return (Set<String>) value;
  }

  public Set<BigDecimal> getSetBigDecimal(){
    return (Set<BigDecimal>) value;
  }


  public Queue<Object> getQueueObject(){
    return (Queue<Object>) value;
  }

  public Queue<Boolean> getQueueBoolean(){
    return (Queue<Boolean>) value;
  }

  public Queue<Character> getQueueChar(){
    return (Queue<Character>) value;
  }

  public Queue<Byte> getQueueByte(){
    return (Queue<Byte>) value;
  }

  public Queue<Short> getQueueShort(){
    return (Queue<Short>) value;
  }

  public Queue<Integer> getQueueInt(){
    return (Queue<Integer>) value;
  }

  public Queue<Long> getQueueLong(){
    return (Queue<Long>) value;
  }

  public Queue<Float> getQueueFloat(){
    return (Queue<Float>) value;
  }

  public Queue<Double> getQueueDouble(){
    return (Queue<Double>) value;
  }

  public Queue<String> getQueueString(){
    return (Queue<String>) value;
  }

  public Queue<BigDecimal> getQueueBigDecimal(){
    return (Queue<BigDecimal>) value;
  }


  public LinkedList<Object> getLinkedListObject(){
    return (LinkedList<Object>) value;
  }

  public LinkedList<Boolean> getLinkedListBoolean(){
    return (LinkedList<Boolean>) value;
  }

  public LinkedList<Character> getLinkedListChar(){
    return (LinkedList<Character>) value;
  }

  public LinkedList<Byte> getLinkedListByte(){
    return (LinkedList<Byte>) value;
  }

  public LinkedList<Short> getLinkedListShort(){
    return (LinkedList<Short>) value;
  }

  public LinkedList<Integer> getLinkedListInt(){
    return (LinkedList<Integer>) value;
  }

  public LinkedList<Long> getLinkedListLong(){
    return (LinkedList<Long>) value;
  }

  public LinkedList<Float> getLinkedListFloat(){
    return (LinkedList<Float>) value;
  }

  public LinkedList<Double> getLinkedListDouble(){
    return (LinkedList<Double>) value;
  }

  public LinkedList<String> getLinkedListString(){
    return (LinkedList<String>) value;
  }

  public LinkedList<BigDecimal> getLinkedListBigDecimal(){
    return (LinkedList<BigDecimal>) value;
  }


  public Vector<Object> getVectorObject(){
    return (Vector<Object>) value;
  }

  public Vector<Boolean> getVectorBoolean(){
    return (Vector<Boolean>) value;
  }

  public Vector<Character> getVectorChar(){
    return (Vector<Character>) value;
  }

  public Vector<Byte> getVectorByte(){
    return (Vector<Byte>) value;
  }

  public Vector<Short> getVectorShort(){
    return (Vector<Short>) value;
  }

  public Vector<Integer> getVectorInt(){
    return (Vector<Integer>) value;
  }

  public Vector<Long> getVectorLong(){
    return (Vector<Long>) value;
  }

  public Vector<Float> getVectorFloat(){
    return (Vector<Float>) value;
  }

  public Vector<Double> getVectorDouble(){
    return (Vector<Double>) value;
  }

  public Vector<String> getVectorString(){
    return (Vector<String>) value;
  }

  public Vector<BigDecimal> getVectorBigDecimal(){
    return (Vector<BigDecimal>) value;
  }


  public Stack<Object> getStackObject(){
    return (Stack<Object>) value;
  }

  public Stack<Boolean> getStackBoolean(){
    return (Stack<Boolean>) value;
  }

  public Stack<Character> getStackChar(){
    return (Stack<Character>) value;
  }

  public Stack<Byte> getStackByte(){
    return (Stack<Byte>) value;
  }

  public Stack<Short> getStackShort(){
    return (Stack<Short>) value;
  }

  public Stack<Integer> getStackInt(){
    return (Stack<Integer>) value;
  }

  public Stack<Long> getStackLong(){
    return (Stack<Long>) value;
  }

  public Stack<Float> getStackFloat(){
    return (Stack<Float>) value;
  }

  public Stack<Double> getStackDouble(){
    return (Stack<Double>) value;
  }

  public Stack<String> getStackString(){
    return (Stack<String>) value;
  }

  public Stack<BigDecimal> getStackBigDecimal(){
    return (Stack<BigDecimal>) value;
  }

  
  public Map<Object, Object> getMapObjectObject(){
    return (Map<Object, Object>) value;
  }

  public Map<Object, Boolean> getMapObjectBoolean(){
    return (Map<Object, Boolean>) value;
  }

  public Map<Object, Character> getMapObjectChar(){
    return (Map<Object, Character>) value;
  }

  public Map<Object, Byte> getMapObjectByte(){
    return (Map<Object, Byte>) value;
  }

  public Map<Object, Short> getMapObjectShort(){
    return (Map<Object, Short>) value;
  }

  public Map<Object, Integer> getMapObjectInt(){
    return (Map<Object, Integer>) value;
  }

  public Map<Object, Long> getMapObjectLong(){
    return (Map<Object, Long>) value;
  }

  public Map<Object, Float> getMapObjectFloat(){
    return (Map<Object, Float>) value;
  }

  public Map<Object, Double> getMapObjectDouble(){
    return (Map<Object, Double>) value;
  }

  public Map<Object, String> getMapObjectString(){
    return (Map<Object, String>) value;
  }

  public Map<Object, BigDecimal> getMapObjectBigDecimal(){
    return (Map<Object, BigDecimal>) value;
  }

  public Map<Boolean, Object> getMapBooleanObject(){
    return (Map<Boolean, Object>) value;
  }

  public Map<Boolean, Boolean> getMapBooleanBoolean(){
    return (Map<Boolean, Boolean>) value;
  }

  public Map<Boolean, Character> getMapBooleanChar(){
    return (Map<Boolean, Character>) value;
  }

  public Map<Boolean, Byte> getMapBooleanByte(){
    return (Map<Boolean, Byte>) value;
  }

  public Map<Boolean, Short> getMapBooleanShort(){
    return (Map<Boolean, Short>) value;
  }

  public Map<Boolean, Integer> getMapBooleanInt(){
    return (Map<Boolean, Integer>) value;
  }

  public Map<Boolean, Long> getMapBooleanLong(){
    return (Map<Boolean, Long>) value;
  }

  public Map<Boolean, Float> getMapBooleanFloat(){
    return (Map<Boolean, Float>) value;
  }

  public Map<Boolean, Double> getMapBooleanDouble(){
    return (Map<Boolean, Double>) value;
  }

  public Map<Boolean, String> getMapBooleanString(){
    return (Map<Boolean, String>) value;
  }

  public Map<Boolean, BigDecimal> getMapBooleanBigDecimal(){
    return (Map<Boolean, BigDecimal>) value;
  }

  public Map<Character, Object> getMapCharacterObject(){
    return (Map<Character, Object>) value;
  }

  public Map<Character, Boolean> getMapCharacterBoolean(){
    return (Map<Character, Boolean>) value;
  }

  public Map<Character, Character> getMapCharacterChar(){
    return (Map<Character, Character>) value;
  }

  public Map<Character, Byte> getMapCharacterByte(){
    return (Map<Character, Byte>) value;
  }

  public Map<Character, Short> getMapCharacterShort(){
    return (Map<Character, Short>) value;
  }

  public Map<Character, Integer> getMapCharacterInt(){
    return (Map<Character, Integer>) value;
  }

  public Map<Character, Long> getMapCharacterLong(){
    return (Map<Character, Long>) value;
  }

  public Map<Character, Float> getMapCharacterFloat(){
    return (Map<Character, Float>) value;
  }

  public Map<Character, Double> getMapCharacterDouble(){
    return (Map<Character, Double>) value;
  }

  public Map<Character, String> getMapCharacterString(){
    return (Map<Character, String>) value;
  }

  public Map<Character, BigDecimal> getMapCharacterBigDecimal(){
    return (Map<Character, BigDecimal>) value;
  }

  public Map<Byte, Object> getMapByteObject(){
    return (Map<Byte, Object>) value;
  }

  public Map<Byte, Boolean> getMapByteBoolean(){
    return (Map<Byte, Boolean>) value;
  }

  public Map<Byte, Character> getMapByteChar(){
    return (Map<Byte, Character>) value;
  }

  public Map<Byte, Byte> getMapByteByte(){
    return (Map<Byte, Byte>) value;
  }

  public Map<Byte, Short> getMapByteShort(){
    return (Map<Byte, Short>) value;
  }

  public Map<Byte, Integer> getMapByteInt(){
    return (Map<Byte, Integer>) value;
  }

  public Map<Byte, Long> getMapByteLong(){
    return (Map<Byte, Long>) value;
  }

  public Map<Byte, Float> getMapByteFloat(){
    return (Map<Byte, Float>) value;
  }

  public Map<Byte, Double> getMapByteDouble(){
    return (Map<Byte, Double>) value;
  }

  public Map<Byte, String> getMapByteString(){
    return (Map<Byte, String>) value;
  }

  public Map<Byte, BigDecimal> getMapByteBigDecimal(){
    return (Map<Byte, BigDecimal>) value;
  }

  public Map<Short, Object> getMapShortObject(){
    return (Map<Short, Object>) value;
  }

  public Map<Short, Boolean> getMapShortBoolean(){
    return (Map<Short, Boolean>) value;
  }

  public Map<Short, Character> getMapShortChar(){
    return (Map<Short, Character>) value;
  }

  public Map<Short, Byte> getMapShortByte(){
    return (Map<Short, Byte>) value;
  }

  public Map<Short, Short> getMapShortShort(){
    return (Map<Short, Short>) value;
  }

  public Map<Short, Integer> getMapShortInt(){
    return (Map<Short, Integer>) value;
  }

  public Map<Short, Long> getMapShortLong(){
    return (Map<Short, Long>) value;
  }

  public Map<Short, Float> getMapShortFloat(){
    return (Map<Short, Float>) value;
  }

  public Map<Short, Double> getMapShortDouble(){
    return (Map<Short, Double>) value;
  }

  public Map<Short, String> getMapShortString(){
    return (Map<Short, String>) value;
  }

  public Map<Short, BigDecimal> getMapShortBigDecimal(){
    return (Map<Short, BigDecimal>) value;
  }

  public Map<Integer, Object> getMapIntegerObject(){
    return (Map<Integer, Object>) value;
  }

  public Map<Integer, Boolean> getMapIntegerBoolean(){
    return (Map<Integer, Boolean>) value;
  }

  public Map<Integer, Character> getMapIntegerChar(){
    return (Map<Integer, Character>) value;
  }

  public Map<Integer, Byte> getMapIntegerByte(){
    return (Map<Integer, Byte>) value;
  }

  public Map<Integer, Short> getMapIntegerShort(){
    return (Map<Integer, Short>) value;
  }

  public Map<Integer, Integer> getMapIntegerInt(){
    return (Map<Integer, Integer>) value;
  }

  public Map<Integer, Long> getMapIntegerLong(){
    return (Map<Integer, Long>) value;
  }

  public Map<Integer, Float> getMapIntegerFloat(){
    return (Map<Integer, Float>) value;
  }

  public Map<Integer, Double> getMapIntegerDouble(){
    return (Map<Integer, Double>) value;
  }

  public Map<Integer, String> getMapIntegerString(){
    return (Map<Integer, String>) value;
  }

  public Map<Integer, BigDecimal> getMapIntegerBigDecimal(){
    return (Map<Integer, BigDecimal>) value;
  }

  public Map<Long, Object> getMapLongObject(){
    return (Map<Long, Object>) value;
  }

  public Map<Long, Boolean> getMapLongBoolean(){
    return (Map<Long, Boolean>) value;
  }

  public Map<Long, Character> getMapLongChar(){
    return (Map<Long, Character>) value;
  }

  public Map<Long, Byte> getMapLongByte(){
    return (Map<Long, Byte>) value;
  }

  public Map<Long, Short> getMapLongShort(){
    return (Map<Long, Short>) value;
  }

  public Map<Long, Integer> getMapLongInt(){
    return (Map<Long, Integer>) value;
  }

  public Map<Long, Long> getMapLongLong(){
    return (Map<Long, Long>) value;
  }

  public Map<Long, Float> getMapLongFloat(){
    return (Map<Long, Float>) value;
  }

  public Map<Long, Double> getMapLongDouble(){
    return (Map<Long, Double>) value;
  }

  public Map<Long, String> getMapLongString(){
    return (Map<Long, String>) value;
  }

  public Map<Long, BigDecimal> getMapLongBigDecimal(){
    return (Map<Long, BigDecimal>) value;
  }

  public Map<Float, Object> getMapFloatObject(){
    return (Map<Float, Object>) value;
  }

  public Map<Float, Boolean> getMapFloatBoolean(){
    return (Map<Float, Boolean>) value;
  }

  public Map<Float, Character> getMapFloatChar(){
    return (Map<Float, Character>) value;
  }

  public Map<Float, Byte> getMapFloatByte(){
    return (Map<Float, Byte>) value;
  }

  public Map<Float, Short> getMapFloatShort(){
    return (Map<Float, Short>) value;
  }

  public Map<Float, Integer> getMapFloatInt(){
    return (Map<Float, Integer>) value;
  }

  public Map<Float, Long> getMapFloatLong(){
    return (Map<Float, Long>) value;
  }

  public Map<Float, Float> getMapFloatFloat(){
    return (Map<Float, Float>) value;
  }

  public Map<Float, Double> getMapFloatDouble(){
    return (Map<Float, Double>) value;
  }

  public Map<Float, String> getMapFloatString(){
    return (Map<Float, String>) value;
  }

  public Map<Float, BigDecimal> getMapFloatBigDecimal(){
    return (Map<Float, BigDecimal>) value;
  }

  public Map<Double, Object> getMapDoubleObject(){
    return (Map<Double, Object>) value;
  }

  public Map<Double, Boolean> getMapDoubleBoolean(){
    return (Map<Double, Boolean>) value;
  }

  public Map<Double, Character> getMapDoubleChar(){
    return (Map<Double, Character>) value;
  }

  public Map<Double, Byte> getMapDoubleByte(){
    return (Map<Double, Byte>) value;
  }

  public Map<Double, Short> getMapDoubleShort(){
    return (Map<Double, Short>) value;
  }

  public Map<Double, Integer> getMapDoubleInt(){
    return (Map<Double, Integer>) value;
  }

  public Map<Double, Long> getMapDoubleLong(){
    return (Map<Double, Long>) value;
  }

  public Map<Double, Float> getMapDoubleFloat(){
    return (Map<Double, Float>) value;
  }

  public Map<Double, Double> getMapDoubleDouble(){
    return (Map<Double, Double>) value;
  }

  public Map<Double, String> getMapDoubleString(){
    return (Map<Double, String>) value;
  }

  public Map<Double, BigDecimal> getMapDoubleBigDecimal(){
    return (Map<Double, BigDecimal>) value;
  }

  public Map<String, Object> getMapStringObject(){
    return (Map<String, Object>) value;
  }

  public Map<String, Boolean> getMapStringBoolean(){
    return (Map<String, Boolean>) value;
  }

  public Map<String, Character> getMapStringChar(){
    return (Map<String, Character>) value;
  }

  public Map<String, Byte> getMapStringByte(){
    return (Map<String, Byte>) value;
  }

  public Map<String, Short> getMapStringShort(){
    return (Map<String, Short>) value;
  }

  public Map<String, Integer> getMapStringInt(){
    return (Map<String, Integer>) value;
  }

  public Map<String, Long> getMapStringLong(){
    return (Map<String, Long>) value;
  }

  public Map<String, Float> getMapStringFloat(){
    return (Map<String, Float>) value;
  }

  public Map<String, Double> getMapStringDouble(){
    return (Map<String, Double>) value;
  }

  public Map<String, String> getMapStringString(){
    return (Map<String, String>) value;
  }

  public Map<String, BigDecimal> getMapStringBigDecimal(){
    return (Map<String, BigDecimal>) value;
  }

  public Map<BigDecimal, Byte> getMapBigDecimalByte(){
    return (Map<BigDecimal, Byte>) value;
  }

  public Map<BigDecimal, Short> getMapBigDecimalShort(){
    return (Map<BigDecimal, Short>) value;
  }

  public Map<BigDecimal, Integer> getMapBigDecimalInt(){
    return (Map<BigDecimal, Integer>) value;
  }

  public Map<BigDecimal, Long> getMapBigDecimalLong(){
    return (Map<BigDecimal, Long>) value;
  }

  public Map<BigDecimal, Float> getMapBigDecimalFloat(){
    return (Map<BigDecimal, Float>) value;
  }

  public Map<BigDecimal, Double> getMapBigDecimalDouble(){
    return (Map<BigDecimal, Double>) value;
  }

  public Map<BigDecimal, String> getMapBigDecimalString(){
    return (Map<BigDecimal, String>) value;
  }

  public Map<BigDecimal, BigDecimal> getMapBigDecimalBigDecimal(){
    return (Map<BigDecimal, BigDecimal>) value;
  }


}
