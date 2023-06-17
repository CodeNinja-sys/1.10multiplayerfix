/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.b.dw;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.ce;
import net.minecraft.client.k.cv;
import net.minecraft.client.k.de;
import net.minecraft.client.m;
import net.minecraft.client.r;
import net.minecraft.g.b.b;
import net.minecraft.g.cn;
import net.minecraft.q.ab;
import net.minecraft.q.au;
import net.minecraft.q.f.k;
import net.minecraft.q.n;
import net.minecraft.q.z;
import net.minecraft.u.ad;
import net.minecraft.u.b.p;
import net.minecraft.u.b.t;
import net.minecraft.u.d.o;
import net.minecraft.w.a.g;
import org.lwjgl.opengl.dx;

public class an
extends de {
    private final r a;
    private final ce b;

    public an(r r2) {
        this.a = r2;
        this.b = r2.m;
    }

    public void a(cv cv2) {
        this.a.D.a("debug");
        bd.D();
        this.a();
        this.b(cv2);
        bd.E();
        if (this.a.w.av) {
            this.e();
        }
        this.a.D.b();
    }

    protected void a() {
        List list = this.b();
        list.add("");
        list.add("Debug: Pie [shift]: " + (this.a.w.au ? "visible" : "hidden") + " FPS [alt]: " + (this.a.w.av ? "visible" : "hidden"));
        list.add("For help: press F3 + Q");
        for (int i2 = 0; i2 < list.size(); ++i2) {
            String string = (String)list.get(i2);
            if (dw.c(string)) continue;
            int n2 = this.b.a;
            int n3 = this.b.a(string);
            int n4 = 2;
            int n5 = 2 + n2 * i2;
            an.a(1, n5 - 1, 2 + n3 + 1, n5 + n2 - 1, -1873784752);
            this.b.a(string, 2, n5, 0xE0E0E0);
        }
    }

    protected void b(cv cv2) {
        List list = this.c();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            String string = (String)list.get(i2);
            if (dw.c(string)) continue;
            int n2 = this.b.a;
            int n3 = this.b.a(string);
            int n4 = cv2.a() - 2 - n3;
            int n5 = 2 + n2 * i2;
            an.a(n4 - 1, n5 - 1, n4 + n3 + 1, n5 + n2 - 1, -1873784752);
            this.b.a(string, n4, n5, 0xE0E0E0);
        }
    }

    protected List b() {
        Object object;
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.a.Z().aU, this.a.Z().cT().b, this.a.Z().aW);
        if (this.a.al()) {
            return ov.a("Minecraft 1.10 Multiplayer Fix (" + this.a.c() + "/" + m.a() + ")", this.a.F, this.a.i.f(), this.a.i.h(), "P: " + this.a.l.b() + ". T: " + this.a.h.s(), this.a.h.t(), "", String.format("Chunk-relative: %d %d %d", b2.cy_() & 0xF, b2.k() & 0xF, b2.l() & 0xF));
        }
        net.minecraft.w.n n2 = this.a.Z();
        ad ad2 = n2.cl_();
        String string = "Invalid";
        switch (ad2) {
            case c: {
                string = "Towards negative Z";
                break;
            }
            case d: {
                string = "Towards positive Z";
                break;
            }
            case e: {
                string = "Towards negative X";
                break;
            }
            case f: {
                string = "Towards positive X";
            }
        }
        ArrayList arrayList = ov.a("Minecraft 1.10 Multiplayer Fix (" + this.a.c() + "/" + m.a() + ("release".equalsIgnoreCase(this.a.d()) ? "" : "/" + this.a.d()) + ")", this.a.F, this.a.i.f(), this.a.i.h(), "P: " + this.a.l.b() + ". T: " + this.a.h.s(), this.a.h.t(), "", String.format("XYZ: %.3f / %.5f / %.3f", this.a.Z().aU, this.a.Z().cT().b, this.a.Z().aW), String.format("Block: %d %d %d", b2.cy_(), b2.k(), b2.l()), String.format("Chunk: %d %d %d in %d %d %d", b2.cy_() & 0xF, b2.k() & 0xF, b2.l() & 0xF, b2.cy_() >> 4, b2.k() >> 4, b2.l() >> 4), String.format("Facing: %s (%s) (%.1f / %.1f)", ad2, string, Float.valueOf(net.minecraft.u.b.n.g(n2.ba)), Float.valueOf(net.minecraft.u.b.n.g(n2.bb))));
        if (this.a.h != null) {
            object = this.a.h.e(b2);
            if (this.a.h.d(b2) && b2.k() >= 0 && b2.k() < 256) {
                if (!((k)object).f()) {
                    g g2;
                    arrayList.add("Biome: " + ((k)object).a(b2, this.a.h.k()).l());
                    arrayList.add("Light: " + ((k)object).a(b2, 0) + " (" + ((k)object).a(au.a, b2) + " sky, " + ((k)object).a(au.b, b2) + " block)");
                    z z2 = this.a.h.C(b2);
                    if (this.a.D() && this.a.F() != null && (g2 = this.a.F().av().a(this.a.j.cM())) != null) {
                        z2 = g2.aQ.C(new net.minecraft.u.b.b(g2));
                    }
                    arrayList.add(String.format("Local Difficulty: %.2f // %.2f (Day %d)", Float.valueOf(z2.a()), Float.valueOf(z2.c()), this.a.h.C() / 24000L));
                } else {
                    arrayList.add("Waiting for chunk...");
                }
            } else {
                arrayList.add("Outside of world...");
            }
        }
        if (this.a.q != null && this.a.q.a()) {
            arrayList.add("Shader: " + this.a.q.e().b());
        }
        if (this.a.v != null && this.a.v.a == p.b && this.a.v.a() != null) {
            object = this.a.v.a();
            arrayList.add(String.format("Looking at: %d %d %d", ((t)object).cy_(), ((t)object).k(), ((t)object).l()));
        }
        return arrayList;
    }

    protected List c() {
        long l2 = Runtime.getRuntime().maxMemory();
        long l3 = Runtime.getRuntime().totalMemory();
        long l4 = Runtime.getRuntime().freeMemory();
        long l5 = l3 - l4;
        ArrayList arrayList = ov.a(String.format("Java: %s %dbit", System.getProperty("java.version"), this.a.S() ? 64 : 32), String.format("Mem: % 2d%% %03d/%03dMB", l5 * 100L / l2, an.a(l5), an.a(l2)), String.format("Allocated: % 2d%% %03dMB", l3 * 100L / l2, an.a(l3)), "", String.format("CPU: %s", ay.j()), "", String.format("Display: %dx%d (%s)", dx.C(), dx.D(), bd.r(7936)), bd.r(7937), bd.r(7938));
        if (this.a.al()) {
            return arrayList;
        }
        if (this.a.v != null && this.a.v.a == p.b && this.a.v.a() != null) {
            net.minecraft.u.b.b b2 = this.a.v.a();
            net.minecraft.g.c.b b3 = this.a.h.n(b2);
            if (this.a.h.y() != ab.g) {
                b3 = b3.b((n)this.a.h, b2);
            }
            arrayList.add("");
            arrayList.add(String.valueOf(cn.v.b(b3.c())));
            for (Map.Entry entry : b3.b().e()) {
                b b4 = (b)entry.getKey();
                Comparable comparable = (Comparable)entry.getValue();
                String string = b4.a(comparable);
                if (Boolean.TRUE.equals(comparable)) {
                    string = (Object)((Object)o.k) + string;
                } else if (Boolean.FALSE.equals(comparable)) {
                    string = (Object)((Object)o.m) + string;
                }
                arrayList.add(String.valueOf(b4.a()) + ": " + string);
            }
        }
        return arrayList;
    }

    private void e() {
        bd.i();
        net.minecraft.u.an an2 = this.a.af();
        int n2 = an2.a();
        int n3 = an2.b();
        long[] arrl = an2.c();
        cv cv2 = new cv(this.a);
        int n4 = n2;
        int n5 = 0;
        an.a(0, cv2.b() - 60, 240, cv2.b(), -1873784752);
        while (n4 != n3) {
            int n6 = an2.a(arrl[n4], 30);
            int n7 = this.c(net.minecraft.u.b.n.a(n6, 0, 60), 0, 30, 60);
            this.b(n5, cv2.b(), cv2.b() - n6, n7);
            ++n5;
            n4 = an2.a(n4 + 1);
        }
        an.a(1, cv2.b() - 30 + 1, 14, cv2.b() - 30 + 10, -1873784752);
        this.b.a("60", 2, cv2.b() - 30 + 2, 0xE0E0E0);
        this.a(0, 239, cv2.b() - 30, -1);
        an.a(1, cv2.b() - 60 + 1, 14, cv2.b() - 60 + 10, -1873784752);
        this.b.a("30", 2, cv2.b() - 60 + 2, 0xE0E0E0);
        this.a(0, 239, cv2.b() - 60, -1);
        this.a(0, 239, cv2.b() - 1, -1);
        this.b(0, cv2.b() - 60, cv2.b(), -1);
        this.b(239, cv2.b() - 60, cv2.b(), -1);
        if (this.a.w.h <= 120) {
            this.a(0, 239, cv2.b() - 60 + this.a.w.h / 2, -16711681);
        }
        bd.j();
    }

    private int c(int n2, int n3, int n4, int n5) {
        return n2 < n4 ? this.a(-16711936, -256, (float)n2 / (float)n4) : this.a(-256, -65536, (float)(n2 - n4) / (float)(n5 - n4));
    }

    private int a(int n2, int n3, float f2) {
        int n4 = n2 >> 24 & 0xFF;
        int n5 = n2 >> 16 & 0xFF;
        int n6 = n2 >> 8 & 0xFF;
        int n7 = n2 & 0xFF;
        int n8 = n3 >> 24 & 0xFF;
        int n9 = n3 >> 16 & 0xFF;
        int n10 = n3 >> 8 & 0xFF;
        int n11 = n3 & 0xFF;
        int n12 = net.minecraft.u.b.n.a((int)((float)n4 + (float)(n8 - n4) * f2), 0, 255);
        int n13 = net.minecraft.u.b.n.a((int)((float)n5 + (float)(n9 - n5) * f2), 0, 255);
        int n14 = net.minecraft.u.b.n.a((int)((float)n6 + (float)(n10 - n6) * f2), 0, 255);
        int n15 = net.minecraft.u.b.n.a((int)((float)n7 + (float)(n11 - n7) * f2), 0, 255);
        return n12 << 24 | n13 << 16 | n14 << 8 | n15;
    }

    private static long a(long l2) {
        return l2 / 1024L / 1024L;
    }
}

