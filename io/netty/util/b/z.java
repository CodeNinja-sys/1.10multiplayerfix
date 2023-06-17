/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.c.f;
import io.netty.util.c.u;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public class z {
    private static final int a = f.e();
    private final int b = f.e();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void c() {
        f f2 = f.a();
        if (f2 == null) {
            return;
        }
        try {
            Object object = f2.c(a);
            if (object != null && object != f.a) {
                z[] arrz;
                Set set = (Set)object;
                for (z z2 : arrz = set.toArray(new z[set.size()])) {
                    z2.c(f2);
                }
            }
        }
        finally {
            f.c();
        }
    }

    public static int d() {
        f f2 = f.a();
        if (f2 == null) {
            return 0;
        }
        return f2.g();
    }

    public static void e() {
        f.d();
    }

    private static void a(f f2, z z2) {
        Set set;
        Object object = f2.c(a);
        if (object == f.a || object == null) {
            set = Collections.newSetFromMap(new IdentityHashMap());
            f2.a(a, set);
        } else {
            set = (Set)object;
        }
        set.add(z2);
    }

    private static void b(f f2, z z2) {
        Object object = f2.c(a);
        if (object == f.a || object == null) {
            return;
        }
        Set set = (Set)object;
        set.remove(z2);
    }

    public final Object f() {
        return this.a(f.b());
    }

    public final Object a(f f2) {
        Object object = f2.c(this.b);
        if (object != f.a) {
            return object;
        }
        return this.d(f2);
    }

    private Object d(f f2) {
        Object object = null;
        try {
            object = this.b();
        }
        catch (Exception exception) {
            u.a(exception);
        }
        f2.a(this.b, object);
        z.a(f2, this);
        return object;
    }

    public final void b(Object object) {
        if (object != f.a) {
            this.a(f.b(), object);
        } else {
            this.h();
        }
    }

    public final void a(f f2, Object object) {
        if (object != f.a) {
            if (f2.a(this.b, object)) {
                z.a(f2, this);
            }
        } else {
            this.c(f2);
        }
    }

    public final boolean g() {
        return this.b(f.a());
    }

    public final boolean b(f f2) {
        return f2 != null && f2.e(this.b);
    }

    public final void h() {
        this.c(f.a());
    }

    public final void c(f f2) {
        if (f2 == null) {
            return;
        }
        Object object = f2.d(this.b);
        z.b(f2, this);
        if (object != f.a) {
            try {
                this.a(object);
            }
            catch (Exception exception) {
                u.a(exception);
            }
        }
    }

    protected Object b() {
        return null;
    }

    protected void a(Object object) {
    }
}

