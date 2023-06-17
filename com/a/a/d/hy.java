/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.d.bw;
import com.a.a.d.cl;
import com.a.a.d.ia;
import com.a.a.d.ib;
import com.a.a.d.ie;
import com.a.a.d.im;
import com.a.a.d.iq;
import com.a.a.d.zz;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class hy
extends AbstractMap
implements bw,
Serializable {
    private static final double a = 1.0;
    private transient ia[] b;
    private transient ia[] c;
    private transient int d;
    private transient int e;
    private transient int f;
    private transient bw g;
    private static final long h = 0L;

    public static hy a() {
        return hy.a(16);
    }

    public static hy a(int n2) {
        return new hy(n2);
    }

    public static hy a(Map map) {
        hy hy2 = hy.a(map.size());
        hy2.putAll(map);
        return hy2;
    }

    private hy(int n2) {
        this.b(n2);
    }

    private void b(int n2) {
        cl.a(n2, "expectedSize");
        int n3 = iq.a(n2, 1.0);
        this.b = this.c(n3);
        this.c = this.c(n3);
        this.e = n3 - 1;
        this.f = 0;
        this.d = 0;
    }

    private void a(ia ia2) {
        int n2 = ia2.a & this.e;
        ia ia3 = null;
        ia ia4 = this.b[n2];
        while (true) {
            if (ia4 == ia2) {
                if (ia3 == null) {
                    this.b[n2] = ia2.c;
                    break;
                }
                ia3.c = ia2.c;
                break;
            }
            ia3 = ia4;
            ia4 = ia4.c;
        }
        int n3 = ia2.b & this.e;
        ia3 = null;
        ia ia5 = this.c[n3];
        while (true) {
            if (ia5 == ia2) {
                if (ia3 == null) {
                    this.c[n3] = ia2.d;
                    break;
                }
                ia3.d = ia2.d;
                break;
            }
            ia3 = ia5;
            ia5 = ia5.d;
        }
        --this.d;
        ++this.f;
    }

    private void b(ia ia2) {
        int n2 = ia2.a & this.e;
        ia2.c = this.b[n2];
        this.b[n2] = ia2;
        int n3 = ia2.b & this.e;
        ia2.d = this.c[n3];
        this.c[n3] = ia2;
        ++this.d;
        ++this.f;
    }

    private static int b(Object object) {
        return iq.a(object == null ? 0 : object.hashCode());
    }

    private ia a(Object object, int n2) {
        ia ia2 = this.b[n2 & this.e];
        while (ia2 != null) {
            if (n2 == ia2.a && cc.a(object, ia2.e)) {
                return ia2;
            }
            ia2 = ia2.c;
        }
        return null;
    }

    private ia b(Object object, int n2) {
        ia ia2 = this.c[n2 & this.e];
        while (ia2 != null) {
            if (n2 == ia2.b && cc.a(object, ia2.f)) {
                return ia2;
            }
            ia2 = ia2.d;
        }
        return null;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a(object, hy.b(object)) != null;
    }

    @Override
    public boolean containsValue(Object object) {
        return this.b(object, hy.b(object)) != null;
    }

    public Object get(Object object) {
        ia ia2 = this.a(object, hy.b(object));
        return ia2 == null ? null : ia2.f;
    }

    @Override
    public Object put(Object object, Object object2) {
        return this.a(object, object2, false);
    }

    @Override
    public Object a(Object object, Object object2) {
        return this.a(object, object2, true);
    }

    private Object a(Object object, Object object2, boolean bl2) {
        int n2 = hy.b(object);
        int n3 = hy.b(object2);
        ia ia2 = this.a(object, n2);
        if (ia2 != null && n3 == ia2.b && cc.a(object2, ia2.f)) {
            return object2;
        }
        ia ia3 = this.b(object2, n3);
        if (ia3 != null) {
            if (bl2) {
                this.a(ia3);
            } else {
                throw new IllegalArgumentException("value already present: " + object2);
            }
        }
        if (ia2 != null) {
            this.a(ia2);
        }
        ia ia4 = new ia(object, n2, object2, n3);
        this.b(ia4);
        this.d();
        return ia2 == null ? null : ia2.f;
    }

    private Object b(Object object, Object object2, boolean bl2) {
        int n2 = hy.b(object);
        int n3 = hy.b(object2);
        ia ia2 = this.b(object, n2);
        if (ia2 != null && n3 == ia2.a && cc.a(object2, ia2.e)) {
            return object2;
        }
        ia ia3 = this.a(object2, n3);
        if (ia3 != null) {
            if (bl2) {
                this.a(ia3);
            } else {
                throw new IllegalArgumentException("value already present: " + object2);
            }
        }
        if (ia2 != null) {
            this.a(ia2);
        }
        ia ia4 = new ia(object2, n3, object, n2);
        this.b(ia4);
        this.d();
        return ia2 == null ? null : ia2.e;
    }

    private void d() {
        ia[] arria = this.b;
        if (iq.a(this.d, arria.length, 1.0)) {
            int n2 = arria.length * 2;
            this.b = this.c(n2);
            this.c = this.c(n2);
            this.e = n2 - 1;
            this.d = 0;
            for (int i2 = 0; i2 < arria.length; ++i2) {
                ia ia2 = arria[i2];
                while (ia2 != null) {
                    ia ia3 = ia2.c;
                    this.b(ia2);
                    ia2 = ia3;
                }
            }
            ++this.f;
        }
    }

    private ia[] c(int n2) {
        return new ia[n2];
    }

    public Object remove(Object object) {
        ia ia2 = this.a(object, hy.b(object));
        if (ia2 == null) {
            return null;
        }
        this.a(ia2);
        return ia2.f;
    }

    @Override
    public void clear() {
        this.d = 0;
        Arrays.fill(this.b, null);
        Arrays.fill(this.c, null);
        ++this.f;
    }

    @Override
    public int size() {
        return this.d;
    }

    public Set keySet() {
        return new im(this);
    }

    @Override
    public Set c() {
        return this.aT_().keySet();
    }

    public Set entrySet() {
        return new ib(this, null);
    }

    @Override
    public bw aT_() {
        return this.g == null ? (this.g = new ie(this, null)) : this.g;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        zz.a((Map)this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n2 = zz.a(objectInputStream);
        this.b(n2);
        zz.a(this, objectInputStream, n2);
    }

    public /* synthetic */ Collection values() {
        return this.c();
    }

    static /* synthetic */ int a(hy hy2) {
        return hy2.f;
    }

    static /* synthetic */ ia[] b(hy hy2) {
        return hy2.b;
    }

    static /* synthetic */ void a(hy hy2, ia ia2) {
        hy2.a(ia2);
    }

    static /* synthetic */ int a(Object object) {
        return hy.b(object);
    }

    static /* synthetic */ ia a(hy hy2, Object object, int n2) {
        return hy2.a(object, n2);
    }

    static /* synthetic */ ia b(hy hy2, Object object, int n2) {
        return hy2.b(object, n2);
    }

    static /* synthetic */ void b(hy hy2, ia ia2) {
        hy2.b(ia2);
    }

    static /* synthetic */ int c(hy hy2) {
        return hy2.d;
    }

    static /* synthetic */ Object a(hy hy2, Object object, Object object2, boolean bl2) {
        return hy2.b(object, object2, bl2);
    }
}

