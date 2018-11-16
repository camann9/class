public class Node {
  public Node next;
  public String value;
  
  public boolean equals(Node other) {
    if (other == null) {
      return false;
    }
    if (value != other.value) {
      return false;
    }
    if (next == null && other.next == null) {
      return true;
    }
    return next.equals(other.next);
  }
  
  public static String asString(Node head) {
    StringBuilder sb = new StringBuilder();
    sb.append("Head: " + head + "\n");
    Node current = head;
    while (current != null) {
      sb.append("\n" + current + "\n");
      sb.append("Value: " + current.value + "\n");
      sb.append("Next: " + current.next + "\n");
      current = current.next;
    }
    return sb.toString();
  }
}
