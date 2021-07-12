import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

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


  @Override
  public String toString() {
    return value.toString();
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
    if (obj instanceof Collection){
      Collection<Object> object = (Collection<Object>) obj;
      Collection<Object> thisColl = (Collection<Object>) value;
      return object.equals(thisColl);
    }
    return this.equals(obj);

  }

  public int hashCode() {
    return value.hashCode();
  }

  public boolean toBoolean(){
    return (boolean) value;
  }

  public char toChar(){
    return (char) value;
  }

  public byte toByte(){
    return (byte) value;
  }

  public short toShort(){
    return (short) value;
  }

  public int toInt(){
    return (int) value;
  }

  public long toLong(){
    return (long) value;
  }

  public float toFloat(){
    return (float) value;
  }

  public double toDouble(){
    return (double) value;
  }

  public BigDecimal toBigDecimal(){
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


  //******Collections*********

  public boolean add(Object o){
    if (value instanceof Collection){
      return ((Collection<Object>) value).add(o);
    }
    throw new RuntimeException("This var is not a collection and add() cannot be applied to it");
  }

  public <T> void addAll(Collection<T> values){
    if (value instanceof Collection){
      ((Collection<T>) value).addAll(values);
      return;
    }
    throw new RuntimeException("This var is not a collection and addAll() cannot be applied to it");
  }

  public <T> void clear(){
    if (value instanceof Collection){
      ((Collection<T>) value).clear();
      return;
    }
    throw new RuntimeException("This var is not a collection and clear() cannot be applied to it");
  }

  public boolean contains(Object o){
    if (value instanceof Collection){
      return ((Collection<Object>) value).contains(o);
    }
    throw new RuntimeException("This var is not a collection and contains() cannot be applied to it");
  }

  public <T> boolean containsAll(Collection<T> values){
    if (value instanceof Collection){
      return ((Collection<T>) value).containsAll(values);
    }
    throw new RuntimeException("This var is not a collection and containsAll() cannot be applied to it");
  }

  public boolean isEmpty(){
    if (value instanceof Collection){
      return ((Collection<Object>) value).isEmpty();
    }
    throw new RuntimeException("This var is not a collection and isEmpty() cannot be applied to it");
  }

  public <T> Iterator<T> iterator(){
    if (value instanceof Collection){
      return ((Collection<T>) value).iterator();
    }
    throw new RuntimeException("This var is not a collection and iterator() cannot be applied to it");
  }

  public boolean remove(Object o){
    if (value instanceof Collection){
      return ((Collection<Object>) value).remove(o);
    }
    throw new RuntimeException("This var is not a collection and remove() cannot be applied to it");
  }

  public boolean removeAll(Collection c) {
    if (value instanceof Collection){
      return ((Collection<Object>) value).removeAll(c);
    }
    throw new RuntimeException("This var is not a collection and removeAll() cannot be applied to it");
  }

  public boolean retainAll(Collection c) {
    if (value instanceof Collection){
      return ((Collection<Object>) value).retainAll(c);
    }
    throw new RuntimeException("This var is not a collection and retainAll() cannot be applied to it");
  }

  public int size() {
    if (value instanceof Collection){
      return ((Collection<Object>) value).size();
    }
    throw new RuntimeException("This var is not a collection and size() cannot be applied to it");
  }

  public Object[] toArray() {
    if (value instanceof Collection){
      return ((Collection<Object>) value).toArray();
    }
    throw new RuntimeException("This var is not a collection and toArray() cannot be applied to it");
  }

  public <T> T[] toArray(T[] a) {
    if (value instanceof Collection){
      return ((Collection<T>) value).toArray(a);
    }
    throw new RuntimeException("This var is not a collection and toArray() cannot be applied to it");
  }

//  public Spliterator spliterator() {
//    if (value instanceof Collection){
//      Collection<Object> objs = new ArrayList<>();
//      objs.addAll((Collection<String>) value);
//      return objs.spliterator();
//    }
//    throw new RuntimeException("This var is not a collection and spliterator() cannot be applied to it");
//  }

  public Stream stream() {
    if (value instanceof Collection){
      return ((Collection<Object>) value).stream();
    }
    throw new RuntimeException("This var is not a collection and stream() cannot be applied to it");
  }

  public Stream parallelStream() {
    if (value instanceof Collection){
      return ((Collection<Object>) value).parallelStream();
    }
    throw new RuntimeException("This var is not a collection and parallelStream() cannot be applied to it");
  }

  public boolean removeIf(Predicate filter) {
    if (value instanceof Collection){
      return ((Collection<Object>) value).removeIf(filter);
    }
    throw new RuntimeException("This var is not a collection and removeIf() cannot be applied to it");
  }

  public void forEach(Consumer action) {
    if (value instanceof Collection){
      ((Collection<Object>) value).forEach(action);
      return;
    }
    throw new RuntimeException("This var is not a collection and forEach() cannot be applied to it");
  }



  //ArrayList
  public ArrayList<Object> toArrayListObject(){
    return (ArrayList<Object>) value;
  }

  public ArrayList<Boolean> toArrayListBoolean(){
    return (ArrayList<Boolean>) value;
  }

  public ArrayList<Character> toArrayListChar(){
    return (ArrayList<Character>) value;
  }

  public ArrayList<Byte> toArrayListByte(){
    return (ArrayList<Byte>) value;
  }

  public ArrayList<Short> toArrayListShort(){
    return (ArrayList<Short>) value;
  }

  public ArrayList<Integer> toArrayListInt(){
    return (ArrayList<Integer>) value;
  }

  public ArrayList<Long> toArrayListLong(){
    return (ArrayList<Long>) value;
  }

  public ArrayList<Float> toArrayListFloat(){
    return (ArrayList<Float>) value;
  }

  public ArrayList<Double> toArrayListDouble(){
    return (ArrayList<Double>) value;
  }

  public ArrayList<String> toArrayListString(){
    return (ArrayList<String>) value;
  }

  public ArrayList<BigDecimal> toArrayListBigDecimal(){
    return (ArrayList<BigDecimal>) value;
  }


  //Set
  public Set<Object> toSetObject(){
    return (Set<Object>) value;
  }

  public Set<Boolean> toSetBoolean(){
    return (Set<Boolean>) value;
  }

  public Set<Character> toSetChar(){
    return (Set<Character>) value;
  }

  public Set<Byte> toSetByte(){
    return (Set<Byte>) value;
  }

  public Set<Short> toSetShort(){
    return (Set<Short>) value;
  }

  public Set<Integer> toSetInt(){
    return (Set<Integer>) value;
  }

  public Set<Long> toSetLong(){
    return (Set<Long>) value;
  }

  public Set<Float> toSetFloat(){
    return (Set<Float>) value;
  }

  public Set<Double> toSetDouble(){
    return (Set<Double>) value;
  }

  public Set<String> toSetString(){
    return (Set<String>) value;
  }

  public Set<BigDecimal> toSetBigDecimal(){
    return (Set<BigDecimal>) value;
  }


  //Queue
  public Queue<Object> toQueueObject(){
    return (Queue<Object>) value;
  }

  public Queue<Boolean> toQueueBoolean(){
    return (Queue<Boolean>) value;
  }

  public Queue<Character> toQueueChar(){
    return (Queue<Character>) value;
  }

  public Queue<Byte> toQueueByte(){
    return (Queue<Byte>) value;
  }

  public Queue<Short> toQueueShort(){
    return (Queue<Short>) value;
  }

  public Queue<Integer> toQueueInt(){
    return (Queue<Integer>) value;
  }

  public Queue<Long> toQueueLong(){
    return (Queue<Long>) value;
  }

  public Queue<Float> toQueueFloat(){
    return (Queue<Float>) value;
  }

  public Queue<Double> toQueueDouble(){
    return (Queue<Double>) value;
  }

  public Queue<String> toQueueString(){
    return (Queue<String>) value;
  }

  public Queue<BigDecimal> toQueueBigDecimal(){
    return (Queue<BigDecimal>) value;
  }


  //linked list
  public LinkedList<Object> toLinkedListObject(){
    return (LinkedList<Object>) value;
  }

  public LinkedList<Boolean> toLinkedListBoolean(){
    return (LinkedList<Boolean>) value;
  }

  public LinkedList<Character> toLinkedListChar(){
    return (LinkedList<Character>) value;
  }

  public LinkedList<Byte> toLinkedListByte(){
    return (LinkedList<Byte>) value;
  }

  public LinkedList<Short> toLinkedListShort(){
    return (LinkedList<Short>) value;
  }

  public LinkedList<Integer> toLinkedListInt(){
    return (LinkedList<Integer>) value;
  }

  public LinkedList<Long> toLinkedListLong(){
    return (LinkedList<Long>) value;
  }

  public LinkedList<Float> toLinkedListFloat(){
    return (LinkedList<Float>) value;
  }

  public LinkedList<Double> toLinkedListDouble(){
    return (LinkedList<Double>) value;
  }

  public LinkedList<String> toLinkedListString(){
    return (LinkedList<String>) value;
  }

  public LinkedList<BigDecimal> toLinkedListBigDecimal(){
    return (LinkedList<BigDecimal>) value;
  }


  //Vector
  public Vector<Object> toVectorObject(){
    return (Vector<Object>) value;
  }

  public Vector<Boolean> toVectorBoolean(){
    return (Vector<Boolean>) value;
  }

  public Vector<Character> toVectorChar(){
    return (Vector<Character>) value;
  }

  public Vector<Byte> toVectorByte(){
    return (Vector<Byte>) value;
  }

  public Vector<Short> toVectorShort(){
    return (Vector<Short>) value;
  }

  public Vector<Integer> toVectorInt(){
    return (Vector<Integer>) value;
  }

  public Vector<Long> toVectorLong(){
    return (Vector<Long>) value;
  }

  public Vector<Float> toVectorFloat(){
    return (Vector<Float>) value;
  }

  public Vector<Double> toVectorDouble(){
    return (Vector<Double>) value;
  }

  public Vector<String> toVectorString(){
    return (Vector<String>) value;
  }

  public Vector<BigDecimal> toVectorBigDecimal(){
    return (Vector<BigDecimal>) value;
  }


  //Stack
  public Stack<Object> toStackObject(){
    return (Stack<Object>) value;
  }

  public Stack<Boolean> toStackBoolean(){
    return (Stack<Boolean>) value;
  }

  public Stack<Character> toStackChar(){
    return (Stack<Character>) value;
  }

  public Stack<Byte> toStackByte(){
    return (Stack<Byte>) value;
  }

  public Stack<Short> toStackShort(){
    return (Stack<Short>) value;
  }

  public Stack<Integer> toStackInt(){
    return (Stack<Integer>) value;
  }

  public Stack<Long> toStackLong(){
    return (Stack<Long>) value;
  }

  public Stack<Float> toStackFloat(){
    return (Stack<Float>) value;
  }

  public Stack<Double> toStackDouble(){
    return (Stack<Double>) value;
  }

  public Stack<String> toStackString(){
    return (Stack<String>) value;
  }

  public Stack<BigDecimal> toStackBigDecimal(){
    return (Stack<BigDecimal>) value;
  }


  //Map
  public Map<Object, Object> toMapObjectObject(){
    return (Map<Object, Object>) value;
  }

  public Map<Object, Boolean> toMapObjectBoolean(){
    return (Map<Object, Boolean>) value;
  }

  public Map<Object, Character> toMapObjectChar(){
    return (Map<Object, Character>) value;
  }

  public Map<Object, Byte> toMapObjectByte(){
    return (Map<Object, Byte>) value;
  }

  public Map<Object, Short> toMapObjectShort(){
    return (Map<Object, Short>) value;
  }

  public Map<Object, Integer> toMapObjectInt(){
    return (Map<Object, Integer>) value;
  }

  public Map<Object, Long> toMapObjectLong(){
    return (Map<Object, Long>) value;
  }

  public Map<Object, Float> toMapObjectFloat(){
    return (Map<Object, Float>) value;
  }

  public Map<Object, Double> toMapObjectDouble(){
    return (Map<Object, Double>) value;
  }

  public Map<Object, String> toMapObjectString(){
    return (Map<Object, String>) value;
  }

  public Map<Object, BigDecimal> toMapObjectBigDecimal(){
    return (Map<Object, BigDecimal>) value;
  }

  public Map<Boolean, Object> toMapBooleanObject(){
    return (Map<Boolean, Object>) value;
  }

  public Map<Boolean, Boolean> toMapBooleanBoolean(){
    return (Map<Boolean, Boolean>) value;
  }

  public Map<Boolean, Character> toMapBooleanChar(){
    return (Map<Boolean, Character>) value;
  }

  public Map<Boolean, Byte> toMapBooleanByte(){
    return (Map<Boolean, Byte>) value;
  }

  public Map<Boolean, Short> toMapBooleanShort(){
    return (Map<Boolean, Short>) value;
  }

  public Map<Boolean, Integer> toMapBooleanInt(){
    return (Map<Boolean, Integer>) value;
  }

  public Map<Boolean, Long> toMapBooleanLong(){
    return (Map<Boolean, Long>) value;
  }

  public Map<Boolean, Float> toMapBooleanFloat(){
    return (Map<Boolean, Float>) value;
  }

  public Map<Boolean, Double> toMapBooleanDouble(){
    return (Map<Boolean, Double>) value;
  }

  public Map<Boolean, String> toMapBooleanString(){
    return (Map<Boolean, String>) value;
  }

  public Map<Boolean, BigDecimal> toMapBooleanBigDecimal(){
    return (Map<Boolean, BigDecimal>) value;
  }

  public Map<Character, Object> toMapCharacterObject(){
    return (Map<Character, Object>) value;
  }

  public Map<Character, Boolean> toMapCharacterBoolean(){
    return (Map<Character, Boolean>) value;
  }

  public Map<Character, Character> toMapCharacterChar(){
    return (Map<Character, Character>) value;
  }

  public Map<Character, Byte> toMapCharacterByte(){
    return (Map<Character, Byte>) value;
  }

  public Map<Character, Short> toMapCharacterShort(){
    return (Map<Character, Short>) value;
  }

  public Map<Character, Integer> toMapCharacterInt(){
    return (Map<Character, Integer>) value;
  }

  public Map<Character, Long> toMapCharacterLong(){
    return (Map<Character, Long>) value;
  }

  public Map<Character, Float> toMapCharacterFloat(){
    return (Map<Character, Float>) value;
  }

  public Map<Character, Double> toMapCharacterDouble(){
    return (Map<Character, Double>) value;
  }

  public Map<Character, String> toMapCharacterString(){
    return (Map<Character, String>) value;
  }

  public Map<Character, BigDecimal> toMapCharacterBigDecimal(){
    return (Map<Character, BigDecimal>) value;
  }

  public Map<Byte, Object> toMapByteObject(){
    return (Map<Byte, Object>) value;
  }

  public Map<Byte, Boolean> toMapByteBoolean(){
    return (Map<Byte, Boolean>) value;
  }

  public Map<Byte, Character> toMapByteChar(){
    return (Map<Byte, Character>) value;
  }

  public Map<Byte, Byte> toMapByteByte(){
    return (Map<Byte, Byte>) value;
  }

  public Map<Byte, Short> toMapByteShort(){
    return (Map<Byte, Short>) value;
  }

  public Map<Byte, Integer> toMapByteInt(){
    return (Map<Byte, Integer>) value;
  }

  public Map<Byte, Long> toMapByteLong(){
    return (Map<Byte, Long>) value;
  }

  public Map<Byte, Float> toMapByteFloat(){
    return (Map<Byte, Float>) value;
  }

  public Map<Byte, Double> toMapByteDouble(){
    return (Map<Byte, Double>) value;
  }

  public Map<Byte, String> toMapByteString(){
    return (Map<Byte, String>) value;
  }

  public Map<Byte, BigDecimal> toMapByteBigDecimal(){
    return (Map<Byte, BigDecimal>) value;
  }

  public Map<Short, Object> toMapShortObject(){
    return (Map<Short, Object>) value;
  }

  public Map<Short, Boolean> toMapShortBoolean(){
    return (Map<Short, Boolean>) value;
  }

  public Map<Short, Character> toMapShortChar(){
    return (Map<Short, Character>) value;
  }

  public Map<Short, Byte> toMapShortByte(){
    return (Map<Short, Byte>) value;
  }

  public Map<Short, Short> toMapShortShort(){
    return (Map<Short, Short>) value;
  }

  public Map<Short, Integer> toMapShortInt(){
    return (Map<Short, Integer>) value;
  }

  public Map<Short, Long> toMapShortLong(){
    return (Map<Short, Long>) value;
  }

  public Map<Short, Float> toMapShortFloat(){
    return (Map<Short, Float>) value;
  }

  public Map<Short, Double> toMapShortDouble(){
    return (Map<Short, Double>) value;
  }

  public Map<Short, String> toMapShortString(){
    return (Map<Short, String>) value;
  }

  public Map<Short, BigDecimal> toMapShortBigDecimal(){
    return (Map<Short, BigDecimal>) value;
  }

  public Map<Integer, Object> toMapIntegerObject(){
    return (Map<Integer, Object>) value;
  }

  public Map<Integer, Boolean> toMapIntegerBoolean(){
    return (Map<Integer, Boolean>) value;
  }

  public Map<Integer, Character> toMapIntegerChar(){
    return (Map<Integer, Character>) value;
  }

  public Map<Integer, Byte> toMapIntegerByte(){
    return (Map<Integer, Byte>) value;
  }

  public Map<Integer, Short> toMapIntegerShort(){
    return (Map<Integer, Short>) value;
  }

  public Map<Integer, Integer> toMapIntegerInt(){
    return (Map<Integer, Integer>) value;
  }

  public Map<Integer, Long> toMapIntegerLong(){
    return (Map<Integer, Long>) value;
  }

  public Map<Integer, Float> toMapIntegerFloat(){
    return (Map<Integer, Float>) value;
  }

  public Map<Integer, Double> toMapIntegerDouble(){
    return (Map<Integer, Double>) value;
  }

  public Map<Integer, String> toMapIntegerString(){
    return (Map<Integer, String>) value;
  }

  public Map<Integer, BigDecimal> toMapIntegerBigDecimal(){
    return (Map<Integer, BigDecimal>) value;
  }

  public Map<Long, Object> toMapLongObject(){
    return (Map<Long, Object>) value;
  }

  public Map<Long, Boolean> toMapLongBoolean(){
    return (Map<Long, Boolean>) value;
  }

  public Map<Long, Character> toMapLongChar(){
    return (Map<Long, Character>) value;
  }

  public Map<Long, Byte> toMapLongByte(){
    return (Map<Long, Byte>) value;
  }

  public Map<Long, Short> toMapLongShort(){
    return (Map<Long, Short>) value;
  }

  public Map<Long, Integer> toMapLongInt(){
    return (Map<Long, Integer>) value;
  }

  public Map<Long, Long> toMapLongLong(){
    return (Map<Long, Long>) value;
  }

  public Map<Long, Float> toMapLongFloat(){
    return (Map<Long, Float>) value;
  }

  public Map<Long, Double> toMapLongDouble(){
    return (Map<Long, Double>) value;
  }

  public Map<Long, String> toMapLongString(){
    return (Map<Long, String>) value;
  }

  public Map<Long, BigDecimal> toMapLongBigDecimal(){
    return (Map<Long, BigDecimal>) value;
  }

  public Map<Float, Object> toMapFloatObject(){
    return (Map<Float, Object>) value;
  }

  public Map<Float, Boolean> toMapFloatBoolean(){
    return (Map<Float, Boolean>) value;
  }

  public Map<Float, Character> toMapFloatChar(){
    return (Map<Float, Character>) value;
  }

  public Map<Float, Byte> toMapFloatByte(){
    return (Map<Float, Byte>) value;
  }

  public Map<Float, Short> toMapFloatShort(){
    return (Map<Float, Short>) value;
  }

  public Map<Float, Integer> toMapFloatInt(){
    return (Map<Float, Integer>) value;
  }

  public Map<Float, Long> toMapFloatLong(){
    return (Map<Float, Long>) value;
  }

  public Map<Float, Float> toMapFloatFloat(){
    return (Map<Float, Float>) value;
  }

  public Map<Float, Double> toMapFloatDouble(){
    return (Map<Float, Double>) value;
  }

  public Map<Float, String> toMapFloatString(){
    return (Map<Float, String>) value;
  }

  public Map<Float, BigDecimal> toMapFloatBigDecimal(){
    return (Map<Float, BigDecimal>) value;
  }

  public Map<Double, Object> toMapDoubleObject(){
    return (Map<Double, Object>) value;
  }

  public Map<Double, Boolean> toMapDoubleBoolean(){
    return (Map<Double, Boolean>) value;
  }

  public Map<Double, Character> toMapDoubleChar(){
    return (Map<Double, Character>) value;
  }

  public Map<Double, Byte> toMapDoubleByte(){
    return (Map<Double, Byte>) value;
  }

  public Map<Double, Short> toMapDoubleShort(){
    return (Map<Double, Short>) value;
  }

  public Map<Double, Integer> toMapDoubleInt(){
    return (Map<Double, Integer>) value;
  }

  public Map<Double, Long> toMapDoubleLong(){
    return (Map<Double, Long>) value;
  }

  public Map<Double, Float> toMapDoubleFloat(){
    return (Map<Double, Float>) value;
  }

  public Map<Double, Double> toMapDoubleDouble(){
    return (Map<Double, Double>) value;
  }

  public Map<Double, String> toMapDoubleString(){
    return (Map<Double, String>) value;
  }

  public Map<Double, BigDecimal> toMapDoubleBigDecimal(){
    return (Map<Double, BigDecimal>) value;
  }

  public Map<String, Object> toMapStringObject(){
    return (Map<String, Object>) value;
  }

  public Map<String, Boolean> toMapStringBoolean(){
    return (Map<String, Boolean>) value;
  }

  public Map<String, Character> toMapStringChar(){
    return (Map<String, Character>) value;
  }

  public Map<String, Byte> toMapStringByte(){
    return (Map<String, Byte>) value;
  }

  public Map<String, Short> toMapStringShort(){
    return (Map<String, Short>) value;
  }

  public Map<String, Integer> toMapStringInt(){
    return (Map<String, Integer>) value;
  }

  public Map<String, Long> toMapStringLong(){
    return (Map<String, Long>) value;
  }

  public Map<String, Float> toMapStringFloat(){
    return (Map<String, Float>) value;
  }

  public Map<String, Double> toMapStringDouble(){
    return (Map<String, Double>) value;
  }

  public Map<String, String> toMapStringString(){
    return (Map<String, String>) value;
  }

  public Map<String, BigDecimal> toMapStringBigDecimal(){
    return (Map<String, BigDecimal>) value;
  }

  public Map<BigDecimal, Byte> toMapBigDecimalByte(){
    return (Map<BigDecimal, Byte>) value;
  }

  public Map<BigDecimal, Short> toMapBigDecimalShort(){
    return (Map<BigDecimal, Short>) value;
  }

  public Map<BigDecimal, Integer> toMapBigDecimalInt(){
    return (Map<BigDecimal, Integer>) value;
  }

  public Map<BigDecimal, Long> toMapBigDecimalLong(){
    return (Map<BigDecimal, Long>) value;
  }

  public Map<BigDecimal, Float> toMapBigDecimalFloat(){
    return (Map<BigDecimal, Float>) value;
  }

  public Map<BigDecimal, Double> toMapBigDecimalDouble(){
    return (Map<BigDecimal, Double>) value;
  }

  public Map<BigDecimal, String> toMapBigDecimalString(){
    return (Map<BigDecimal, String>) value;
  }

  public Map<BigDecimal, BigDecimal> toMapBigDecimalBigDecimal(){
    return (Map<BigDecimal, BigDecimal>) value;
  }


}
