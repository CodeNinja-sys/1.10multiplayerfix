/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.an;
import com.a.a.d.nj;
import com.a.a.d.ok;
import com.a.a.d.ol;
import com.a.a.d.om;
import com.a.a.d.oo;
import com.a.a.d.oq;
import com.a.a.d.or;
import com.a.a.d.ot;
import com.a.a.d.ou;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.vi;
import com.a.a.d.wf;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class oj
extends an
implements ou,
Serializable {
    private transient or a;
    private transient or b;
    private transient Map c;
    private transient int d;
    private transient int e;
    private static final long f = 0L;

    public static oj a() {
        return new oj();
    }

    public static oj a(int n2) {
        return new oj(n2);
    }

    public static oj b(vi vi2) {
        return new oj(vi2);
    }

    oj() {
        this.c = sz.c();
    }

    private oj(int n2) {
        this.c = new HashMap(n2);
    }

    private oj(vi vi2) {
        this(vi2.q().size());
        this.a(vi2);
    }

    private or a(Object object, Object object2, or or2) {
        or or3 = new or(object, object2);
        if (this.a == null) {
            this.a = this.b = or3;
            this.c.put(object, new oq(or3));
            ++this.e;
        } else if (or2 == null) {
            this.b.c = or3;
            or3.d = this.b;
            this.b = or3;
            oq oq2 = (oq)this.c.get(object);
            if (oq2 == null) {
                oq2 = new oq(or3);
                this.c.put(object, oq2);
                ++this.e;
            } else {
                ++oq2.c;
                or or4 = oq2.b;
                or4.e = or3;
                or3.f = or4;
                oq2.b = or3;
            }
        } else {
            oq oq3 = (oq)this.c.get(object);
            ++oq3.c;
            or3.d = or2.d;
            or3.f = or2.f;
            or3.c = or2;
            or3.e = or2;
            if (or2.f == null) {
                ((oq)this.c.get((Object)object)).a = or3;
            } else {
                or2.f.e = or3;
            }
            if (or2.d == null) {
                this.a = or3;
            } else {
                or2.d.c = or3;
            }
            or2.d = or3;
            or2.f = or3;
        }
        ++this.d;
        return or3;
    }

    private void a(or or2) {
        if (or2.d != null) {
            or2.d.c = or2.c;
        } else {
            this.a = or2.c;
        }
        if (or2.c != null) {
            or2.c.d = or2.d;
        } else {
            this.b = or2.d;
        }
        if (or2.f == null && or2.e == null) {
            oq oq2 = (oq)this.c.remove(or2.a);
            oq2.c = 0;
            ++this.e;
        } else {
            oq oq3 = (oq)this.c.get(or2.a);
            --oq3.c;
            if (or2.f == null) {
                oq3.a = or2.e;
            } else {
                or2.f.e = or2.e;
            }
            if (or2.e == null) {
                oq3.b = or2.f;
            } else {
                or2.e.f = or2.f;
            }
        }
        --this.d;
    }

    private void h(Object object) {
        nj.i(new ot(this, object));
    }

    private static void i(Object object) {
        if (object == null) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public int g() {
        return this.d;
    }

    @Override
    public boolean o() {
        return this.a == null;
    }

    @Override
    public boolean f(Object object) {
        return this.c.containsKey(object);
    }

    @Override
    public boolean g(Object object) {
        return this.b().contains(object);
    }

    @Override
    public boolean a(Object object, Object object2) {
        this.a(object, object2, null);
        return true;
    }

    @Override
    public List a(Object object, Iterable iterable) {
        List list = this.j(object);
        ot ot2 = new ot(this, object);
        Iterator iterator = iterable.iterator();
        while (ot2.hasNext() && iterator.hasNext()) {
            ot2.next();
            ot2.set(iterator.next());
        }
        while (ot2.hasNext()) {
            ot2.next();
            ot2.remove();
        }
        while (iterator.hasNext()) {
            ot2.add(iterator.next());
        }
        return list;
    }

    private List j(Object object) {
        return Collections.unmodifiableList(ov.a(new ot(this, object)));
    }

    @Override
    public List b(Object object) {
        List list = this.j(object);
        this.h(object);
        return list;
    }

    @Override
    public void h() {
        this.a = null;
        this.b = null;
        this.c.clear();
        this.d = 0;
        ++this.e;
    }

    @Override
    public List a(Object object) {
        return new ok(this, object);
    }

    @Override
    Set i() {
        return new ol(this);
    }

    public List b() {
        return (List)super.j();
    }

    List d() {
        return new om(this);
    }

    public List e() {
        return (List)super.l();
    }

    List f() {
        return new oo(this);
    }

    @Override
    Iterator m() {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    Map n() {
        return new wf(this);
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.g());
        for (Map.Entry entry : this.e()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = sz.d();
        int n2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            this.a(object, object2);
        }
    }

    @Override
    /* synthetic */ Collection t() {
        return this.d();
    }

    @Override
    public /* synthetic */ Collection j() {
        return this.b();
    }

    @Override
    /* synthetic */ Collection p() {
        return this.f();
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.e();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    static /* synthetic */ int a(oj oj2) {
        return oj2.e;
    }

    static /* synthetic */ or b(oj oj2) {
        return oj2.b;
    }

    static /* synthetic */ or c(oj oj2) {
        return oj2.a;
    }

    static /* synthetic */ void e(Object object) {
        oj.i(object);
    }

    static /* synthetic */ void a(oj oj2, or or2) {
        oj2.a(or2);
    }

    static /* synthetic */ void a(oj oj2, Object object) {
        oj2.h(object);
    }

    static /* synthetic */ Map d(oj oj2) {
        return oj2.c;
    }

    static /* synthetic */ or a(oj oj2, Object object, Object object2, or or2) {
        return oj2.a(object, object2, or2);
    }

    static /* synthetic */ int e(oj oj2) {
        return oj2.d;
    }
}

