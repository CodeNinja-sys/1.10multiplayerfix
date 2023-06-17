/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ex;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.js;
import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.d.kk;
import com.a.a.d.kq;
import com.a.a.d.ou;
import com.a.a.d.vi;
import com.a.a.d.zz;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class jr
extends kk
implements ou {
    private transient jr a;
    private static final long d = 0L;

    public static jr a() {
        return ex.a;
    }

    public static jr d(Object object, Object object2) {
        js js2 = jr.b();
        js2.a(object, object2);
        return js2.a();
    }

    public static jr a(Object object, Object object2, Object object3, Object object4) {
        js js2 = jr.b();
        js2.a(object, object2);
        js2.a(object3, object4);
        return js2.a();
    }

    public static jr a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        js js2 = jr.b();
        js2.a(object, object2);
        js2.a(object3, object4);
        js2.a(object5, object6);
        return js2.a();
    }

    public static jr a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        js js2 = jr.b();
        js2.a(object, object2);
        js2.a(object3, object4);
        js2.a(object5, object6);
        js2.a(object7, object8);
        return js2.a();
    }

    public static jr a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        js js2 = jr.b();
        js2.a(object, object2);
        js2.a(object3, object4);
        js2.a(object5, object6);
        js2.a(object7, object8);
        js2.a(object9, object10);
        return js2.a();
    }

    public static js b() {
        return new js();
    }

    public static jr b(vi vi2) {
        Object object;
        if (vi2.o()) {
            return jr.a();
        }
        if (vi2 instanceof jr && !((kk)(object = (jr)vi2)).w()) {
            return object;
        }
        object = jt.n();
        int n2 = 0;
        for (Map.Entry entry : vi2.c().entrySet()) {
            jl jl2 = jl.a((Collection)entry.getValue());
            if (jl2.isEmpty()) continue;
            ((ju)object).b(entry.getKey(), jl2);
            n2 += jl2.size();
        }
        return new jr(((ju)object).b(), n2);
    }

    jr(jt jt2, int n2) {
        super(jt2, n2);
    }

    public jl e(Object object) {
        jl jl2 = (jl)this.b.get(object);
        return jl2 == null ? jl.d() : jl2;
    }

    public jr d() {
        jr jr2 = this.a;
        return jr2 == null ? (this.a = this.u()) : jr2;
    }

    private jr u() {
        js js2 = jr.b();
        for (Map.Entry entry : this.z()) {
            js2.a(entry.getValue(), entry.getKey());
        }
        jr jr2 = js2.a();
        jr2.a = this;
        return jr2;
    }

    public jl h(Object object) {
        throw new UnsupportedOperationException();
    }

    public jl d(Object object, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        zz.a((vi)this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) {
        jt jt2;
        objectInputStream.defaultReadObject();
        int n2 = objectInputStream.readInt();
        if (n2 < 0) {
            throw new InvalidObjectException("Invalid key count " + n2);
        }
        ju ju2 = jt.n();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            int n4 = objectInputStream.readInt();
            if (n4 <= 0) {
                throw new InvalidObjectException("Invalid value count " + n4);
            }
            Object[] arrobject = new Object[n4];
            for (int i3 = 0; i3 < n4; ++i3) {
                arrobject[i3] = objectInputStream.readObject();
            }
            ju2.b(object, jl.a(arrobject));
            n3 += n4;
        }
        try {
            jt2 = ju2.b();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw (InvalidObjectException)new InvalidObjectException(illegalArgumentException.getMessage()).initCause(illegalArgumentException);
        }
        kq.a.a((Object)this, jt2);
        kq.b.a((Object)this, n3);
    }

    @Override
    public /* synthetic */ kk e() {
        return this.d();
    }

    @Override
    public /* synthetic */ iz i(Object object) {
        return this.e(object);
    }

    @Override
    public /* synthetic */ iz e(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    public /* synthetic */ iz j(Object object) {
        return this.h(object);
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.e(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.h(object);
    }

    @Override
    public /* synthetic */ List a(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    public /* synthetic */ List b(Object object) {
        return this.h(object);
    }

    @Override
    public /* synthetic */ List a(Object object) {
        return this.e(object);
    }
}

