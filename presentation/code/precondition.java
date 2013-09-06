private void input(int size, Object valueOne, Object valueTwo) {
    checkNotNull(valueOne, "valueOne can't be null");
    checkNotNull(valueTwo, "valueTwo can't be null");

    checkArgument(size >= 0, "size have to be positivel");
}