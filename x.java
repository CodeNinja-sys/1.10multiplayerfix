/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.Arrays;
import java.util.List;
import org.lwjgl.a.g;

public class x
extends cjn {
    private static final List a = ov.a();
    private final dae b;
    private String c;
    private String d;
    private String e;
    private fi f;
    private cwv g;
    private cld h;

    public x(dae dae2) {
        this.b = dae2;
    }

    @Override
    public void cH_() {
        this.y.clear();
        org.lwjgl.a.g.a(true);
        this.c = bf.a("createWorld.customize.presets.title", new Object[0]);
        this.d = bf.a("createWorld.customize.presets.share", new Object[0]);
        this.e = bf.a("createWorld.customize.presets.list", new Object[0]);
        this.h = new cld(2, this.B, 50, 40, this.w - 100, 20);
        this.f = new fi(this);
        this.h.f(1230);
        this.h.a(this.b.f());
        this.g = this.b(new cwv(0, this.w / 2 - 155, this.x - 28, 150, 20, bf.a("createWorld.customize.presets.select", new Object[0])));
        this.y.add(new cwv(1, this.w / 2 + 5, this.x - 28, 150, 20, bf.a("gui.cancel", new Object[0])));
        this.e();
    }

    @Override
    public void p_() {
        super.p_();
        this.f.i();
    }

    @Override
    public void aG_() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        this.h.a(n2, n3, n4);
        super.a(n2, n3, n4);
    }

    @Override
    protected void a(char c2, int n2) {
        if (!this.h.a(c2, n2)) {
            super.a(c2, n2);
        }
    }

    @Override
    protected void a(cwv cwv2) {
        if (cwv2.j == 0 && this.h()) {
            this.b.a(this.h.b());
            this.u.a(this.b);
        } else if (cwv2.j == 1) {
            this.u.a(this.b);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.f.a(n2, n3, f2);
        this.a(this.B, this.c, this.w / 2, 8, 0xFFFFFF);
        this.b(this.B, this.d, 50, 30, 0xA0A0A0);
        this.b(this.B, this.e, 50, 70, 0xA0A0A0);
        this.h.g();
        super.a(n2, n3, f2);
    }

    @Override
    public void d() {
        this.h.a();
        super.d();
    }

    public void e() {
        this.g.k = this.h();
    }

    private boolean h() {
        return this.f.a > -1 && this.f.a < a.size() || this.h.b().length() > 1;
    }

    private static void a(String string, azg azg2, anr anr2, pb ... arrpb) {
        x.a(string, azg2, 0, anr2, null, arrpb);
    }

    private static void a(String string, azg azg2, anr anr2, List list, pb ... arrpb) {
        x.a(string, azg2, 0, anr2, list, arrpb);
    }

    private static void a(String string, azg azg2, int n2, anr anr2, List list, pb ... arrpb) {
        bnv bnv2 = new bnv();
        for (int i2 = arrpb.length - 1; i2 >= 0; --i2) {
            bnv2.c().add(arrpb[i2]);
        }
        bnv2.a(anr.a(anr2));
        bnv2.d();
        if (list != null) {
            for (String string2 : list) {
                bnv2.b().put(string2, sz.c());
            }
        }
        a.add(new arx(azg2, n2, string, bnv2.toString()));
    }

    static /* synthetic */ float a(x x2) {
        return x2.q;
    }

    static /* synthetic */ float b(x x2) {
        return x2.q;
    }

    static /* synthetic */ float c(x x2) {
        return x2.q;
    }

    static /* synthetic */ float d(x x2) {
        return x2.q;
    }

    static /* synthetic */ List f() {
        return a;
    }

    static /* synthetic */ fi e(x x2) {
        return x2.f;
    }

    static /* synthetic */ cld f(x x2) {
        return x2.h;
    }

    static {
        x.a("Classic Flat", azg.a(blg.c), cff.c, Arrays.asList("village"), new pb(1, blg.c), new pb(2, blg.d), new pb(1, blg.h));
        x.a("Tunnelers' Dream", azg.a(blg.b), cff.e, Arrays.asList("biome_1", "dungeon", "decoration", "stronghold", "mineshaft"), new pb(1, blg.c), new pb(5, blg.d), new pb(230, blg.b), new pb(1, blg.h));
        x.a("Water World", hp.az, cff.z, Arrays.asList("biome_1", "oceanmonument"), new pb(90, blg.j), new pb(5, blg.m), new pb(5, blg.d), new pb(5, blg.b), new pb(1, blg.h));
        x.a("Overworld", azg.a(blg.H), deq.b.b(), cff.c, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake"), new pb(1, blg.c), new pb(3, blg.d), new pb(59, blg.b), new pb(1, blg.h));
        x.a("Snowy Kingdom", azg.a(blg.aH), cff.n, Arrays.asList("village", "biome_1"), new pb(1, blg.aH), new pb(1, blg.c), new pb(3, blg.d), new pb(59, blg.b), new pb(1, blg.h));
        x.a("Bottomless Pit", hp.I, cff.c, Arrays.asList("village", "biome_1"), new pb(1, blg.c), new pb(3, blg.d), new pb(2, blg.e));
        x.a("Desert", azg.a(blg.m), cff.d, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"), new pb(8, blg.m), new pb(52, blg.A), new pb(3, blg.b), new pb(1, blg.h));
        x.a("Redstone Ready", hp.aE, cff.d, new pb(52, blg.A), new pb(3, blg.b), new pb(1, blg.h));
        x.a("The Void", azg.a(blg.cv), cff.P, Arrays.asList("decoration"), new pb(1, blg.a));
    }
}

