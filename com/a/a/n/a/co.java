/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.bl;
import java.lang.reflect.Constructor;
import java.util.Arrays;

final class co
implements bl {
    co() {
    }

    public Boolean a(Constructor constructor) {
        return Arrays.asList(constructor.getParameterTypes()).contains(String.class);
    }
}

