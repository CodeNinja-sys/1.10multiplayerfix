/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aav;
import com.a.a.d.agi;
import com.a.a.d.agj;
import com.a.a.d.cm;
import com.a.a.d.iz;
import com.a.a.d.jm;
import com.a.a.d.jn;
import com.a.a.d.jo;
import com.a.a.d.jp;
import com.a.a.d.jq;
import com.a.a.d.ov;
import com.a.a.d.yc;
import com.a.a.d.ze;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class jl
extends iz
implements List,
RandomAccess {
    private static final jl a = new ze(yc.a);

    public static jl d() {
        return a;
    }

    public static jl a(Object object) {
        return new aav(object);
    }

    public static jl a(Object object, Object object2) {
        return jl.c(object, object2);
    }

    public static jl a(Object object, Object object2, Object object3) {
        return jl.c(object, object2, object3);
    }

    public static jl a(Object object, Object object2, Object object3, Object object4) {
        return jl.c(object, object2, object3, object4);
    }

    public static jl a(Object object, Object object2, Object object3, Object object4, Object object5) {
        return jl.c(object, object2, object3, object4, object5);
    }

    public static jl a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        return jl.c(object, object2, object3, object4, object5, object6);
    }

    public static jl a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return jl.c(object, object2, object3, object4, object5, object6, object7);
    }

    public static jl a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        return jl.c(object, object2, object3, object4, object5, object6, object7, object8);
    }

    public static jl a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        return jl.c(object, object2, object3, object4, object5, object6, object7, object8, object9);
    }

    public static jl a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        return jl.c(object, object2, object3, object4, object5, object6, object7, object8, object9, object10);
    }

    public static jl a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11) {
        return jl.c(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11);
    }

    public static jl a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object ... arrobject) {
        Object[] arrobject2 = new Object[12 + arrobject.length];
        arrobject2[0] = object;
        arrobject2[1] = object2;
        arrobject2[2] = object3;
        arrobject2[3] = object4;
        arrobject2[4] = object5;
        arrobject2[5] = object6;
        arrobject2[6] = object7;
        arrobject2[7] = object8;
        arrobject2[8] = object9;
        arrobject2[9] = object10;
        arrobject2[10] = object11;
        arrobject2[11] = object12;
        System.arraycopy(arrobject, 0, arrobject2, 12, arrobject.length);
        return jl.c(arrobject2);
    }

    public static jl a(Iterable iterable) {
        cl.a(iterable);
        return iterable instanceof Collection ? jl.a(cm.a(iterable)) : jl.a(iterable.iterator());
    }

    public static jl a(Collection collection) {
        if (collection instanceof iz) {
            jl jl2 = ((iz)collection).h();
            return jl2.a() ? jl.b(jl2.toArray()) : jl2;
        }
        return jl.c(collection.toArray());
    }

    public static jl a(Iterator iterator) {
        if (!iterator.hasNext()) {
            return jl.d();
        }
        Object e2 = iterator.next();
        if (!iterator.hasNext()) {
            return jl.a(e2);
        }
        return new jn().c(e2).b(iterator).b();
    }

    public static jl a(Object[] arrobject) {
        switch (arrobject.length) {
            case 0: {
                return jl.d();
            }
            case 1: {
                return new aav(arrobject[0]);
            }
        }
        return new ze(yc.a((Object[])arrobject.clone()));
    }

    private static jl c(Object ... arrobject) {
        return jl.b(yc.a(arrobject));
    }

    static jl b(Object[] arrobject) {
        return jl.b(arrobject, arrobject.length);
    }

    static jl b(Object[] arrobject, int n2) {
        switch (n2) {
            case 0: {
                return jl.d();
            }
            case 1: {
                aav aav2 = new aav(arrobject[0]);
                return aav2;
            }
        }
        if (n2 < arrobject.length) {
            arrobject = yc.b(arrobject, n2);
        }
        return new ze(arrobject);
    }

    jl() {
    }

    @Override
    public agi aO_() {
        return this.e();
    }

    public agj e() {
        return this.a(0);
    }

    public agj a(int n2) {
        return new jm(this, this.size(), n2);
    }

    @Override
    public int indexOf(Object object) {
        return object == null ? -1 : ov.b((List)this, object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return object == null ? -1 : ov.c(this, object);
    }

    @Override
    public boolean contains(Object object) {
        return this.indexOf(object) >= 0;
    }

    public jl a(int n2, int n3) {
        cl.a(n2, n3, this.size());
        int n4 = n3 - n2;
        switch (n4) {
            case 0: {
                return jl.d();
            }
            case 1: {
                return jl.a(this.get(n2));
            }
        }
        return this.b(n2, n3);
    }

    jl b(int n2, int n3) {
        return new jq(this, n2, n3 - n2);
    }

    public final boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int n2, Object object) {
        throw new UnsupportedOperationException();
    }

    public final void add(int n2, Object object) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final jl h() {
        return this;
    }

    @Override
    int a(Object[] arrobject, int n2) {
        int n3 = this.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            arrobject[n2 + i2] = this.get(i2);
        }
        return n2 + n3;
    }

    public jl f() {
        return new jo(this);
    }

    @Override
    public boolean equals(Object object) {
        return ov.a((List)this, object);
    }

    @Override
    public int hashCode() {
        int n2 = 1;
        int n3 = this.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 = 31 * n2 + this.get(i2).hashCode();
            n2 = ~(~n2);
        }
        return n2;
    }

    private void a(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    Object aR_() {
        return new jp(this.toArray());
    }

    public static jn g() {
        return new jn();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }

    public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.a(n2);
    }

    public /* synthetic */ ListIterator listIterator() {
        return this.e();
    }
}

