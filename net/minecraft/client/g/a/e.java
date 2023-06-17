/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.a;

import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.a.i;
import net.minecraft.client.g.a.w;
import net.minecraft.client.g.s;
import net.minecraft.u.b.n;

public class e {
    private final int a;
    private final Set b = aad.a(256);
    private final List c = ov.b(256);
    private int d;
    private int e;
    private final int f;
    private final int g;
    private final int h;

    public e(int n2, int n3, int n4, int n5) {
        this.a = n5;
        this.f = n2;
        this.g = n3;
        this.h = n4;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public void a(d d2) {
        w w2 = new w(d2, this.a);
        if (this.h > 0) {
            w2.a(this.h);
        }
        this.b.add(w2);
    }

    public void c() {
        Object[] arrobject = this.b.toArray(new w[this.b.size()]);
        Arrays.sort(arrobject);
        Object[] arrobject2 = arrobject;
        int n2 = arrobject.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = arrobject2[i2];
            if (this.a((w)object)) continue;
            String string = String.format("Unable to fit: %s - size: %dx%d - Maybe try a lowerresolution resourcepack?", ((w)object).a().i(), ((w)object).a().c(), ((w)object).a().d());
            throw new s((w)object, string);
        }
        this.d = n.c(this.d);
        this.e = n.c(this.e);
    }

    public List d() {
        Object object2;
        ArrayList arrayList = ov.a();
        for (Object object2 : this.c) {
            ((i)object2).a(arrayList);
        }
        object2 = ov.a();
        for (Object object3 : arrayList) {
            w w2 = ((i)object3).a();
            d d2 = w2.a();
            d2.a(this.d, this.e, ((i)object3).b(), ((i)object3).c(), w2.e());
            object2.add(d2);
        }
        return object2;
    }

    private static int b(int n2, int n3) {
        return (n2 >> n3) + ((n2 & (1 << n3) - 1) == 0 ? 0 : 1) << n3;
    }

    private boolean a(w w2) {
        d d2 = w2.a();
        boolean bl2 = d2.c() != d2.d();
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (((i)this.c.get(i2)).a(w2)) {
                return true;
            }
            if (!bl2) continue;
            w2.d();
            if (((i)this.c.get(i2)).a(w2)) {
                return true;
            }
            w2.d();
        }
        return this.b(w2);
    }

    private boolean b(w w2) {
        i i2;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        int n2 = Math.min(w2.b(), w2.c());
        int n3 = Math.max(w2.b(), w2.c());
        int n4 = n.c(this.d);
        int n5 = n.c(this.e);
        int n6 = n.c(this.d + n2);
        int n7 = n.c(this.e + n2);
        boolean bl5 = n6 <= this.f;
        boolean bl6 = bl4 = n7 <= this.g;
        if (!bl5 && !bl4) {
            return false;
        }
        boolean bl7 = bl5 && n4 != n6;
        boolean bl8 = bl3 = bl4 && n5 != n7;
        if (bl7 ^ bl3) {
            bl2 = bl7;
        } else {
            boolean bl9 = bl2 = bl5 && n4 <= n5;
        }
        if (bl2) {
            if (w2.b() > w2.c()) {
                w2.d();
            }
            if (this.e == 0) {
                this.e = w2.c();
            }
            i2 = new i(this.d, 0, w2.b(), this.e);
            this.d += w2.b();
        } else {
            i2 = new i(0, this.e, this.d, w2.c());
            this.e += w2.c();
        }
        i2.a(w2);
        this.c.add(i2);
        return true;
    }

    static /* synthetic */ int a(int n2, int n3) {
        return net.minecraft.client.g.a.e.b(n2, n3);
    }
}

