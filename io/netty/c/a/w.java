/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.c.a.d;
import io.netty.c.a.g;
import io.netty.c.a.x;
import io.netty.channel.bd;
import io.netty.util.af;
import io.netty.util.c.aa;
import io.netty.util.c.ad;
import java.util.List;

public abstract class w
extends d {
    static final af a = af.a(w.class.getName() + ".REPLAY");
    private final x c = new x();
    private Object d;
    private int e = -1;

    protected w() {
        this(null);
    }

    protected w(Object object) {
        this.d = object;
    }

    protected void d() {
        this.e = this.c().p();
    }

    protected void a(Object object) {
        this.d();
        this.b(object);
    }

    protected Object e() {
        return this.d;
    }

    protected Object b(Object object) {
        Object object2 = this.d;
        this.d = object;
        return object2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(bd bd2) {
        aa aa2 = aa.a();
        try {
            this.c.a();
            this.c(bd2, this.c(), aa2);
            this.b(bd2, this.c, aa2);
        }
        catch (af af2) {
            af2.a(a);
        }
        catch (g g2) {
            throw g2;
        }
        catch (Exception exception) {
            throw new g(exception);
        }
        finally {
            try {
                if (this.b != null) {
                    this.b.ad();
                    this.b = null;
                }
                int n2 = aa2.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    bd2.b(aa2.get(i2));
                }
                if (n2 > 0) {
                    bd2.k();
                }
                bd2.j();
            }
            finally {
                aa2.b();
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    protected void c(bd var1_1, io.netty.b.g var2_2, List var3_3) {
        this.c.d(var2_2);
        try {
            do lbl-1000:
            // 3 sources

            {
                block8: {
                    if (var2_2.u() == false) return;
                    var4_4 = this.e = var2_2.p();
                    var5_7 = var3_3.size();
                    var6_8 = this.d;
                    var7_9 = var2_2.r();
                    try {
                        this.a(var1_1, this.c, var3_3);
                        if (var1_1.w()) {
                            return;
                        }
                        if (var5_7 != var3_3.size()) break block8;
                        if (var7_9 != var2_2.r() || var6_8 != this.d) ** GOTO lbl-1000
                        throw new g(ad.a(this.getClass()) + ".decode() must consume the inbound " + "data or change its state if it did not decode anything.");
                    }
                    catch (af var8_10) {
                        var8_10.a(w.a);
                        if (var1_1.w()) {
                            return;
                        }
                        var9_11 = this.e;
                        if (var9_11 < 0) return;
                        var2_2.g(var9_11);
                        return;
                    }
                }
                if (var4_4 != var2_2.p() || var6_8 != this.d) continue;
                throw new g(ad.a(this.getClass()) + ".decode() method must consume the inbound data " + "or change its state if it decoded something.");
            } while (!this.a());
            return;
        }
        catch (g var4_5) {
            throw var4_5;
        }
        catch (Throwable var4_6) {
            throw new g(var4_6);
        }
    }
}

