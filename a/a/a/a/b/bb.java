/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.as;
import a.a.a.a.b.au;
import a.a.a.a.b.b;
import a.a.a.a.b.bc;
import a.a.a.a.b.bg;
import a.a.a.a.b.bi;
import a.a.a.a.b.bj;
import a.a.a.a.b.de;
import a.a.a.a.b.ec;
import a.a.a.a.c.aq;
import a.a.a.a.c.w;
import a.a.a.a.e;
import a.a.a.a.g;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class bb
extends b
implements e,
Serializable,
Cloneable {
    private static final long v = 0L;
    private static final boolean w = false;
    protected transient long[] j;
    protected transient Object[] k;
    protected transient int l;
    protected transient boolean m;
    protected de n;
    protected transient int o;
    protected transient int p;
    protected int q;
    protected final float r;
    protected transient au s;
    protected transient ec t;
    protected transient w u;

    public bb(int n2, float f2, de de2) {
        this.n = de2;
        if (f2 <= 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Load factor must be greater than 0 and smaller than or equal to 1");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.r = f2;
        this.o = g.b(n2, f2);
        this.l = this.o - 1;
        this.p = g.a(this.o, f2);
        this.j = new long[this.o + 1];
        this.k = new Object[this.o + 1];
    }

    public bb(int n2, de de2) {
        this(n2, 0.75f, de2);
    }

    public bb(de de2) {
        this(16, 0.75f, de2);
    }

    public bb(Map map, float f2, de de2) {
        this(map.size(), f2, de2);
        this.putAll(map);
    }

    public bb(Map map, de de2) {
        this(map, 0.75f, de2);
    }

    public bb(as as2, float f2, de de2) {
        this(as2.size(), f2, de2);
        this.putAll((Map)as2);
    }

    public bb(as as2, de de2) {
        this(as2, 0.75f, de2);
    }

    public bb(long[] arrl, Object[] arrobject, float f2, de de2) {
        this(arrl.length, f2, de2);
        if (arrl.length != arrobject.length) {
            throw new IllegalArgumentException("The key array and the value array have different lengths (" + arrl.length + " and " + arrobject.length + ")");
        }
        for (int i2 = 0; i2 < arrl.length; ++i2) {
            this.a(arrl[i2], arrobject[i2]);
        }
    }

    public bb(long[] arrl, Object[] arrobject, de de2) {
        this(arrl, arrobject, 0.75f, de2);
    }

    public de e() {
        return this.n;
    }

    private int l() {
        return this.m ? this.q - 1 : this.q;
    }

    private void e(int n2) {
        int n3 = g.b(n2, this.r);
        if (n3 > this.o) {
            this.d(n3);
        }
    }

    private void d(long l2) {
        int n2 = (int)Math.min(0x40000000L, Math.max(2L, g.e((long)Math.ceil((float)l2 / this.r))));
        if (n2 > this.o) {
            this.d(n2);
        }
    }

    private Object f(int n2) {
        Object object = this.k[n2];
        this.k[n2] = null;
        --this.q;
        this.a(n2);
        if (this.q < this.p / 4 && this.o > 16) {
            this.d(this.o / 2);
        }
        return object;
    }

    private Object m() {
        this.m = false;
        Object object = this.k[this.o];
        this.k[this.o] = null;
        --this.q;
        if (this.q < this.p / 4 && this.o > 16) {
            this.d(this.o / 2);
        }
        return object;
    }

    @Override
    public void putAll(Map map) {
        if ((double)this.r <= 0.5) {
            this.e(map.size());
        } else {
            this.d((long)(this.size() + map.size()));
        }
        super.putAll(map);
    }

    private int b(long l2, Object object) {
        int n2;
        if (this.n.a(l2, 0L)) {
            if (this.m) {
                return this.o;
            }
            this.m = true;
            n2 = this.o;
        } else {
            long[] arrl = this.j;
            n2 = g.b(this.n.a(l2)) & this.l;
            long l3 = arrl[n2];
            if (l3 != 0L) {
                if (this.n.a(l3, l2)) {
                    return n2;
                }
                while ((l3 = arrl[n2 = n2 + 1 & this.l]) != 0L) {
                    if (!this.n.a(l3, l2)) continue;
                    return n2;
                }
            }
        }
        this.j[n2] = l2;
        this.k[n2] = object;
        if (this.q++ >= this.p) {
            this.d(g.b(this.q + 1, this.r));
        }
        return -1;
    }

    @Override
    public Object a(long l2, Object object) {
        int n2 = this.b(l2, object);
        if (n2 < 0) {
            return this.a;
        }
        Object object2 = this.k[n2];
        this.k[n2] = object;
        return object2;
    }

    @Override
    public Object a(Long l2, Object object) {
        Object object2 = object;
        int n2 = this.b(l2, object2);
        if (n2 < 0) {
            return this.a;
        }
        Object object3 = this.k[n2];
        this.k[n2] = object2;
        return object3;
    }

    protected final void a(int n2) {
        long[] arrl = this.j;
        while (true) {
            long l2;
            int n3 = n2;
            n2 = n3 + 1 & this.l;
            while (true) {
                if ((l2 = arrl[n2]) == 0L) {
                    arrl[n3] = 0L;
                    this.k[n3] = null;
                    return;
                }
                int n4 = g.b(this.n.a(l2)) & this.l;
                if (n3 <= n2 ? n3 >= n4 || n4 > n2 : n3 >= n4 && n4 > n2) break;
                n2 = n2 + 1 & this.l;
            }
            arrl[n3] = l2;
            this.k[n3] = this.k[n2];
        }
    }

    @Override
    public Object a(long l2) {
        if (this.n.a(l2, 0L)) {
            if (this.m) {
                return this.m();
            }
            return this.a;
        }
        long[] arrl = this.j;
        int n2 = g.b(this.n.a(l2)) & this.l;
        long l3 = arrl[n2];
        if (l3 == 0L) {
            return this.a;
        }
        if (this.n.a(l2, l3)) {
            return this.f(n2);
        }
        do {
            if ((l3 = arrl[n2 = n2 + 1 & this.l]) != 0L) continue;
            return this.a;
        } while (!this.n.a(l2, l3));
        return this.f(n2);
    }

    @Override
    public Object remove(Object object) {
        long l2 = (Long)object;
        if (this.n.a(l2, 0L)) {
            if (this.m) {
                return this.m();
            }
            return this.a;
        }
        long[] arrl = this.j;
        int n2 = g.b(this.n.a(l2)) & this.l;
        long l3 = arrl[n2];
        if (l3 == 0L) {
            return this.a;
        }
        if (this.n.a(l3, l2)) {
            return this.f(n2);
        }
        do {
            if ((l3 = arrl[n2 = n2 + 1 & this.l]) != 0L) continue;
            return this.a;
        } while (!this.n.a(l3, l2));
        return this.f(n2);
    }

    public Object a(Long l2) {
        if (l2 == null) {
            return null;
        }
        long l3 = l2;
        if (this.n.a(l3, 0L)) {
            return this.m ? this.k[this.o] : this.a;
        }
        long[] arrl = this.j;
        int n2 = g.b(this.n.a(l3)) & this.l;
        long l4 = arrl[n2];
        if (l4 == 0L) {
            return this.a;
        }
        if (this.n.a(l3, l4)) {
            return this.k[n2];
        }
        do {
            if ((l4 = arrl[n2 = n2 + 1 & this.l]) != 0L) continue;
            return this.a;
        } while (!this.n.a(l3, l4));
        return this.k[n2];
    }

    @Override
    public Object c(long l2) {
        if (this.n.a(l2, 0L)) {
            return this.m ? this.k[this.o] : this.a;
        }
        long[] arrl = this.j;
        int n2 = g.b(this.n.a(l2)) & this.l;
        long l3 = arrl[n2];
        if (l3 == 0L) {
            return this.a;
        }
        if (this.n.a(l2, l3)) {
            return this.k[n2];
        }
        do {
            if ((l3 = arrl[n2 = n2 + 1 & this.l]) != 0L) continue;
            return this.a;
        } while (!this.n.a(l2, l3));
        return this.k[n2];
    }

    @Override
    public boolean b(long l2) {
        if (this.n.a(l2, 0L)) {
            return this.m;
        }
        long[] arrl = this.j;
        int n2 = g.b(this.n.a(l2)) & this.l;
        long l3 = arrl[n2];
        if (l3 == 0L) {
            return false;
        }
        if (this.n.a(l2, l3)) {
            return true;
        }
        do {
            if ((l3 = arrl[n2 = n2 + 1 & this.l]) != 0L) continue;
            return false;
        } while (!this.n.a(l2, l3));
        return true;
    }

    @Override
    public boolean containsValue(Object object) {
        Object[] arrobject = this.k;
        long[] arrl = this.j;
        if (this.m && (arrobject[this.o] == null ? object == null : arrobject[this.o].equals(object))) {
            return true;
        }
        int n2 = this.o;
        while (n2-- != 0) {
            if (arrl[n2] == 0L || !(arrobject[n2] == null ? object == null : arrobject[n2].equals(object))) continue;
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        if (this.q == 0) {
            return;
        }
        this.q = 0;
        this.m = false;
        Arrays.fill(this.j, 0L);
        Arrays.fill(this.k, null);
    }

    @Override
    public int size() {
        return this.q;
    }

    @Override
    public boolean isEmpty() {
        return this.q == 0;
    }

    public void b(int n2) {
    }

    public int f() {
        return 16;
    }

    public au h() {
        if (this.s == null) {
            this.s = new bi(this, null);
        }
        return this.s;
    }

    @Override
    public ec b() {
        if (this.t == null) {
            this.t = new bg(this, null);
        }
        return this.t;
    }

    @Override
    public w c() {
        if (this.u == null) {
            this.u = new bc(this);
        }
        return this.u;
    }

    public boolean i() {
        return true;
    }

    public boolean j() {
        int n2 = g.b(this.q, this.r);
        if (n2 >= this.o || this.q > g.a(n2, this.r)) {
            return true;
        }
        try {
            this.d(n2);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            return false;
        }
        return true;
    }

    public boolean c(int n2) {
        int n3 = g.d((int)Math.ceil((float)n2 / this.r));
        if (n3 >= n2 || this.q > g.a(n3, this.r)) {
            return true;
        }
        try {
            this.d(n3);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            return false;
        }
        return true;
    }

    protected void d(int n2) {
        long[] arrl = this.j;
        Object[] arrobject = this.k;
        int n3 = n2 - 1;
        long[] arrl2 = new long[n2 + 1];
        Object[] arrobject2 = new Object[n2 + 1];
        int n4 = this.o;
        int n5 = this.l();
        while (n5-- != 0) {
            while (arrl[--n4] == 0L) {
            }
            int n6 = g.b(this.n.a(arrl[n4])) & n3;
            if (arrl2[n6] != 0L) {
                while (arrl2[n6 = n6 + 1 & n3] != 0L) {
                }
            }
            arrl2[n6] = arrl[n4];
            arrobject2[n6] = arrobject[n4];
        }
        arrobject2[n2] = arrobject[this.o];
        this.o = n2;
        this.l = n3;
        this.p = g.a(this.o, this.r);
        this.j = arrl2;
        this.k = arrobject2;
    }

    public bb k() {
        bb bb2;
        try {
            bb2 = (bb)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        bb2.t = null;
        bb2.u = null;
        bb2.s = null;
        bb2.m = this.m;
        bb2.j = (long[])this.j.clone();
        bb2.k = (Object[])this.k.clone();
        bb2.n = this.n;
        return bb2;
    }

    @Override
    public int hashCode() {
        int n2 = 0;
        int n3 = this.l();
        int n4 = 0;
        int n5 = 0;
        while (n3-- != 0) {
            while (this.j[n4] == 0L) {
                ++n4;
            }
            n5 = this.n.a(this.j[n4]);
            if (this != this.k[n4]) {
                n5 ^= this.k[n4] == null ? 0 : this.k[n4].hashCode();
            }
            n2 += n5;
            ++n4;
        }
        if (this.m) {
            n2 += this.k[this.o] == null ? 0 : this.k[this.o].hashCode();
        }
        return n2;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        long[] arrl = this.j;
        Object[] arrobject = this.k;
        bj bj2 = new bj(this, null);
        objectOutputStream.defaultWriteObject();
        int n2 = this.q;
        while (n2-- != 0) {
            int n3 = bj2.c();
            objectOutputStream.writeLong(arrl[n3]);
            objectOutputStream.writeObject(arrobject[n3]);
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.o = g.b(this.q, this.r);
        this.p = g.a(this.o, this.r);
        this.l = this.o - 1;
        this.j = new long[this.o + 1];
        long[] arrl = this.j;
        this.k = new Object[this.o + 1];
        Object[] arrobject = this.k;
        int n2 = this.q;
        while (n2-- != 0) {
            int n3;
            long l2 = objectInputStream.readLong();
            Object object = objectInputStream.readObject();
            if (this.n.a(l2, 0L)) {
                n3 = this.o;
                this.m = true;
            } else {
                n3 = g.b(this.n.a(l2)) & this.l;
                while (arrl[n3] != 0L) {
                    n3 = n3 + 1 & this.l;
                }
            }
            arrl[n3] = l2;
            arrobject[n3] = object;
        }
    }

    private void n() {
    }

    @Override
    public /* synthetic */ aq bG_() {
        return this.h();
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.a((Long)object, object2);
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.c();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.b();
    }

    public /* synthetic */ Object clone() {
        return this.k();
    }

    static /* synthetic */ Object a(bb bb2) {
        return bb2.m();
    }

    static /* synthetic */ Object a(bb bb2, int n2) {
        return bb2.f(n2);
    }
}

