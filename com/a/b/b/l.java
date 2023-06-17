/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.ae;
import com.a.b.b.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class l
implements ae {
    final /* synthetic */ Constructor a;
    final /* synthetic */ f b;

    l(f f2, Constructor constructor) {
        this.b = f2;
        this.a = constructor;
    }

    public Object a() {
        try {
            Object[] arrobject = null;
            return this.a.newInstance(arrobject);
        }
        catch (InstantiationException instantiationException) {
            throw new RuntimeException("Failed to invoke " + this.a + " with no args", instantiationException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new RuntimeException("Failed to invoke " + this.a + " with no args", invocationTargetException.getTargetException());
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError((Object)illegalAccessException);
        }
    }
}

