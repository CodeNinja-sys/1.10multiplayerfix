/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.dw;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.client.m;
import org.lwjgl.opengl.dx;

public class cmq
extends alo {
    private final bxy a;
    private final deb b;

    public cmq(bxy bxy2) {
        this.a = bxy2;
        this.b = bxy2.k;
    }

    public void a(cnt cnt2) {
        this.a.B.a("debug");
        cja.D();
        this.a();
        this.b(cnt2);
        cja.E();
        if (this.a.u.av) {
            this.d();
        }
        this.a.B.b();
    }

    protected void a() {
        List list = this.b();
        list.add("");
        list.add("Debug: Pie [shift]: " + (this.a.u.au ? "visible" : "hidden") + " FPS [alt]: " + (this.a.u.av ? "visible" : "hidden"));
        list.add("For help: press F3 + Q");
        for (int i2 = 0; i2 < list.size(); ++i2) {
            String string = (String)list.get(i2);
            if (dw.c(string)) continue;
            int n2 = this.b.a;
            int n3 = this.b.a(string);
            int n4 = 2;
            int n5 = 2 + n2 * i2;
            cmq.a(1, n5 - 1, 2 + n3 + 1, n5 + n2 - 1, -1873784752);
            this.b.a(string, 2, n5, 0xE0E0E0);
        }
    }

    protected void b(cnt cnt2) {
        List list = this.c();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            String string = (String)list.get(i2);
            if (dw.c(string)) continue;
            int n2 = this.b.a;
            int n3 = this.b.a(string);
            int n4 = cnt2.a() - 2 - n3;
            int n5 = 2 + n2 * i2;
            cmq.a(n4 - 1, n5 - 1, n4 + n3 + 1, n5 + n2 - 1, -1873784752);
            this.b.a(string, n4, n5, 0xE0E0E0);
        }
    }

    protected List b() {
        Object object;
        cmz cmz2 = new cmz(this.a.ab().aU, this.a.ab().cD().b, this.a.ab().aW);
        if (this.a.am()) {
            return ov.a("Minecraft 1.10 (" + this.a.e() + "/" + m.a() + ")", this.a.D, this.a.g.f(), this.a.g.h(), "P: " + this.a.j.b() + ". T: " + this.a.f.m(), this.a.f.n(), "", String.format("Chunk-relative: %d %d %d", cmz2.a() & 0xF, cmz2.b() & 0xF, cmz2.c() & 0xF));
        }
        cpk cpk2 = this.a.ab();
        bqk bqk2 = cpk2.B_();
        String string = "Invalid";
        switch (bqk2) {
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
        ArrayList arrayList = ov.a("Minecraft 1.10 (" + this.a.e() + "/" + m.a() + ("release".equalsIgnoreCase(this.a.f()) ? "" : "/" + this.a.f()) + ")", this.a.D, this.a.g.f(), this.a.g.h(), "P: " + this.a.j.b() + ". T: " + this.a.f.m(), this.a.f.n(), "", String.format("XYZ: %.3f / %.5f / %.3f", this.a.ab().aU, this.a.ab().cD().b, this.a.ab().aW), String.format("Block: %d %d %d", cmz2.a(), cmz2.b(), cmz2.c()), String.format("Chunk: %d %d %d in %d %d %d", cmz2.a() & 0xF, cmz2.b() & 0xF, cmz2.c() & 0xF, cmz2.a() >> 4, cmz2.b() >> 4, cmz2.c() >> 4), String.format("Facing: %s (%s) (%.1f / %.1f)", bqk2, string, Float.valueOf(cmk.g(cpk2.ba)), Float.valueOf(cmk.g(cpk2.bb))));
        if (this.a.f != null) {
            object = this.a.f.e(cmz2);
            if (!this.a.f.d(cmz2) || cmz2.b() < 0 || cmz2.b() >= 256) {
                arrayList.add("Outside of world...");
            } else if (!((bhm)object).h()) {
                czt czt2;
                arrayList.add("Biome: " + ((bhm)object).a(cmz2, this.a.f.t_()).l());
                arrayList.add("Light: " + ((bhm)object).a(cmz2, 0) + " (" + ((bhm)object).a(bzq.a, cmz2) + " sky, " + ((bhm)object).a(bzq.b, cmz2) + " block)");
                bgp bgp2 = this.a.f.C(cmz2);
                if (this.a.F() && this.a.H() != null && (czt2 = ((cmt)((Object)this.a.H().al())).a(this.a.h.cx())) != null) {
                    bgp2 = czt2.aQ.C(new cmz(czt2));
                }
                arrayList.add(String.format("Local Difficulty: %.2f // %.2f (Day %d)", Float.valueOf(bgp2.a()), Float.valueOf(bgp2.c()), this.a.f.A() / 24000L));
            } else {
                arrayList.add("Waiting for chunk...");
            }
        }
        if (this.a.o != null && this.a.o.a()) {
            arrayList.add("Shader: " + this.a.o.e().b());
        }
        if (this.a.t != null && this.a.t.a == bmw.b && this.a.t.a() != null) {
            object = this.a.t.a();
            arrayList.add(String.format("Looking at: %d %d %d", ((cjx)object).a(), ((cjx)object).b(), ((cjx)object).c()));
        }
        return arrayList;
    }

    protected List c() {
        long l2 = Runtime.getRuntime().maxMemory();
        long l3 = Runtime.getRuntime().totalMemory();
        long l4 = Runtime.getRuntime().freeMemory();
        long l5 = l3 - l4;
        ArrayList arrayList = ov.a(String.format("Java: %s %dbit", System.getProperty("java.version"), this.a.U() ? 64 : 32), String.format("Mem: % 2d%% %03d/%03dMB", l5 * 100L / l2, cmq.a(l5), cmq.a(l2)), String.format("Allocated: % 2d%% %03dMB", l3 * 100L / l2, cmq.a(l3)), "", String.format("CPU: %s", cjg.j()), "", String.format("Display: %dx%d (%s)", dx.C(), dx.D(), cja.r(7936)), cja.r(7937), cja.r(7938));
        if (this.a.am()) {
            return arrayList;
        }
        if (this.a.t != null && this.a.t.a == bmw.b && this.a.t.a() != null) {
            cmz cmz2 = this.a.t.a();
            dbk dbk2 = this.a.f.n(cmz2);
            if (this.a.f.v() != aaf.g) {
                dbk2 = dbk2.b((bnj)this.a.f, cmz2);
            }
            arrayList.add("");
            arrayList.add(String.valueOf(bfa.v.b(dbk2.t())));
            for (Map.Entry entry : dbk2.s().e()) {
                bvs bvs2 = (bvs)entry.getKey();
                Comparable comparable = (Comparable)entry.getValue();
                String string = bvs2.a(comparable);
                if (Boolean.TRUE.equals(comparable)) {
                    string = (Object)((Object)aug.k) + string;
                } else if (Boolean.FALSE.equals(comparable)) {
                    string = (Object)((Object)aug.m) + string;
                }
                arrayList.add(bvs2.b() + ": " + string);
            }
        }
        return arrayList;
    }

    private void d() {
        cja.i();
        dgv dgv2 = this.a.ah();
        int n2 = dgv2.a();
        int n3 = dgv2.b();
        long[] arrl = dgv2.c();
        cnt cnt2 = new cnt(this.a);
        int n4 = n2;
        int n5 = 0;
        cmq.a(0, cnt2.b() - 60, 240, cnt2.b(), -1873784752);
        while (n4 != n3) {
            int n6 = dgv2.a(arrl[n4], 30);
            int n7 = this.c(cmk.a(n6, 0, 60), 0, 30, 60);
            this.b(n5, cnt2.b(), cnt2.b() - n6, n7);
            ++n5;
            n4 = dgv2.a(n4 + 1);
        }
        cmq.a(1, cnt2.b() - 30 + 1, 14, cnt2.b() - 30 + 10, -1873784752);
        this.b.a("60", 2, cnt2.b() - 30 + 2, 0xE0E0E0);
        this.a(0, 239, cnt2.b() - 30, -1);
        cmq.a(1, cnt2.b() - 60 + 1, 14, cnt2.b() - 60 + 10, -1873784752);
        this.b.a("30", 2, cnt2.b() - 60 + 2, 0xE0E0E0);
        this.a(0, 239, cnt2.b() - 60, -1);
        this.a(0, 239, cnt2.b() - 1, -1);
        this.b(0, cnt2.b() - 60, cnt2.b(), -1);
        this.b(239, cnt2.b() - 60, cnt2.b(), -1);
        if (this.a.u.h <= 120) {
            this.a(0, 239, cnt2.b() - 60 + this.a.u.h / 2, -16711681);
        }
        cja.j();
    }

    private int c(int n2, int n3, int n4, int n5) {
        if (n2 < n4) {
            return this.a(-16711936, -256, (float)n2 / (float)n4);
        }
        return this.a(-256, -65536, (float)(n2 - n4) / (float)(n5 - n4));
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
        int n12 = cmk.a((int)((float)n4 + (float)(n8 - n4) * f2), 0, 255);
        int n13 = cmk.a((int)((float)n5 + (float)(n9 - n5) * f2), 0, 255);
        int n14 = cmk.a((int)((float)n6 + (float)(n10 - n6) * f2), 0, 255);
        int n15 = cmk.a((int)((float)n7 + (float)(n11 - n7) * f2), 0, 255);
        return n12 << 24 | n13 << 16 | n14 << 8 | n15;
    }

    private static long a(long l2) {
        return l2 / 1024L / 1024L;
    }
}

