/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.a.i;
import net.minecraft.q.a.a.f;
import net.minecraft.q.a.a.m;
import net.minecraft.q.a.a.s;
import net.minecraft.u.b.n;

public class e {
    private final s[] a;
    private final a[] b;
    private final f c;
    private final f d;

    public e(s[] arrs, a[] arra, f f2, f f3) {
        this.a = arrs;
        this.b = arra;
        this.c = f2;
        this.d = f3;
    }

    protected void a(Collection collection, Random random, m m2) {
        ArrayList arrayList = ov.a();
        int n2 = 0;
        s[] arrs = this.a;
        int n3 = this.a.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            s s2 = arrs[i2];
            if (!i.a(s2.e, random, m2) || (n4 = s2.a(m2.e())) <= 0) continue;
            arrayList.add(s2);
            n2 += n4;
        }
        if (n2 != 0 && !arrayList.isEmpty()) {
            int n5 = random.nextInt(n2);
            for (s s3 : arrayList) {
                if ((n5 -= s3.a(m2.e())) >= 0) continue;
                s3.a(collection, random, m2);
                return;
            }
        }
    }

    public void b(Collection collection, Random random, m m2) {
        if (i.a(this.b, random, m2)) {
            int n2 = this.c.a(random) + n.d(this.d.b(random) * m2.e());
            for (int i2 = 0; i2 < n2; ++i2) {
                this.a(collection, random, m2);
            }
        }
    }

    static /* synthetic */ s[] a(e e2) {
        return e2.a;
    }

    static /* synthetic */ f b(e e2) {
        return e2.c;
    }

    static /* synthetic */ f c(e e2) {
        return e2.d;
    }

    static /* synthetic */ a[] d(e e2) {
        return e2.b;
    }
}

