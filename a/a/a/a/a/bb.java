/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.as;
import a.a.a.a.a.au;
import a.a.a.a.a.b;
import a.a.a.a.a.bc;
import a.a.a.a.a.bg;
import a.a.a.a.a.bi;
import a.a.a.a.a.bj;
import a.a.a.a.a.de;
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

public class bb
extends b
implements e,
Serializable,
Cloneable {
    private static final long v = 0L;
    private static final boolean w = false;
    protected transient int[] j;
    protected transient Object[] k;
    protected transient int l;
    protected transient boolean m;
    protected de n;
    protected transient int o;
    protected transient int p;
    protected int q;
    protected final float r;
    protected transient au s;
    protected transient eb t;
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
        this.j = new int[this.o + 1];
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

    public bb(int[] arrn, Object[] arrobject, float f2, de de2) {
        this(arrn.length, f2, de2);
        if (arrn.length != arrobject.length) {
            throw new IllegalArgumentException("The key array and the value array have different lengths (" + arrn.length + " and " + arrobject.length + ")");
        }
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            this.a(arrn[i2], arrobject[i2]);
        }
    }

    public bb(int[] arrn, Object[] arrobject, de de2) {
        this(arrn, arrobject, 0.75f, de2);
    }

    public de e() {
        return this.n;
    }

    private int l() {
        return this.m ? this.q - 1 : this.q;
    }

    private void h(int n2) {
        int n3 = g.b(n2, this.r);
        if (n3 > this.o) {
            this.g(n3);
        }
    }

    private void a(long l2) {
        int n2 = (int)Math.min(0x40000000L, Math.max(2L, g.e((long)Math.ceil((float)l2 / this.r))));
        if (n2 > this.o) {
            this.g(n2);
        }
    }

    private Object i(int n2) {
        Object object = this.k[n2];
        this.k[n2] = null;
        --this.q;
        this.d(n2);
        if (this.q < this.p / 4 && this.o > 16) {
            this.g(this.o / 2);
        }
        return object;
    }

    private Object m() {
        this.m = false;
        Object object = this.k[this.o];
        this.k[this.o] = null;
        --this.q;
        if (this.q < this.p / 4 && this.o > 16) {
            this.g(this.o / 2);
        }
        return object;
    }

    @Override
    public void putAll(Map map) {
        if ((double)this.r <= 0.5) {
            this.h(map.size());
        } else {
            this.a((long)(this.size() + map.size()));
        }
        super.putAll(map);
    }

    private int b(int n2, Object object) {
        int n3;
        if (this.n.a(n2, 0)) {
            if (this.m) {
                return this.o;
            }
            this.m = true;
            n3 = this.o;
        } else {
            int[] arrn = this.j;
            n3 = g.b(this.n.a(n2)) & this.l;
            int n4 = arrn[n3];
            if (n4 != 0) {
                if (this.n.a(n4, n2)) {
                    return n3;
                }
                while ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) {
                    if (!this.n.a(n4, n2)) continue;
                    return n3;
                }
            }
        }
        this.j[n3] = n2;
        this.k[n3] = object;
        if (this.q++ >= this.p) {
            this.g(g.b(this.q + 1, this.r));
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
                int n5 = g.b(this.n.a(n3)) & this.l;
                if (n4 <= n2 ? n4 >= n5 || n5 > n2 : n4 >= n5 && n5 > n2) break;
                n2 = n2 + 1 & this.l;
            }
            arrn[n4] = n3;
            this.k[n4] = this.k[n2];
        }
    }

    @Override
    public Object a(int n2) {
        if (this.n.a(n2, 0)) {
            if (this.m) {
                return this.m();
            }
            return this.a;
        }
        int[] arrn = this.j;
        int n3 = g.b(this.n.a(n2)) & this.l;
        int n4 = arrn[n3];
        if (n4 == 0) {
            return this.a;
        }
        if (this.n.a(n2, n4)) {
            return this.i(n3);
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) continue;
            return this.a;
        } while (!this.n.a(n2, n4));
        return this.i(n3);
    }

    @Override
    public Object remove(Object object) {
        int n2 = (Integer)object;
        if (this.n.a(n2, 0)) {
            if (this.m) {
                return this.m();
            }
            return this.a;
        }
        int[] arrn = this.j;
        int n3 = g.b(this.n.a(n2)) & this.l;
        int n4 = arrn[n3];
        if (n4 == 0) {
            return this.a;
        }
        if (this.n.a(n4, n2)) {
            return this.i(n3);
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) continue;
            return this.a;
        } while (!this.n.a(n4, n2));
        return this.i(n3);
    }

    public Object a(Integer n2) {
        if (n2 == null) {
            return null;
        }
        int n3 = n2;
        if (this.n.a(n3, 0)) {
            return this.m ? this.k[this.o] : this.a;
        }
        int[] arrn = this.j;
        int n4 = g.b(this.n.a(n3)) & this.l;
        int n5 = arrn[n4];
        if (n5 == 0) {
            return this.a;
        }
        if (this.n.a(n3, n5)) {
            return this.k[n4];
        }
        do {
            if ((n5 = arrn[n4 = n4 + 1 & this.l]) != 0) continue;
            return this.a;
        } while (!this.n.a(n3, n5));
        return this.k[n4];
    }

    @Override
    public Object c(int n2) {
        if (this.n.a(n2, 0)) {
            return this.m ? this.k[this.o] : this.a;
        }
        int[] arrn = this.j;
        int n3 = g.b(this.n.a(n2)) & this.l;
        int n4 = arrn[n3];
        if (n4 == 0) {
            return this.a;
        }
        if (this.n.a(n2, n4)) {
            return this.k[n3];
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) continue;
            return this.a;
        } while (!this.n.a(n2, n4));
        return this.k[n3];
    }

    @Override
    public boolean b(int n2) {
        if (this.n.a(n2, 0)) {
            return this.m;
        }
        int[] arrn = this.j;
        int n3 = g.b(this.n.a(n2)) & this.l;
        int n4 = arrn[n3];
        if (n4 == 0) {
            return false;
        }
        if (this.n.a(n2, n4)) {
            return true;
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.l]) != 0) continue;
            return false;
        } while (!this.n.a(n2, n4));
        return true;
    }

    @Override
    public boolean containsValue(Object object) {
        Object[] arrobject = this.k;
        int[] arrn = this.j;
        if (this.m && (arrobject[this.o] == null ? object == null : arrobject[this.o].equals(object))) {
            return true;
        }
        int n2 = this.o;
        while (n2-- != 0) {
            if (arrn[n2] == 0 || !(arrobject[n2] == null ? object == null : arrobject[n2].equals(object))) continue;
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
        Arrays.fill(this.j, 0);
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

    public void e(int n2) {
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
    public eb b() {
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
            this.g(n2);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            return false;
        }
        return true;
    }

    public boolean f(int n2) {
        int n3 = g.d((int)Math.ceil((float)n2 / this.r));
        if (n3 >= n2 || this.q > g.a(n3, this.r)) {
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
        int n4 = this.o;
        int n5 = this.l();
        while (n5-- != 0) {
            while (arrn[--n4] == 0) {
            }
            int n6 = g.b(this.n.a(arrn[n4])) & n3;
            if (arrn2[n6] != 0) {
                while (arrn2[n6 = n6 + 1 & n3] != 0) {
                }
            }
            arrn2[n6] = arrn[n4];
            arrobject2[n6] = arrobject[n4];
        }
        arrobject2[n2] = arrobject[this.o];
        this.o = n2;
        this.l = n3;
        this.p = g.a(this.o, this.r);
        this.j = arrn2;
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
        bb2.j = (int[])this.j.clone();
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
            while (this.j[n4] == 0) {
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
        int[] arrn = this.j;
        Object[] arrobject = this.k;
        bj bj2 = new bj(this, null);
        objectOutputStream.defaultWriteObject();
        int n2 = this.q;
        while (n2-- != 0) {
            int n3 = bj2.c();
            objectOutputStream.writeInt(arrn[n3]);
            objectOutputStream.writeObject(arrobject[n3]);
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.o = g.b(this.q, this.r);
        this.p = g.a(this.o, this.r);
        this.l = this.o - 1;
        this.j = new int[this.o + 1];
        int[] arrn = this.j;
        this.k = new Object[this.o + 1];
        Object[] arrobject = this.k;
        int n2 = this.q;
        while (n2-- != 0) {
            int n3;
            int n4 = objectInputStream.readInt();
            Object object = objectInputStream.readObject();
            if (this.n.a(n4, 0)) {
                n3 = this.o;
                this.m = true;
            } else {
                n3 = g.b(this.n.a(n4)) & this.l;
                while (arrn[n3] != 0) {
                    n3 = n3 + 1 & this.l;
                }
            }
            arrn[n3] = n4;
            arrobject[n3] = object;
        }
    }

    private void n() {
    }

    @Override
    public /* synthetic */ aq bD_() {
        return this.h();
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
        return this.k();
    }

    static /* synthetic */ Object a(bb bb2) {
        return bb2.m();
    }

    static /* synthetic */ Object a(bb bb2, int n2) {
        return bb2.i(n2);
    }
}

