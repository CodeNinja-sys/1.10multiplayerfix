/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.as;
import a.a.a.a.a.au;
import a.a.a.a.a.b;
import a.a.a.a.a.bm;
import a.a.a.a.a.bq;
import a.a.a.a.a.bs;
import a.a.a.a.a.bt;
import a.a.a.a.a.eb;
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
    protected transient int[] j;
    protected transient Object[] k;
    protected transient int l;
    protected transient boolean m;
    protected transient int n;
    protected transient int o;
    protected int p;
    protected final float q;
    protected transient au r;
    protected transient eb s;
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
        this.j = new int[this.n + 1];
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

    public bl(int[] arrn, Object[] arrobject, float f2) {
        this(arrn.length, f2);
        if (arrn.length != arrobject.length) {
            throw new IllegalArgumentException("The key array and the value array have different lengths (" + arrn.length + " and " + arrobject.length + ")");
        }
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            this.a(arrn[i2], arrobject[i2]);
        }
    }

    public bl(int[] arrn, Object[] arrobject) {
        this(arrn, arrobject, 0.75f);
    }

    private int k() {
        return this.m ? this.p - 1 : this.p;
    }

    private void h(int n2) {
        int n3 = g.b(n2, this.q);
        if (n3 > this.n) {
            this.g(n3);
        }
    }

    private void a(long l2) {
        int n2 = (int)Math.min(0x40000000L, Math.max(2L, g.e((long)Math.ceil((float)l2 / this.q))));
        if (n2 > this.n) {
            this.g(n2);
        }
    }

    private Object i(int n2) {
        Object object = this.k[n2];
        this.k[n2] = null;
        --this.p;
        this.d(n2);
        if (this.p < this.o / 4 && this.n > 16) {
            this.g(this.n / 2);
        }
        return object;
    }

    private Object l() {
        this.m = false;
        Object object = this.k[this.n];
        this.k[this.n] = null;
        --this.p;
        if (this.p < this.o / 4 && this.n > 16) {
            this.g(this.n / 2);
        }
        return object;
    }

    @Override
    public void putAll(Map map) {
        if ((double)this.q <= 0.5) {
            this.h(map.size());
        } else {
            this.a((long)(this.size() + map.size()));
        }
        super.putAll(map);
    }

    private int b(int n2, Object object) {
        int n3;
        if (n2 == 0) {
            if (this.m) {
                return this.n;
            }
            this.m = true;
            n3 = this.n;
        } else {
            int[] arrn = this.j;
            n3 = g.b(n2) & this.l;
            int n4 = arrn[n3];
            if (n4 != 0) {
                if (n4 == n2) {
                    return n3;
                }
                while ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) {
                    if (n4 != n2) continue;
                    return n3;
                }
            }
        }
        this.j[n3] = n2;
        this.k[n3] = object;
        if (this.p++ >= this.o) {
            this.g(g.b(this.p + 1, this.q));
        }
        return -1;
    }

    @Override
    public Object a(int n2, Object object) {
        int n3 = this.b(n2, object);
        if (n3 < 0) {
            return this.a;
        }
        Object object2 = this.k[n3];
        this.k[n3] = object;
        return object2;
    }

    @Override
    public Object a(Integer n2, Object object) {
        Object object2 = object;
        int n3 = this.b(n2, object2);
        if (n3 < 0) {
            return this.a;
        }
        Object object3 = this.k[n3];
        this.k[n3] = object2;
        return object3;
    }

    protected final void d(int n2) {
        int[] arrn = this.j;
        while (true) {
            int n3;
            int n4 = n2;
            n2 = n4 + 1 & this.l;
            while (true) {
                if ((n3 = arrn[n2]) == 0) {
                    arrn[n4] = 0;
                    this.k[n4] = null;
                    return;
                }
                int n5 = g.b(n3) & this.l;
                if (n4 <= n2 ? n4 >= n5 || n5 > n2 : n4 >= n5 && n5 > n2) break;
                n2 = n2 + 1 & this.l;
            }
            arrn[n4] = n3;
            this.k[n4] = this.k[n2];
        }
    }

    @Override
    public Object a(int n2) {
        if (n2 == 0) {
            if (this.m) {
                return this.l();
            }
            return this.a;
        }
        int[] arrn = this.j;
        int n3 = g.b(n2) & this.l;
        int n4 = arrn[n3];
        if (n4 == 0) {
            return this.a;
        }
        if (n2 == n4) {
            return this.i(n3);
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) continue;
            return this.a;
        } while (n2 != n4);
        return this.i(n3);
    }

    @Override
    public Object remove(Object object) {
        int n2 = (Integer)object;
        if (n2 == 0) {
            if (this.m) {
                return this.l();
            }
            return this.a;
        }
        int[] arrn = this.j;
        int n3 = g.b(n2) & this.l;
        int n4 = arrn[n3];
        if (n4 == 0) {
            return this.a;
        }
        if (n4 == n2) {
            return this.i(n3);
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) continue;
            return this.a;
        } while (n4 != n2);
        return this.i(n3);
    }

    public Object a(Integer n2) {
        if (n2 == null) {
            return null;
        }
        int n3 = n2;
        if (n3 == 0) {
            return this.m ? this.k[this.n] : this.a;
        }
        int[] arrn = this.j;
        int n4 = g.b(n3) & this.l;
        int n5 = arrn[n4];
        if (n5 == 0) {
            return this.a;
        }
        if (n3 == n5) {
            return this.k[n4];
        }
        do {
            if ((n5 = arrn[n4 = n4 + 1 & this.l]) != 0) continue;
            return this.a;
        } while (n3 != n5);
        return this.k[n4];
    }

    @Override
    public Object c(int n2) {
        if (n2 == 0) {
            return this.m ? this.k[this.n] : this.a;
        }
        int[] arrn = this.j;
        int n3 = g.b(n2) & this.l;
        int n4 = arrn[n3];
        if (n4 == 0) {
            return this.a;
        }
        if (n2 == n4) {
            return this.k[n3];
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) continue;
            return this.a;
        } while (n2 != n4);
        return this.k[n3];
    }

    @Override
    public boolean b(int n2) {
        if (n2 == 0) {
            return this.m;
        }
        int[] arrn = this.j;
        int n3 = g.b(n2) & this.l;
        int n4 = arrn[n3];
        if (n4 == 0) {
            return false;
        }
        if (n2 == n4) {
            return true;
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) continue;
            return false;
        } while (n2 != n4);
        return true;
    }

    @Override
    public boolean containsValue(Object object) {
        Object[] arrobject = this.k;
        int[] arrn = this.j;
        if (this.m && (arrobject[this.n] == null ? object == null : arrobject[this.n].equals(object))) {
            return true;
        }
        int n2 = this.n;
        while (n2-- != 0) {
            if (arrn[n2] == 0 || !(arrobject[n2] == null ? object == null : arrobject[n2].equals(object))) continue;
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
        Arrays.fill(this.j, 0);
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

    public void e(int n2) {
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
    public eb b() {
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
            this.g(n2);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            return false;
        }
        return true;
    }

    public boolean f(int n2) {
        int n3 = g.d((int)Math.ceil((float)n2 / this.q));
        if (n3 >= n2 || this.p > g.a(n3, this.q)) {
            return true;
        }
        try {
            this.g(n3);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            return false;
        }
        return true;
    }

    protected void g(int n2) {
        int[] arrn = this.j;
        Object[] arrobject = this.k;
        int n3 = n2 - 1;
        int[] arrn2 = new int[n2 + 1];
        Object[] arrobject2 = new Object[n2 + 1];
        int n4 = this.n;
        int n5 = this.k();
        while (n5-- != 0) {
            while (arrn[--n4] == 0) {
            }
            int n6 = g.b(arrn[n4]) & n3;
            if (arrn2[n6] != 0) {
                while (arrn2[n6 = n6 + 1 & n3] != 0) {
                }
            }
            arrn2[n6] = arrn[n4];
            arrobject2[n6] = arrobject[n4];
        }
        arrobject2[n2] = arrobject[this.n];
        this.n = n2;
        this.l = n3;
        this.o = g.a(this.n, this.q);
        this.j = arrn2;
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
        bl2.j = (int[])this.j.clone();
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
            while (this.j[n4] == 0) {
                ++n4;
            }
            n5 = this.j[n4];
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
        int[] arrn = this.j;
        Object[] arrobject = this.k;
        bt bt2 = new bt(this, null);
        objectOutputStream.defaultWriteObject();
        int n2 = this.p;
        while (n2-- != 0) {
            int n3 = bt2.c();
            objectOutputStream.writeInt(arrn[n3]);
            objectOutputStream.writeObject(arrobject[n3]);
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.n = g.b(this.p, this.q);
        this.o = g.a(this.n, this.q);
        this.l = this.n - 1;
        this.j = new int[this.n + 1];
        int[] arrn = this.j;
        this.k = new Object[this.n + 1];
        Object[] arrobject = this.k;
        int n2 = this.p;
        while (n2-- != 0) {
            int n3;
            int n4 = objectInputStream.readInt();
            Object object = objectInputStream.readObject();
            if (n4 == 0) {
                n3 = this.n;
                this.m = true;
            } else {
                n3 = g.b(n4) & this.l;
                while (arrn[n3] != 0) {
                    n3 = n3 + 1 & this.l;
                }
            }
            arrn[n3] = n4;
            arrobject[n3] = object;
        }
    }

    private void m() {
    }

    @Override
    public /* synthetic */ aq bD_() {
        return this.f();
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.a((Integer)object, object2);
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
        return bl2.i(n2);
    }
}

