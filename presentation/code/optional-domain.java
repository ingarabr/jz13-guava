private Optional<String> getOptionalOf(boolean hasValue) {
    if (hasValue) {
        return Optional.of("aValue"); // throws NPE if value is null
    }
    return Optional.absent();
}

private Optional<String> getAbsent() {
        return Optional.absent();
}

private Optional<String> getOptional(String value) {
        return Optional.fromNullable(value); // returns absent if value is null
}