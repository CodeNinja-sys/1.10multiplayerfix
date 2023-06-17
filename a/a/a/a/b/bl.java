/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.as;
import a.a.a.a.b.au;
import a.a.a.a.b.b;
import a.a.a.a.b.bm;
import a.a.a.a.b.bq;
import a.a.a.a.b.bs;
import a.a.a.a.b.bt;
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

public class bl
extends b
implements e,
Serializable,
Cloneable {
    private static final long u = 0L;
    private static final boolean v = false;
    protected transient long[] j;
    protected transient Object[] k;
    protected transient int l;
    protected transient boolean m;
    protected transient int n;
    protected transient int o;
    protected int p;
    protected final float q;
    protected transient au r;
    protected transient ec s;
    protected transient w t;

    public bl(int n2, float f2) {
        if (f2 <= 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Load factor must be greater than 0 and smaller than or equal to 1");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.q = f2;
        this.n = g.b(n2, f2);
        this.l = this.n - 1;
        this.o = g.a(this.n, f2);
        this.j = new long[this.n + 1];
        this.k = new Object[this.n + 1];
    }

    public bl(int n2) {
        this(n2, 0.75f);
    }

    public bl() {
        this(16, 0.75f);
    }

    public bl(Map map, float f2) {
        this(map.size(), f2);
        this.putAll(map);
    }

    public bl(Map map) {
        this(map, 0.75f);
    }

    public bl(as as2, float f2) {
        this(as2.size(), f2);
        this.putAll((Map)as2);
    }

    public bl(as as2) {
        this(as2, 0.75f);
    }

    public bl(long[] arrl, Object[] arrobject, float f2) {
        this(arrl.length, f2);
        if (arrl.length != arrobject.length) {
            throw new IllegalArgumentException("The key array and the value array have different lengths (" + arrl.length + " and " + arrobject.length + ")");
        }
        for (int i2 = 0; i2 < arrl.length; ++i2) {
            this.a(arrl[i2], arrobject[i2]);
        }
    }

    public bl(long[] arrl, Object[] arrobject) {
        this(arrl, arrobject, 0.75f);
    }

    private int k() {
        return this.m ? this.p - 1 : this.p;
    }

    private void e(int n2) {
        int n3 = g.b(n2, this.q);
        if (n3 > this.n) {
            this.d(n3);
        }
    }

    private void d(long l2) {
        int n2 = (int)Math.min(0x40000000L, Math.max(2L, g.e((long)Math.ceil((float)l2 / this.q))));
        if (n2 > this.n) {
            this.d(n2);
        }
    }

    private Object f(int n2) {
        Object object = this.k[n2];
        this.k[n2] = null;
        --this.p;
        this.a(n2);
        if (this.p < this.o / 4 && this.n > 16) {
            this.d(this.n / 2);
        }
        return object;
    }

    private Object l() {
        this.m = false;
        Object object = this.k[this.n];
        this.k[this.n] = null;
        --this.p;
        if (this.p < this.o / 4 && this.n > 16) {
            this.d(this.n / 2);
        }
        return object;
    }

    @Override
    public void putAll(Map map) {
        if ((double)this.q <= 0.5) {
            this.e(map.size());
        } else {
            this.d((long)(this.size() + map.size()));
        }
        super.putAll(map);
    }

    private int b(long l2, Object object) {
        int n2;
        if (l2 == 0L) {
            if (this.m) {
                return this.n;
            }
            this.m = true;
            n2 = this.n;
        } else {
            long[] arrl = this.j;
            n2 = (int)g.b(l2) & this.l;
            long l3 = arrl[n2];
            if (l3 != 0L) {
                if (l3 == l2) {
                    return n2;
                }
                while ((l3 = arrl[n2 = n2 + 1 & this.l]) != 0L) {
                    if (l3 != l2) continue;
                    return n2;
                }
            }
        }
        this.j[n2] = l2;
        this.k[n2] = object;
        if (this.p++ >= this.o) {
            this.d(g.b(this.p + 1, this.q));
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
                int n4 = (int)g.b(l2) & this.l;
                if (n3 <= n2 ? n3 >= n4 || n4 > n2 : n3 >= n4 && n4 > n2) break;
                n2 = n2 + 1 & this.l;
            }
            arrl[n3] = l2;
            this.k[n3] = this.k[n2];
        }
    }

    @Override
    public Object a(long l2) {
        if (l2 == 0L) {
            if (this.m) {
                return this.l();
            }
            return this.a;
        }
        long[] arrl = this.j;
        int n2 = (int)g.b(l2) & this.l;
        long l3 = arrl[n2];
        if (l3 == 0L) {
            return this.a;
        }
        if (l2 == l3) {
            return this.f(n2);
        }
        do {
            if ((l3 = arrl[n2 = n2 + 1 & this.l]) != 0L) continue;
            return this.a;
        } while (l2 != l3);
        return this.f(n2);
    }

    @Override
    public Object remove(Object object) {
        long l2 = (Long)object;
        if (l2 == 0L) {
            if (this.m) {
                return this.l();
            }
            return this.a;
        }
        long[] arrl = this.j;
        int n2 = (int)g.b(l2) & this.l;
        long l3 = arrl[n2];
        if (l3 == 0L) {
            return this.a;
        }
        if (l3 == l2) {
            return this.f(n2);
        }
        do {
            if ((l3 = arrl[n2 = n2 + 1 & this.l]) != 0L) continue;
            return this.a;
        } while (l3 != l2);
        return this.f(n2);
    }

    public Object a(Long l2) {
        if (l2 == null) {
            return null;
        }
        long l3 = l2;
        if (l3 == 0L) {
            return this.m ? this.k[this.n] : this.a;
        }
        long[] arrl = this.j;
        int n2 = (int)g.b(l3) & this.l;
        long l4 = arrl[n2];
        if (l4 == 0L) {
            return this.a;
        }
        if (l3 == l4) {
            return this.k[n2];
        }
        do {
            if ((l4 = arrl[n2 = n2 + 1 & this.l]) != 0L) continue;
            return this.a;
        } while (l3 != l4);
        return this.k[n2];
    }

    @Override
    public Object c(long l2) {
        if (l2 == 0L) {
            return this.m ? this.k[this.n] : this.a;
        }
        long[] arrl = this.j;
        int n2 = (int)g.b(l2) & this.l;
        long l3 = arrl[n2];
        if (l3 == 0L) {
            return this.a;
        }
        if (l2 == l3) {
            return this.k[n2];
        }
        do {
            if ((l3 = arrl[n2 = n2 + 1 & this.l]) != 0L) continue;
            return this.a;
        } while (l2 != l3);
        return this.k[n2];
    }

    @Override
    public boolean b(long l2) {
        if (l2 == 0L) {
            return this.m;
        }
        long[] arrl = this.j;
        int n2 = (int)g.b(l2) & this.l;
        long l3 = arrl[n2];
        if (l3 == 0L) {
            return false;
        }
        if (l2 == l3) {
            return true;
        }
        do {
            if ((l3 = arrl[n2 = n2 + 1 & this.l]) != 0L) continue;
            return false;
        } while (l2 != l3);
        return true;
    }

    @Override
    public boolean containsValue(Object object) {
        Object[] arrobject = this.k;
        long[] arrl = this.j;
        if (this.m && (arrobject[this.n] == null ? object == null : arrobject[this.n].equals(object))) {
            return true;
        }
        int n2 = this.n;
        while (n2-- != 0) {
            if (arrl[n2] == 0L || !(arrobject[n2] == null ? object == null : arrobject[n2].equals(object))) continue;
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        if (this.p == 0) {
            return;
        }
        this.p = 0;
        this.m = false;
        Arrays.fill(this.j, 0L);
        Arrays.fill(this.k, null);
    }

    @Override
    public int size() {
        return this.p;
    }

    @Override
    public boolean isEmpty() {
        return this.p == 0;
    }

    public void b(int n2) {
    }

    public int e() {
        return 16;
    }

    public au f() {
        if (this.r == null) {
            this.r = new bs(this, null);
        }
        return this.r;
    }

    @Override
    public ec b() {
        if (this.s == null) {
            this.s = new bq(this, null);
        }
        return this.s;
    }

    @Override
    public w c() {
        if (this.t == null) {
            this.t = new bm(this);
        }
        return this.t;
    }

    public boolean h() {
        return true;
    }

    public boolean i() {
        int n2 = g.b(this.p, this.q);
        if (n2 >= this.n || this.p > g.a(n2, this.q)) {
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
        int n3 = g.d((int)Math.ceil((float)n2 / this.q));
        if (n3 >= n2 || this.p > g.a(n3, this.q)) {
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
        int n4 = this.n;
        int n5 = this.k();
        while (n5-- != 0) {
            while (arrl[--n4] == 0L) {
            }
            int n6 = (int)g.b(arrl[n4]) & n3;
            if (arrl2[n6] != 0L) {
                while (arrl2[n6 = n6 + 1 & n3] != 0L) {
                }
            }
            arrl2[n6] = arrl[n4];
            arrobject2[n6] = arrobject[n4];
        }
        arrobject2[n2] = arrobject[this.n];
        this.n = n2;
        this.l = n3;
        this.o = g.a(this.n, this.q);
        this.j = arrl2;
        this.k = arrobject2;
    }

    public bl j() {
        bl bl2;
        try {
            bl2 = (bl)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        bl2.s = null;
        bl2.t = null;
        bl2.r = null;
        bl2.m = this.m;
        bl2.j = (long[])this.j.clone();
        bl2.k = (Object[])this.k.clone();
        return bl2;
    }

    @Override
    public int hashCode() {
        int n2 = 0;
        int n3 = this.k();
        int n4 = 0;
        int n5 = 0;
        while (n3-- != 0) {
            while (this.j[n4] == 0L) {
                ++n4;
            }
            n5 = g.d(this.j[n4]);
            if (this != this.k[n4]) {
                n5 ^= this.k[n4] == null ? 0 : this.k[n4].hashCode();
            }
            n2 += n5;
            ++n4;
        }
        if (this.m) {
            n2 += this.k[this.n] == null ? 0 : this.k[this.n].hashCode();
        }
        return n2;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        long[] arrl = this.j;
        Object[] arrobject = this.k;
        bt bt2 = new bt(this, null);
        objectOutputStream.defaultWriteObject();
        int n2 = this.p;
        while (n2-- != 0) {
            int n3 = bt2.c();
            objectOutputStream.writeLong(arrl[n3]);
            objectOutputStream.writeObject(arrobject[n3]);
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.n = g.b(this.p, this.q);
        this.o = g.a(this.n, this.q);
        this.l = this.n - 1;
        this.j = new long[this.n + 1];
        long[] arrl = this.j;
        this.k = new Object[this.n + 1];
        Object[] arrobject = this.k;
        int n2 = this.p;
        while (n2-- != 0) {
            int n3;
            long l2 = objectInputStream.readLong();
            Object object = objectInputStream.readObject();
            if (l2 == 0L) {
                n3 = this.n;
                this.m = true;
            } else {
                n3 = (int)g.b(l2) & this.l;
                while (arrl[n3] != 0L) {
                    n3 = n3 + 1 & this.l;
                }
            }
            arrl[n3] = l2;
            arrobject[n3] = object;
        }
    }

    private void m() {
    }

    @Override
    public /* synthetic */ aq bG_() {
        return this.f();
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
        return this.j();
    }

    static /* synthetic */ Object a(bl bl2) {
        return bl2.l();
    }

    static /* synthetic */ Object a(bl bl2, int n2) {
        return bl2.f(n2);
    }
}

