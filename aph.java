/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.List;
import java.util.Map;

public class aph
extends bh {
    public int b;
    public int c;
    public byte d;
    public boolean e;
    public byte f;
    public byte[] g = new byte[16384];
    public List h = ov.a();
    private final Map j = sz.c();
    public Map i = sz.d();

    public aph(String string) {
        super(string);
    }

    public void a(double d2, double d3, int n2) {
        int n3 = 128 * (1 << n2);
        int n4 = cmk.c((d2 + 64.0) / (double)n3);
        int n5 = cmk.c((d3 + 64.0) / (double)n3);
        this.b = n4 * n3 + n3 / 2 - 64;
        this.c = n5 * n3 + n3 / 2 - 64;
    }

    @Override
    public void a(bvp bvp2) {
        this.d = bvp2.f("dimension");
        this.b = bvp2.h("xCenter");
        this.c = bvp2.h("zCenter");
        this.f = bvp2.f("scale");
        this.f = (byte)cmk.a(this.f, 0, 4);
        this.e = bvp2.b("trackingPosition", 1) ? bvp2.p("trackingPosition") : true;
        int n2 = bvp2.g("width");
        int n3 = bvp2.g("height");
        if (n2 == 128 && n3 == 128) {
            this.g = bvp2.m("colors");
        } else {
            byte[] arrby = bvp2.m("colors");
            this.g = new byte[16384];
            int n4 = (128 - n2) / 2;
            int n5 = (128 - n3) / 2;
            for (int i2 = 0; i2 < n3; ++i2) {
                int n6 = i2 + n5;
                if (n6 < 0 && n6 >= 128) continue;
                for (int i3 = 0; i3 < n2; ++i3) {
                    int n7 = i3 + n4;
                    if (n7 < 0 && n7 >= 128) continue;
                    this.g[n7 + n6 * 128] = arrby[i3 + i2 * n2];
                }
            }
        }
    }

    @Override
    public bvp b(bvp bvp2) {
        bvp2.a("dimension", this.d);
        bvp2.a("xCenter", this.b);
        bvp2.a("zCenter", this.c);
        bvp2.a("scale", this.f);
        bvp2.a("width", (short)128);
        bvp2.a("height", (short)128);
        bvp2.a("colors", this.g);
        bvp2.a("trackingPosition", this.e);
        return bvp2;
    }

    public void a(bdl bdl2, bhl bhl2) {
        Object object;
        if (!this.j.containsKey(bdl2)) {
            cxr cxr2 = new cxr(this, bdl2);
            this.j.put(bdl2, cxr2);
            this.h.add(cxr2);
        }
        if (!bdl2.n.f(bhl2)) {
            this.i.remove(bdl2.i_());
        }
        for (int i2 = 0; i2 < this.h.size(); ++i2) {
            object = (cxr)this.h.get(i2);
            if (object.a.bk || !object.a.n.f(bhl2) && !bhl2.y()) {
                this.j.remove(((cxr)object).a);
                this.h.remove(object);
                continue;
            }
            if (bhl2.y() || object.a.bS != this.d || !this.e) continue;
            this.a(0, object.a.aQ, ((cxr)object).a.i_(), object.a.aU, object.a.aW, object.a.ba);
        }
        if (bhl2.y() && this.e) {
            cvr cvr2 = bhl2.z();
            object = cvr2.p();
            this.a(1, bdl2.aQ, "frame-" + cvr2.bW(), ((cjx)object).a(), ((cjx)object).c(), cvr2.b.c() * 90);
        }
        if (bhl2.n() && bhl2.o().b("Decorations", 9)) {
            bmh bmh2 = bhl2.o().c("Decorations", 10);
            for (int i3 = 0; i3 < bmh2.b(); ++i3) {
                bvp bvp2 = bmh2.b(i3);
                if (this.i.containsKey(bvp2.l("id"))) continue;
                this.a(bvp2.f("type"), bdl2.aQ, bvp2.l("id"), bvp2.k("x"), bvp2.k("z"), bvp2.k("rot"));
            }
        }
    }

    private void a(int n2, iu iu2, String string, double d2, double d3, double d4) {
        byte by2;
        int n3 = 1 << this.f;
        float f2 = (float)(d2 - (double)this.b) / (float)n3;
        float f3 = (float)(d3 - (double)this.c) / (float)n3;
        byte by3 = (byte)((double)(f2 * 2.0f) + 0.5);
        byte by4 = (byte)((double)(f3 * 2.0f) + 0.5);
        int n4 = 63;
        if (f2 >= -63.0f && f3 >= -63.0f && f2 <= 63.0f && f3 <= 63.0f) {
            by2 = (byte)((d4 += d4 < 0.0 ? -8.0 : 8.0) * 16.0 / 360.0);
            if (this.d < 0) {
                int n5 = (int)(iu2.E().f() / 10L);
                by2 = (byte)(n5 * n5 * 34187121 + n5 * 121 >> 15 & 0xF);
            }
        } else if (Math.abs(f2) < 320.0f && Math.abs(f3) < 320.0f) {
            n2 = 6;
            by2 = 0;
            if (f2 <= -63.0f) {
                by3 = -128;
            }
            if (f3 <= -63.0f) {
                by4 = -128;
            }
            if (f2 >= 63.0f) {
                by3 = 127;
            }
            if (f3 >= 63.0f) {
                by4 = 127;
            }
        } else {
            this.i.remove(string);
            return;
        }
        this.i.put(string, new e((byte)n2, by3, by4, by2));
    }

    public ds a(bhl bhl2, iu iu2, bdl bdl2) {
        cxr cxr2 = (cxr)this.j.get(bdl2);
        if (cxr2 == null) {
            return null;
        }
        return cxr2.a(bhl2);
    }

    public void a(int n2, int n3) {
        super.a();
        for (cxr cxr2 : this.h) {
            cxr2.a(n2, n3);
        }
    }

    public cxr a(bdl bdl2) {
        cxr cxr2 = (cxr)this.j.get(bdl2);
        if (cxr2 == null) {
            cxr2 = new cxr(this, bdl2);
            this.j.put(bdl2, cxr2);
            this.h.add(cxr2);
        }
        return cxr2;
    }
}

