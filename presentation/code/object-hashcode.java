@Override
public int hashCode(){
        return Objects.hashCode(firstname,lastname);
// Java 7:
// return java.util.Objects.hash(firstname, lastname);
}


