/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.ak;
import java.lang.reflect.Method;

final class al
extends ak {
    final /* synthetic */ Method a;
    final /* synthetic */ Object b;

    al(Method method, Object object) {
        this.a = method;
        this.b = object;
    }

    public Object a(Class class_) {
        return this.a.invoke(this.b, class_);
    }
}

