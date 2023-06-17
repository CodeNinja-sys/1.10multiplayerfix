/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.aj;
import a.a.a.a.a.an;
import a.a.a.a.a.ap;
import a.a.a.a.a.aq;
import a.a.a.a.a.as;
import a.a.a.a.a.bv;
import a.a.a.a.a.bw;
import a.a.a.a.a.cy;
import a.a.a.a.a.eb;
import a.a.a.a.a.eh;
import a.a.a.a.a.h;
import a.a.a.a.c.aw;
import a.a.a.a.c.w;
import a.a.a.a.e;
import a.a.a.a.g;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class ai
extends h
implements e,
Serializable,
Cloneable {
    private static final long x = 0L;
    private static final boolean y = false;
    protected transient int[] j;
    protected transient Object[] k;
    protected transient int l;
    protected transient boolean m;
    protected transient int n = -1;
    protected transient int o = -1;
    protected transient long[] p;
    protected transient int q;
    protected transient int r;
    protected int s;
    protected final float t;
    protected transient bw u;
    protected transient eh v;
    protected transient w w;

    public ai(int n2, float f2) {
        if (f2 <= 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Load factor must be greater than 0 and smaller than or equal to 1");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.t = f2;
        this.q = g.b(n2, f2);
        this.l = this.q - 1;
        this.r = g.a(this.q, f2);
        this.j = new int[this.q + 1];
        this.k = new Object[this.q + 1];
        this.p = new long[this.q + 1];
    }

    public ai(int n2) {
        this(n2, 0.75f);
    }

    public ai() {
        this(16, 0.75f);
    }

    public ai(Map map, float f2) {
        this(map.size(), f2);
        this.putAll(map);
    }

    public ai(Map map) {
        this(map, 0.75f);
    }

    public ai(as as2, float f2) {
        this(as2.size(), f2);
        this.putAll((Map)as2);
    }

    public ai(as as2) {
        this(as2, 0.75f);
    }

    public ai(int[] arrn, Object[] arrobject, float f2) {
        this(arrn.length, f2);
        if (arrn.length != arrobject.length) {
            throw new IllegalArgumentException("The key array and the value array have different lengths (" + arrn.length + " and " + arrobject.length + ")");
        }
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            this.a(arrn[i2], arrobject[i2]);
        }
    }

    public ai(int[] arrn, Object[] arrobject) {
        this(arrn, arrobject, 0.75f);
    }

    private int t() {
        return this.m ? this.s - 1 : this.s;
    }

    private void m(int n2) {
        int n3 = g.b(n2, this.t);
        if (n3 > this.q) {
            this.l(n3);
        }
    }

    private void a(long l2) {
        int n2 = (int)Math.min(0x40000000L, Math.max(2L, g.e((long)Math.ceil((float)l2 / this.t))));
        if (n2 > this.q) {
            this.l(n2);
        }
    }

    private Object n(int n2) {
        Object object = this.k[n2];
        this.k[n2] = null;
        --this.s;
        this.h(n2);
        this.d(n2);
        if (this.s < this.r / 4 && this.q > 16) {
            this.l(this.q / 2);
        }
        return object;
    }

    private Object u() {
        this.m = false;
        Object object = this.k[this.q];
        this.k[this.q] = null;
        --this.s;
        this.h(this.q);
        if (this.s < this.r / 4 && this.q > 16) {
            this.l(this.q / 2);
        }
        return object;
    }

    @Override
    public void putAll(Map map) {
        if ((double)this.t <= 0.5) {
            this.m(map.size());
        } else {
            this.a((long)(this.size() + map.size()));
        }
        super.putAll(map);
    }

    private int d(int n2, Object object) {
        int n3;
        if (n2 == 0) {
            if (this.m) {
                return this.q;
            }
            this.m = true;
            n3 = this.q;
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
        if (this.s == 0) {
            this.n = this.o = n3;
            this.p[n3] = -1L;
        } else {
            int n5 = this.o;
            this.p[n5] = this.p[n5] ^ (this.p[this.o] ^ (long)n3 & 0xFFFFFFFFL) & 0xFFFFFFFFL;
            this.p[n3] = ((long)this.o & 0xFFFFFFFFL) << 32 | 0xFFFFFFFFL;
            this.o = n3;
        }
        if (this.s++ >= this.r) {
            this.l(g.b(this.s + 1, this.t));
        }
        return -1;
    }

    @Override
    public Object a(int n2, Object object) {
        int n3 = this.d(n2, object);
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
        int n3 = this.d(n2, object2);
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
            this.a(n2, n4);
        }
    }

    @Override
    public Object a(int n2) {
        if (n2 == 0) {
            if (this.m) {
                return this.u();
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
            return this.n(n3);
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) continue;
            return this.a;
        } while (n2 != n4);
        return this.n(n3);
    }

    @Override
    public Object remove(Object object) {
        int n2 = (Integer)object;
        if (n2 == 0) {
            if (this.m) {
                return this.u();
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
            return this.n(n3);
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) continue;
            return this.a;
        } while (n4 != n2);
        return this.n(n3);
    }

    private Object e(int n2, Object object) {
        Object object2 = this.k[n2];
        this.k[n2] = object;
        return object2;
    }

    public Object i() {
        if (this.s == 0) {
            throw new NoSuchElementException();
        }
        int n2 = this.n;
        this.n = (int)this.p[n2];
        if (0 <= this.n) {
            int n3 = this.n;
            this.p[n3] = this.p[n3] | 0xFFFFFFFF00000000L;
        }
        --this.s;
        Object object = this.k[n2];
        if (n2 == this.q) {
            this.m = false;
            this.k[this.q] = null;
        } else {
            this.d(n2);
        }
        if (this.s < this.r / 4 && this.q > 16) {
            this.l(this.q / 2);
        }
        return object;
    }

    public Object j() {
        if (this.s == 0) {
            throw new NoSuchElementException();
        }
        int n2 = this.o;
        this.o = (int)(this.p[n2] >>> 32);
        if (0 <= this.o) {
            int n3 = this.o;
            this.p[n3] = this.p[n3] | 0xFFFFFFFFL;
        }
        --this.s;
        Object object = this.k[n2];
        if (n2 == this.q) {
            this.m = false;
            this.k[this.q] = null;
        } else {
            this.d(n2);
        }
        if (this.s < this.r / 4 && this.q > 16) {
            this.l(this.q / 2);
        }
        return object;
    }

    private void o(int n2) {
        if (this.s == 1 || this.n == n2) {
            return;
        }
        if (this.o == n2) {
            int n3 = this.o = (int)(this.p[n2] >>> 32);
            this.p[n3] = this.p[n3] | 0xFFFFFFFFL;
        } else {
            long l2 = this.p[n2];
            int n4 = (int)(l2 >>> 32);
            int n5 = (int)l2;
            int n6 = n4;
            this.p[n6] = this.p[n6] ^ (this.p[n4] ^ l2 & 0xFFFFFFFFL) & 0xFFFFFFFFL;
            int n7 = n5;
            this.p[n7] = this.p[n7] ^ (this.p[n5] ^ l2 & 0xFFFFFFFF00000000L) & 0xFFFFFFFF00000000L;
        }
        int n8 = this.n;
        this.p[n8] = this.p[n8] ^ (this.p[this.n] ^ ((long)n2 & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
        this.p[n2] = 0xFFFFFFFF00000000L | (long)this.n & 0xFFFFFFFFL;
        this.n = n2;
    }

    private void p(int n2) {
        if (this.s == 1 || this.o == n2) {
            return;
        }
        if (this.n == n2) {
            int n3 = this.n = (int)this.p[n2];
            this.p[n3] = this.p[n3] | 0xFFFFFFFF00000000L;
        } else {
            long l2 = this.p[n2];
            int n4 = (int)(l2 >>> 32);
            int n5 = (int)l2;
            int n6 = n4;
            this.p[n6] = this.p[n6] ^ (this.p[n4] ^ l2 & 0xFFFFFFFFL) & 0xFFFFFFFFL;
            int n7 = n5;
            this.p[n7] = this.p[n7] ^ (this.p[n5] ^ l2 & 0xFFFFFFFF00000000L) & 0xFFFFFFFF00000000L;
        }
        int n8 = this.o;
        this.p[n8] = this.p[n8] ^ (this.p[this.o] ^ (long)n2 & 0xFFFFFFFFL) & 0xFFFFFFFFL;
        this.p[n2] = ((long)this.o & 0xFFFFFFFFL) << 32 | 0xFFFFFFFFL;
        this.o = n2;
    }

    public Object e(int n2) {
        if (n2 == 0) {
            if (this.m) {
                this.o(this.q);
                return this.k[this.q];
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
            this.o(n3);
            return this.k[n3];
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) continue;
            return this.a;
        } while (n2 != n4);
        this.o(n3);
        return this.k[n3];
    }

    public Object f(int n2) {
        if (n2 == 0) {
            if (this.m) {
                this.p(this.q);
                return this.k[this.q];
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
            this.p(n3);
            return this.k[n3];
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) continue;
            return this.a;
        } while (n2 != n4);
        this.p(n3);
        return this.k[n3];
    }

    public Object b(int n2, Object object) {
        int n3;
        if (n2 == 0) {
            if (this.m) {
                this.o(this.q);
                return this.e(this.q, object);
            }
            this.m = true;
            n3 = this.q;
        } else {
            int[] arrn = this.j;
            n3 = g.b(n2) & this.l;
            int n4 = arrn[n3];
            if (n4 != 0) {
                if (n4 == n2) {
                    this.o(n3);
                    return this.e(n3, object);
                }
                while ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) {
                    if (n4 != n2) continue;
                    this.o(n3);
                    return this.e(n3, object);
                }
            }
        }
        this.j[n3] = n2;
        this.k[n3] = object;
        if (this.s == 0) {
            this.n = this.o = n3;
            this.p[n3] = -1L;
        } else {
            int n5 = this.n;
            this.p[n5] = this.p[n5] ^ (this.p[this.n] ^ ((long)n3 & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
            this.p[n3] = 0xFFFFFFFF00000000L | (long)this.n & 0xFFFFFFFFL;
            this.n = n3;
        }
        if (this.s++ >= this.r) {
            this.l(g.b(this.s, this.t));
        }
        return this.a;
    }

    public Object c(int n2, Object object) {
        int n3;
        if (n2 == 0) {
            if (this.m) {
                this.p(this.q);
                return this.e(this.q, object);
            }
            this.m = true;
            n3 = this.q;
        } else {
            int[] arrn = this.j;
            n3 = g.b(n2) & this.l;
            int n4 = arrn[n3];
            if (n4 != 0) {
                if (n4 == n2) {
                    this.p(n3);
                    return this.e(n3, object);
                }
                while ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) {
                    if (n4 != n2) continue;
                    this.p(n3);
                    return this.e(n3, object);
                }
            }
        }
        this.j[n3] = n2;
        this.k[n3] = object;
        if (this.s == 0) {
            this.n = this.o = n3;
            this.p[n3] = -1L;
        } else {
            int n5 = this.o;
            this.p[n5] = this.p[n5] ^ (this.p[this.o] ^ (long)n3 & 0xFFFFFFFFL) & 0xFFFFFFFFL;
            this.p[n3] = ((long)this.o & 0xFFFFFFFFL) << 32 | 0xFFFFFFFFL;
            this.o = n3;
        }
        if (this.s++ >= this.r) {
            this.l(g.b(this.s, this.t));
        }
        return this.a;
    }

    public Object c(Integer n2) {
        if (n2 == null) {
            return null;
        }
        int n3 = n2;
        if (n3 == 0) {
            return this.m ? this.k[this.q] : this.a;
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
            return this.m ? this.k[this.q] : this.a;
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
        if (this.m && (arrobject[this.q] == null ? object == null : arrobject[this.q].equals(object))) {
            return true;
        }
        int n2 = this.q;
        while (n2-- != 0) {
            if (arrn[n2] == 0 || !(arrobject[n2] == null ? object == null : arrobject[n2].equals(object))) continue;
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        if (this.s == 0) {
            return;
        }
        this.s = 0;
        this.m = false;
        Arrays.fill(this.j, 0);
        Arrays.fill(this.k, null);
        this.o = -1;
        this.n = -1;
    }

    @Override
    public int size() {
        return this.s;
    }

    @Override
    public boolean isEmpty() {
        return this.s == 0;
    }

    public void g(int n2) {
    }

    public int k() {
        return 16;
    }

    protected void h(int n2) {
        if (this.s == 0) {
            this.o = -1;
            this.n = -1;
            return;
        }
        if (this.n == n2) {
            this.n = (int)this.p[n2];
            if (0 <= this.n) {
                int n3 = this.n;
                this.p[n3] = this.p[n3] | 0xFFFFFFFF00000000L;
            }
            return;
        }
        if (this.o == n2) {
            this.o = (int)(this.p[n2] >>> 32);
            if (0 <= this.o) {
                int n4 = this.o;
                this.p[n4] = this.p[n4] | 0xFFFFFFFFL;
            }
            return;
        }
        long l2 = this.p[n2];
        int n5 = (int)(l2 >>> 32);
        int n6 = (int)l2;
        int n7 = n5;
        this.p[n7] = this.p[n7] ^ (this.p[n5] ^ l2 & 0xFFFFFFFFL) & 0xFFFFFFFFL;
        int n8 = n6;
        this.p[n8] = this.p[n8] ^ (this.p[n6] ^ l2 & 0xFFFFFFFF00000000L) & 0xFFFFFFFF00000000L;
    }

    protected void a(int n2, int n3) {
        if (this.s == 1) {
            this.n = this.o = n3;
            this.p[n3] = -1L;
            return;
        }
        if (this.n == n2) {
            this.n = n3;
            int n4 = (int)this.p[n2];
            this.p[n4] = this.p[n4] ^ (this.p[(int)this.p[n2]] ^ ((long)n3 & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
            this.p[n3] = this.p[n2];
            return;
        }
        if (this.o == n2) {
            this.o = n3;
            int n5 = (int)(this.p[n2] >>> 32);
            this.p[n5] = this.p[n5] ^ (this.p[(int)(this.p[n2] >>> 32)] ^ (long)n3 & 0xFFFFFFFFL) & 0xFFFFFFFFL;
            this.p[n3] = this.p[n2];
            return;
        }
        long l2 = this.p[n2];
        int n6 = (int)(l2 >>> 32);
        int n7 = (int)l2;
        int n8 = n6;
        this.p[n8] = this.p[n8] ^ (this.p[n6] ^ (long)n3 & 0xFFFFFFFFL) & 0xFFFFFFFFL;
        int n9 = n7;
        this.p[n9] = this.p[n9] ^ (this.p[n7] ^ ((long)n3 & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
        this.p[n3] = l2;
    }

    @Override
    public int l() {
        if (this.s == 0) {
            throw new NoSuchElementException();
        }
        return this.j[this.n];
    }

    @Override
    public int m() {
        if (this.s == 0) {
            throw new NoSuchElementException();
        }
        return this.j[this.o];
    }

    @Override
    public cy n() {
        return null;
    }

    @Override
    public bv i(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public bv j(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public bv b(int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    public bw o() {
        if (this.u == null) {
            this.u = new ap(this, null);
        }
        return this.u;
    }

    @Override
    public eh g() {
        if (this.v == null) {
            this.v = new an(this, null);
        }
        return this.v;
    }

    @Override
    public w c() {
        if (this.w == null) {
            this.w = new aj(this);
        }
        return this.w;
    }

    public boolean p() {
        return true;
    }

    public boolean q() {
        int n2 = g.b(this.s, this.t);
        if (n2 >= this.q || this.s > g.a(n2, this.t)) {
            return true;
        }
        try {
            this.l(n2);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            return false;
        }
        return true;
    }

    public boolean k(int n2) {
        int n3 = g.d((int)Math.ceil((float)n2 / this.t));
        if (n3 >= n2 || this.s > g.a(n3, this.t)) {
            return true;
        }
        try {
            this.l(n3);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            return false;
        }
        return true;
    }

    protected void l(int n2) {
        int[] arrn = this.j;
        Object[] arrobject = this.k;
        int n3 = n2 - 1;
        int[] arrn2 = new int[n2 + 1];
        Object[] arrobject2 = new Object[n2 + 1];
        int n4 = this.n;
        int n5 = -1;
        int n6 = -1;
        long[] arrl = this.p;
        long[] arrl2 = new long[n2 + 1];
        this.n = -1;
        int n7 = this.s;
        while (n7-- != 0) {
            int n8;
            if (arrn[n4] == 0) {
                n8 = n2;
            } else {
                n8 = g.b(arrn[n4]) & n3;
                while (arrn2[n8] != 0) {
                    n8 = n8 + 1 & n3;
                }
            }
            arrn2[n8] = arrn[n4];
            arrobject2[n8] = arrobject[n4];
            if (n5 != -1) {
                int n9 = n6;
                arrl2[n9] = arrl2[n9] ^ (arrl2[n6] ^ (long)n8 & 0xFFFFFFFFL) & 0xFFFFFFFFL;
                int n10 = n8;
                arrl2[n10] = arrl2[n10] ^ (arrl2[n8] ^ ((long)n6 & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
                n6 = n8;
            } else {
                n6 = this.n = n8;
                arrl2[n8] = -1L;
            }
            int n11 = n4;
            n4 = (int)arrl[n4];
            n5 = n11;
        }
        this.p = arrl2;
        this.o = n6;
        if (n6 != -1) {
            int n12 = n6;
            arrl2[n12] = arrl2[n12] | 0xFFFFFFFFL;
        }
        this.q = n2;
        this.l = n3;
        this.r = g.a(this.q, this.t);
        this.j = arrn2;
        this.k = arrobject2;
    }

    public ai r() {
        ai ai2;
        try {
            ai2 = (ai)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        ai2.v = null;
        ai2.w = null;
        ai2.u = null;
        ai2.m = this.m;
        ai2.j = (int[])this.j.clone();
        ai2.k = (Object[])this.k.clone();
        ai2.p = (long[])this.p.clone();
        return ai2;
    }

    @Override
    public int hashCode() {
        int n2 = 0;
        int n3 = this.t();
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
            n2 += this.k[this.q] == null ? 0 : this.k[this.q].hashCode();
        }
        return n2;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        int[] arrn = this.j;
        Object[] arrobject = this.k;
        aq aq2 = new aq(this, null);
        objectOutputStream.defaultWriteObject();
        int n2 = this.s;
        while (n2-- != 0) {
            int n3 = aq2.e();
            objectOutputStream.writeInt(arrn[n3]);
            objectOutputStream.writeObject(arrobject[n3]);
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.q = g.b(this.s, this.t);
        this.r = g.a(this.q, this.t);
        this.l = this.q - 1;
        this.j = new int[this.q + 1];
        int[] arrn = this.j;
        this.k = new Object[this.q + 1];
        Object[] arrobject = this.k;
        this.p = new long[this.q + 1];
        long[] arrl = this.p;
        int n2 = -1;
        this.o = -1;
        this.n = -1;
        int n3 = this.s;
        while (n3-- != 0) {
            int n4;
            int n5 = objectInputStream.readInt();
            Object object = objectInputStream.readObject();
            if (n5 == 0) {
                n4 = this.q;
                this.m = true;
            } else {
                n4 = g.b(n5) & this.l;
                while (arrn[n4] != 0) {
                    n4 = n4 + 1 & this.l;
                }
            }
            arrn[n4] = n5;
            arrobject[n4] = object;
            if (this.n != -1) {
                int n6 = n2;
                arrl[n6] = arrl[n6] ^ (arrl[n2] ^ (long)n4 & 0xFFFFFFFFL) & 0xFFFFFFFFL;
                int n7 = n4;
                arrl[n7] = arrl[n7] ^ (arrl[n4] ^ ((long)n2 & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
                n2 = n4;
                continue;
            }
            n2 = this.n = n4;
            int n8 = n4;
            arrl[n8] = arrl[n8] | 0xFFFFFFFF00000000L;
        }
        this.o = n2;
        if (n2 != -1) {
            int n9 = n2;
            arrl[n9] = arrl[n9] | 0xFFFFFFFFL;
        }
    }

    private void v() {
    }

    @Override
    public /* synthetic */ aw s() {
        return this.o();
    }

    @Override
    public /* synthetic */ eb b() {
        return this.g();
    }

    @Override
    public /* synthetic */ a.a.a.a.c.aq bD_() {
        return this.o();
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
        return this.g();
    }

    public /* synthetic */ Comparator comparator() {
        return this.n();
    }

    public /* synthetic */ Object clone() {
        return this.r();
    }

    static /* synthetic */ Object a(ai ai2) {
        return ai2.u();
    }

    static /* synthetic */ Object a(ai ai2, int n2) {
        return ai2.n(n2);
    }
}

