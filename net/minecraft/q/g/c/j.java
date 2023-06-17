/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.d.ov;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.q.g.c.da;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.b.m;

public abstract class j {
    protected List a = ov.b();
    protected dc b;
    private int c;
    private int d;

    public j() {
    }

    public j(int n2, int n3) {
        this.c = n2;
        this.d = n3;
    }

    public dc a() {
        return this.b;
    }

    public List b() {
        return this.a;
    }

    public void a(k k2, Random random, dc dc2) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            r r2 = (r)iterator.next();
            if (!r2.f().a(dc2) || r2.a(k2, random, dc2)) continue;
            iterator.remove();
        }
    }

    protected void c() {
        this.b = dc.a();
        for (r r2 : this.a) {
            this.b.b(r2.f());
        }
    }

    public e a(int n2, int n3) {
        e e2 = new e();
        e2.a("id", da.a(this));
        e2.a("ChunkX", n2);
        e2.a("ChunkZ", n3);
        e2.a("BB", this.b.g());
        q q2 = new q();
        for (r r2 : this.a) {
            q2.a(r2.e());
        }
        e2.a("Children", q2);
        this.a(e2);
        return e2;
    }

    public void a(e e2) {
    }

    public void a(k k2, e e2) {
        this.c = e2.h("ChunkX");
        this.d = e2.h("ChunkZ");
        if (e2.e("BB")) {
            this.b = new dc(e2.n("BB"));
        }
        q q2 = e2.c("Children", 10);
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            this.a.add(da.b(q2.b(i2), k2));
        }
        this.b(e2);
    }

    public void b(e e2) {
    }

    protected void a(k k2, Random random, int n2) {
        int n3 = k2.x() - n2;
        int n4 = this.b.d() + 1;
        if (n4 < n3) {
            n4 += random.nextInt(n3 - n4);
        }
        int n5 = n4 - this.b.e;
        this.b.a(0, n5, 0);
        for (r r2 : this.a) {
            r2.a(0, n5, 0);
        }
    }

    protected void a(k k2, Random random, int n2, int n3) {
        int n4 = n3 - n2 + 1 - this.b.d();
        int n5 = n4 > 1 ? n2 + random.nextInt(n4) : n2;
        int n6 = n5 - this.b.b;
        this.b.a(0, n6, 0);
        for (r r2 : this.a) {
            r2.a(0, n6, 0);
        }
    }

    public boolean d() {
        return true;
    }

    public boolean a(m m2) {
        return true;
    }

    public void b(m m2) {
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }
}

