/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a.a;

import org.lwjgl.util.a.a.j;
import org.lwjgl.util.a.a.k;
import org.lwjgl.util.a.a.o;
import org.lwjgl.util.a.a.s;

abstract class n {
    public static final int a = 32;

    n() {
    }

    public static boolean a(o o2, Object object, Object object2) {
        return k.b((j)object, (j)object2);
    }

    static n a(o o2) {
        return new s(o2);
    }

    abstract void a();

    abstract boolean b();

    abstract int a(Object var1);

    abstract Object c();

    abstract void a(int var1);

    abstract Object d();

    abstract boolean e();
}

