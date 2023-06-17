/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.k;
import com.a.b.r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bro
implements aoi,
avf {
    public static final qe a = new qe("meta:missing_sound", 1.0f, 1.0f, 1, ad.a, false);
    private static final d b = org.apache.logging.log4j.c.c();
    private static final k c = new r().a(cbg.class, (Object)new zf()).a((Type)((Object)dca.class), (Object)new ga()).i();
    private static final ParameterizedType d = new bna();
    private final bvo e = new bvo();
    private final atz f;
    private final akx g;

    public bro(akx akx2, cmx cmx2) {
        this.g = akx2;
        this.f = new atz(this, cmx2);
    }

    @Override
    public void a(akx akx2) {
        Object object;
        Object object2;
        this.e.a();
        for (Object object3 : akx2.a()) {
            try {
                object2 = akx2.b(new bpx((String)object3, "sounds.json"));
                object = object2.iterator();
                while (object.hasNext()) {
                    dbr dbr2 = (dbr)object.next();
                    try {
                        Map map = this.a(dbr2.b());
                        for (Map.Entry entry : map.entrySet()) {
                            this.a(new bpx((String)object3, (String)entry.getKey()), (dca)entry.getValue());
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        b.f("Invalid sounds.json", (Throwable)runtimeException);
                    }
                }
            }
            catch (IOException iOException) {
            }
        }
        for (Object object3 : this.e.c()) {
            object2 = (cdp)this.e.c(object3);
            if (!(((cdp)object2).c() instanceof du) || bf.a((String)(object = ((du)((cdp)object2).c()).d()))) continue;
            b.a("Missing subtitle {} for event: {}", object, object3);
        }
        for (Object object3 : this.e.c()) {
            if (bi.a.c(object3) != null) continue;
            b.a("Not having sound event for: {}", object3);
        }
        this.f.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected Map a(InputStream inputStream) {
        try {
            Map map = (Map)c.a((Reader)new InputStreamReader(inputStream), (Type)d);
            return map;
        }
        finally {
            t.a(inputStream);
        }
    }

    private void a(bpx bpx2, dca dca2) {
        boolean bl2;
        cdp cdp2 = (cdp)this.e.c(bpx2);
        boolean bl3 = bl2 = cdp2 == null;
        if (bl2 || dca2.b()) {
            if (!bl2) {
                b.a("Replaced sound event location {}", bpx2);
            }
            cdp2 = new cdp(bpx2, dca2.c());
            this.e.a(cdp2);
        }
        block4: for (qe qe2 : dca2.a()) {
            ckf ckf2;
            bpx bpx3 = qe2.a();
            switch (qe2.g()) {
                case a: {
                    if (!this.a(qe2, bpx2)) continue block4;
                    ckf2 = qe2;
                    break;
                }
                case b: {
                    ckf2 = new ago(this, bpx3);
                    break;
                }
                default: {
                    throw new IllegalStateException("Unknown SoundEventRegistration type: " + (Object)((Object)qe2.g()));
                }
            }
            cdp2.a(ckf2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean a(qe qe2, bpx bpx2) {
        bpx bpx3 = qe2.b();
        dbr dbr2 = null;
        try {
            dbr2 = this.g.a(bpx3);
            dbr2.b();
        }
        catch (FileNotFoundException fileNotFoundException) {
            b.f("File {} does not exist, cannot add it to event {}", bpx3, bpx2);
            boolean bl2 = false;
            {
                catch (Throwable throwable) {
                    t.a(dbr2);
                    throw throwable;
                }
            }
            t.a(dbr2);
            return bl2;
            catch (IOException iOException) {
                b.f("Could not load sound file {}, cannot add it to event {}", bpx3, bpx2, iOException);
                boolean bl3 = false;
                t.a(dbr2);
                return bl3;
            }
        }
        t.a(dbr2);
        return true;
    }

    public cdp a(bpx bpx2) {
        return (cdp)this.e.c(bpx2);
    }

    public void a(dci dci2) {
        this.f.c(dci2);
    }

    public void a(dci dci2, int n2) {
        this.f.a(dci2, n2);
    }

    public void a(bdl bdl2, float f2) {
        this.f.a(bdl2, f2);
    }

    public void b() {
        this.f.e();
    }

    public void c() {
        this.f.c();
    }

    public void d() {
        this.f.b();
    }

    @Override
    public void a() {
        this.f.d();
    }

    public void e() {
        this.f.f();
    }

    public void a(csg csg2, float f2) {
        if (csg2 == csg.a && f2 <= 0.0f) {
            this.c();
        }
        this.f.a(csg2, f2);
    }

    public void b(dci dci2) {
        this.f.b(dci2);
    }

    public boolean c(dci dci2) {
        return this.f.a(dci2);
    }

    public void a(hm hm2) {
        this.f.a(hm2);
    }

    public void b(hm hm2) {
        this.f.b(hm2);
    }

    public void a(String string, csg csg2) {
        this.f.a(string, csg2);
    }

    static /* synthetic */ bvo a(bro bro2) {
        return bro2.e;
    }
}

