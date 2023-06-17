/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Random;
import org.lwjgl.util.a.j;

public class awt
extends ab {
    private static final bpx C = new bpx("textures/gui/container/enchanting_table.png");
    private static final bpx D = new bpx("textures/entity/enchanting_table_book.png");
    private static final td E = new td();
    private final cps F;
    private final Random G = new Random();
    private final dc H;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float r;
    public float s;
    bhl t;
    private final cnq I;

    public awt(cps cps2, iu iu2, cnq cnq2) {
        super(new dc(cps2, iu2));
        this.F = cps2;
        this.H = (dc)this.d;
        this.I = cnq2;
    }

    @Override
    protected void a(int n2, int n3) {
        this.B.a(this.I.v().i(), 12, 5, 0x404040);
        this.B.a(this.F.v().i(), 8, this.c - 96 + 2, 0x404040);
    }

    @Override
    public void d() {
        super.d();
        this.f();
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        int n5 = (this.w - this.b) / 2;
        int n6 = (this.x - this.c) / 2;
        for (int i2 = 0; i2 < 3; ++i2) {
            int n7 = n2 - (n5 + 60);
            int n8 = n3 - (n6 + 14 + 19 * i2);
            if (n7 < 0 || n8 < 0 || n7 >= 108 || n8 >= 19 || !this.H.a((bdl)this.u.h, i2)) continue;
            this.u.c.a(this.H.h, i2);
        }
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.P().a(C);
        int n4 = (this.w - this.b) / 2;
        int n5 = (this.x - this.c) / 2;
        this.c(n4, n5, 0, 0, this.b, this.c);
        cja.D();
        cja.l(5889);
        cja.D();
        cja.C();
        cnt cnt2 = new cnt(this.u);
        cja.b((cnt2.a() - 320) / 2 * cnt2.e(), (cnt2.b() - 240) / 2 * cnt2.e(), 320 * cnt2.e(), 240 * cnt2.e());
        cja.c(-0.34f, 0.23f, 0.0f);
        org.lwjgl.util.a.j.a(90.0f, 1.3333334f, 9.0f, 80.0f);
        float f3 = 1.0f;
        cja.l(5888);
        cja.C();
        bjr.b();
        cja.c(0.0f, 3.3f, -16.0f);
        cja.b(1.0f, 1.0f, 1.0f);
        float f4 = 5.0f;
        cja.b(5.0f, 5.0f, 5.0f);
        cja.b(180.0f, 0.0f, 0.0f, 1.0f);
        this.u.P().a(D);
        cja.b(20.0f, 1.0f, 0.0f, 0.0f);
        float f5 = this.s + (this.r - this.s) * f2;
        cja.c((1.0f - f5) * 0.2f, (1.0f - f5) * 0.1f, (1.0f - f5) * 0.25f);
        cja.b(-(1.0f - f5) * 90.0f - 90.0f, 0.0f, 1.0f, 0.0f);
        cja.b(180.0f, 1.0f, 0.0f, 0.0f);
        float f6 = this.k + (this.j - this.k) * f2 + 0.25f;
        float f7 = this.k + (this.j - this.k) * f2 + 0.75f;
        f6 = (f6 - (float)cmk.b((double)f6)) * 1.6f - 0.3f;
        f7 = (f7 - (float)cmk.b((double)f7)) * 1.6f - 0.3f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        cja.A();
        E.a(null, 0.0f, f6, f7, f5, 0.0f, 0.0625f);
        cja.B();
        bjr.a();
        cja.l(5889);
        cja.b(0, 0, this.u.d, this.u.e);
        cja.E();
        cja.l(5888);
        cja.E();
        bjr.a();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        dcc.a().a(this.H.b);
        int n6 = this.H.b();
        for (int i2 = 0; i2 < 3; ++i2) {
            int n7 = n4 + 60;
            int n8 = n7 + 20;
            this.q = 0.0f;
            this.u.P().a(C);
            int n9 = this.H.c[i2];
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            if (n9 == 0) {
                this.c(n7, n5 + 14 + 19 * i2, 0, 185, 108, 19);
                continue;
            }
            String string = "" + n9;
            int n10 = 86 - this.B.a(string);
            String string2 = dcc.a().a(this.B, n10);
            deb deb2 = this.u.l;
            int n11 = 6839882;
            if (!(n6 >= i2 + 1 && this.u.h.H >= n9 || this.u.h.G.d)) {
                this.c(n7, n5 + 14 + 19 * i2, 0, 185, 108, 19);
                this.c(n7 + 1, n5 + 15 + 19 * i2, 16 * i2, 239, 16, 16);
                deb2.a(string2, n8, n5 + 16 + 19 * i2, n10, (n11 & 0xFEFEFE) >> 1);
                n11 = 4226832;
            } else {
                int n12 = n2 - (n4 + 60);
                int n13 = n3 - (n5 + 14 + 19 * i2);
                if (n12 >= 0 && n13 >= 0 && n12 < 108 && n13 < 19) {
                    this.c(n7, n5 + 14 + 19 * i2, 0, 204, 108, 19);
                    n11 = 0xFFFF80;
                } else {
                    this.c(n7, n5 + 14 + 19 * i2, 0, 166, 108, 19);
                }
                this.c(n7 + 1, n5 + 15 + 19 * i2, 16 * i2, 223, 16, 16);
                deb2.a(string2, n8, n5 + 16 + 19 * i2, n10, n11);
                n11 = 8453920;
            }
            deb2 = this.u.k;
            deb2.a(string, (float)(n8 + 86 - deb2.a(string)), (float)(n5 + 16 + 19 * i2 + 7), n11);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        boolean bl2 = this.u.h.G.d;
        int n4 = this.H.b();
        for (int i2 = 0; i2 < 3; ++i2) {
            int n5 = this.H.c[i2];
            dad dad2 = dad.c(this.H.d[i2]);
            int n6 = this.H.e[i2];
            int n7 = i2 + 1;
            if (!this.a(60, 14 + 19 * i2, 108, 17, n2, n3) || n5 <= 0 || n6 < 0 || dad2 == null) continue;
            ArrayList arrayList = ov.a();
            arrayList.add("" + (Object)((Object)aug.p) + (Object)((Object)aug.u) + bf.a("container.enchant.clue", dad2.d(n6)));
            if (!bl2) {
                arrayList.add("");
                if (this.u.h.H < n5) {
                    arrayList.add((Object)((Object)aug.m) + "Level Requirement: " + this.H.c[i2]);
                } else {
                    String string = n7 == 1 ? bf.a("container.enchant.lapis.one", new Object[0]) : bf.a("container.enchant.lapis.many", n7);
                    aug aug2 = n4 >= n7 ? aug.h : aug.m;
                    arrayList.add((Object)((Object)aug2) + "" + string);
                    string = n7 == 1 ? bf.a("container.enchant.level.one", new Object[0]) : bf.a("container.enchant.level.many", n7);
                    arrayList.add((Object)((Object)aug.h) + "" + string);
                }
            }
            this.a(arrayList, n2, n3);
            break;
        }
    }

    public void f() {
        bhl bhl2 = this.d.a(0).a();
        if (!bhl.b(bhl2, this.t)) {
            this.t = bhl2;
            do {
                this.l += (float)(this.G.nextInt(4) - this.G.nextInt(4));
            } while (this.j <= this.l + 1.0f && this.j >= this.l - 1.0f);
        }
        ++this.i;
        this.k = this.j;
        this.s = this.r;
        boolean bl2 = false;
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.H.c[i2] == 0) continue;
            bl2 = true;
        }
        this.r = bl2 ? (this.r += 0.2f) : (this.r -= 0.2f);
        this.r = cmk.a(this.r, 0.0f, 1.0f);
        float f2 = (this.l - this.j) * 0.4f;
        float f3 = 0.2f;
        f2 = cmk.a(f2, -0.2f, 0.2f);
        this.m += (f2 - this.m) * 0.9f;
        this.j += this.m;
    }
}

