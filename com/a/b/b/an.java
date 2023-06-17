/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.ak;
import java.lang.reflect.Method;

final class an
extends ak {
    final /* synthetic */ Method a;
    final /* synthetic */ int b;

    an(Method method, int n2) {
        this.a = method;
        this.b = n2;
    }

    public Object a(Class class_) {
        return this.a.invoke(null, class_, this.b);
    }
}

