/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.b;

import io.netty.b.g;
import io.netty.b.i;
import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.channel.b.a;
import io.netty.channel.b.c;
import io.netty.channel.b.e;
import io.netty.channel.b.f;
import io.netty.channel.b.l;
import io.netty.channel.b.n;
import io.netty.channel.b.o;
import io.netty.channel.dh;
import io.netty.util.b.ad;
import io.netty.util.b.w;
import io.netty.util.x;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class m
extends AbstractSet
implements a {
    private static final AtomicInteger a = new AtomicInteger();
    private final String b;
    private final w c;
    private final io.netty.util.c.c d = new io.netty.util.c.c();
    private final io.netty.util.c.c e = new io.netty.util.c.c();
    private final aw f = new n(this);

    public m(w w2) {
        this("group-0x" + Integer.toHexString(a.incrementAndGet()), w2);
    }

    public m(String string, w w2) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        this.b = string;
        this.c = w2;
    }

    @Override
    public String a() {
        return this.b;
    }

    @Override
    public boolean isEmpty() {
        return this.e.isEmpty() && this.d.isEmpty();
    }

    @Override
    public int size() {
        return this.e.size() + this.d.size();
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof an) {
            an an2 = (an)object;
            if (object instanceof dh) {
                return this.d.contains(an2);
            }
            return this.e.contains(an2);
        }
        return false;
    }

    public boolean a(an an2) {
        io.netty.util.c.c c2 = an2 instanceof dh ? this.d : this.e;
        boolean bl2 = c2.add(an2);
        if (bl2) {
            an2.s().a((ad)this.f);
        }
        return bl2;
    }

    @Override
    public boolean remove(Object object) {
        if (!(object instanceof an)) {
            return false;
        }
        an an2 = (an)object;
        boolean bl2 = an2 instanceof dh ? this.d.remove(an2) : this.e.remove(an2);
        if (!bl2) {
            return false;
        }
        an2.s().b((ad)this.f);
        return true;
    }

    @Override
    public void clear() {
        this.e.clear();
        this.d.clear();
    }

    @Override
    public Iterator iterator() {
        return new l(this.d.iterator(), this.e.iterator());
    }

    @Override
    public Object[] toArray() {
        ArrayList arrayList = new ArrayList(this.size());
        arrayList.addAll(this.d);
        arrayList.addAll(this.e);
        return arrayList.toArray();
    }

    @Override
    public Object[] toArray(Object[] arrobject) {
        ArrayList arrayList = new ArrayList(this.size());
        arrayList.addAll(this.d);
        arrayList.addAll(this.e);
        return arrayList.toArray(arrobject);
    }

    @Override
    public c d() {
        return this.c(io.netty.channel.b.f.a());
    }

    @Override
    public c c() {
        return this.b(io.netty.channel.b.f.a());
    }

    @Override
    public c e() {
        return this.d(io.netty.channel.b.f.a());
    }

    @Override
    public c a(Object object) {
        return this.a(object, io.netty.channel.b.f.a());
    }

    private static Object d(Object object) {
        if (object instanceof g) {
            return ((g)object).S().ab();
        }
        if (object instanceof i) {
            return ((i)object).c().bC_();
        }
        return x.a(object);
    }

    @Override
    public c a(Object object, e e2) {
        if (object == null) {
            throw new NullPointerException("message");
        }
        if (e2 == null) {
            throw new NullPointerException("matcher");
        }
        LinkedHashMap<an, av> linkedHashMap = new LinkedHashMap<an, av>(this.size());
        for (an an2 : this.e) {
            if (!e2.a(an2)) continue;
            linkedHashMap.put(an2, an2.a(m.d(object)));
        }
        x.b(object);
        return new o((a)this, linkedHashMap, this.c);
    }

    @Override
    public a b() {
        return this.a(io.netty.channel.b.f.a());
    }

    @Override
    public c c(Object object) {
        return this.b(object);
    }

    @Override
    public c b(Object object) {
        return this.b(object, io.netty.channel.b.f.a());
    }

    @Override
    public c b(e e2) {
        if (e2 == null) {
            throw new NullPointerException("matcher");
        }
        LinkedHashMap<an, av> linkedHashMap = new LinkedHashMap<an, av>(this.size());
        for (an an2 : this.d) {
            if (!e2.a(an2)) continue;
            linkedHashMap.put(an2, an2.k());
        }
        for (an an2 : this.e) {
            if (!e2.a(an2)) continue;
            linkedHashMap.put(an2, an2.k());
        }
        return new o((a)this, linkedHashMap, this.c);
    }

    @Override
    public c c(e e2) {
        if (e2 == null) {
            throw new NullPointerException("matcher");
        }
        LinkedHashMap<an, av> linkedHashMap = new LinkedHashMap<an, av>(this.size());
        for (an an2 : this.d) {
            if (!e2.a(an2)) continue;
            linkedHashMap.put(an2, an2.l());
        }
        for (an an2 : this.e) {
            if (!e2.a(an2)) continue;
            linkedHashMap.put(an2, an2.l());
        }
        return new o((a)this, linkedHashMap, this.c);
    }

    @Override
    public c d(e e2) {
        if (e2 == null) {
            throw new NullPointerException("matcher");
        }
        LinkedHashMap<an, av> linkedHashMap = new LinkedHashMap<an, av>(this.size());
        for (an an2 : this.d) {
            if (!e2.a(an2)) continue;
            linkedHashMap.put(an2, an2.m());
        }
        for (an an2 : this.e) {
            if (!e2.a(an2)) continue;
            linkedHashMap.put(an2, an2.m());
        }
        return new o((a)this, linkedHashMap, this.c);
    }

    @Override
    public a a(e e2) {
        for (an an2 : this.e) {
            if (!e2.a(an2)) continue;
            an2.n();
        }
        return this;
    }

    @Override
    public c c(Object object, e e2) {
        return this.b(object, e2);
    }

    @Override
    public c b(Object object, e e2) {
        if (object == null) {
            throw new NullPointerException("message");
        }
        LinkedHashMap<an, av> linkedHashMap = new LinkedHashMap<an, av>(this.size());
        for (an an2 : this.e) {
            if (!e2.a(an2)) continue;
            linkedHashMap.put(an2, an2.b(m.d(object)));
        }
        x.b(object);
        return new o((a)this, linkedHashMap, this.c);
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override
    public boolean equals(Object object) {
        return this == object;
    }

    public int a(a a2) {
        int n2 = this.a().compareTo(a2.a());
        if (n2 != 0) {
            return n2;
        }
        return System.identityHashCode(this) - System.identityHashCode(a2);
    }

    @Override
    public String toString() {
        return io.netty.util.c.ad.a(this) + "(name: " + this.a() + ", size: " + this.size() + ')';
    }

    @Override
    public /* synthetic */ boolean add(Object object) {
        return this.a((an)object);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((a)object);
    }
}

