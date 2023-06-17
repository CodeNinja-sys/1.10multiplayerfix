/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.b.cn;
import com.a.a.d.nj;
import java.util.Arrays;
import java.util.Iterator;
import net.minecraft.u.ar;
import net.minecraft.u.b.n;

public class az
implements Iterable,
ar {
    private static final Object a = null;
    private Object[] b;
    private int[] c;
    private Object[] d;
    private int e;
    private int f;

    public az(int n2) {
        n2 = (int)((float)n2 / 0.8f);
        this.b = new Object[n2];
        this.c = new int[n2];
        this.d = new Object[n2];
    }

    public int a(Object object) {
        return this.b(this.b(object, this.c(object)));
    }

    public Object a(int n2) {
        return n2 >= 0 && n2 < this.d.length ? this.d[n2] : null;
    }

    private int b(int n2) {
        return n2 == -1 ? -1 : this.c[n2];
    }

    public int b(Object object) {
        int n2 = this.c();
        this.a(object, n2);
        return n2;
    }

    private int c() {
        while (this.e < this.d.length && this.d[this.e] != null) {
            ++this.e;
        }
        return this.e;
    }

    private void c(int n2) {
        Object[] arrobject = this.b;
        int[] arrn = this.c;
        this.b = new Object[n2];
        this.c = new int[n2];
        this.d = new Object[n2];
        this.e = 0;
        this.f = 0;
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            if (arrobject[i2] == null) continue;
            this.a(arrobject[i2], arrn[i2]);
        }
    }

    public void a(Object object, int n2) {
        int n3;
        int n4 = Math.max(n2, this.f + 1);
        if ((float)n4 >= (float)this.b.length * 0.8f) {
            for (n3 = this.b.length << 1; n3 < n2; n3 <<= 1) {
            }
            this.c(n3);
        }
        n3 = this.d(this.c(object));
        this.b[n3] = object;
        this.c[n3] = n2;
        this.d[n2] = object;
        ++this.f;
        if (n2 == this.e) {
            ++this.e;
        }
    }

    private int c(Object object) {
        return (n.f(System.identityHashCode(object)) & Integer.MAX_VALUE) % this.b.length;
    }

    private int b(Object object, int n2) {
        int n3;
        for (n3 = n2; n3 < this.b.length; ++n3) {
            if (this.b[n3] == object) {
                return n3;
            }
            if (this.b[n3] != a) continue;
            return -1;
        }
        for (n3 = 0; n3 < n2; ++n3) {
            if (this.b[n3] == object) {
                return n3;
            }
            if (this.b[n3] != a) continue;
            return -1;
        }
        return -1;
    }

    private int d(int n2) {
        int n3;
        for (n3 = n2; n3 < this.b.length; ++n3) {
            if (this.b[n3] != a) continue;
            return n3;
        }
        for (n3 = 0; n3 < n2; ++n3) {
            if (this.b[n3] != a) continue;
            return n3;
        }
        throw new RuntimeException("Overflowed :(");
    }

    public Iterator iterator() {
        return nj.b((Iterator)nj.b(this.d), cn.d());
    }

    public void a() {
        Arrays.fill(this.b, null);
        Arrays.fill(this.d, null);
        this.e = 0;
        this.f = 0;
    }

    public int b() {
        return this.f;
    }
}

