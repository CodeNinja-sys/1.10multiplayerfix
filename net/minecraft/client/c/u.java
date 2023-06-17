/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import com.a.a.d.ov;
import java.util.List;
import java.util.Random;
import net.minecraft.client.c.h;
import net.minecraft.client.c.l;
import net.minecraft.client.c.r;
import net.minecraft.u.bp;
import net.minecraft.u.d.a;

public class u
implements r {
    private final List a = ov.a();
    private final Random b = new Random();
    private final bp c;
    private final a d;

    public u(bp bp2, String string) {
        this.c = bp2;
        this.d = string == null ? null : new net.minecraft.u.d.l(string, new Object[0]);
    }

    @Override
    public int e() {
        int n2 = 0;
        for (r r2 : this.a) {
            n2 += r2.e();
        }
        return n2;
    }

    public l a() {
        int n2 = this.e();
        if (!this.a.isEmpty() && n2 != 0) {
            int n3 = this.b.nextInt(n2);
            for (r r2 : this.a) {
                if ((n3 -= r2.e()) >= 0) continue;
                return (l)r2.i();
            }
            return h.a;
        }
        return h.a;
    }

    public void a(r r2) {
        this.a.add(r2);
    }

    public bp b() {
        return this.c;
    }

    public a c() {
        return this.d;
    }

    @Override
    public /* synthetic */ Object i() {
        return this.a();
    }
}

