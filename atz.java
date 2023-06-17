/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.bw;
import com.a.a.d.hy;
import com.a.a.d.io;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.vi;
import e.a.a.a;
import e.a.p;
import e.a.s;
import io.netty.util.c.ag;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.g;

public class atz {
    private static final f a = org.apache.logging.log4j.g.a("SOUNDS");
    private static final d b = org.apache.logging.log4j.c.c();
    private static final Set c = aad.a();
    private final bro d;
    private final cmx e;
    private crc f;
    private boolean g;
    private int h;
    private final Map i = hy.a();
    private final Map j = ((bw)this.i).aT_();
    private final vi k = io.v();
    private final List l = ov.a();
    private final Map m = sz.c();
    private final Map n = sz.c();
    private final List o = ov.a();
    private final List p = ov.a();

    public atz(bro bro2, cmx cmx2) {
        this.d = bro2;
        this.e = cmx2;
        try {
            e.a.p.a(e.a.b.f.class);
            e.a.p.a("ogg", a.class);
        }
        catch (s s2) {
            b.b(a, "Error linking with the LibraryJavaSound plug-in", (Throwable)s2);
        }
    }

    public void a() {
        c.clear();
        for (bi bi2 : bi.a) {
            bpx bpx2 = bi2.a();
            if (this.d.a(bpx2) != null) continue;
            b.f("Missing sound for event: {}", bi.a.b(bi2));
            c.add(bpx2);
        }
        this.b();
        this.i();
    }

    private synchronized void i() {
        if (this.g) {
            return;
        }
        try {
            new Thread((Runnable)new axo(this), "Sound Library Loader").start();
        }
        catch (RuntimeException runtimeException) {
            b.b(a, "Error starting SoundSystem. Turning off sounds & music", (Throwable)runtimeException);
            this.e.a(csg.a, 0.0f);
            this.e.b();
        }
    }

    private float a(csg csg2) {
        if (csg2 == null || csg2 == csg.a) {
            return 1.0f;
        }
        return this.e.a(csg2);
    }

    public void a(csg csg2, float f2) {
        if (!this.g) {
            return;
        }
        if (csg2 == csg.a) {
            this.f.e(f2);
            return;
        }
        for (String string : this.k.c((Object)csg2)) {
            dci dci2 = (dci)this.i.get(string);
            float f3 = this.e(dci2);
            if (f3 <= 0.0f) {
                this.b(dci2);
                continue;
            }
            this.f.a(string, f3);
        }
    }

    public void b() {
        if (this.g) {
            this.c();
            this.f.b();
            this.g = false;
        }
    }

    public void c() {
        if (this.g) {
            for (String string : this.i.keySet()) {
                this.f.i(string);
            }
            this.i.clear();
            this.m.clear();
            this.l.clear();
            this.k.h();
            this.n.clear();
        }
    }

    public void a(hm hm2) {
        this.o.add(hm2);
    }

    public void b(hm hm2) {
        this.o.remove(hm2);
    }

    public void d() {
        dci dci2;
        Map.Entry entry;
        Iterator iterator2;
        ++this.h;
        for (Iterator iterator2 : this.l) {
            iterator2.a();
            if (iterator2.m()) {
                this.b((dci)((Object)iterator2));
                continue;
            }
            entry = (String)this.j.get(iterator2);
            this.f.a((String)((Object)entry), this.e((dci)((Object)iterator2)));
            this.f.b((String)((Object)entry), this.d((dci)((Object)iterator2)));
            this.f.a((String)((Object)entry), iterator2.i(), iterator2.j(), iterator2.k());
        }
        Iterator<Object> iterator3 = this.i.entrySet().iterator();
        while (iterator3.hasNext()) {
            int n2;
            iterator2 = (Map.Entry)iterator3.next();
            entry = (String)iterator2.getKey();
            dci2 = (dci)iterator2.getValue();
            if (this.f.a((String)((Object)entry)) || (n2 = ((Integer)this.n.get(entry)).intValue()) > this.h) continue;
            int n3 = dci2.f();
            if (dci2.e() && n3 > 0) {
                this.m.put(dci2, this.h + n3);
            }
            iterator3.remove();
            b.a(a, "Removed channel {} because it's not playing anymore", entry);
            this.f.n((String)((Object)entry));
            this.n.remove(entry);
            try {
                this.k.c((Object)dci2.d(), entry);
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            if (!(dci2 instanceof anm)) continue;
            this.l.remove(dci2);
        }
        iterator2 = this.m.entrySet().iterator();
        while (iterator2.hasNext()) {
            entry = iterator2.next();
            if (this.h < (Integer)entry.getValue()) continue;
            dci2 = (dci)entry.getKey();
            if (dci2 instanceof anm) {
                ((anm)dci2).a();
            }
            this.c(dci2);
            iterator2.remove();
        }
    }

    public boolean a(dci dci2) {
        if (!this.g) {
            return false;
        }
        String string = (String)this.j.get(dci2);
        if (string == null) {
            return false;
        }
        return this.f.a(string) || this.n.containsKey(string) && (Integer)this.n.get(string) <= this.h;
    }

    public void b(dci dci2) {
        if (!this.g) {
            return;
        }
        String string = (String)this.j.get(dci2);
        if (string != null) {
            this.f.i(string);
        }
    }

    public void c(dci dci2) {
        if (!this.g) {
            return;
        }
        cdp cdp2 = dci2.a(this.d);
        bpx bpx2 = dci2.b();
        if (cdp2 == null) {
            if (c.add(bpx2)) {
                b.f(a, "Unable to play unknown soundEvent: {}", bpx2);
            }
            return;
        }
        if (!this.o.isEmpty()) {
            for (hm hm2 : this.o) {
                hm2.a(dci2, cdp2);
            }
        }
        if (this.f.e() <= 0.0f) {
            b.a(a, "Skipped playing soundEvent: {}, master volume was zero", bpx2);
            return;
        }
        qe qe2 = dci2.c();
        if (qe2 == bro.a) {
            if (c.add(bpx2)) {
                b.f(a, "Unable to play empty soundEvent: {}", bpx2);
            }
            return;
        }
        float f2 = dci2.g();
        float f3 = 16.0f;
        if (f2 > 1.0f) {
            f3 *= f2;
        }
        csg csg2 = dci2.d();
        float f4 = this.e(dci2);
        float f5 = this.d(dci2);
        if (f4 == 0.0f) {
            b.a(a, "Skipped playing sound {}, volume was zero.", qe2.a());
            return;
        }
        boolean bl2 = dci2.e() && dci2.f() == 0;
        String string = cmk.a(ag.b()).toString();
        bpx bpx3 = qe2.b();
        if (qe2.h()) {
            this.f.b(false, string, atz.a(bpx3), bpx3.toString(), bl2, dci2.i(), dci2.j(), dci2.k(), dci2.l().a(), f3);
        } else {
            this.f.a(false, string, atz.a(bpx3), bpx3.toString(), bl2, dci2.i(), dci2.j(), dci2.k(), dci2.l().a(), f3);
        }
        b.a(a, "Playing sound {} for event {} as channel {}", qe2.a(), bpx3, string);
        this.f.b(string, f5);
        this.f.a(string, f4);
        this.f.g(string);
        this.n.put(string, this.h + 20);
        this.i.put(string, dci2);
        if (csg2 != csg.a) {
            this.k.a((Object)csg2, string);
        }
        if (dci2 instanceof anm) {
            this.l.add((anm)dci2);
        }
    }

    private float d(dci dci2) {
        return cmk.a(dci2.h(), 0.5f, 2.0f);
    }

    private float e(dci dci2) {
        return cmk.a(dci2.g() * this.a(dci2.d()), 0.0f, 1.0f);
    }

    public void e() {
        for (Map.Entry entry : this.i.entrySet()) {
            String string = (String)entry.getKey();
            boolean bl2 = this.a((dci)entry.getValue());
            if (!bl2) continue;
            b.a(a, "Pausing channel {}", string);
            this.f.h(string);
            this.p.add(string);
        }
    }

    public void f() {
        for (String string : this.p) {
            b.a(a, "Resuming channel {}", string);
            this.f.g(string);
        }
        this.p.clear();
    }

    public void a(dci dci2, int n2) {
        this.m.put(dci2, this.h + n2);
    }

    private static URL a(bpx bpx2) {
        String string = String.format("%s:%s:%s", "mcsounddomain", bpx2.c(), bpx2.b());
        brb brb2 = new brb(bpx2);
        try {
            return new URL(null, string, brb2);
        }
        catch (MalformedURLException malformedURLException) {
            throw new Error("TODO: Sanely handle url exception! :D");
        }
    }

    public void a(bdl bdl2, float f2) {
        if (!this.g || bdl2 == null) {
            return;
        }
        float f3 = bdl2.bd + (bdl2.bb - bdl2.bd) * f2;
        float f4 = bdl2.bc + (bdl2.ba - bdl2.bc) * f2;
        double d2 = bdl2.aR + (bdl2.aU - bdl2.aR) * (double)f2;
        double d3 = bdl2.aS + (bdl2.aV - bdl2.aS) * (double)f2 + (double)bdl2.A();
        double d4 = bdl2.aT + (bdl2.aW - bdl2.aT) * (double)f2;
        float f5 = cmk.b((f4 + 90.0f) * ((float)Math.PI / 180));
        float f6 = cmk.a((f4 + 90.0f) * ((float)Math.PI / 180));
        float f7 = cmk.b(-f3 * ((float)Math.PI / 180));
        float f8 = cmk.a(-f3 * ((float)Math.PI / 180));
        float f9 = cmk.b((-f3 + 90.0f) * ((float)Math.PI / 180));
        float f10 = cmk.a((-f3 + 90.0f) * ((float)Math.PI / 180));
        float f11 = f5 * f7;
        float f12 = f8;
        float f13 = f6 * f7;
        float f14 = f5 * f9;
        float f15 = f10;
        float f16 = f6 * f9;
        this.f.c((float)d2, (float)d3, (float)d4);
        this.f.a(f11, f12, f13, f14, f15, f16);
    }

    public void a(String string, csg csg2) {
        if (csg2 != null) {
            for (String string2 : this.k.c((Object)csg2)) {
                dci dci2 = (dci)this.i.get(string2);
                if (!string.isEmpty()) {
                    if (!dci2.b().equals(new bpx(string))) continue;
                    this.b(dci2);
                    continue;
                }
                this.b(dci2);
            }
        } else if (!string.isEmpty()) {
            for (dci dci3 : this.i.values()) {
                if (!dci3.b().equals(new bpx(string))) continue;
                this.b(dci3);
            }
        } else {
            this.c();
        }
    }

    static /* synthetic */ d g() {
        return b;
    }

    static /* synthetic */ crc a(atz atz2, crc crc2) {
        atz2.f = crc2;
        return atz2.f;
    }

    static /* synthetic */ boolean a(atz atz2, boolean bl2) {
        atz2.g = bl2;
        return atz2.g;
    }

    static /* synthetic */ cmx a(atz atz2) {
        return atz2.e;
    }

    static /* synthetic */ crc b(atz atz2) {
        return atz2.f;
    }

    static /* synthetic */ f h() {
        return a;
    }
}

