/*
 * Decompiled with CFR 0.150.
 */
package b.a;

import b.a.g;
import b.ag;
import java.lang.reflect.Constructor;

class d
implements ag {
    private final Constructor a;

    d(Constructor constructor) {
        this.a = constructor;
    }

    public Object a(String string) {
        return g.a(this.a, string);
    }

    public Class a() {
        return this.a.getDeclaringClass();
    }

    public String b() {
        return null;
    }
}

