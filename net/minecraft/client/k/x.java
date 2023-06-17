/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;
import net.minecraft.client.c.ac;
import net.minecraft.client.c.h;
import net.minecraft.client.f.an;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.g;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.de;
import net.minecraft.u.bp;
import net.minecraft.u.d.o;
import net.minecraft.x.d.a.ah;
import org.apache.commons.b.b;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class x
extends cc {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final bp b = new bp("textures/gui/title/minecraft.png");
    private static final bp c = new bp("textures/misc/vignette.png");
    private int d;
    private List e;
    private int f;
    private final float g = 0.5f;

    @Override
    public void bY_() {
        net.minecraft.client.c.g g2 = this.n.s();
        h h2 = this.n.U();
        if (this.d == 0) {
            g2.b();
            g2.a(ac.d);
            h2.e();
        }
        h2.a();
        ++this.d;
        float f2 = (float)(this.f + this.q + this.q + 24) / 0.5f;
        if ((float)this.d > f2) {
            this.f();
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == 1) {
            this.f();
        }
    }

    private void f() {
        this.n.j.d.a(new net.minecraft.x.d.a.x(ah.a));
        this.n.a((cc)null);
    }

    @Override
    public boolean cq_() {
        return true;
    }

    @Override
    public void ct_() {
        block10: {
            if (this.e == null) {
                this.e = ov.a();
                an an2 = null;
                try {
                    try {
                        String string;
                        String string2 = "" + (Object)((Object)net.minecraft.u.d.o.p) + (Object)((Object)net.minecraft.u.d.o.q) + (Object)((Object)net.minecraft.u.d.o.k) + (Object)((Object)net.minecraft.u.d.o.l);
                        int n2 = 274;
                        an2 = this.n.O().a(new bp("texts/end.txt"));
                        InputStream inputStream = an2.b();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, org.apache.commons.b.b.f));
                        Random random = new Random(8124371L);
                        while ((string = bufferedReader.readLine()) != null) {
                            string = string.replaceAll("PLAYERNAME", this.n.K().c());
                            while (string.contains(string2)) {
                                int n3 = string.indexOf(string2);
                                String string3 = string.substring(0, n3);
                                String string4 = string.substring(n3 + string2.length());
                                string = String.valueOf(string3) + (Object)((Object)net.minecraft.u.d.o.p) + (Object)((Object)net.minecraft.u.d.o.q) + "XXXXXXXX".substring(0, random.nextInt(4) + 3) + string4;
                            }
                            this.e.addAll(this.n.m.c(string, 274));
                            this.e.add("");
                        }
                        inputStream.close();
                        for (int i2 = 0; i2 < 8; ++i2) {
                            this.e.add("");
                        }
                        inputStream = this.n.O().a(new bp("texts/credits.txt")).b();
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream, org.apache.commons.b.b.f));
                        while ((string = bufferedReader.readLine()) != null) {
                            string = string.replaceAll("PLAYERNAME", this.n.K().c());
                            string = string.replaceAll("\t", "    ");
                            this.e.addAll(this.n.m.c(string, 274));
                            this.e.add("");
                        }
                        inputStream.close();
                        this.f = this.e.size() * 12;
                    }
                    catch (Exception exception) {
                        a.b("Couldn't load credits", (Throwable)exception);
                        org.apache.commons.b.t.a(an2);
                        break block10;
                    }
                }
                catch (Throwable throwable) {
                    org.apache.commons.b.t.a(an2);
                    throw throwable;
                }
                org.apache.commons.b.t.a(an2);
            }
        }
    }

    private void b(int n2, int n3, float f2) {
        ci ci2 = ci.a();
        g g2 = ci2.c();
        this.n.N().a(de.y);
        g2.a(7, net.minecraft.client.g.d.b.i);
        int n4 = this.p;
        float f3 = 0.0f - ((float)this.d + f2) * 0.5f * 0.5f;
        float f4 = (float)this.q - ((float)this.d + f2) * 0.5f * 0.5f;
        float f5 = 0.015625f;
        float f6 = ((float)this.d + f2 - 0.0f) * 0.02f;
        float f7 = (float)(this.f + this.q + this.q + 24) / 0.5f;
        float f8 = (f7 - 20.0f - ((float)this.d + f2)) * 0.005f;
        if (f8 < f6) {
            f6 = f8;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        f6 *= f6;
        f6 = f6 * 96.0f / 255.0f;
        g2.b(0.0, (double)this.q, (double)this.B).a(0.0, f3 * 0.015625f).a(f6, f6, f6, 1.0f).d();
        g2.b((double)n4, (double)this.q, (double)this.B).a((float)n4 * 0.015625f, f3 * 0.015625f).a(f6, f6, f6, 1.0f).d();
        g2.b((double)n4, 0.0, (double)this.B).a((float)n4 * 0.015625f, f4 * 0.015625f).a(f6, f6, f6, 1.0f).d();
        g2.b(0.0, 0.0, (double)this.B).a(0.0, f4 * 0.015625f).a(f6, f6, f6, 1.0f).d();
        ci2.b();
    }

    @Override
    public void a(int n2, int n3, float f2) {
        int n4;
        this.b(n2, n3, f2);
        ci ci2 = ci.a();
        g g2 = ci2.c();
        int n5 = 274;
        int n6 = this.p / 2 - 137;
        int n7 = this.q + 50;
        float f3 = -((float)this.d + f2) * 0.5f;
        bd.D();
        bd.c(0.0f, f3, 0.0f);
        this.n.N().a(b);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a_(n6, n7, 0, 0, 155, 44);
        this.a_(n6 + 155, n7, 0, 45, 155, 44);
        int n8 = n7 + 200;
        for (n4 = 0; n4 < this.e.size(); ++n4) {
            float f4;
            if (n4 == this.e.size() - 1 && (f4 = (float)n8 + f3 - (float)(this.q / 2 - 6)) < 0.0f) {
                bd.c(0.0f, -f4, 0.0f);
            }
            if ((float)n8 + f3 + 12.0f + 8.0f > 0.0f && (float)n8 + f3 < (float)this.q) {
                String string = (String)this.e.get(n4);
                if (string.startsWith("[C]")) {
                    this.u.a(string.substring(3), (float)(n6 + (274 - this.u.a(string.substring(3))) / 2), (float)n8, 0xFFFFFF);
                } else {
                    this.u.b.setSeed((long)n4 * 4238972211L + (long)(this.d / 4));
                    this.u.a(string, (float)n6, (float)n8, 0xFFFFFF);
                }
            }
            n8 += 12;
        }
        bd.E();
        this.n.N().a(c);
        bd.l();
        bd.a(ad.o, bc.k);
        n4 = this.p;
        int n9 = this.q;
        g2.a(7, net.minecraft.client.g.d.b.i);
        g2.b(0.0, (double)n9, (double)this.B).a(0.0, 1.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        g2.b((double)n4, (double)n9, (double)this.B).a(1.0, 1.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        g2.b((double)n4, 0.0, (double)this.B).a(1.0, 0.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        g2.b(0.0, 0.0, (double)this.B).a(0.0, 0.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        ci2.b();
        bd.k();
        super.a(n2, n3, f2);
    }
}

