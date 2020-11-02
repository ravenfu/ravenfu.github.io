
private <T> Class<T> getGenericClass() {
    Type superClass = this.getClass().getGenericSuperclass();
    Type type = ((ParameterizedType) superClass).getActualTypeArguments()[0];
    if (type instanceof ParameterizedType) {
        return (Class<T>) ((ParameterizedType) type).getRawType();
    } else {
        return (Class<T>) type;
    }
}