/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.a.a;
import com.c.c.d.a.c;
import com.c.c.d.a.d;
import com.c.c.d.a.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import net.minecraft.s.b;
import net.minecraft.s.j;
import net.minecraft.s.n;
import net.minecraft.s.o;
import net.minecraft.s.v;
import org.lwjgl.opengl.GL11;

class h
extends o {
    final /* synthetic */ a a;

    public h(a a2) {
        this.a = a2;
        super(a2.r(), a2.s(), 30, a2.s() - 40, a2.t() + 1);
    }

    @Override
    public int a() {
        return com.c.c.d.a.a.b(this.a).size();
    }

    @Override
    public void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    public boolean a(int n2) {
        return false;
    }

    @Override
    public int b() {
        return this.a() * (this.a.t() + 1) + 15;
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, v v2, int n6, int n7) {
        if (com.c.c.d.a.a.b(this.a) != null && com.c.c.d.a.a.b(this.a).size() > n2) {
            e e2 = (e)com.c.c.d.a.a.b(this.a).get(n2);
            this.a.b(e2.d, 20, n4, ((e)com.c.c.d.a.a.b((a)this.a).get((int)n2)).e.equals(b.g()) ? 0x7FFF7F : 0xFFFFFF);
            int n8 = e2.c.a;
            int n9 = e2.c.b;
            int n10 = e2.c.c;
            GL11.l(3553);
            v2.a(7, j.f);
            v2.a((double)(com.c.c.d.a.a.c(this.a) - 8), (double)n4 + 6.5, 0.0).a(n8, n9, n10, 255).c();
            v2.a((double)(com.c.c.d.a.a.c(this.a) - 3), (double)n4 + 6.5, 0.0).a(n8, n9, n10, 255).c();
            v2.a((double)(com.c.c.d.a.a.c(this.a) - 3), (double)n4 + 1.5, 0.0).a(n8, n9, n10, 255).c();
            v2.a((double)(com.c.c.d.a.a.c(this.a) - 8), (double)n4 + 1.5, 0.0).a(n8, n9, n10, 255).c();
            v2.a();
            GL11.k(3553);
            n.b(((e)com.c.c.d.a.a.b((a)this.a).get((int)n2)).e, ((e)com.c.c.d.a.a.b((a)this.a).get((int)n2)).d);
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
            n.a(10, n4, 8.0f, 8.0f, 8, 8, 8, 8, 64.0f, 64.0f);
            n.a(10, n4, 40.0f, 8.0f, 8, 8, 8, 8, 64.0f, 64.0f);
            ArrayList<d> arrayList = new ArrayList<d>();
            for (c object : e2.b) {
                int n11 = object.b();
                int n12 = object.a();
                double d2 = com.c.c.d.a.a.d(this.a) * (double)TimeUnit.MINUTES.convert(object.c - object.b, TimeUnit.MILLISECONDS);
                if (d2 < 3.0) {
                    d2 = 3.0;
                }
                double d3 = (double)(com.c.c.d.a.a.c(this.a) + (com.c.c.d.a.a.e(this.a) * object.d - com.c.c.d.a.a.e(this.a))) + (double)n12 * com.c.c.d.a.a.f(this.a) + (double)n11 * com.c.c.d.a.a.d(this.a);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
                Date date = new Date(object.b);
                Date date2 = new Date(object.c);
                int n13 = (int)Math.ceil((double)TimeUnit.SECONDS.convert(object.c - object.b, TimeUnit.MILLISECONDS) / 60.0);
                if (n13 < 1) {
                    n13 = 1;
                }
                String string = "[" + simpleDateFormat.format(date) + " - " + simpleDateFormat.format(date2) + "] " + n13 + (n13 > 1 ? " minutes" : " minute");
                boolean bl2 = false;
                for (d d4 : arrayList) {
                    if (!(d4.a + d4.b >= d3 - 0.5)) continue;
                    double d5 = d4.a + d4.b - d3;
                    double d6 = Math.max(0.0, d3 - (d4.a + d4.b));
                    d4.b = d4.b - Math.max(0.0, d5) + d2 + d6;
                    d4.c = d4.c + "\n" + string;
                    bl2 = true;
                    break;
                }
                if (bl2) continue;
                arrayList.add(new d(d3, d2, string, null));
            }
            for (d d7 : arrayList) {
                GL11.l(3553);
                v2.a(7, j.f);
                v2.a(d7.a, (double)n4 + 6.5, 0.0).a(n8, n9, n10, 255).c();
                v2.a(d7.a + d7.b, (double)n4 + 6.5, 0.0).a(n8, n9, n10, 255).c();
                v2.a(d7.a + d7.b, (double)n4 + 1.5, 0.0).a(n8, n9, n10, 255).c();
                v2.a(d7.a, (double)n4 + 1.5, 0.0).a(n8, n9, n10, 255).c();
                v2.a();
                GL11.k(3553);
                if (!((double)this.g() >= d7.a) || !((double)this.g() <= d7.a + d7.b) || !((double)this.f() >= (double)n4 + 1.5) || !((double)this.f() <= (double)n4 + 6.5)) continue;
                com.c.c.d.a.a.a(this.a, d7.c.trim());
            }
        }
    }

    @Override
    public int c() {
        return this.e() - 7;
    }
}

