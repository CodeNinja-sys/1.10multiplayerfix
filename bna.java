/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

final class bna
implements ParameterizedType {
    bna() {
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{String.class, dca.class};
    }

    @Override
    public Type getRawType() {
        return Map.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

