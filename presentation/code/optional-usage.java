getOptional(null).isPresent(); // false
getOptional("aValue").isPresent(); // true

getOptional("aValue").or("anotherValue"); // aValue
getOptional(null).or("anotherValue"); // anotherValue

getOptional(null).get(); // throws IllegalStateException
getOptional(null).orNull();
