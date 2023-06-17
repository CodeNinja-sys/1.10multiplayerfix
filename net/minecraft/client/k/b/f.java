/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import com.a.a.d.ov;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.f.u;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.dn;
import net.minecraft.f.ab;
import net.minecraft.f.r;
import net.minecraft.u.b.b;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.x.a;
import net.minecraft.x.d.a.j;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;

public class f
extends cc {
    private static final d a = org.apache.logging.log4j.c.c();
    private final ab b;
    private bi c = bi.a;
    private bq d = bq.a;
    private r e = net.minecraft.f.r.d;
    private boolean f;
    private boolean g;
    private boolean h;
    private dn i;
    private dn j;
    private dn k;
    private dn l;
    private dn m;
    private dn v;
    private dn w;
    private dn x;
    private dn C;
    private dn D;
    private ch E;
    private ch F;
    private ch G;
    private ch H;
    private ch I;
    private ch J;
    private ch K;
    private ch L;
    private ch M;
    private ch N;
    private ch O;
    private ch P;
    private ch Q;
    private ch R;
    private final List S = ov.a();
    private final DecimalFormat T = new DecimalFormat("0.0###");

    public f(ab ab2) {
        this.b = ab2;
        this.T.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
    }

    @Override
    public void bY_() {
        this.i.a();
        this.j.a();
        this.k.a();
        this.l.a();
        this.m.a();
        this.v.a();
        this.w.a();
        this.x.a();
        this.C.a();
        this.D.a();
    }

    @Override
    public void ct_() {
        org.lwjgl.a.g.a(true);
        this.r.clear();
        this.E = this.b(new ch(0, this.p / 2 - 4 - 150, 210, 150, 20, net.minecraft.client.f.u.a("gui.done", new Object[0])));
        this.F = this.b(new ch(1, this.p / 2 + 4, 210, 150, 20, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        this.G = this.b(new ch(9, this.p / 2 + 4 + 100, 185, 50, 20, net.minecraft.client.f.u.a("structure_block.button.save", new Object[0])));
        this.H = this.b(new ch(10, this.p / 2 + 4 + 100, 185, 50, 20, net.minecraft.client.f.u.a("structure_block.button.load", new Object[0])));
        this.M = this.b(new ch(18, this.p / 2 - 4 - 150, 185, 50, 20, "MODE"));
        this.N = this.b(new ch(19, this.p / 2 + 4 + 100, 120, 50, 20, net.minecraft.client.f.u.a("structure_block.button.detect_size", new Object[0])));
        this.O = this.b(new ch(20, this.p / 2 + 4 + 100, 160, 50, 20, "ENTITIES"));
        this.P = this.b(new ch(21, this.p / 2 - 20, 185, 40, 20, "MIRROR"));
        this.Q = this.b(new ch(22, this.p / 2 + 4 + 100, 80, 50, 20, "SHOWAIR"));
        this.R = this.b(new ch(23, this.p / 2 + 4 + 100, 80, 50, 20, "SHOWBB"));
        this.I = this.b(new ch(11, this.p / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20, "0"));
        this.J = this.b(new ch(12, this.p / 2 - 1 - 40 - 20, 185, 40, 20, "90"));
        this.K = this.b(new ch(13, this.p / 2 + 1 + 20, 185, 40, 20, "180"));
        this.L = this.b(new ch(14, this.p / 2 + 1 + 40 + 1 + 20, 185, 40, 20, "270"));
        this.i = new dn(2, this.u, this.p / 2 - 152, 40, 300, 20);
        this.i.f(64);
        this.i.a(this.b.b());
        this.S.add(this.i);
        b b2 = this.b.g();
        this.j = new dn(3, this.u, this.p / 2 - 152, 80, 80, 20);
        this.j.f(15);
        this.j.a(Integer.toString(b2.cy_()));
        this.S.add(this.j);
        this.k = new dn(4, this.u, this.p / 2 - 72, 80, 80, 20);
        this.k.f(15);
        this.k.a(Integer.toString(b2.k()));
        this.S.add(this.k);
        this.l = new dn(5, this.u, this.p / 2 + 8, 80, 80, 20);
        this.l.f(15);
        this.l.a(Integer.toString(b2.l()));
        this.S.add(this.l);
        b b3 = this.b.h();
        this.m = new dn(6, this.u, this.p / 2 - 152, 120, 80, 20);
        this.m.f(15);
        this.m.a(Integer.toString(b3.cy_()));
        this.S.add(this.m);
        this.v = new dn(7, this.u, this.p / 2 - 72, 120, 80, 20);
        this.v.f(15);
        this.v.a(Integer.toString(b3.k()));
        this.S.add(this.v);
        this.w = new dn(8, this.u, this.p / 2 + 8, 120, 80, 20);
        this.w.f(15);
        this.w.a(Integer.toString(b3.l()));
        this.S.add(this.w);
        this.x = new dn(15, this.u, this.p / 2 - 152, 120, 80, 20);
        this.x.f(15);
        this.x.a(this.T.format(this.b.q()));
        this.S.add(this.x);
        this.C = new dn(16, this.u, this.p / 2 - 72, 120, 80, 20);
        this.C.f(31);
        this.C.a(Long.toString(this.b.r()));
        this.S.add(this.C);
        this.D = new dn(17, this.u, this.p / 2 - 152, 120, 240, 20);
        this.D.f(128);
        this.D.a(this.b.k());
        this.S.add(this.D);
        this.c = this.b.i();
        this.s();
        this.d = this.b.j();
        this.t();
        this.e = this.b.n();
        this.u();
        this.f = this.b.p();
        this.i();
        this.g = this.b.y();
        this.q();
        this.h = this.b.z();
        this.r();
    }

    @Override
    public void cs_() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j == 1) {
                this.b.b(this.c);
                this.b.b(this.d);
                this.b.a(this.e);
                this.b.a(this.f);
                this.b.e(this.g);
                this.b.f(this.h);
                this.n.a((cc)null);
            } else if (ch2.j == 0) {
                if (this.a(1)) {
                    this.n.a((cc)null);
                }
            } else if (ch2.j == 9) {
                if (this.b.n() == net.minecraft.f.r.a) {
                    this.a(2);
                    this.n.a((cc)null);
                }
            } else if (ch2.j == 10) {
                if (this.b.n() == net.minecraft.f.r.b) {
                    this.a(3);
                    this.n.a((cc)null);
                }
            } else if (ch2.j == 11) {
                this.b.b(bq.a);
                this.t();
            } else if (ch2.j == 12) {
                this.b.b(bq.b);
                this.t();
            } else if (ch2.j == 13) {
                this.b.b(bq.c);
                this.t();
            } else if (ch2.j == 14) {
                this.b.b(bq.d);
                this.t();
            } else if (ch2.j == 18) {
                this.b.o();
                this.u();
            } else if (ch2.j == 19) {
                if (this.b.n() == net.minecraft.f.r.a) {
                    this.a(4);
                    this.n.a((cc)null);
                }
            } else if (ch2.j == 20) {
                this.b.a(!this.b.p());
                this.i();
            } else if (ch2.j == 22) {
                this.b.e(!this.b.y());
                this.q();
            } else if (ch2.j == 23) {
                this.b.f(!this.b.z());
                this.r();
            } else if (ch2.j == 21) {
                switch (this.b.i()) {
                    case a: {
                        this.b.b(bi.b);
                        break;
                    }
                    case b: {
                        this.b.b(bi.c);
                        break;
                    }
                    case c: {
                        this.b.b(bi.a);
                    }
                }
                this.s();
            }
        }
    }

    private void i() {
        boolean bl2 = !this.b.p();
        this.O.i = bl2 ? net.minecraft.client.f.u.a("options.on", new Object[0]) : net.minecraft.client.f.u.a("options.off", new Object[0]);
    }

    private void q() {
        boolean bl2 = this.b.y();
        this.Q.i = bl2 ? net.minecraft.client.f.u.a("options.on", new Object[0]) : net.minecraft.client.f.u.a("options.off", new Object[0]);
    }

    private void r() {
        boolean bl2 = this.b.z();
        this.R.i = bl2 ? net.minecraft.client.f.u.a("options.on", new Object[0]) : net.minecraft.client.f.u.a("options.off", new Object[0]);
    }

    private void s() {
        bi bi2 = this.b.i();
        switch (bi2) {
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

    private void t() {
        this.I.k = true;
        this.J.k = true;
        this.K.k = true;
        this.L.k = true;
        switch (this.b.j()) {
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

    private void u() {
        this.i.b(false);
        this.j.b(false);
        this.k.b(false);
        this.l.b(false);
        this.m.b(false);
        this.v.b(false);
        this.w.b(false);
        this.x.b(false);
        this.C.b(false);
        this.D.b(false);
        this.i.e(false);
        this.i.b(false);
        this.j.e(false);
        this.k.e(false);
        this.l.e(false);
        this.m.e(false);
        this.v.e(false);
        this.w.e(false);
        this.x.e(false);
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
        switch (this.b.n()) {
            case a: {
                this.i.e(true);
                this.i.b(true);
                this.j.e(true);
                this.k.e(true);
                this.l.e(true);
                this.m.e(true);
                this.v.e(true);
                this.w.e(true);
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
                this.x.e(true);
                this.C.e(true);
                this.H.l = true;
                this.O.l = true;
                this.P.l = true;
                this.I.l = true;
                this.J.l = true;
                this.K.l = true;
                this.L.l = true;
                this.R.l = true;
                this.t();
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
        this.M.i = net.minecraft.client.f.u.a("structure_block.mode." + this.b.n().a(), new Object[0]);
    }

    private boolean a(int n2) {
        try {
            a a2 = new a(io.netty.b.bi.a());
            this.b.a(a2);
            a2.B(n2);
            a2.a(this.b.n().toString());
            a2.a(this.i.b());
            a2.E(this.c(this.j.b()));
            a2.E(this.c(this.k.b()));
            a2.E(this.c(this.l.b()));
            a2.E(this.c(this.m.b()));
            a2.E(this.c(this.v.b()));
            a2.E(this.c(this.w.b()));
            a2.a(this.b.i().toString());
            a2.a(this.b.j().toString());
            a2.a(this.D.b());
            a2.a(this.b.p());
            a2.a(this.b.y());
            a2.a(this.b.z());
            a2.a(this.b(this.x.b()));
            a2.a(this.a(this.C.b()));
            this.n.v().a(new j("MC|Struct", a2));
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
        if (this.i.n() && net.minecraft.client.k.b.f.a(c2)) {
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
        if (this.v.n()) {
            this.v.a(c2, n2);
        }
        if (this.w.n()) {
            this.w.a(c2, n2);
        }
        if (this.x.n()) {
            this.x.a(c2, n2);
        }
        if (this.C.n()) {
            this.C.a(c2, n2);
        }
        if (this.D.n()) {
            this.D.a(c2, n2);
        }
        if (n2 == 15) {
            dn dn2 = null;
            dn dn3 = null;
            for (dn dn4 : this.S) {
                if (dn2 != null && dn4.n()) {
                    dn3 = dn4;
                    break;
                }
                if (!dn4.k() || !dn4.n()) continue;
                dn2 = dn4;
            }
            if (dn2 != null && dn3 == null) {
                for (dn dn4 : this.S) {
                    if (!dn4.n() || dn4 == dn2) continue;
                    dn3 = dn4;
                    break;
                }
            }
            if (dn3 != null && dn3 != dn2) {
                dn2.b(false);
                dn3.b(true);
            }
        }
        if (n2 != 28 && n2 != 156) {
            if (n2 == 1) {
                this.a(this.F);
            }
        } else {
            this.a(this.E);
        }
    }

    private static boolean a(char c2) {
        boolean bl2 = true;
        char[] arrc = net.minecraft.u.d.b;
        int n2 = net.minecraft.u.d.b.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c3 = arrc[i2];
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
        if (this.v.n()) {
            this.v.a(n2, n3, n4);
        }
        if (this.w.n()) {
            this.w.a(n2, n3, n4);
        }
        if (this.x.n()) {
            this.x.a(n2, n3, n4);
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
        this.m();
        r r2 = this.b.n();
        this.a(this.u, net.minecraft.client.f.u.a("tile.structureBlock.name", new Object[0]), this.p / 2, 10, 0xFFFFFF);
        if (r2 != net.minecraft.f.r.d) {
            this.b(this.u, net.minecraft.client.f.u.a("structure_block.structure_name", new Object[0]), this.p / 2 - 153, 30, 0xA0A0A0);
            this.i.g();
        }
        if (r2 == net.minecraft.f.r.b || r2 == net.minecraft.f.r.a) {
            this.b(this.u, net.minecraft.client.f.u.a("structure_block.position", new Object[0]), this.p / 2 - 153, 70, 0xA0A0A0);
            this.j.g();
            this.k.g();
            this.l.g();
            string = net.minecraft.client.f.u.a("structure_block.include_entities", new Object[0]);
            n4 = this.u.a(string);
            this.b(this.u, string, this.p / 2 + 154 - n4, 150, 0xA0A0A0);
        }
        if (r2 == net.minecraft.f.r.a) {
            this.b(this.u, net.minecraft.client.f.u.a("structure_block.size", new Object[0]), this.p / 2 - 153, 110, 0xA0A0A0);
            this.m.g();
            this.v.g();
            this.w.g();
            string = net.minecraft.client.f.u.a("structure_block.detect_size", new Object[0]);
            n4 = this.u.a(string);
            this.b(this.u, string, this.p / 2 + 154 - n4, 110, 0xA0A0A0);
            String string2 = net.minecraft.client.f.u.a("structure_block.show_air", new Object[0]);
            int n5 = this.u.a(string2);
            this.b(this.u, string2, this.p / 2 + 154 - n5, 70, 0xA0A0A0);
        }
        if (r2 == net.minecraft.f.r.b) {
            this.b(this.u, net.minecraft.client.f.u.a("structure_block.integrity", new Object[0]), this.p / 2 - 153, 110, 0xA0A0A0);
            this.x.g();
            this.C.g();
            string = net.minecraft.client.f.u.a("structure_block.show_boundingbox", new Object[0]);
            n4 = this.u.a(string);
            this.b(this.u, string, this.p / 2 + 154 - n4, 70, 0xA0A0A0);
        }
        if (r2 == net.minecraft.f.r.d) {
            this.b(this.u, net.minecraft.client.f.u.a("structure_block.custom_data", new Object[0]), this.p / 2 - 153, 110, 0xA0A0A0);
            this.D.g();
        }
        string = "structure_block.mode_info." + r2.a();
        this.b(this.u, net.minecraft.client.f.u.a(string, new Object[0]), this.p / 2 - 153, 174, 0xA0A0A0);
        super.a(n2, n3, f2);
    }

    @Override
    public boolean cq_() {
        return false;
    }
}

