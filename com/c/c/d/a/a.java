/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.a.a.d.ov;
import com.c.c.b.i;
import com.c.c.b.v;
import com.c.c.b.w;
import com.c.c.d.a.b;
import com.c.c.d.a.c;
import com.c.c.d.a.e;
import com.c.c.d.a.f;
import com.c.c.d.a.g;
import com.c.c.d.a.h;
import com.c.c.e.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import net.minecraft.s.j;
import net.minecraft.s.n;
import org.apache.logging.log4j.d;
import org.lwjgl.opengl.GL11;

public class a
extends n {
    private static final d a = org.apache.logging.log4j.c.c();
    private final n b;
    private final i c;
    private volatile List d = new ArrayList();
    private h e;
    private int s;
    private String t;
    private volatile List u = new ArrayList();
    private List v = Arrays.asList(new f(79, 243, 29), new f(243, 175, 29), new f(243, 29, 190), new f(29, 165, 243), new f(29, 243, 130), new f(243, 29, 64), new f(29, 74, 243));
    private int w = 0;
    private long x;
    private int y = 0;
    private Boolean z = false;
    private int A = 0;
    private int B = 0;
    private double C = 0.0;
    private double D = 0.0;
    private int E = 0;

    public a(n n2, i i2) {
        this.b = n2;
        this.c = i2;
        this.c();
    }

    @Override
    public void a() {
        super.a();
        this.e.h();
    }

    @Override
    public void d() {
        org.lwjgl.a.g.a(true);
        this.u();
        this.s = this.r();
        this.e = new h(this);
        this.b(com.c.c.d.a.a.a(this.E, this.r() / 2 - 100, this.s() - 30, 200, 20, com.c.c.d.a.a.f("gui.back")));
    }

    private f b() {
        if (this.w > this.v.size() - 1) {
            this.w = 0;
        }
        return (f)this.v.get(this.w++);
    }

    private void c() {
        new b(this).start();
    }

    private List a(w w2) {
        ArrayList arrayList = ov.a();
        this.x = w2.a;
        long l2 = System.currentTimeMillis() - w2.a;
        for (Object object : w2.b) {
            e e2 = this.a(((v)object).a, arrayList);
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            calendar.setTimeInMillis(((v)object).b);
            Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault());
            calendar2.setTimeInMillis(((v)object).c);
            c c2 = new c(l2, calendar.getTimeInMillis(), calendar2.getTimeInMillis(), null);
            if (e2 == null) {
                String string = "";
                try {
                    string = (String)com.c.c.e.s.a.f(((v)object).a);
                }
                catch (Exception exception) {
                    a.b("Could not get name for " + ((v)object).a, (Throwable)exception);
                    continue;
                }
                e2 = new e(((v)object).a, new ArrayList(), string, ((v)object).a);
                e2.b.add(c2);
                arrayList.add(e2);
                continue;
            }
            e2.b.add(c2);
        }
        Collections.sort(arrayList);
        for (Object object : arrayList) {
            ((e)object).c = this.b();
            Collections.sort(((e)object).b);
        }
        this.z = arrayList.size() == 0;
        return arrayList;
    }

    private e a(String string, List list) {
        for (e e2 : list) {
            if (!e2.a.equals(string)) continue;
            return e2;
        }
        return null;
    }

    @Override
    public void g() {
        super.g();
    }

    @Override
    public void a(net.minecraft.s.f f2) {
        if (f2.c() == this.E) {
            net.minecraft.s.b.a(this.b);
        }
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            net.minecraft.s.b.a(this.b);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        int n4;
        this.t = null;
        this.p();
        for (e e2 : this.d) {
            n4 = this.e(e2.d);
            if (n4 <= this.y) continue;
            this.y = n4 + 10;
        }
        int n5 = 25;
        this.A = this.y + n5;
        int n6 = this.s - this.A - 10;
        n4 = this.u.size() < 1 ? 1 : this.u.size();
        this.B = n6 / n4;
        this.C = (double)this.B / 24.0;
        this.D = this.C / 60.0;
        this.e.a(n2, n3, f2);
        if (this.d != null && this.d.size() > 0) {
            net.minecraft.s.v v2 = net.minecraft.s.v.b;
            GL11.l(3553);
            v2.a(7, net.minecraft.s.j.f);
            v2.a((double)this.A, (double)(this.s() - 40), 0.0).a(128, 128, 128, 255).c();
            v2.a((double)(this.A + 1), (double)(this.s() - 40), 0.0).a(128, 128, 128, 255).c();
            v2.a((double)(this.A + 1), 30.0, 0.0).a(128, 128, 128, 255).c();
            v2.a((double)this.A, 30.0, 0.0).a(128, 128, 128, 255).c();
            v2.a();
            GL11.k(3553);
            for (g g2 : this.u) {
                int n7 = this.u.indexOf(g2) + 1;
                this.b(g2.a, this.A + (n7 - 1) * this.B + (this.B - this.e(g2.a)) / 2 + 2, this.s() - 52, 0xFFFFFF);
                GL11.l(3553);
                v2.a(7, net.minecraft.s.j.f);
                v2.a((double)(this.A + n7 * this.B), (double)(this.s() - 40), 0.0).a(128, 128, 128, 255).c();
                v2.a((double)(this.A + n7 * this.B + 1), (double)(this.s() - 40), 0.0).a(128, 128, 128, 255).c();
                v2.a((double)(this.A + n7 * this.B + 1), 30.0, 0.0).a(128, 128, 128, 255).c();
                v2.a((double)(this.A + n7 * this.B), 30.0, 0.0).a(128, 128, 128, 255).c();
                v2.a();
                GL11.k(3553);
            }
        }
        super.a(n2, n3, f2);
        this.a(com.c.c.d.a.a.f("mco.activity.title"), this.r() / 2, 10, 0xFFFFFF);
        if (this.t != null) {
            this.a(this.t, n2, n3);
        }
        if (this.z.booleanValue()) {
            this.a(com.c.c.d.a.a.a("mco.activity.noactivity", TimeUnit.DAYS.convert(this.x, TimeUnit.MILLISECONDS)), this.r() / 2, this.s() / 2 - 20, 0xFFFFFF);
        }
    }

    protected void a(String string, int n2, int n3) {
        if (string == null) {
            return;
        }
        int n4 = 0;
        int n5 = 0;
        for (String string2 : string.split("\n")) {
            int n6 = this.e(string2);
            if (n6 <= n5) continue;
            n5 = n6;
        }
        int n7 = n2 - n5 - 5;
        int n8 = n3;
        if (n7 < 0) {
            n7 = n2 + 12;
        }
        for (String string3 : string.split("\n")) {
            this.b(n7 - 3, n8 - (n4 == 0 ? 3 : 0) + n4, n7 + n5 + 3, n8 + 8 + 3 + n4, -1073741824, -1073741824);
            this.c(string3, n7, n8 + n4, -1);
            n4 += 10;
        }
    }

    static /* synthetic */ i a(a a2) {
        return a2.c;
    }

    static /* synthetic */ List a(a a2, List list) {
        a2.d = list;
        return a2.d;
    }

    static /* synthetic */ List a(a a2, w w2) {
        return a2.a(w2);
    }

    static /* synthetic */ List b(a a2) {
        return a2.d;
    }

    static /* synthetic */ List b(a a2, List list) {
        a2.u = list;
        return a2.u;
    }

    static /* synthetic */ int c(a a2) {
        return a2.A;
    }

    static /* synthetic */ double d(a a2) {
        return a2.D;
    }

    static /* synthetic */ int e(a a2) {
        return a2.B;
    }

    static /* synthetic */ double f(a a2) {
        return a2.C;
    }

    static /* synthetic */ String a(a a2, String string) {
        a2.t = string;
        return a2.t;
    }
}

