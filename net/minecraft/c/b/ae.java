/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import net.minecraft.c.b.f;

class ae
implements ParameterizedType {
    ae() {
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{f.class};
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

