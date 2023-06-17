/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class dam
extends chb
implements zo {
    private static final d h = org.apache.logging.log4j.c.c();
    public static final bpx f = new bpx("missingno");
    public static final bpx g = new bpx("textures/atlas/blocks.png");
    private final List i = ov.a();
    private final Map j = sz.c();
    private final Map k = sz.c();
    private final String l;
    private final iz m;
    private int n;
    private final ars o = new ars("missingno");

    public dam(String string) {
        this(string, null);
    }

    public dam(String string, iz iz2) {
        this.l = string;
        this.m = iz2;
    }

    private void f() {
        int[] arrn = anq.b;
        this.o.b(16);
        this.o.c(16);
        int[][] arrarrn = new int[this.n + 1][];
        arrarrn[0] = arrn;
        this.o.a(ov.a((Object[])new int[][][]{arrarrn}));
    }

    @Override
    public void a(akx akx2) {
        if (this.m != null) {
            this.a(akx2, this.m);
        }
    }

    public void a(akx akx2, iz iz2) {
        this.j.clear();
        iz2.a(this);
        this.f();
        this.e();
        this.b(akx2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void b(akx akx2) {
        Object object222222;
        Iterator iterator;
        Object object;
        int n2 = bxy.D();
        ddm ddm2 = new ddm(n2, n2, 0, this.n);
        this.k.clear();
        this.i.clear();
        int n3 = Integer.MAX_VALUE;
        int n4 = 1 << this.n;
        for (Map.Entry entry : this.j.entrySet()) {
            block14: {
                object = (ars)entry.getValue();
                iterator = this.a((ars)object);
                object222222 = null;
                try {
                    ddt ddt2 = ddt.a(akx2.a((bpx)((Object)iterator)));
                    object222222 = akx2.a((bpx)((Object)iterator));
                    boolean bl2 = object222222.a("animation") != null;
                    ((ars)object).a(ddt2, bl2);
                }
                catch (RuntimeException runtimeException) {
                    h.b("Unable to parse metadata from {}", iterator, runtimeException);
                    {
                        catch (Throwable throwable) {
                            t.a(object222222);
                            throw throwable;
                        }
                    }
                    t.a((Closeable)object222222);
                    continue;
                    catch (IOException iOException) {
                        h.b("Using missing texture, unable to load {}", iterator, iOException);
                        t.a((Closeable)object222222);
                        continue;
                    }
                }
                t.a((Closeable)object222222);
                n3 = Math.min(n3, Math.min(((ars)object).c(), ((ars)object).d()));
                int n5 = Math.min(Integer.lowestOneBit(((ars)object).c()), Integer.lowestOneBit(((ars)object).d()));
                if (n5 >= n4) break block14;
                h.f("Texture {} with size {}x{} limits mip level from {} to {}", iterator, ((ars)object).c(), ((ars)object).d(), cmk.e(n4), cmk.e(n5));
                n4 = n5;
            }
            ddm2.a((ars)object);
        }
        int n6 = Math.min(n3, n4);
        int n7 = cmk.e(n6);
        if (n7 < this.n) {
            h.f("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", this.l, this.n, n7, n6);
            this.n = n7;
        }
        this.o.d(this.n);
        ddm2.a(this.o);
        ddm2.c();
        h.d("Created: {}x{} {}-atlas", ddm2.a(), ddm2.b(), this.l);
        anq.a(this.aF_(), this.n, ddm2.a(), ddm2.b());
        object = sz.b(this.j);
        for (Object object222222 : ddm2.d()) {
            if (object222222 != this.o && !this.a(akx2, (ars)object222222)) continue;
            String string = ((ars)object222222).i();
            object.remove(string);
            this.k.put(string, object222222);
            try {
                anq.a(((ars)object222222).a(0), ((ars)object222222).c(), ((ars)object222222).d(), ((ars)object222222).a(), ((ars)object222222).b(), false, false);
            }
            catch (Throwable throwable) {
                cet cet2 = cet.a(throwable, "Stitching texture atlas");
                sx sx2 = cet2.a("Texture being stitched together");
                sx2.a("Atlas path", this.l);
                sx2.a("Sprite", object222222);
                throw new oz(cet2);
            }
            if (!((ars)object222222).m()) continue;
            this.i.add(object222222);
        }
        iterator = object.values().iterator();
        while (iterator.hasNext()) {
            object222222 = (ars)iterator.next();
            ((ars)object222222).a(this.o);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean a(akx akx2, ars ars2) {
        bpx bpx2 = this.a(ars2);
        dbr dbr2 = null;
        try {
            dbr2 = akx2.a(bpx2);
            ars2.a(dbr2, this.n + 1);
        }
        catch (RuntimeException runtimeException) {
            h.b("Unable to parse metadata from {}", bpx2, runtimeException);
            boolean bl2 = false;
            return bl2;
        }
        catch (IOException iOException) {
            h.b("Using missing texture, unable to load {}", bpx2, iOException);
            boolean bl3 = false;
            return bl3;
        }
        finally {
            t.a(dbr2);
        }
        try {
            ars2.d(this.n);
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Applying mipmap");
            sx sx2 = cet2.a("Sprite being mipmapped");
            sx2.a("Sprite name", new atv(this, ars2));
            sx2.a("Sprite size", new bpr(this, ars2));
            sx2.a("Sprite frames", new csz(this, ars2));
            sx2.a("Mipmap levels", this.n);
            throw new oz(cet2);
        }
        return true;
    }

    private bpx a(ars ars2) {
        bpx bpx2 = new bpx(ars2.i());
        return new bpx(bpx2.c(), String.format("%s/%s%s", this.l, bpx2.b(), ".png"));
    }

    public ars a(String string) {
        ars ars2 = (ars)this.k.get(string);
        if (ars2 == null) {
            ars2 = this.o;
        }
        return ars2;
    }

    public void b() {
        anq.b(this.aF_());
        for (ars ars2 : this.i) {
            ars2.j();
        }
    }

    public ars a(bpx bpx2) {
        if (bpx2 == null) {
            throw new IllegalArgumentException("Location cannot be null!");
        }
        ars ars2 = (ars)this.j.get(bpx2);
        if (ars2 == null) {
            ars2 = ars.a(bpx2);
            this.j.put(bpx2.toString(), ars2);
        }
        return ars2;
    }

    @Override
    public void a() {
        this.b();
    }

    public void a(int n2) {
        this.n = n2;
    }

    public ars c() {
        return this.o;
    }
}

