/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.b;

class e {
    static final e a = new e(null);
    private final String b;
    private final Throwable c;
    private final Object[] d;

    e(String string) {
        this(string, null, null);
    }

    e(String string, Object[] arrobject, Throwable throwable) {
        this.b = string;
        this.c = throwable;
        this.d = throwable == null ? arrobject : e.a(arrobject);
    }

    static Object[] a(Object[] arrobject) {
        if (arrobject == null || arrobject.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int n2 = arrobject.length - 1;
        Object[] arrobject2 = new Object[n2];
        System.arraycopy(arrobject, 0, arrobject2, 0, n2);
        return arrobject2;
    }

    public String a() {
        return this.b;
    }

    public Object[] b() {
        return this.d;
    }

    public Throwable c() {
        return this.c;
    }
}

