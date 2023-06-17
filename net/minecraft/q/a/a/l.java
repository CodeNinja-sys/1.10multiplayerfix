/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;
import java.util.Collection;
import java.util.Random;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.a.i;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.m;
import net.minecraft.q.a.a.s;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class l
extends s {
    protected final cg a;
    protected final o[] b;

    public l(cg cg2, int n2, int n3, o[] arro, a[] arra) {
        super(n2, n3, arra);
        this.a = cg2;
        this.b = arro;
    }

    @Override
    public void a(Collection collection, Random random, m m2) {
        cu cu2 = new cu(this.a);
        o[] arro = this.b;
        int n2 = this.b.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            o o2 = arro[i2];
            if (!i.a(o2.a(), random, m2)) continue;
            cu2 = o2.a(cu2, random, m2);
        }
        if (cu2.b > 0) {
            if (cu2.b < this.a.i()) {
                collection.add(cu2);
            } else {
                cu cu3;
                for (int i3 = cu2.b; i3 > 0; i3 -= cu3.b) {
                    cu3 = cu2.j();
                    cu3.b = Math.min(cu2.b(), i3);
                    collection.add(cu3);
                }
            }
        }
    }

    @Override
    protected void a(z z2, ad ad2) {
        bp bp2;
        if (this.b != null && this.b.length > 0) {
            z2.a("functions", ad2.a(this.b));
        }
        if ((bp2 = (bp)cg.e.b(this.a)) == null) {
            throw new IllegalArgumentException("Can't serialize unknown item " + this.a);
        }
        z2.a("name", bp2.toString());
    }

    public static l a(z z2, u u2, int n2, int n3, a[] arra) {
        cg cg2 = bc.g(z2, "name");
        o[] arro = z2.b("functions") ? (o[])bc.a(z2, "functions", u2, o[].class) : new o[0];
        return new l(cg2, n2, n3, arro, arra);
    }
}

