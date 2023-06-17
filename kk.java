/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

final class kk
implements ParameterizedType {
    kk() {
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{blr.class};
    }

    @Override
    public Type getRawType() {
        return List.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

