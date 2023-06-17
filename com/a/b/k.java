/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.ad;
import com.a.b.ag;
import com.a.b.ah;
import com.a.b.an;
import com.a.b.ap;
import com.a.b.b.a.a;
import com.a.b.b.a.c;
import com.a.b.b.a.e;
import com.a.b.b.a.g;
import com.a.b.b.a.i;
import com.a.b.b.a.m;
import com.a.b.b.a.p;
import com.a.b.b.a.t;
import com.a.b.b.a.v;
import com.a.b.b.a.y;
import com.a.b.b.af;
import com.a.b.b.f;
import com.a.b.b.s;
import com.a.b.d.d;
import com.a.b.j;
import com.a.b.l;
import com.a.b.n;
import com.a.b.o;
import com.a.b.q;
import com.a.b.u;
import com.a.b.w;
import com.a.b.x;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class k {
    static final boolean a = false;
    private static final String d = ")]}'\n";
    private final ThreadLocal e = new ThreadLocal();
    private final Map f = Collections.synchronizedMap(new HashMap());
    private final List g;
    private final f h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    final u b = new l(this);
    final ad c = new com.a.b.m(this);

    public k() {
        this(s.a, com.a.b.d.a, Collections.emptyMap(), false, false, false, true, false, false, ah.a, Collections.emptyList());
    }

    k(s s2, j j2, Map map, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, ah ah2, List list) {
        this.h = new f(map);
        this.i = bl2;
        this.k = bl4;
        this.j = bl5;
        this.l = bl6;
        ArrayList<ap> arrayList = new ArrayList<ap>();
        arrayList.add(y.Q);
        arrayList.add(m.a);
        arrayList.add(s2);
        arrayList.addAll(list);
        arrayList.add(y.x);
        arrayList.add(y.m);
        arrayList.add(y.g);
        arrayList.add(y.i);
        arrayList.add(y.k);
        arrayList.add(y.a(Long.TYPE, Long.class, this.a(ah2)));
        arrayList.add(y.a(Double.TYPE, Double.class, this.a(bl7)));
        arrayList.add(y.a(Float.TYPE, Float.class, this.b(bl7)));
        arrayList.add(y.r);
        arrayList.add(y.t);
        arrayList.add(y.z);
        arrayList.add(y.B);
        arrayList.add(y.a(BigDecimal.class, y.v));
        arrayList.add(y.a(BigInteger.class, y.w));
        arrayList.add(y.D);
        arrayList.add(y.F);
        arrayList.add(y.J);
        arrayList.add(y.O);
        arrayList.add(y.H);
        arrayList.add(y.d);
        arrayList.add(com.a.b.b.a.e.a);
        arrayList.add(y.M);
        arrayList.add(v.a);
        arrayList.add(t.a);
        arrayList.add(y.K);
        arrayList.add(com.a.b.b.a.a.a);
        arrayList.add(y.R);
        arrayList.add(y.b);
        arrayList.add(new c(this.h));
        arrayList.add(new com.a.b.b.a.k(this.h, bl3));
        arrayList.add(new p(this.h, j2, s2));
        this.g = Collections.unmodifiableList(arrayList);
    }

    private an a(boolean bl2) {
        if (bl2) {
            return y.p;
        }
        return new n(this);
    }

    private an b(boolean bl2) {
        if (bl2) {
            return y.o;
        }
        return new o(this);
    }

    private void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private an a(ah ah2) {
        if (ah2 == ah.a) {
            return y.n;
        }
        return new com.a.b.p(this);
    }

    public an a(com.a.b.c.a a2) {
        q q2;
        an an2 = (an)this.f.get(a2);
        if (an2 != null) {
            return an2;
        }
        HashMap<com.a.b.c.a, q> hashMap = (HashMap<com.a.b.c.a, q>)this.e.get();
        boolean bl2 = false;
        if (hashMap == null) {
            hashMap = new HashMap<com.a.b.c.a, q>();
            this.e.set(hashMap);
            bl2 = true;
        }
        if ((q2 = (q)hashMap.get(a2)) != null) {
            return q2;
        }
        try {
            q q3 = new q();
            hashMap.put(a2, q3);
            for (ap ap2 : this.g) {
                an an3 = ap2.a(this, a2);
                if (an3 == null) continue;
                q3.a(an3);
                this.f.put(a2, an3);
                an an4 = an3;
                return an4;
            }
            throw new IllegalArgumentException("GSON cannot handle " + a2);
        }
        finally {
            hashMap.remove(a2);
            if (bl2) {
                this.e.remove();
            }
        }
    }

    public an a(ap ap2, com.a.b.c.a a2) {
        boolean bl2 = false;
        for (ap ap3 : this.g) {
            if (!bl2) {
                if (ap3 != ap2) continue;
                bl2 = true;
                continue;
            }
            an an2 = ap3.a(this, a2);
            if (an2 == null) continue;
            return an2;
        }
        throw new IllegalArgumentException("GSON cannot serialize " + a2);
    }

    public an a(Class class_) {
        return this.a(com.a.b.c.a.c(class_));
    }

    public w a(Object object) {
        if (object == null) {
            return com.a.b.y.a;
        }
        return this.a(object, object.getClass());
    }

    public w a(Object object, Type type) {
        i i2 = new i();
        this.a(object, type, i2);
        return i2.a();
    }

    public String b(Object object) {
        if (object == null) {
            return this.a(com.a.b.y.a);
        }
        return this.b(object, object.getClass());
    }

    public String b(Object object, Type type) {
        StringWriter stringWriter = new StringWriter();
        this.a(object, type, stringWriter);
        return stringWriter.toString();
    }

    public void a(Object object, Appendable appendable) {
        if (object != null) {
            this.a(object, object.getClass(), appendable);
        } else {
            this.a((w)com.a.b.y.a, appendable);
        }
    }

    public void a(Object object, Type type, Appendable appendable) {
        try {
            com.a.b.d.e e2 = this.a(com.a.b.b.ag.a(appendable));
            this.a(object, type, e2);
        }
        catch (IOException iOException) {
            throw new x(iOException);
        }
    }

    public void a(Object object, Type type, com.a.b.d.e e2) {
        an an2 = this.a(com.a.b.c.a.b(type));
        boolean bl2 = e2.g();
        e2.b(true);
        boolean bl3 = e2.h();
        e2.c(this.j);
        boolean bl4 = e2.i();
        e2.d(this.i);
        try {
            an2.a(e2, object);
        }
        catch (IOException iOException) {
            throw new x(iOException);
        }
        finally {
            e2.b(bl2);
            e2.c(bl3);
            e2.d(bl4);
        }
    }

    public String a(w w2) {
        StringWriter stringWriter = new StringWriter();
        this.a(w2, (Appendable)stringWriter);
        return stringWriter.toString();
    }

    public void a(w w2, Appendable appendable) {
        try {
            com.a.b.d.e e2 = this.a(com.a.b.b.ag.a(appendable));
            this.a(w2, e2);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    private com.a.b.d.e a(Writer writer) {
        if (this.k) {
            writer.write(d);
        }
        com.a.b.d.e e2 = new com.a.b.d.e(writer);
        if (this.l) {
            e2.c("  ");
        }
        e2.d(this.i);
        return e2;
    }

    public void a(w w2, com.a.b.d.e e2) {
        boolean bl2 = e2.g();
        e2.b(true);
        boolean bl3 = e2.h();
        e2.c(this.j);
        boolean bl4 = e2.i();
        e2.d(this.i);
        try {
            com.a.b.b.ag.a(w2, e2);
        }
        catch (IOException iOException) {
            throw new x(iOException);
        }
        finally {
            e2.b(bl2);
            e2.c(bl3);
            e2.d(bl4);
        }
    }

    public Object a(String string, Class class_) {
        Object object = this.a(string, (Type)class_);
        return af.a(class_).cast(object);
    }

    public Object a(String string, Type type) {
        if (string == null) {
            return null;
        }
        StringReader stringReader = new StringReader(string);
        Object object = this.a((Reader)stringReader, type);
        return object;
    }

    public Object a(Reader reader, Class class_) {
        com.a.b.d.a a2 = new com.a.b.d.a(reader);
        Object object = this.a(a2, (Type)class_);
        com.a.b.k.a(object, a2);
        return af.a(class_).cast(object);
    }

    public Object a(Reader reader, Type type) {
        com.a.b.d.a a2 = new com.a.b.d.a(reader);
        Object object = this.a(a2, type);
        com.a.b.k.a(object, a2);
        return object;
    }

    private static void a(Object object, com.a.b.d.a a2) {
        try {
            if (object != null && a2.f() != com.a.b.d.d.j) {
                throw new x("JSON document was not fully consumed.");
            }
        }
        catch (com.a.b.d.f f2) {
            throw new ag(f2);
        }
        catch (IOException iOException) {
            throw new x(iOException);
        }
    }

    public Object a(com.a.b.d.a a2, Type type) {
        boolean bl2 = true;
        boolean bl3 = a2.p();
        a2.a(true);
        try {
            Object object;
            a2.f();
            bl2 = false;
            com.a.b.c.a a3 = com.a.b.c.a.b(type);
            an an2 = this.a(a3);
            Object object2 = object = an2.a(a2);
            return object2;
        }
        catch (EOFException eOFException) {
            if (bl2) {
                Object var6_10 = null;
                return var6_10;
            }
            throw new ag(eOFException);
        }
        catch (IllegalStateException illegalStateException) {
            throw new ag(illegalStateException);
        }
        catch (IOException iOException) {
            throw new ag(iOException);
        }
        finally {
            a2.a(bl3);
        }
    }

    public Object a(w w2, Class class_) {
        Object object = this.a(w2, (Type)class_);
        return af.a(class_).cast(object);
    }

    public Object a(w w2, Type type) {
        if (w2 == null) {
            return null;
        }
        return this.a(new g(w2), type);
    }

    public String toString() {
        return "{serializeNulls:" + this.i + "factories:" + this.g + ",instanceCreators:" + this.h + "}";
    }

    static /* synthetic */ void a(k k2, double d2) {
        k2.a(d2);
    }
}

