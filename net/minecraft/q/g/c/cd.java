/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.d.ov;
import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.q.g.c.aj;
import net.minecraft.q.g.c.ci;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.q;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class cd
extends q {
    private final List d = ov.b();

    public cd() {
    }

    public cd(int n2, Random random, int n3, int n4, aj aj2) {
        super(n2, aj2);
        this.a = aj2;
        this.b = new dc(n3, 50, n4, n3 + 7 + random.nextInt(6), 54 + random.nextInt(6), n4 + 7 + random.nextInt(6));
    }

    @Override
    public void a(r r2, List list, Random random) {
        dc dc2;
        q q2;
        int n2;
        int n3 = this.g();
        int n4 = this.b.d() - 3 - 1;
        if (n4 <= 0) {
            n4 = 1;
        }
        int n5 = 0;
        while (n5 < this.b.c()) {
            n2 = n5 + random.nextInt(this.b.c());
            if (n2 + 3 > this.b.c()) break;
            q2 = ci.a(r2, list, random, this.b.a + n2, this.b.b + random.nextInt(n4) + 1, this.b.c - 1, ad.c, n3);
            if (q2 != null) {
                dc2 = q2.f();
                this.d.add(new dc(dc2.a, dc2.b, this.b.c, dc2.d, dc2.e, this.b.c + 1));
            }
            n5 = n2 + 4;
        }
        n5 = 0;
        while (n5 < this.b.c()) {
            n2 = n5 + random.nextInt(this.b.c());
            if (n2 + 3 > this.b.c()) break;
            q2 = ci.a(r2, list, random, this.b.a + n2, this.b.b + random.nextInt(n4) + 1, this.b.f + 1, ad.d, n3);
            if (q2 != null) {
                dc2 = q2.f();
                this.d.add(new dc(dc2.a, dc2.b, this.b.f - 1, dc2.d, dc2.e, this.b.f));
            }
            n5 = n2 + 4;
        }
        n5 = 0;
        while (n5 < this.b.e()) {
            n2 = n5 + random.nextInt(this.b.e());
            if (n2 + 3 > this.b.e()) break;
            q2 = ci.a(r2, list, random, this.b.a - 1, this.b.b + random.nextInt(n4) + 1, this.b.c + n2, ad.e, n3);
            if (q2 != null) {
                dc2 = q2.f();
                this.d.add(new dc(this.b.a, dc2.b, dc2.c, this.b.a + 1, dc2.e, dc2.f));
            }
            n5 = n2 + 4;
        }
        n5 = 0;
        while (n5 < this.b.e()) {
            n2 = n5 + random.nextInt(this.b.e());
            if (n2 + 3 > this.b.e()) break;
            q2 = ci.a(r2, list, random, this.b.d + 1, this.b.b + random.nextInt(n4) + 1, this.b.c + n2, ad.f, n3);
            if (q2 != null) {
                dc2 = q2.f();
                this.d.add(new dc(this.b.d - 1, dc2.b, dc2.c, this.b.d, dc2.e, dc2.f));
            }
            n5 = n2 + 4;
        }
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.a(k2, dc2)) {
            return false;
        }
        this.a(k2, dc2, this.b.a, this.b.b, this.b.c, this.b.d, this.b.b, this.b.f, p.d.v(), p.a.v(), true);
        this.a(k2, dc2, this.b.a, this.b.b + 1, this.b.c, this.b.d, Math.min(this.b.b + 3, this.b.e), this.b.f, p.a.v(), p.a.v(), false);
        for (dc dc3 : this.d) {
            this.a(k2, dc2, dc3.a, dc3.e - 2, dc3.c, dc3.d, dc3.e, dc3.f, p.a.v(), p.a.v(), false);
        }
        this.a(k2, dc2, this.b.a, this.b.b + 4, this.b.c, this.b.d, this.b.e, this.b.f, p.a.v(), false);
        return true;
    }

    @Override
    public void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        for (dc dc2 : this.d) {
            dc2.a(n2, n3, n4);
        }
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        net.minecraft.e.q q2 = new net.minecraft.e.q();
        for (dc dc2 : this.d) {
            q2.a(dc2.g());
        }
        e2.a("Entrances", q2);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        net.minecraft.e.q q2 = e2.c("Entrances", 11);
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            this.d.add(new dc(q2.d(i2)));
        }
    }
}

