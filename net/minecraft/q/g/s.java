/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import com.a.a.d.ov;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.a.i;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.q.b.q;
import net.minecraft.q.f.o;
import net.minecraft.q.g.a.g;
import net.minecraft.q.g.a.j;
import net.minecraft.q.g.c.ae;
import net.minecraft.q.g.c.ap;
import net.minecraft.q.g.c.at;
import net.minecraft.q.g.c.bs;
import net.minecraft.q.g.c.dg;
import net.minecraft.q.g.e;
import net.minecraft.q.g.u;
import net.minecraft.q.k;
import net.minecraft.u.b.m;
import net.minecraft.u.b.t;
import net.minecraft.w.ag;

public class s
implements o {
    private final k a;
    private final Random b;
    private final b[] c = new b[256];
    private final net.minecraft.q.g.k d;
    private final List e = ov.a();
    private final boolean f;
    private final boolean g;
    private g h;
    private g i;

    public s(k k2, long l2, boolean bl2, String string) {
        this.a = k2;
        this.b = new Random(l2);
        this.d = net.minecraft.q.g.k.a(string);
        if (bl2) {
            Map map = this.d.b();
            if (map.containsKey("village")) {
                Map map2 = (Map)map.get("village");
                if (!map2.containsKey("size")) {
                    map2.put("size", "1");
                }
                this.e.add(new dg(map2));
            }
            if (map.containsKey("biome_1")) {
                this.e.add(new ae((Map)map.get("biome_1")));
            }
            if (map.containsKey("mineshaft")) {
                this.e.add(new bs((Map)map.get("mineshaft")));
            }
            if (map.containsKey("stronghold")) {
                this.e.add(new net.minecraft.q.g.c.s((Map)map.get("stronghold")));
            }
            if (map.containsKey("oceanmonument")) {
                this.e.add(new ap((Map)map.get("oceanmonument")));
            }
        }
        if (this.d.b().containsKey("lake")) {
            this.h = new g(p.j);
        }
        if (this.d.b().containsKey("lava_lake")) {
            this.i = new g(p.l);
        }
        this.g = this.d.b().containsKey("dungeon");
        int n2 = 0;
        int n3 = 0;
        boolean bl3 = true;
        for (e e2 : this.d.c()) {
            for (int i2 = e2.c(); i2 < e2.c() + e2.a(); ++i2) {
                b b2 = e2.b();
                if (b2.c() == p.a) continue;
                bl3 = false;
                this.c[i2] = b2;
            }
            if (e2.b().c() == p.a) {
                n3 += e2.a();
                continue;
            }
            n2 += e2.a() + n3;
            n3 = 0;
        }
        k2.c(n2);
        this.f = bl3 && this.d.a() != q.a(net.minecraft.a.i.P) ? false : this.d.b().containsKey("decoration");
    }

    @Override
    public net.minecraft.q.f.k a(int n2, int n3) {
        int n4;
        Object object;
        net.minecraft.q.f.e e2 = new net.minecraft.q.f.e();
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            object = this.c[i2];
            if (object == null) continue;
            for (int i3 = 0; i3 < 16; ++i3) {
                for (n4 = 0; n4 < 16; ++n4) {
                    e2.a(i3, i2, n4, (b)object);
                }
            }
        }
        for (u u2 : this.e) {
            u2.a(this.a, n2, n3, e2);
        }
        net.minecraft.q.f.k k2 = new net.minecraft.q.f.k(this.a, e2, n2, n3);
        object = this.a.k().b(null, n2 * 16, n3 * 16, 16, 16);
        byte[] arrby = k2.l();
        for (n4 = 0; n4 < arrby.length; ++n4) {
            arrby[n4] = (byte)q.a(object[n4]);
        }
        k2.b();
        return k2;
    }

    @Override
    public void b(int n2, int n3) {
        Object object2;
        int n4 = n2 * 16;
        int n5 = n3 * 16;
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n4, 0, n5);
        q q2 = this.a.a(new net.minecraft.u.b.b(n4 + 16, 0, n5 + 16));
        boolean bl2 = false;
        this.b.setSeed(this.a.A());
        long l2 = this.b.nextLong() / 2L * 2L + 1L;
        long l3 = this.b.nextLong() / 2L * 2L + 1L;
        this.b.setSeed((long)n2 * l2 + (long)n3 * l3 ^ this.a.A());
        m m2 = new m(n2, n3);
        for (Object object2 : this.e) {
            boolean bl3 = ((at)object2).a(this.a, this.b, m2);
            if (!(object2 instanceof dg)) continue;
            bl2 |= bl3;
        }
        if (this.h != null && !bl2 && this.b.nextInt(4) == 0) {
            this.h.a(this.a, this.b, b2.a(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
        }
        if (!(this.i == null || bl2 || this.b.nextInt(8) != 0 || ((t)(object2 = b2.a(this.b.nextInt(16) + 8, this.b.nextInt(this.b.nextInt(248) + 8), this.b.nextInt(16) + 8))).k() >= this.a.x() && this.b.nextInt(10) != 0)) {
            this.i.a(this.a, this.b, (net.minecraft.u.b.b)object2);
        }
        if (this.g) {
            for (int i2 = 0; i2 < 8; ++i2) {
                new j().a(this.a, this.b, b2.a(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
            }
        }
        if (this.f) {
            q2.a(this.a, this.b, b2);
        }
    }

    @Override
    public boolean a(net.minecraft.q.f.k k2, int n2, int n3) {
        return false;
    }

    @Override
    public List a(ag ag2, net.minecraft.u.b.b b2) {
        q q2 = this.a.a(b2);
        return q2.a(ag2);
    }

    @Override
    public net.minecraft.u.b.b a(k k2, String string, net.minecraft.u.b.b b2) {
        if ("Stronghold".equals(string)) {
            for (at at2 : this.e) {
                if (!(at2 instanceof net.minecraft.q.g.c.s)) continue;
                return at2.a(k2, b2);
            }
        }
        return null;
    }

    @Override
    public void b(net.minecraft.q.f.k k2, int n2, int n3) {
        for (at at2 : this.e) {
            at2.a(this.a, n2, n3, null);
        }
    }
}

