Closer closer = Closer.create();
try {
    InputStream doesNotExist = closer.register(getInputStream());
    byte[] b = new byte[2];
    int read = doesNotExist.read(b, 0, 2);
} catch (Exception e) {
        throw closer.rethrow(e);
} finally {
        closer.close();
}

private InputStream getInputStream() {
        return getClass().getResourceAsStream("doesNotExist");
}