/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f.a;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.e.a;
import net.minecraft.e.q;
import net.minecraft.f.ap;
import net.minecraft.g.cn;
import net.minecraft.q.a.o;
import net.minecraft.q.as;
import net.minecraft.q.f.a.e;
import net.minecraft.q.f.a.f;
import net.minecraft.q.f.a.h;
import net.minecraft.q.f.a.i;
import net.minecraft.q.f.b;
import net.minecraft.q.k;
import net.minecraft.u.b.m;
import net.minecraft.u.bp;
import net.minecraft.w.n;
import org.apache.logging.log4j.c;

public class d
implements o,
h {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private final Map b = new ConcurrentHashMap();
    private final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    private final File d;
    private final net.minecraft.u.a.a e;
    private boolean f;

    public d(File file, net.minecraft.u.a.a a2) {
        this.d = file;
        this.e = a2;
    }

    @Override
    public net.minecraft.q.f.k a(k k2, int n2, int n3) {
        m m2 = new m(n2, n3);
        net.minecraft.e.e e2 = (net.minecraft.e.e)this.b.get(m2);
        if (e2 == null) {
            DataInputStream dataInputStream = net.minecraft.q.f.a.f.b(this.d, n2, n3);
            if (dataInputStream == null) {
                return null;
            }
            e2 = this.e.a((net.minecraft.u.a.f)net.minecraft.u.a.c.c, net.minecraft.e.h.a(dataInputStream));
        }
        return this.a(k2, n2, n3, e2);
    }

    protected net.minecraft.q.f.k a(k k2, int n2, int n3, net.minecraft.e.e e2) {
        if (!e2.b("Level", 10)) {
            a.b("Chunk file at {},{} is missing level data, skipping", n2, n3);
            return null;
        }
        net.minecraft.e.e e3 = e2.o("Level");
        if (!e3.b("Sections", 9)) {
            a.b("Chunk file at {},{} is missing block data, skipping", n2, n3);
            return null;
        }
        net.minecraft.q.f.k k3 = this.a(k2, e3);
        if (!k3.a(n2, n3)) {
            a.b("Chunk file at {},{} is in the wrong location; relocating. (Expected {}, {}, got {}, {})", n2, n3, n2, n3, k3.b, k3.c);
            e3.a("xPos", n2);
            e3.a("zPos", n3);
            k3 = this.a(k2, e3);
        }
        return k3;
    }

    @Override
    public void a(k k2, net.minecraft.q.f.k k3) {
        k2.z();
        try {
            net.minecraft.e.e e2 = new net.minecraft.e.e();
            net.minecraft.e.e e3 = new net.minecraft.e.e();
            e2.a("Level", e3);
            e2.a("DataVersion", 510);
            this.a(k3, k2, e3);
            this.a(k3.k(), e2);
        }
        catch (Exception exception) {
            a.b("Failed to save chunk", (Throwable)exception);
        }
    }

    protected void a(m m2, net.minecraft.e.e e2) {
        if (!this.c.contains(m2)) {
            this.b.put(m2, e2);
        }
        net.minecraft.q.a.i.a().a(this);
    }

    @Override
    public boolean a() {
        boolean bl2;
        if (this.b.isEmpty()) {
            if (this.f) {
                a.d("ThreadedAnvilChunkStorage ({}): All chunks are saved", this.d.getName());
            }
            return false;
        }
        m m2 = (m)this.b.keySet().iterator().next();
        try {
            this.c.add(m2);
            net.minecraft.e.e e2 = (net.minecraft.e.e)this.b.remove(m2);
            if (e2 != null) {
                try {
                    this.b(m2, e2);
                }
                catch (Exception exception) {
                    a.b("Failed to save chunk", (Throwable)exception);
                }
            }
            bl2 = true;
        }
        finally {
            this.c.remove(m2);
        }
        return bl2;
    }

    private void b(m m2, net.minecraft.e.e e2) {
        DataOutputStream dataOutputStream = net.minecraft.q.f.a.f.c(this.d, m2.a, m2.b);
        net.minecraft.e.h.a(e2, (DataOutput)dataOutputStream);
        dataOutputStream.close();
    }

    @Override
    public void b(k k2, net.minecraft.q.f.k k3) {
    }

    @Override
    public void b() {
    }

    @Override
    public void c() {
        try {
            this.f = true;
            while (this.a()) {
            }
        }
        finally {
            this.f = false;
        }
    }

    public static void a(net.minecraft.u.a.a a2) {
        a2.a(net.minecraft.u.a.c.c, (net.minecraft.u.a.e)new i());
    }

    private void a(net.minecraft.q.f.k k2, k k3, net.minecraft.e.e e2) {
        Object object;
        net.minecraft.e.e e3;
        Object object2;
        int n2;
        e2.a("xPos", k2.b);
        e2.a("zPos", k2.c);
        e2.a("LastUpdate", k3.B());
        e2.a("HeightMap", k2.r());
        e2.a("TerrainPopulated", k2.u());
        e2.a("LightPopulated", k2.v());
        e2.a("InhabitedTime", k2.x());
        e[] arre = k2.h();
        q q2 = new q();
        boolean bl2 = !k3.q.n();
        e[] arre2 = arre;
        int n3 = arre.length;
        for (n2 = 0; n2 < n3; ++n2) {
            object2 = arre2[n2];
            if (object2 == net.minecraft.q.f.k.a) continue;
            e3 = new net.minecraft.e.e();
            e3.a("Y", (byte)(((e)object2).c() >> 4 & 0xFF));
            object = new byte[4096];
            Object object3 = new b();
            b b2 = ((e)object2).e().a((byte[])object, (b)object3);
            e3.a("Blocks", (byte[])object);
            e3.a("Data", ((b)object3).a());
            if (b2 != null) {
                e3.a("Add", b2.a());
            }
            e3.a("BlockLight", ((e)object2).f().a());
            if (bl2) {
                e3.a("SkyLight", ((e)object2).g().a());
            } else {
                e3.a("SkyLight", new byte[((e)object2).f().a().length]);
            }
            q2.a(e3);
        }
        e2.a("Sections", q2);
        e2.a("Biomes", k2.l());
        k2.g(false);
        object2 = new q();
        for (n2 = 0; n2 < k2.t().length; ++n2) {
            for (n n4 : k2.t()[n2]) {
                if (!n4.d(e3 = new net.minecraft.e.e())) continue;
                k2.g(true);
                ((q)object2).a(e3);
            }
        }
        e2.a("Entities", (a)object2);
        q q3 = new q();
        for (ap ap2 : k2.s().values()) {
            e3 = ap2.a(new net.minecraft.e.e());
            q3.a(e3);
        }
        e2.a("TileEntities", q3);
        List list = k3.a(k2, false);
        if (list != null) {
            long l2 = k3.B();
            object = new q();
            for (Object object3 : list) {
                net.minecraft.e.e e4 = new net.minecraft.e.e();
                bp bp2 = (bp)cn.v.b(((as)object3).a());
                e4.a("i", bp2 == null ? "" : bp2.toString());
                e4.a("x", ((as)object3).a.cy_());
                e4.a("y", ((as)object3).a.k());
                e4.a("z", ((as)object3).a.l());
                e4.a("t", (int)(((as)object3).b - l2));
                e4.a("p", ((as)object3).c);
                ((q)object).a(e4);
            }
            e2.a("TileTicks", (a)object);
        }
    }

    private net.minecraft.q.f.k a(k k2, net.minecraft.e.e e2) {
        q q2;
        q q3;
        Object object;
        Object object2;
        Object object3;
        int n2;
        a a2;
        int n3 = e2.h("xPos");
        int n4 = e2.h("zPos");
        net.minecraft.q.f.k k3 = new net.minecraft.q.f.k(k2, n3, n4);
        k3.a(e2.n("HeightMap"));
        k3.d(e2.p("TerrainPopulated"));
        k3.e(e2.p("LightPopulated"));
        k3.c(e2.i("InhabitedTime"));
        q q4 = e2.c("Sections", 10);
        int n5 = 16;
        e[] arre = new e[16];
        boolean bl2 = !k2.q.n();
        for (int i2 = 0; i2 < q4.e(); ++i2) {
            a2 = q4.b(i2);
            n2 = ((net.minecraft.e.e)a2).f("Y");
            object3 = new e(n2 << 4, bl2);
            object2 = ((net.minecraft.e.e)a2).m("Blocks");
            object = new b(((net.minecraft.e.e)a2).m("Data"));
            b b2 = ((net.minecraft.e.e)a2).b("Add", 7) ? new b(((net.minecraft.e.e)a2).m("Add")) : null;
            ((e)object3).e().a((byte[])object2, (b)object, b2);
            ((e)object3).a(new b(((net.minecraft.e.e)a2).m("BlockLight")));
            if (bl2) {
                ((e)object3).b(new b(((net.minecraft.e.e)a2).m("SkyLight")));
            }
            ((e)object3).d();
            arre[n2] = object3;
        }
        k3.a(arre);
        if (e2.b("Biomes", 7)) {
            k3.a(e2.m("Biomes"));
        }
        if ((q3 = e2.c("Entities", 10)) != null) {
            for (int i3 = 0; i3 < q3.e(); ++i3) {
                net.minecraft.e.e e3 = q3.b(i3);
                net.minecraft.q.f.a.d.a(e3, k2, k3);
                k3.g(true);
            }
        }
        if ((a2 = e2.c("TileEntities", 10)) != null) {
            for (n2 = 0; n2 < ((q)a2).e(); ++n2) {
                object3 = ((q)a2).b(n2);
                object2 = ap.a(k2, (net.minecraft.e.e)object3);
                if (object2 == null) continue;
                k3.a((ap)object2);
            }
        }
        if (e2.b("TileTicks", 9) && (q2 = e2.c("TileTicks", 10)) != null) {
            for (int i4 = 0; i4 < q2.e(); ++i4) {
                object2 = q2.b(i4);
                object = ((net.minecraft.e.e)object2).b("i", 8) ? cn.a(((net.minecraft.e.e)object2).l("i")) : cn.d(((net.minecraft.e.e)object2).h("i"));
                k2.b(new net.minecraft.u.b.b(((net.minecraft.e.e)object2).h("x"), ((net.minecraft.e.e)object2).h("y"), ((net.minecraft.e.e)object2).h("z")), (cn)object, ((net.minecraft.e.e)object2).h("t"), ((net.minecraft.e.e)object2).h("p"));
            }
        }
        return k3;
    }

    public static n a(net.minecraft.e.e e2, k k2, net.minecraft.q.f.k k3) {
        n n2 = net.minecraft.q.f.a.d.a(e2, k2);
        if (n2 == null) {
            return null;
        }
        k3.a(n2);
        if (e2.b("Passengers", 9)) {
            q q2 = e2.c("Passengers", 10);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                n n3 = net.minecraft.q.f.a.d.a(q2.b(i2), k2, k3);
                if (n3 == null) continue;
                n3.a(n2, true);
            }
        }
        return n2;
    }

    public static n a(net.minecraft.e.e e2, k k2, double d2, double d3, double d4, boolean bl2) {
        n n2 = net.minecraft.q.f.a.d.a(e2, k2);
        if (n2 == null) {
            return null;
        }
        n2.b(d2, d3, d4, n2.ba, n2.bb);
        if (bl2 && !k2.a(n2)) {
            return null;
        }
        if (e2.b("Passengers", 9)) {
            q q2 = e2.c("Passengers", 10);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                n n3 = net.minecraft.q.f.a.d.a(q2.b(i2), k2, d2, d3, d4, bl2);
                if (n3 == null) continue;
                n3.a(n2, true);
            }
        }
        return n2;
    }

    protected static n a(net.minecraft.e.e e2, k k2) {
        try {
            return net.minecraft.w.h.a(e2, k2);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
    }

    public static void a(n n2, k k2) {
        if (k2.a(n2) && n2.cA()) {
            for (n n3 : n2.db()) {
                net.minecraft.q.f.a.d.a(n3, k2);
            }
        }
    }

    public static n a(net.minecraft.e.e e2, k k2, boolean bl2) {
        n n2 = net.minecraft.q.f.a.d.a(e2, k2);
        if (n2 == null) {
            return null;
        }
        if (bl2 && !k2.a(n2)) {
            return null;
        }
        if (e2.b("Passengers", 9)) {
            q q2 = e2.c("Passengers", 10);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                n n3 = net.minecraft.q.f.a.d.a(q2.b(i2), k2, bl2);
                if (n3 == null) continue;
                n3.a(n2, true);
            }
        }
        return n2;
    }
}

