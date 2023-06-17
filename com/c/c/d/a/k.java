/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.b.a;
import com.c.c.b.ab;
import com.c.c.b.i;
import com.c.c.c.b;
import com.c.c.d.a.aa;
import com.c.c.d.a.ac;
import com.c.c.d.a.ad;
import com.c.c.d.a.ae;
import com.c.c.d.a.l;
import com.c.c.d.a.m;
import com.c.c.d.a.n;
import com.c.c.d.a.s;
import com.c.c.d.a.x;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import net.minecraft.s.f;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;

public class k
extends net.minecraft.s.n {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final String b = "realms:textures/gui/realms/plus_icon.png";
    private static final String c = "realms:textures/gui/realms/restore_icon.png";
    private static int d = -1;
    private final s e;
    private List s = Collections.emptyList();
    private String t = null;
    private m u;
    private int v = -1;
    private static final int w = 0;
    private static final int x = 1;
    private static final int y = 2;
    private int z;
    private f A;
    private Boolean B = false;
    private i C;
    private static final String D = "Uploaded";

    public k(s s2, i i2, int n2) {
        this.e = s2;
        this.C = i2;
        this.z = n2;
    }

    @Override
    public void a() {
        super.a();
        this.u.h();
    }

    @Override
    public void d() {
        org.lwjgl.a.g.a(true);
        this.u();
        this.u = new m(this);
        if (d != -1) {
            this.u.b(d);
        }
        new l(this, "Realms-fetch-backups").start();
        this.e();
    }

    private void c() {
        if (this.s.size() <= 1) {
            return;
        }
        for (int i2 = 0; i2 < this.s.size() - 1; ++i2) {
            a a2 = (a)this.s.get(i2);
            a a3 = (a)this.s.get(i2 + 1);
            if (a2.d.isEmpty() || a3.d.isEmpty()) continue;
            for (String string : a2.d.keySet()) {
                if (!string.contains(D) && a3.d.containsKey(string)) {
                    if (((String)a2.d.get(string)).equals(a3.d.get(string))) continue;
                    this.a(a2, string);
                    continue;
                }
                this.a(a2, string);
            }
        }
    }

    private void a(a a2, String string) {
        if (string.contains(D)) {
            String string2 = DateFormat.getDateTimeInstance(3, 3).format(a2.b);
            a2.e.put(string, string2);
            a2.a(true);
        } else {
            a2.e.put(string, a2.d.get(string));
        }
    }

    private void e() {
        this.A = com.c.c.d.a.k.a(2, this.r() - 135, 32, 120, 20, com.c.c.d.a.k.f("mco.backup.button.download"));
        this.b(this.A);
        this.b(com.c.c.d.a.k.a(0, this.r() - 100, this.s() - 35, 85, 20, com.c.c.d.a.k.f("gui.back")));
    }

    @Override
    public void g() {
        super.g();
    }

    @Override
    public void a(f f2) {
        if (!f2.d()) {
            return;
        }
        if (f2.c() == 0) {
            net.minecraft.s.b.a(this.e);
        } else if (f2.c() == 2) {
            this.f();
        }
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            net.minecraft.s.b.a(this.e);
        }
    }

    private void b(int n2) {
        if (n2 >= 0 && n2 < this.s.size() && !this.C.k) {
            this.v = n2;
            Date date = ((a)this.s.get((int)n2)).b;
            String string = DateFormat.getDateTimeInstance(3, 3).format(date);
            String string2 = com.c.c.e.s.a(System.currentTimeMillis() - date.getTime());
            String string3 = com.c.c.d.a.k.a("mco.configure.world.restore.question.line1", string, string2);
            String string4 = com.c.c.d.a.k.f("mco.configure.world.restore.question.line2");
            net.minecraft.s.b.a(new ac(this, ad.a, string3, string4, true, 1));
        }
    }

    private void f() {
        String string = com.c.c.d.a.k.f("mco.configure.world.restore.download.question.line1");
        String string2 = com.c.c.d.a.k.f("mco.configure.world.restore.download.question.line2");
        net.minecraft.s.b.a(new ac(this, ad.b, string, string2, true, 2));
    }

    private void i() {
        com.c.c.a.m m2 = com.c.c.a.m.a();
        try {
            ab ab2 = m2.b(this.C.a, this.z);
            net.minecraft.s.b.a(new x(this, ab2, this.C.c + " (" + ((com.c.c.b.s)this.C.i.get(this.C.o)).a(this.C.o) + ")"));
        }
        catch (b b2) {
            a.b("Couldn't download world data");
            net.minecraft.s.b.a(new aa(b2, (net.minecraft.s.n)this));
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (bl2 && n2 == 1) {
            this.j();
        } else if (bl2 && n2 == 2) {
            this.i();
        } else {
            net.minecraft.s.b.a(this);
        }
    }

    private void j() {
        a a2 = (a)this.s.get(this.v);
        n n2 = new n(this, a2, null);
        ae ae2 = new ae(this.e.c(), n2);
        ae2.b();
        net.minecraft.s.b.a(ae2);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.t = null;
        this.p();
        this.u.a(n2, n3, f2);
        this.a(com.c.c.d.a.k.f("mco.configure.world.backup"), this.r() / 2, 12, 0xFFFFFF);
        this.b(com.c.c.d.a.k.f("mco.configure.world.backup"), (this.r() - 150) / 2 - 90, 20, 0xA0A0A0);
        if (this.B.booleanValue()) {
            this.b(com.c.c.d.a.k.f("mco.backup.nobackups"), 20, this.s() / 2 - 10, 0xFFFFFF);
        }
        this.A.b(this.B == false);
        super.a(n2, n3, f2);
        if (this.t != null) {
            this.a(this.t, n2, n3);
        }
    }

    protected void a(String string, int n2, int n3) {
        if (string == null) {
            return;
        }
        int n4 = n2 + 12;
        int n5 = n3 - 12;
        int n6 = this.e(string);
        this.b(n4 - 3, n5 - 3, n4 + n6 + 3, n5 + 8 + 3, -1073741824, -1073741824);
        this.c(string, n4, n5, 0xFFFFFF);
    }

    static /* synthetic */ List a(k k2, List list) {
        k2.s = list;
        return k2.s;
    }

    static /* synthetic */ i a(k k2) {
        return k2.C;
    }

    static /* synthetic */ Boolean a(k k2, Boolean bl2) {
        k2.B = bl2;
        return k2.B;
    }

    static /* synthetic */ List b(k k2) {
        return k2.s;
    }

    static /* synthetic */ void c(k k2) {
        k2.c();
    }

    static /* synthetic */ d b() {
        return a;
    }

    static /* synthetic */ s d(k k2) {
        return k2.e;
    }

    static /* synthetic */ int a(int n2) {
        d = n2;
        return d;
    }

    static /* synthetic */ void a(k k2, int n2) {
        k2.b(n2);
    }

    static /* synthetic */ String a(k k2, String string) {
        k2.t = string;
        return k2.t;
    }
}

