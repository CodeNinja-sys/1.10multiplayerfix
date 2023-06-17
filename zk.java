/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.b.aa;
import io.netty.b.bi;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;

public class zk
extends cjn {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final bpx b = new bpx("textures/gui/book.png");
    private final bdl c;
    private final bhl d;
    private final boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private final int i = 192;
    private final int j = 192;
    private int k = 1;
    private int l;
    private bmh m;
    private String r = "";
    private List s;
    private int t = -1;
    private ou C;
    private ou D;
    private cwv E;
    private cwv F;
    private cwv G;
    private cwv H;

    public zk(bdl bdl2, bhl bhl2, boolean bl2) {
        this.c = bdl2;
        this.d = bhl2;
        this.e = bl2;
        if (bhl2.n()) {
            bvp bvp2 = bhl2.o();
            this.m = bvp2.c("pages", 8);
            if (this.m != null) {
                this.m = this.m.c();
                this.k = this.m.b();
                if (this.k < 1) {
                    this.k = 1;
                }
            }
        }
        if (this.m == null && bl2) {
            this.m = new bmh();
            this.m.a(new byh(""));
            this.k = 1;
        }
    }

    @Override
    public void d() {
        super.d();
        ++this.h;
    }

    @Override
    public void cH_() {
        this.y.clear();
        org.lwjgl.a.g.a(true);
        if (this.e) {
            this.F = this.b(new cwv(3, this.w / 2 - 100, 196, 98, 20, bf.a("book.signButton", new Object[0])));
            this.E = this.b(new cwv(0, this.w / 2 + 2, 196, 98, 20, bf.a("gui.done", new Object[0])));
            this.G = this.b(new cwv(5, this.w / 2 - 100, 196, 98, 20, bf.a("book.finalizeButton", new Object[0])));
            this.H = this.b(new cwv(4, this.w / 2 + 2, 196, 98, 20, bf.a("gui.cancel", new Object[0])));
        } else {
            this.E = this.b(new cwv(0, this.w / 2 - 100, 196, 200, 20, bf.a("gui.done", new Object[0])));
        }
        int n2 = (this.w - 192) / 2;
        int n3 = 2;
        this.C = (ou)this.b(new ou(1, n2 + 120, 156, true));
        this.D = (ou)this.b(new ou(2, n2 + 38, 156, false));
        this.h();
    }

    @Override
    public void aG_() {
        org.lwjgl.a.g.a(false);
    }

    private void h() {
        this.C.l = !this.g && (this.l < this.k - 1 || this.e);
        this.D.l = !this.g && this.l > 0;
        boolean bl2 = this.E.l = !this.e || !this.g;
        if (this.e) {
            this.F.l = !this.g;
            this.H.l = this.g;
            this.G.l = this.g;
            this.G.k = !this.r.trim().isEmpty();
        }
    }

    private void a(boolean bl2) {
        if (!this.e || !this.f) {
            return;
        }
        if (this.m != null) {
            Object object;
            while (this.m.b() > 1 && ((String)(object = this.m.g(this.m.b() - 1))).isEmpty()) {
                this.m.a(this.m.b() - 1);
            }
            if (this.d.n()) {
                object = this.d.o();
                ((bvp)object).a("pages", this.m);
            } else {
                this.d.a("pages", this.m);
            }
            object = "MC|BEdit";
            if (bl2) {
                object = "MC|BSign";
                this.d.a("author", new byh(this.c.i_()));
                this.d.a("title", new byh(this.r.trim()));
            }
            si si2 = new si(bi.a());
            si2.a(this.d);
            this.u.x().a(new pm((String)object, si2));
        }
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j == 0) {
            this.u.a((cjn)null);
            this.a(false);
        } else if (cwv2.j == 3 && this.e) {
            this.g = true;
        } else if (cwv2.j == 1) {
            if (this.l < this.k - 1) {
                ++this.l;
            } else if (this.e) {
                this.i();
                if (this.l < this.k - 1) {
                    ++this.l;
                }
            }
        } else if (cwv2.j == 2) {
            if (this.l > 0) {
                --this.l;
            }
        } else if (cwv2.j == 5 && this.g) {
            this.a(true);
            this.u.a((cjn)null);
        } else if (cwv2.j == 4 && this.g) {
            this.g = false;
        }
        this.h();
    }

    private void i() {
        if (this.m == null || this.m.b() >= 50) {
            return;
        }
        this.m.a(new byh(""));
        ++this.k;
        this.f = true;
    }

    @Override
    protected void a(char c2, int n2) {
        super.a(c2, n2);
        if (!this.e) {
            return;
        }
        if (this.g) {
            this.c(c2, n2);
        } else {
            this.b(c2, n2);
        }
    }

    private void b(char c2, int n2) {
        if (cjn.e(n2)) {
            this.b(cjn.l());
            return;
        }
        switch (n2) {
            case 14: {
                String string = this.j();
                if (!string.isEmpty()) {
                    this.a(string.substring(0, string.length() - 1));
                }
                return;
            }
            case 28: 
            case 156: {
                this.b("\n");
                return;
            }
        }
        if (ate.a(c2)) {
            this.b(Character.toString(c2));
            return;
        }
    }

    private void c(char c2, int n2) {
        switch (n2) {
            case 14: {
                if (!this.r.isEmpty()) {
                    this.r = this.r.substring(0, this.r.length() - 1);
                    this.h();
                }
                return;
            }
            case 28: 
            case 156: {
                if (!this.r.isEmpty()) {
                    this.a(true);
                    this.u.a((cjn)null);
                }
                return;
            }
        }
        if (this.r.length() < 16 && ate.a(c2)) {
            this.r = this.r + Character.toString(c2);
            this.h();
            this.f = true;
        }
    }

    private String j() {
        if (this.m != null && this.l >= 0 && this.l < this.m.b()) {
            return this.m.g(this.l);
        }
        return "";
    }

    private void a(String string) {
        if (this.m != null && this.l >= 0 && this.l < this.m.b()) {
            this.m.a(this.l, new byh(string));
            this.f = true;
        }
    }

    private void b(String string) {
        String string2 = this.j();
        String string3 = string2 + string;
        int n2 = this.B.b(string3 + "" + (Object)((Object)aug.a) + "_", 118);
        if (n2 <= 128 && string3.length() < 256) {
            this.a(string3);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.P().a(b);
        int n4 = (this.w - 192) / 2;
        int n5 = 2;
        this.c(n4, 2, 0, 0, 192, 192);
        if (this.g) {
            String string = this.r;
            if (this.e) {
                string = this.h / 6 % 2 == 0 ? string + "" + (Object)((Object)aug.a) + "_" : string + "" + (Object)((Object)aug.h) + "_";
            }
            String string2 = bf.a("book.editTitle", new Object[0]);
            int n6 = this.B.a(string2);
            this.B.a(string2, n4 + 36 + (116 - n6) / 2, 34, 0);
            int n7 = this.B.a(string);
            this.B.a(string, n4 + 36 + (116 - n7) / 2, 50, 0);
            String string3 = bf.a("book.byAuthor", this.c.i_());
            int n8 = this.B.a(string3);
            this.B.a((Object)((Object)aug.i) + string3, n4 + 36 + (116 - n8) / 2, 60, 0);
            String string4 = bf.a("book.finalizeWarning", new Object[0]);
            this.B.a(string4, n4 + 36, 82, 116, 0);
        } else {
            String string = bf.a("book.pageIndicator", this.l + 1, this.k);
            String string5 = "";
            if (this.m != null && this.l >= 0 && this.l < this.m.b()) {
                string5 = this.m.g(this.l);
            }
            if (this.e) {
                string5 = this.B.b() ? string5 + "_" : (this.h / 6 % 2 == 0 ? string5 + "" + (Object)((Object)aug.a) + "_" : string5 + "" + (Object)((Object)aug.h) + "_");
            } else if (this.t != this.l) {
                cbg cbg2;
                if (daa.b(this.d.o())) {
                    try {
                        cbg2 = zf.a(string5);
                        this.s = cbg2 != null ? cma.a(cbg2, 116, this.B, true, true) : null;
                    }
                    catch (aa aa2) {
                        this.s = null;
                    }
                } else {
                    cbg2 = new aym((Object)((Object)aug.e) + "* Invalid book tag *");
                    this.s = ov.a(cbg2);
                }
                this.t = this.l;
            }
            int n9 = this.B.a(string);
            this.B.a(string, n4 - n9 + 192 - 44, 18, 0);
            if (this.s == null) {
                this.B.a(string5, n4 + 36, 34, 116, 0);
            } else {
                int n10 = Math.min(128 / this.B.a, this.s.size());
                for (int i2 = 0; i2 < n10; ++i2) {
                    cbg cbg3 = (cbg)this.s.get(i2);
                    this.B.a(cbg3.i(), n4 + 36, 34 + i2 * this.B.a, 0);
                }
                cbg cbg4 = this.a(n2, n3);
                if (cbg4 != null) {
                    this.a(cbg4, n2, n3);
                }
            }
        }
        super.a(n2, n3, f2);
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        cbg cbg2;
        if (n4 == 0 && (cbg2 = this.a(n2, n3)) != null && this.a(cbg2)) {
            return;
        }
        super.a(n2, n3, n4);
    }

    @Override
    protected boolean a(cbg cbg2) {
        cxk cxk2 = cbg2.h().h();
        if (cxk2 == null) {
            return false;
        }
        if (cxk2.a() == nc.e) {
            String string = cxk2.b();
            try {
                int n2 = Integer.parseInt(string) - 1;
                if (n2 >= 0 && n2 < this.k && n2 != this.l) {
                    this.l = n2;
                    this.h();
                    return true;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            return false;
        }
        boolean bl2 = super.a(cbg2);
        if (bl2 && cxk2.a() == nc.c) {
            this.u.a((cjn)null);
        }
        return bl2;
    }

    public cbg a(int n2, int n3) {
        if (this.s == null) {
            return null;
        }
        int n4 = n2 - (this.w - 192) / 2 - 36;
        int n5 = n3 - 2 - 16 - 16;
        if (n4 < 0 || n5 < 0) {
            return null;
        }
        int n6 = Math.min(128 / this.B.a, this.s.size());
        if (n4 <= 116 && n5 < this.u.k.a * n6 + n6) {
            int n7 = n5 / this.u.k.a;
            if (n7 >= 0 && n7 < this.s.size()) {
                cbg cbg2 = (cbg)this.s.get(n7);
                int n8 = 0;
                for (cbg cbg3 : cbg2) {
                    if (!(cbg3 instanceof aym) || (n8 += this.u.k.a(((aym)cbg3).a())) <= n4) continue;
                    return cbg3;
                }
            }
            return null;
        }
        return null;
    }

    static /* synthetic */ bpx f() {
        return b;
    }
}

