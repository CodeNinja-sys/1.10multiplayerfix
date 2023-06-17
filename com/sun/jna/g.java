/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Callback;
import com.sun.jna.FromNativeConverter;
import com.sun.jna.Native;
import com.sun.jna.ToNativeConverter;
import com.sun.jna.av;
import com.sun.jna.ay;
import com.sun.jna.bc;
import com.sun.jna.bd;
import com.sun.jna.bj;
import com.sun.jna.bu;
import com.sun.jna.bw;
import com.sun.jna.c;
import com.sun.jna.d;
import com.sun.jna.e;
import com.sun.jna.i;
import com.sun.jna.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class g
implements d {
    private Method c;
    private ToNativeConverter d;
    private FromNativeConverter[] e;
    private final e f;

    public g(e e2, Method method, bu bu2) {
        this.f = e2;
        this.c = method;
        Class<?>[] arrclass = method.getParameterTypes();
        Class<?> class_ = method.getReturnType();
        this.e = new FromNativeConverter[arrclass.length];
        if ((com.sun.jna.e.l == null ? (com.sun.jna.e.l = com.sun.jna.e.a("com.sun.jna.au")) : com.sun.jna.e.l).isAssignableFrom(class_)) {
            this.d = av.a(class_);
        } else if (bu2 != null) {
            this.d = bu2.b(class_);
        }
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            if ((com.sun.jna.e.l == null ? com.sun.jna.e.a("com.sun.jna.au") : com.sun.jna.e.l).isAssignableFrom(arrclass[i2])) {
                this.e[i2] = new av(arrclass[i2]);
                continue;
            }
            if (bu2 == null) continue;
            this.e[i2] = bu2.a(arrclass[i2]);
        }
        if (!method.isAccessible()) {
            try {
                method.setAccessible(true);
            }
            catch (SecurityException securityException) {
                throw new IllegalArgumentException("Callback method is inaccessible, make sure the interface is public: " + method);
            }
        }
    }

    public Callback c() {
        return com.sun.jna.e.a(this.f);
    }

    private Object b(Object[] arrobject) {
        Object object;
        Class<?>[] arrclass = this.c.getParameterTypes();
        Object[] arrobject2 = new Object[arrobject.length];
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            object = arrclass[i2];
            Object object2 = arrobject[i2];
            if (this.e[i2] != null) {
                c c2 = new c((Class)object, this.c, arrobject, i2);
                arrobject2[i2] = this.e[i2].a(object2, c2);
                continue;
            }
            arrobject2[i2] = this.a(object2, (Class)object);
        }
        Object object3 = null;
        object = this.c();
        if (object != null) {
            try {
                object3 = this.a(this.c.invoke(object, arrobject2));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                Native.d().a((Callback)object, illegalArgumentException);
            }
            catch (IllegalAccessException illegalAccessException) {
                Native.d().a((Callback)object, illegalAccessException);
            }
            catch (InvocationTargetException invocationTargetException) {
                Native.d().a((Callback)object, invocationTargetException.getTargetException());
            }
        }
        for (int i3 = 0; i3 < arrobject2.length; ++i3) {
            if (!(arrobject2[i3] instanceof bd) || arrobject2[i3] instanceof bj) continue;
            ((bd)arrobject2[i3]).r();
        }
        return object3;
    }

    public Object a(Object[] arrobject) {
        try {
            return this.b(arrobject);
        }
        catch (Throwable throwable) {
            Native.d().a(this.c(), throwable);
            return null;
        }
    }

    private Object a(Object object, Class class_) {
        if (object instanceof ay) {
            if (class_ == (com.sun.jna.e.m == null ? (com.sun.jna.e.m = com.sun.jna.e.a("java.lang.String")) : com.sun.jna.e.m)) {
                object = ((ay)object).o(0L);
            } else if (class_ == (com.sun.jna.e.n == null ? (com.sun.jna.e.n = com.sun.jna.e.a("com.sun.jna.bw")) : com.sun.jna.e.n)) {
                object = new bw(((ay)object).a(0L, true));
            } else if (class_ == (com.sun.jna.e.o == null ? (com.sun.jna.e.o = com.sun.jna.e.a("[Ljava.lang.String;")) : com.sun.jna.e.o) || class_ == (com.sun.jna.e.p == null ? (com.sun.jna.e.p = com.sun.jna.e.a("[Lcom.sun.jna.bw;")) : com.sun.jna.e.p)) {
                object = ((ay)object).b(0L, class_ == (com.sun.jna.e.p == null ? (com.sun.jna.e.p = com.sun.jna.e.a("[Lcom.sun.jna.bw;")) : com.sun.jna.e.p));
            } else if ((com.sun.jna.e.q == null ? (com.sun.jna.e.q = com.sun.jna.e.a("com.sun.jna.Callback")) : com.sun.jna.e.q).isAssignableFrom(class_)) {
                object = com.sun.jna.e.a(class_, (ay)object);
            } else if ((com.sun.jna.e.i == null ? (com.sun.jna.e.i = com.sun.jna.e.a("com.sun.jna.bd")) : com.sun.jna.e.i).isAssignableFrom(class_)) {
                bd bd2 = bd.a(class_);
                if ((com.sun.jna.e.j == null ? (com.sun.jna.e.j = com.sun.jna.e.a("com.sun.jna.bj")) : com.sun.jna.e.j).isAssignableFrom(class_)) {
                    byte[] arrby = new byte[bd2.e()];
                    ((ay)object).a(0L, arrby, 0, arrby.length);
                    bd2.g().b(0L, arrby, 0, arrby.length);
                } else {
                    bd2.a((ay)object);
                }
                bd2.j();
                object = bd2;
            }
        } else if ((Boolean.TYPE == class_ || (com.sun.jna.e.r == null ? (com.sun.jna.e.r = com.sun.jna.e.a("java.lang.Boolean")) : com.sun.jna.e.r) == class_) && object instanceof Number) {
            object = n.a(((Number)object).intValue() != 0);
        }
        return object;
    }

    private Object a(Object object) {
        Class<?> class_;
        if (this.d != null) {
            object = this.d.a(object, new i(this.c));
        }
        if (object == null) {
            return null;
        }
        if ((com.sun.jna.e.i == null ? (com.sun.jna.e.i = com.sun.jna.e.a("com.sun.jna.bd")) : com.sun.jna.e.i).isAssignableFrom(class_ = object.getClass())) {
            if ((com.sun.jna.e.j == null ? (com.sun.jna.e.j = com.sun.jna.e.a("com.sun.jna.bj")) : com.sun.jna.e.j).isAssignableFrom(class_)) {
                return object;
            }
            return ((bd)object).g();
        }
        if (class_ == Boolean.TYPE || class_ == (com.sun.jna.e.r == null ? (com.sun.jna.e.r = com.sun.jna.e.a("java.lang.Boolean")) : com.sun.jna.e.r)) {
            return Boolean.TRUE.equals(object) ? n.e : n.f;
        }
        if (class_ == (com.sun.jna.e.m == null ? (com.sun.jna.e.m = com.sun.jna.e.a("java.lang.String")) : com.sun.jna.e.m) || class_ == (com.sun.jna.e.n == null ? (com.sun.jna.e.n = com.sun.jna.e.a("com.sun.jna.bw")) : com.sun.jna.e.n)) {
            return com.sun.jna.e.a(object, class_ == (com.sun.jna.e.n == null ? (com.sun.jna.e.n = com.sun.jna.e.a("com.sun.jna.bw")) : com.sun.jna.e.n));
        }
        if (class_ == (com.sun.jna.e.o == null ? (com.sun.jna.e.o = com.sun.jna.e.a("[Ljava.lang.String;")) : com.sun.jna.e.o) || class_ == (com.sun.jna.e.n == null ? (com.sun.jna.e.n = com.sun.jna.e.a("com.sun.jna.bw")) : com.sun.jna.e.n)) {
            bc bc2 = class_ == (com.sun.jna.e.o == null ? (com.sun.jna.e.o = com.sun.jna.e.a("[Ljava.lang.String;")) : com.sun.jna.e.o) ? new bc((String[])object) : new bc((bw[])object);
            com.sun.jna.e.b.put(object, bc2);
            return bc2;
        }
        if ((com.sun.jna.e.q == null ? (com.sun.jna.e.q = com.sun.jna.e.a("com.sun.jna.Callback")) : com.sun.jna.e.q).isAssignableFrom(class_)) {
            return com.sun.jna.e.a((Callback)object);
        }
        return object;
    }

    public Class[] a() {
        return this.c.getParameterTypes();
    }

    public Class b() {
        return this.c.getReturnType();
    }
}

