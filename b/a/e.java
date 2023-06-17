/*
 * Decompiled with CFR 0.150.
 */
package b.a;

import b.a.g;
import b.ag;
import java.lang.reflect.Method;

class e
implements ag {
    private final Method a;
    private final Class b;

    e(Method method, Class class_) {
        this.a = method;
        this.b = class_;
    }

    public Object a(String string) {
        return this.b.cast(g.a(this.a, string));
    }

    public Class a() {
        return this.b;
    }

    public String b() {
        return null;
    }
}

