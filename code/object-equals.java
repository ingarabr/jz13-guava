@Override public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Name other = (Name) obj;
    return Objects.equal(firstname, other.firstname) &&
            Objects.equal(lastname, other.lastname);
// Java 7:
//    return java.util.Objects.equals(firstname, other.firstname) &&
//            java.util.Objects.equals(lastname, other.lastname)
}

