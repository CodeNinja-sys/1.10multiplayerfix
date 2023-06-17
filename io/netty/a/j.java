/*
 * Decompiled with CFR 0.150.
 */
package io.netty.a;

import io.netty.a.a;
import io.netty.a.k;
import io.netty.channel.an;
import io.netty.channel.ba;
import io.netty.channel.bi;
import io.netty.channel.ct;
import io.netty.util.c;
import io.netty.util.c.ad;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.util.LinkedHashMap;
import java.util.Map;

public final class j
extends a {
    private static final g a = h.a(j.class);
    private final Map b = new LinkedHashMap();
    private final Map c = new LinkedHashMap();
    private volatile ct d;
    private volatile ba e;

    public j() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private j(j j2) {
        super(j2);
        this.d = j2.d;
        this.e = j2.e;
        Map map = j2.b;
        synchronized (map) {
            this.b.putAll(j2.b);
        }
        map = j2.c;
        synchronized (map) {
            this.c.putAll(j2.c);
        }
    }

    public j b(ct ct2) {
        return this.a(ct2, ct2);
    }

    public j a(ct ct2, ct ct3) {
        super.a(ct2);
        if (ct3 == null) {
            throw new NullPointerException("childGroup");
        }
        if (this.d != null) {
            throw new IllegalStateException("childGroup set already");
        }
        this.d = ct3;
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public j b(bi bi2, Object object) {
        if (bi2 == null) {
            throw new NullPointerException("childOption");
        }
        if (object == null) {
            Map map = this.b;
            synchronized (map) {
                this.b.remove(bi2);
            }
        }
        Map map = this.b;
        synchronized (map) {
            this.b.put(bi2, object);
        }
        return this;
    }

    public j b(c c2, Object object) {
        if (c2 == null) {
            throw new NullPointerException("childKey");
        }
        if (object == null) {
            this.c.remove(c2);
        } else {
            this.c.put(c2, object);
        }
        return this;
    }

    public j b(ba ba2) {
        if (ba2 == null) {
            throw new NullPointerException("childHandler");
        }
        this.e = ba2;
        return this;
    }

    public ct l() {
        return this.d;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void a(an an2) {
        Map.Entry[] arrentry;
        Map.Entry[] arrentry2;
        Map map;
        Map map2 = map = this.j();
        synchronized (map2) {
            an2.G().a(map);
        }
        map2 = this.k();
        Object object2 = map2;
        synchronized (object2) {
            for (Map.Entry object3 : map2.entrySet()) {
                arrentry2 = (Map.Entry[])object3.getKey();
                an2.a((c)arrentry2).set(object3.getValue());
            }
        }
        object2 = an2.c();
        if (this.h() != null) {
            object2.b(new ba[]{this.h()});
        }
        ct ct2 = this.d;
        ba ba2 = this.e;
        Map map3 = this.b;
        synchronized (map3) {
            arrentry2 = this.b.entrySet().toArray(j.c(this.b.size()));
        }
        map3 = this.c;
        synchronized (map3) {
            arrentry = this.c.entrySet().toArray(j.d(this.c.size()));
        }
        object2.b(new ba[]{new k(this, ct2, ba2, arrentry2, arrentry)});
    }

    public j m() {
        super.a();
        if (this.e == null) {
            throw new IllegalStateException("childHandler not set");
        }
        if (this.d == null) {
            a.d("childGroup is not set. Using parentGroup instead.");
            this.d = this.i();
        }
        return this;
    }

    private static Map.Entry[] c(int n2) {
        return new Map.Entry[n2];
    }

    private static Map.Entry[] d(int n2) {
        return new Map.Entry[n2];
    }

    public j n() {
        return new j(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.setLength(stringBuilder.length() - 1);
        stringBuilder.append(", ");
        if (this.d != null) {
            stringBuilder.append("childGroup: ");
            stringBuilder.append(ad.a(this.d));
            stringBuilder.append(", ");
        }
        Map map = this.b;
        synchronized (map) {
            if (!this.b.isEmpty()) {
                stringBuilder.append("childOptions: ");
                stringBuilder.append(this.b);
                stringBuilder.append(", ");
            }
        }
        map = this.c;
        synchronized (map) {
            if (!this.c.isEmpty()) {
                stringBuilder.append("childAttrs: ");
                stringBuilder.append(this.c);
                stringBuilder.append(", ");
            }
        }
        if (this.e != null) {
            stringBuilder.append("childHandler: ");
            stringBuilder.append(this.e);
            stringBuilder.append(", ");
        }
        if (stringBuilder.charAt(stringBuilder.length() - 1) == '(') {
            stringBuilder.append(')');
        } else {
            stringBuilder.setCharAt(stringBuilder.length() - 2, ')');
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ a b() {
        return this.n();
    }

    @Override
    public /* synthetic */ a a() {
        return this.m();
    }

    @Override
    public /* synthetic */ a a(ct ct2) {
        return this.b(ct2);
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.n();
    }

    static /* synthetic */ g o() {
        return a;
    }
}

