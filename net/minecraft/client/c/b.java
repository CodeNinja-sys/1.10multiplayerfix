/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import net.minecraft.client.c.q;

class b
implements ParameterizedType {
    b() {
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{String.class, q.class};
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

