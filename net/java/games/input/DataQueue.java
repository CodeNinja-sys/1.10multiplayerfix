/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

final class DataQueue {
    private final Object[] c;
    private int d;
    private int e;
    static final boolean a = !(b == null ? (b = DataQueue.a("net.java.games.input.DataQueue")) : b).desiredAssertionStatus();
    static Class b;

    public DataQueue(int n2, Class class_) {
        this.c = new Object[n2];
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            try {
                this.c[i2] = class_.newInstance();
                continue;
            }
            catch (InstantiationException instantiationException) {
                throw new RuntimeException(instantiationException);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException(illegalAccessException);
            }
        }
        this.a();
    }

    public final void a() {
        this.d = 0;
        this.e = this.c.length;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    public final Object a(int n2) {
        if (!a && n2 >= this.e) {
            throw new AssertionError();
        }
        return this.c[n2];
    }

    public final Object d() {
        if (!this.g()) {
            return null;
        }
        return this.a(this.d++);
    }

    public final void e() {
        int n2 = 0;
        while (this.g()) {
            this.a(this.d, n2);
            ++this.d;
            ++n2;
        }
        this.d = n2;
        this.e = this.c.length;
    }

    private final void a(int n2, int n3) {
        Object object = this.c[n2];
        this.c[n2] = this.c[n3];
        this.c[n3] = object;
    }

    public final void f() {
        this.e = this.d;
        this.d = 0;
    }

    public final boolean g() {
        return this.h() > 0;
    }

    public final int h() {
        return this.e - this.d;
    }

    public final void b(int n2) {
        this.d = n2;
    }

    public final Object[] i() {
        return this.c;
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

