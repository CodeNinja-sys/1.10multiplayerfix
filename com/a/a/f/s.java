/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.f;

import com.a.a.f.n;
import java.lang.reflect.Method;

final class s
extends n {
    public s(Object object, Method method) {
        super(object, method);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(Object object) {
        s s2 = this;
        synchronized (s2) {
            super.a(object);
        }
    }
}

