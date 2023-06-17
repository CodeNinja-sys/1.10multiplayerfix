/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.b.dg;
import com.a.a.d.ov;
import java.util.List;
import java.util.Random;
import net.minecraft.client.f.u;
import net.minecraft.client.i.a;
import net.minecraft.client.i.j;
import net.minecraft.client.i.n;
import net.minecraft.client.k.at;
import net.minecraft.client.k.ax;
import net.minecraft.client.k.bd;
import net.minecraft.client.k.be;
import net.minecraft.client.k.bo;
import net.minecraft.client.k.bu;
import net.minecraft.client.k.bw;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cw;
import net.minecraft.client.k.dl;
import net.minecraft.client.l.l;
import net.minecraft.client.l.p;
import net.minecraft.client.r;
import net.minecraft.q.a.w;
import net.minecraft.q.ab;
import net.minecraft.q.aj;
import org.apache.commons.c.am;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;

public class ai
extends cc
implements bu {
    private static final d a = org.apache.logging.log4j.c.c();
    private final net.minecraft.client.l.c b = new net.minecraft.client.l.c();
    private final cc c;
    private bd d;
    private j e;
    private ch f;
    private ch g;
    private ch h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private String m;
    private a v;
    private l w;
    private p x;
    private boolean C;
    private static final String[] D = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};

    public ai(cc cc2) {
        this.c = cc2;
    }

    @Override
    public void ct_() {
        org.lwjgl.a.g.a(true);
        this.r.clear();
        if (this.C) {
            this.d.a(this.p, this.q, 32, this.q - 64);
        } else {
            this.C = true;
            this.e = new j(this.n);
            this.e.a();
            this.w = new l();
            try {
                this.x = new p(this.w);
                this.x.start();
            }
            catch (Exception exception) {
                a.f("Unable to start LAN server detection: {}", exception.getMessage());
            }
            this.d = new bd(this, this.n, this.p, this.q, 32, this.q - 64, 36);
            this.d.a(this.e);
        }
        this.f();
    }

    @Override
    public void cp_() {
        super.cp_();
        this.d.cr_();
    }

    public void f() {
        this.f = this.b(new ch(7, this.p / 2 - 154, this.q - 28, 70, 20, net.minecraft.client.f.u.a("selectServer.edit", new Object[0])));
        this.h = this.b(new ch(2, this.p / 2 - 74, this.q - 28, 70, 20, net.minecraft.client.f.u.a("selectServer.delete", new Object[0])));
        this.g = this.b(new ch(1, this.p / 2 - 154, this.q - 52, 100, 20, net.minecraft.client.f.u.a("selectServer.select", new Object[0])));
        this.r.add(new ch(4, this.p / 2 - 50, this.q - 52, 100, 20, net.minecraft.client.f.u.a("selectServer.direct", new Object[0])));
        this.r.add(new ch(3, this.p / 2 + 4 + 50, this.q - 52, 100, 20, net.minecraft.client.f.u.a("selectServer.add", new Object[0])));
        this.r.add(new ch(8, this.p / 2 + 4, this.q - 28, 70, 20, net.minecraft.client.f.u.a("selectServer.refresh", new Object[0])));
        this.r.add(new ch(0, this.p / 2 + 4 + 76, this.q - 28, 75, 20, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        this.a(this.d.b());
    }

    @Override
    public void bY_() {
        super.bY_();
        if (this.w.a()) {
            List list = this.w.c();
            this.w.b();
            this.d.a(list);
        }
        this.b.a();
    }

    @Override
    public void cs_() {
        org.lwjgl.a.g.a(false);
        if (this.x != null) {
            this.x.interrupt();
            this.x = null;
        }
        this.b.b();
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            bo bo2;
            bo bo3 = bo2 = this.d.b() < 0 ? null : this.d.e(this.d.b());
            if (ch2.j == 2 && bo2 instanceof bw) {
                String string = ((bw)bo2).a().a;
                if (string != null) {
                    this.i = true;
                    String string2 = net.minecraft.client.f.u.a("selectServer.deleteQuestion", new Object[0]);
                    String string3 = "'" + string + "' " + net.minecraft.client.f.u.a("selectServer.deleteWarning", new Object[0]);
                    String string4 = net.minecraft.client.f.u.a("selectServer.deleteButton", new Object[0]);
                    String string5 = net.minecraft.client.f.u.a("gui.cancel", new Object[0]);
                    at at2 = new at(this, string2, string3, string4, string5, this.d.b());
                    this.n.a(at2);
                }
            } else if (ch2.j == 1) {
                this.g();
            } else if (ch2.j == 4) {
                this.l = true;
                this.v = new a(net.minecraft.client.f.u.a("selectServer.defaultName", new Object[0]), "", false);
                this.n.a(new dl(this, this.v));
            } else if (ch2.j == 3) {
                this.j = true;
                this.v = new a(net.minecraft.client.f.u.a("selectServer.defaultName", new Object[0]), "", false);
                this.n.a(new ax(this, this.v));
            } else if (ch2.j == 7 && bo2 instanceof bw) {
                this.k = true;
                a a2 = ((bw)bo2).a();
                this.v = new a(a2.a, a2.b, false);
                this.v.a(a2);
                this.n.a(new ax(this, this.v));
            } else if (ch2.j == 0) {
                this.n.a(this.c);
            } else if (ch2.j == 8) {
                this.q();
            }
        }
    }

    private void q() {
        this.n.a(new ai(this.c));
    }

    @Override
    public void a(boolean bl2, int n2) {
        bo bo2;
        bo bo3 = bo2 = this.d.b() < 0 ? null : this.d.e(this.d.b());
        if (this.i) {
            this.i = false;
            if (bl2 && bo2 instanceof bw) {
                this.e.b(this.d.b());
                this.e.b();
                this.d.b(-1);
                this.d.a(this.e);
            }
            this.n.a(this);
        } else if (this.l) {
            this.l = false;
            if (bl2) {
                this.a(this.v);
            } else {
                this.n.a(this);
            }
        } else if (this.j) {
            this.j = false;
            if (bl2) {
                this.e.a(this.v);
                this.e.b();
                this.d.b(-1);
                this.d.a(this.e);
            }
            this.n.a(this);
        } else if (this.k) {
            this.k = false;
            if (bl2 && bo2 instanceof bw) {
                a a2 = ((bw)bo2).a();
                a2.a = this.v.a;
                a2.b = this.v.b;
                a2.a(this.v);
                this.e.b();
                this.d.a(this.e);
            }
            this.n.a(this);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        bo bo2;
        int n3 = this.d.b();
        bo bo3 = bo2 = n3 < 0 ? null : this.d.e(n3);
        if (n2 == 63) {
            this.q();
        } else if (n3 >= 0) {
            if (n2 == 200) {
                if (ai.o()) {
                    if (n3 > 0 && bo2 instanceof bw) {
                        this.e.a(n3, n3 - 1);
                        this.a(this.d.b() - 1);
                        this.d.g(-this.d.o());
                        this.d.a(this.e);
                    }
                } else if (n3 > 0) {
                    this.a(this.d.b() - 1);
                    this.d.g(-this.d.o());
                    if (this.d.e(this.d.b()) instanceof be) {
                        if (this.d.b() > 0) {
                            this.a(this.d.a() - 1);
                            this.d.g(-this.d.o());
                        } else {
                            this.a(-1);
                        }
                    }
                } else {
                    this.a(-1);
                }
            } else if (n2 == 208) {
                if (ai.o()) {
                    if (n3 < this.e.c() - 1) {
                        this.e.a(n3, n3 + 1);
                        this.a(n3 + 1);
                        this.d.g(this.d.o());
                        this.d.a(this.e);
                    }
                } else if (n3 < this.d.a()) {
                    this.a(this.d.b() + 1);
                    this.d.g(this.d.o());
                    if (this.d.e(this.d.b()) instanceof be) {
                        if (this.d.b() < this.d.a() - 1) {
                            this.a(this.d.a() + 1);
                            this.d.g(this.d.o());
                        } else {
                            this.a(-1);
                        }
                    }
                } else {
                    this.a(-1);
                }
            } else if (n2 != 28 && n2 != 156) {
                super.a(c2, n2);
            } else {
                this.a((ch)this.r.get(2));
            }
        } else {
            super.a(c2, n2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m = null;
        this.m();
        this.d.a(n2, n3, f2);
        this.a(this.u, net.minecraft.client.f.u.a("multiplayer.title", new Object[0]), this.p / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
        if (this.m != null) {
            this.a(ov.a(dg.a("\n").a(this.m)), n2, n3);
        }
    }

    public void g() {
        bo bo2;
        bo bo3 = bo2 = this.d.b() < 0 ? null : this.d.e(this.d.b());
        if (bo2 instanceof bw) {
            this.a(((bw)bo2).a());
        } else {
            boolean cfr_ignored_0 = bo2 instanceof cw;
        }
    }

    private void a(a a2) {
        Random random = new Random();
        if (random.nextDouble() < 1.0) {
            if (!net.minecraft.client.r.I.i()) {
                this.r();
            }
        } else {
            this.n.a(new n(this, this.n, a2));
        }
    }

    private void r() {
        this.n.a((cc)null);
        long l2 = new Random().nextLong();
        String string = Integer.toString(new Random().nextInt(100000));
        if (!am.a((CharSequence)string)) {
            try {
                long l3 = Long.parseLong(string);
                if (l3 != 0L) {
                    l2 = l3;
                }
            }
            catch (NumberFormatException numberFormatException) {
                l2 = string.hashCode();
            }
        }
        aj aj2 = new aj(l2, net.minecraft.q.am.a("survival"), true, false, ab.a[0]);
        aj2.a("");
        String string2 = "New World";
        char[] arrc = net.minecraft.u.d.c;
        int n2 = net.minecraft.u.d.c.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = arrc[i2];
            string2 = string2.replace(c2, '_');
        }
        if (am.a((CharSequence)string2)) {
            string2 = "World";
        }
        string2 = ai.a(this.n.g(), string2);
        this.n.a(string2, "564C4C527320576F726C64", aj2);
    }

    public static String a(w w2, String string) {
        string = string.replaceAll("[\\./\"]", "_");
        String[] arrstring = D;
        int n2 = D.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = arrstring[i2];
            if (!string.equalsIgnoreCase(string2)) continue;
            string = "_" + string + "_";
        }
        while (w2.a(string) != null) {
            string = String.valueOf(string) + "-";
        }
        return string;
    }

    public void a(int n2) {
        this.d.b(n2);
        bo bo2 = n2 < 0 ? null : this.d.e(n2);
        this.g.k = false;
        this.f.k = false;
        this.h.k = false;
        if (bo2 != null && !(bo2 instanceof be)) {
            this.g.k = true;
            if (bo2 instanceof bw) {
                this.f.k = true;
                this.h.k = true;
            }
        }
    }

    public net.minecraft.client.l.c h() {
        return this.b;
    }

    public void a(String string) {
        this.m = string;
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.d.a(n2, n3, n4);
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
        this.d.c(n2, n3, n4);
    }

    public j i() {
        return this.e;
    }

    public boolean a(bw bw2, int n2) {
        return n2 > 0;
    }

    public boolean b(bw bw2, int n2) {
        return n2 < this.e.c() - 1;
    }

    public void a(bw bw2, int n2, boolean bl2) {
        int n3 = bl2 ? 0 : n2 - 1;
        this.e.a(n2, n3);
        if (this.d.b() == n2) {
            this.a(n3);
        }
        this.d.a(this.e);
    }

    public void b(bw bw2, int n2, boolean bl2) {
        int n3 = bl2 ? this.e.c() - 1 : n2 + 1;
        this.e.a(n2, n3);
        if (this.d.b() == n2) {
            this.a(n3);
        }
        this.d.a(this.e);
    }
}

