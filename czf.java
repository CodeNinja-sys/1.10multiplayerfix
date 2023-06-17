/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;
import org.apache.commons.b.b;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class czf
extends cjn {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final bpx b = new bpx("textures/gui/title/minecraft.png");
    private static final bpx c = new bpx("textures/misc/vignette.png");
    private int d;
    private List e;
    private int f;
    private final float g = 0.5f;

    @Override
    public void d() {
        agn agn2 = this.u.u();
        bro bro2 = this.u.W();
        if (this.d == 0) {
            agn2.b();
            agn2.a(aii.d);
            bro2.e();
        }
        bro2.a();
        ++this.d;
        float f2 = (float)(this.f + this.x + this.x + 24) / 0.5f;
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
        this.u.h.a.a(new daq(cpl.a));
        this.u.a((cjn)null);
    }

    @Override
    public boolean q_() {
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void cH_() {
        if (this.e != null) {
            return;
        }
        this.e = ov.a();
        dbr dbr2 = null;
        try {
            int n2;
            String string;
            String string2 = "" + (Object)((Object)aug.p) + (Object)((Object)aug.q) + (Object)((Object)aug.k) + (Object)((Object)aug.l);
            int n3 = 274;
            dbr2 = this.u.Q().a(new bpx("texts/end.txt"));
            InputStream inputStream = dbr2.b();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, org.apache.commons.b.b.f));
            Random random = new Random(8124371L);
            while ((string = bufferedReader.readLine()) != null) {
                string = string.replaceAll("PLAYERNAME", this.u.M().c());
                while (string.contains(string2)) {
                    n2 = string.indexOf(string2);
                    String string3 = string.substring(0, n2);
                    String string4 = string.substring(n2 + string2.length());
                    string = string3 + (Object)((Object)aug.p) + (Object)((Object)aug.q) + "XXXXXXXX".substring(0, random.nextInt(4) + 3) + string4;
                }
                this.e.addAll(this.u.k.c(string, 274));
                this.e.add("");
            }
            inputStream.close();
            for (n2 = 0; n2 < 8; ++n2) {
                this.e.add("");
            }
            inputStream = this.u.Q().a(new bpx("texts/credits.txt")).b();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, org.apache.commons.b.b.f));
            while ((string = bufferedReader.readLine()) != null) {
                string = string.replaceAll("PLAYERNAME", this.u.M().c());
                string = string.replaceAll("\t", "    ");
                this.e.addAll(this.u.k.c(string, 274));
                this.e.add("");
            }
            inputStream.close();
            this.f = this.e.size() * 12;
            t.a(dbr2);
        }
        catch (Exception exception) {
            a.b("Couldn't load credits", (Throwable)exception);
        }
        finally {
            t.a(dbr2);
        }
    }

    private void b(int n2, int n3, float f2) {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        this.u.P().a(alo.n);
        bix2.a(7, bxb.i);
        int n4 = this.w;
        float f3 = 0.0f - ((float)this.d + f2) * 0.5f * 0.5f;
        float f4 = (float)this.x - ((float)this.d + f2) * 0.5f * 0.5f;
        float f5 = 0.015625f;
        float f6 = ((float)this.d + f2 - 0.0f) * 0.02f;
        float f7 = (float)(this.f + this.x + this.x + 24) / 0.5f;
        float f8 = (f7 - 20.0f - ((float)this.d + f2)) * 0.005f;
        if (f8 < f6) {
            f6 = f8;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        f6 *= f6;
        f6 = f6 * 96.0f / 255.0f;
        bix2.b(0.0, (double)this.x, (double)this.q).a(0.0, f3 * 0.015625f).a(f6, f6, f6, 1.0f).d();
        bix2.b((double)n4, (double)this.x, (double)this.q).a((float)n4 * 0.015625f, f3 * 0.015625f).a(f6, f6, f6, 1.0f).d();
        bix2.b((double)n4, 0.0, (double)this.q).a((float)n4 * 0.015625f, f4 * 0.015625f).a(f6, f6, f6, 1.0f).d();
        bix2.b(0.0, 0.0, (double)this.q).a(0.0, f4 * 0.015625f).a(f6, f6, f6, 1.0f).d();
        bha2.b();
    }

    @Override
    public void a(int n2, int n3, float f2) {
        int n4;
        this.b(n2, n3, f2);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        int n5 = 274;
        int n6 = this.w / 2 - 137;
        int n7 = this.x + 50;
        float f3 = -((float)this.d + f2) * 0.5f;
        cja.D();
        cja.c(0.0f, f3, 0.0f);
        this.u.P().a(b);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.c(n6, n7, 0, 0, 155, 44);
        this.c(n6 + 155, n7, 0, 45, 155, 44);
        int n8 = n7 + 200;
        for (n4 = 0; n4 < this.e.size(); ++n4) {
            float f4;
            if (n4 == this.e.size() - 1 && (f4 = (float)n8 + f3 - (float)(this.x / 2 - 6)) < 0.0f) {
                cja.c(0.0f, -f4, 0.0f);
            }
            if ((float)n8 + f3 + 12.0f + 8.0f > 0.0f && (float)n8 + f3 < (float)this.x) {
                String string = (String)this.e.get(n4);
                if (string.startsWith("[C]")) {
                    this.B.a(string.substring(3), (float)(n6 + (274 - this.B.a(string.substring(3))) / 2), (float)n8, 0xFFFFFF);
                } else {
                    this.B.b.setSeed((long)n4 * 4238972211L + (long)(this.d / 4));
                    this.B.a(string, (float)n6, (float)n8, 0xFFFFFF);
                }
            }
            n8 += 12;
        }
        cja.E();
        this.u.P().a(c);
        cja.l();
        cja.a(bjt.o, afi.k);
        n4 = this.w;
        int n9 = this.x;
        bix2.a(7, bxb.i);
        bix2.b(0.0, (double)n9, (double)this.q).a(0.0, 1.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        bix2.b((double)n4, (double)n9, (double)this.q).a(1.0, 1.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        bix2.b((double)n4, 0.0, (double)this.q).a(1.0, 0.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        bix2.b(0.0, 0.0, (double)this.q).a(0.0, 0.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        bha2.b();
        cja.k();
        super.a(n2, n3, f2);
    }
}

