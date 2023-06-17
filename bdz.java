/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import io.netty.b.bi;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;

public class bdz
extends cjn {
    private static final d a = org.apache.logging.log4j.c.c();
    private final i b;
    private cdk c = cdk.a;
    private ih d = ih.a;
    private cfk e = cfk.d;
    private boolean f;
    private boolean g;
    private boolean h;
    private cld i;
    private cld j;
    private cld k;
    private cld l;
    private cld m;
    private cld r;
    private cld s;
    private cld t;
    private cld C;
    private cld D;
    private cwv E;
    private cwv F;
    private cwv G;
    private cwv H;
    private cwv I;
    private cwv J;
    private cwv K;
    private cwv L;
    private cwv M;
    private cwv N;
    private cwv O;
    private cwv P;
    private cwv Q;
    private cwv R;
    private final List S = ov.a();
    private final DecimalFormat T = new DecimalFormat("0.0###");

    public bdz(i i2) {
        this.b = i2;
        this.T.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
    }

    @Override
    public void d() {
        this.i.a();
        this.j.a();
        this.k.a();
        this.l.a();
        this.m.a();
        this.r.a();
        this.s.a();
        this.t.a();
        this.C.a();
        this.D.a();
    }

    @Override
    public void cH_() {
        org.lwjgl.a.g.a(true);
        this.y.clear();
        this.E = this.b(new cwv(0, this.w / 2 - 4 - 150, 210, 150, 20, bf.a("gui.done", new Object[0])));
        this.F = this.b(new cwv(1, this.w / 2 + 4, 210, 150, 20, bf.a("gui.cancel", new Object[0])));
        this.G = this.b(new cwv(9, this.w / 2 + 4 + 100, 185, 50, 20, bf.a("structure_block.button.save", new Object[0])));
        this.H = this.b(new cwv(10, this.w / 2 + 4 + 100, 185, 50, 20, bf.a("structure_block.button.load", new Object[0])));
        this.M = this.b(new cwv(18, this.w / 2 - 4 - 150, 185, 50, 20, "MODE"));
        this.N = this.b(new cwv(19, this.w / 2 + 4 + 100, 120, 50, 20, bf.a("structure_block.button.detect_size", new Object[0])));
        this.O = this.b(new cwv(20, this.w / 2 + 4 + 100, 160, 50, 20, "ENTITIES"));
        this.P = this.b(new cwv(21, this.w / 2 - 20, 185, 40, 20, "MIRROR"));
        this.Q = this.b(new cwv(22, this.w / 2 + 4 + 100, 80, 50, 20, "SHOWAIR"));
        this.R = this.b(new cwv(23, this.w / 2 + 4 + 100, 80, 50, 20, "SHOWBB"));
        this.I = this.b(new cwv(11, this.w / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20, "0"));
        this.J = this.b(new cwv(12, this.w / 2 - 1 - 40 - 20, 185, 40, 20, "90"));
        this.K = this.b(new cwv(13, this.w / 2 + 1 + 20, 185, 40, 20, "180"));
        this.L = this.b(new cwv(14, this.w / 2 + 1 + 40 + 1 + 20, 185, 40, 20, "270"));
        this.i = new cld(2, this.B, this.w / 2 - 152, 40, 300, 20);
        this.i.f(64);
        this.i.a(this.b.c());
        this.S.add(this.i);
        cmz cmz2 = this.b.d();
        this.j = new cld(3, this.B, this.w / 2 - 152, 80, 80, 20);
        this.j.f(15);
        this.j.a(Integer.toString(cmz2.a()));
        this.S.add(this.j);
        this.k = new cld(4, this.B, this.w / 2 - 72, 80, 80, 20);
        this.k.f(15);
        this.k.a(Integer.toString(cmz2.b()));
        this.S.add(this.k);
        this.l = new cld(5, this.B, this.w / 2 + 8, 80, 80, 20);
        this.l.f(15);
        this.l.a(Integer.toString(cmz2.c()));
        this.S.add(this.l);
        cmz cmz3 = this.b.e();
        this.m = new cld(6, this.B, this.w / 2 - 152, 120, 80, 20);
        this.m.f(15);
        this.m.a(Integer.toString(cmz3.a()));
        this.S.add(this.m);
        this.r = new cld(7, this.B, this.w / 2 - 72, 120, 80, 20);
        this.r.f(15);
        this.r.a(Integer.toString(cmz3.b()));
        this.S.add(this.r);
        this.s = new cld(8, this.B, this.w / 2 + 8, 120, 80, 20);
        this.s.f(15);
        this.s.a(Integer.toString(cmz3.c()));
        this.S.add(this.s);
        this.t = new cld(15, this.B, this.w / 2 - 152, 120, 80, 20);
        this.t.f(15);
        this.t.a(this.T.format(this.b.l()));
        this.S.add(this.t);
        this.C = new cld(16, this.B, this.w / 2 - 72, 120, 80, 20);
        this.C.f(31);
        this.C.a(Long.toString(this.b.m()));
        this.S.add(this.C);
        this.D = new cld(17, this.B, this.w / 2 - 152, 120, 240, 20);
        this.D.f(128);
        this.D.a(this.b.h());
        this.S.add(this.D);
        this.c = this.b.f();
        this.j();
        this.d = this.b.g();
        this.q();
        this.e = this.b.i();
        this.r();
        this.f = this.b.k();
        this.f();
        this.g = this.b.t();
        this.h();
        this.h = this.b.u();
        this.i();
    }

    @Override
    public void aG_() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j == 1) {
            this.b.a(this.c);
            this.b.a(this.d);
            this.b.a(this.e);
            this.b.a(this.f);
            this.b.e(this.g);
            this.b.f(this.h);
            this.u.a((cjn)null);
        } else if (cwv2.j == 0) {
            if (this.b(1)) {
                this.u.a((cjn)null);
            }
        } else if (cwv2.j == 9) {
            if (this.b.i() == cfk.a) {
                this.b(2);
                this.u.a((cjn)null);
            }
        } else if (cwv2.j == 10) {
            if (this.b.i() == cfk.b) {
                this.b(3);
                this.u.a((cjn)null);
            }
        } else if (cwv2.j == 11) {
            this.b.a(ih.a);
            this.q();
        } else if (cwv2.j == 12) {
            this.b.a(ih.b);
            this.q();
        } else if (cwv2.j == 13) {
            this.b.a(ih.c);
            this.q();
        } else if (cwv2.j == 14) {
            this.b.a(ih.d);
            this.q();
        } else if (cwv2.j == 18) {
            this.b.j();
            this.r();
        } else if (cwv2.j == 19) {
            if (this.b.i() == cfk.a) {
                this.b(4);
                this.u.a((cjn)null);
            }
        } else if (cwv2.j == 20) {
            this.b.a(!this.b.k());
            this.f();
        } else if (cwv2.j == 22) {
            this.b.e(!this.b.t());
            this.h();
        } else if (cwv2.j == 23) {
            this.b.f(!this.b.u());
            this.i();
        } else if (cwv2.j == 21) {
            switch (this.b.f()) {
                case a: {
                    this.b.a(cdk.b);
                    break;
                }
                case b: {
                    this.b.a(cdk.c);
                    break;
                }
                case c: {
                    this.b.a(cdk.a);
                }
            }
            this.j();
        }
    }

    private void f() {
        boolean bl2 = !this.b.k();
        this.O.i = bl2 ? bf.a("options.on", new Object[0]) : bf.a("options.off", new Object[0]);
    }

    private void h() {
        boolean bl2 = this.b.t();
        this.Q.i = bl2 ? bf.a("options.on", new Object[0]) : bf.a("options.off", new Object[0]);
    }

    private void i() {
        boolean bl2 = this.b.u();
        this.R.i = bl2 ? bf.a("options.on", new Object[0]) : bf.a("options.off", new Object[0]);
    }

    private void j() {
        cdk cdk2 = this.b.f();
        switch (cdk2) {
            case a: {
                this.P.i = "|";
                break;
            }
            case b: {
                this.P.i = "< >";
                break;
            }
            case c: {
                this.P.i = "^ v";
            }
        }
    }

    private void q() {
        this.I.k = true;
        this.J.k = true;
        this.K.k = true;
        this.L.k = true;
        switch (this.b.g()) {
            case a: {
                this.I.k = false;
                break;
            }
            case c: {
                this.K.k = false;
                break;
            }
            case d: {
                this.L.k = false;
                break;
            }
            case b: {
                this.J.k = false;
            }
        }
    }

    private void r() {
        this.i.b(false);
        this.j.b(false);
        this.k.b(false);
        this.l.b(false);
        this.m.b(false);
        this.r.b(false);
        this.s.b(false);
        this.t.b(false);
        this.C.b(false);
        this.D.b(false);
        this.i.e(false);
        this.i.b(false);
        this.j.e(false);
        this.k.e(false);
        this.l.e(false);
        this.m.e(false);
        this.r.e(false);
        this.s.e(false);
        this.t.e(false);
        this.C.e(false);
        this.D.e(false);
        this.G.l = false;
        this.H.l = false;
        this.N.l = false;
        this.O.l = false;
        this.P.l = false;
        this.I.l = false;
        this.J.l = false;
        this.K.l = false;
        this.L.l = false;
        this.Q.l = false;
        this.R.l = false;
        switch (this.b.i()) {
            case a: {
                this.i.e(true);
                this.i.b(true);
                this.j.e(true);
                this.k.e(true);
                this.l.e(true);
                this.m.e(true);
                this.r.e(true);
                this.s.e(true);
                this.G.l = true;
                this.N.l = true;
                this.O.l = true;
                this.Q.l = true;
                break;
            }
            case b: {
                this.i.e(true);
                this.i.b(true);
                this.j.e(true);
                this.k.e(true);
                this.l.e(true);
                this.t.e(true);
                this.C.e(true);
                this.H.l = true;
                this.O.l = true;
                this.P.l = true;
                this.I.l = true;
                this.J.l = true;
                this.K.l = true;
                this.L.l = true;
                this.R.l = true;
                this.q();
                break;
            }
            case c: {
                this.i.e(true);
                this.i.b(true);
                break;
            }
            case d: {
                this.D.e(true);
                this.D.b(true);
            }
        }
        this.M.i = bf.a("structure_block.mode." + this.b.i().a(), new Object[0]);
    }

    private boolean b(int n2) {
        try {
            si si2 = new si(bi.a());
            this.b.a(si2);
            si2.B(n2);
            si2.a(this.b.i().toString());
            si2.a(this.i.b());
            si2.E(this.c(this.j.b()));
            si2.E(this.c(this.k.b()));
            si2.E(this.c(this.l.b()));
            si2.E(this.c(this.m.b()));
            si2.E(this.c(this.r.b()));
            si2.E(this.c(this.s.b()));
            si2.a(this.b.f().toString());
            si2.a(this.b.g().toString());
            si2.a(this.D.b());
            si2.a(this.b.k());
            si2.a(this.b.t());
            si2.a(this.b.u());
            si2.a(this.b(this.t.b()));
            si2.a(this.a(this.C.b()));
            this.u.x().a(new pm("MC|Struct", si2));
            return true;
        }
        catch (Exception exception) {
            a.f("Could not send structure block info", (Throwable)exception);
            return false;
        }
    }

    private long a(String string) {
        try {
            return Long.valueOf(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0L;
        }
    }

    private float b(String string) {
        try {
            return Float.valueOf(string).floatValue();
        }
        catch (NumberFormatException numberFormatException) {
            return 1.0f;
        }
    }

    private int c(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (this.i.n() && bdz.a(c2)) {
            this.i.a(c2, n2);
        }
        if (this.j.n()) {
            this.j.a(c2, n2);
        }
        if (this.k.n()) {
            this.k.a(c2, n2);
        }
        if (this.l.n()) {
            this.l.a(c2, n2);
        }
        if (this.m.n()) {
            this.m.a(c2, n2);
        }
        if (this.r.n()) {
            this.r.a(c2, n2);
        }
        if (this.s.n()) {
            this.s.a(c2, n2);
        }
        if (this.t.n()) {
            this.t.a(c2, n2);
        }
        if (this.C.n()) {
            this.C.a(c2, n2);
        }
        if (this.D.n()) {
            this.D.a(c2, n2);
        }
        if (n2 == 15) {
            cld cld2 = null;
            cld cld3 = null;
            for (cld cld4 : this.S) {
                if (cld2 != null && cld4.n()) {
                    cld3 = cld4;
                    break;
                }
                if (!cld4.k() || !cld4.n()) continue;
                cld2 = cld4;
            }
            if (cld2 != null && cld3 == null) {
                for (cld cld4 : this.S) {
                    if (!cld4.n() || cld4 == cld2) continue;
                    cld3 = cld4;
                    break;
                }
            }
            if (cld3 != null && cld3 != cld2) {
                cld2.b(false);
                cld3.b(true);
            }
        }
        if (n2 == 28 || n2 == 156) {
            this.a(this.E);
        } else if (n2 == 1) {
            this.a(this.F);
        }
    }

    private static boolean a(char c2) {
        boolean bl2 = true;
        for (char c3 : ate.b) {
            if (c3 != c2) continue;
            bl2 = false;
            break;
        }
        return bl2;
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        if (this.i.n()) {
            this.i.a(n2, n3, n4);
        }
        if (this.j.n()) {
            this.j.a(n2, n3, n4);
        }
        if (this.k.n()) {
            this.k.a(n2, n3, n4);
        }
        if (this.l.n()) {
            this.l.a(n2, n3, n4);
        }
        if (this.m.n()) {
            this.m.a(n2, n3, n4);
        }
        if (this.r.n()) {
            this.r.a(n2, n3, n4);
        }
        if (this.s.n()) {
            this.s.a(n2, n3, n4);
        }
        if (this.t.n()) {
            this.t.a(n2, n3, n4);
        }
        if (this.C.n()) {
            this.C.a(n2, n3, n4);
        }
        if (this.D.n()) {
            this.D.a(n2, n3, n4);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        int n4;
        String string;
        this.aH_();
        cfk cfk2 = this.b.i();
        this.a(this.B, bf.a("tile.structureBlock.name", new Object[0]), this.w / 2, 10, 0xFFFFFF);
        if (cfk2 != cfk.d) {
            this.b(this.B, bf.a("structure_block.structure_name", new Object[0]), this.w / 2 - 153, 30, 0xA0A0A0);
            this.i.g();
        }
        if (cfk2 == cfk.b || cfk2 == cfk.a) {
            this.b(this.B, bf.a("structure_block.position", new Object[0]), this.w / 2 - 153, 70, 0xA0A0A0);
            this.j.g();
            this.k.g();
            this.l.g();
            string = bf.a("structure_block.include_entities", new Object[0]);
            n4 = this.B.a(string);
            this.b(this.B, string, this.w / 2 + 154 - n4, 150, 0xA0A0A0);
        }
        if (cfk2 == cfk.a) {
            this.b(this.B, bf.a("structure_block.size", new Object[0]), this.w / 2 - 153, 110, 0xA0A0A0);
            this.m.g();
            this.r.g();
            this.s.g();
            string = bf.a("structure_block.detect_size", new Object[0]);
            n4 = this.B.a(string);
            this.b(this.B, string, this.w / 2 + 154 - n4, 110, 0xA0A0A0);
            String string2 = bf.a("structure_block.show_air", new Object[0]);
            int n5 = this.B.a(string2);
            this.b(this.B, string2, this.w / 2 + 154 - n5, 70, 0xA0A0A0);
        }
        if (cfk2 == cfk.b) {
            this.b(this.B, bf.a("structure_block.integrity", new Object[0]), this.w / 2 - 153, 110, 0xA0A0A0);
            this.t.g();
            this.C.g();
            string = bf.a("structure_block.show_boundingbox", new Object[0]);
            n4 = this.B.a(string);
            this.b(this.B, string, this.w / 2 + 154 - n4, 70, 0xA0A0A0);
        }
        if (cfk2 == cfk.d) {
            this.b(this.B, bf.a("structure_block.custom_data", new Object[0]), this.w / 2 - 153, 110, 0xA0A0A0);
            this.D.g();
        }
        string = "structure_block.mode_info." + cfk2.a();
        this.b(this.B, bf.a(string, new Object[0]), this.w / 2 - 153, 174, 0xA0A0A0);
        super.a(n2, n3, f2);
    }

    @Override
    public boolean q_() {
        return false;
    }
}

