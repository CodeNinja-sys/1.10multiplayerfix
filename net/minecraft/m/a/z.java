/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import net.minecraft.a.w;
import net.minecraft.e.a;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.f.l;
import net.minecraft.h.af;
import net.minecraft.m.a.u;
import net.minecraft.m.cu;
import net.minecraft.q.k;

class z
implements u {
    private z() {
    }

    @Override
    public boolean a(af af2, k k2) {
        boolean bl2 = false;
        for (int i2 = 0; i2 < af2.e(); ++i2) {
            cu cu2 = af2.a(i2);
            if (cu2 == null || cu2.a() != w.cO) continue;
            if (bl2) {
                return false;
            }
            if (net.minecraft.f.w.c(cu2) >= 6) {
                return false;
            }
            bl2 = true;
        }
        if (!bl2) {
            return false;
        }
        return this.c(af2) != null;
    }

    @Override
    public cu a(af af2) {
        cu cu2 = null;
        for (int i2 = 0; i2 < af2.e(); ++i2) {
            cu cu3 = af2.a(i2);
            if (cu3 == null || cu3.a() != w.cO) continue;
            cu2 = cu3.j();
            cu2.b = 1;
            break;
        }
        l l2 = this.c(af2);
        if (l2 != null) {
            Object object;
            int n2 = 0;
            for (int i3 = 0; i3 < af2.e(); ++i3) {
                object = af2.a(i3);
                if (object == null || ((cu)object).a() != w.bd) continue;
                n2 = ((cu)object).h();
                break;
            }
            e e2 = cu2.a("BlockEntityTag", true);
            if (e2.b("Patterns", 9)) {
                object = e2.c("Patterns", 10);
            } else {
                object = new q();
                e2.a("Patterns", (a)object);
            }
            e e3 = new e();
            e3.a("Pattern", l2.b());
            e3.a("Color", n2);
            ((q)object).a(e3);
        }
        return cu2;
    }

    @Override
    public int a() {
        return 10;
    }

    @Override
    public cu b() {
        return null;
    }

    @Override
    public cu[] b(af af2) {
        cu[] arrcu = new cu[af2.e()];
        for (int i2 = 0; i2 < arrcu.length; ++i2) {
            cu cu2 = af2.a(i2);
            if (cu2 == null || !cu2.a().q()) continue;
            arrcu[i2] = new cu(cu2.a().p());
        }
        return arrcu;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private l c(af var1_1) {
        for (l var2_5 : l.values()) {
            block19: {
                block18: {
                    block17: {
                        if (!var2_5.d()) continue;
                        var6_6 = true;
                        if (!var2_5.e()) break block17;
                        var7_7 = 0;
                        var8_8 = 0;
                        var9_9 = 0;
                        ** GOTO lbl30
                    }
                    if (var1_1.e() != var2_5.c().length * var2_5.c()[0].length()) break block18;
                    var7_7 = -1;
                    var8_8 = 0;
                    ** GOTO lbl53
                }
                var6_6 = false;
                break block19;
lbl-1000:
                // 1 sources

                {
                    var10_10 = var1_1.a(var9_9);
                    if (var10_10 != null && var10_10.a() != w.cO) {
                        if (var10_10.a() == w.bd) {
                            if (var8_8 != 0) {
                                var6_6 = false;
                                break;
                            }
                            var8_8 = 1;
                        } else {
                            if (var7_7 != 0 || !var10_10.a(var2_5.f())) {
                                var6_6 = false;
                                break;
                            }
                            var7_7 = 1;
                        }
                    }
                    ++var9_9;
lbl30:
                    // 2 sources

                    ** while (var9_9 < var1_1.e() && var6_6)
                }
lbl31:
                // 3 sources

                if (var7_7 != 0) break block19;
                var6_6 = false;
                break block19;
lbl-1000:
                // 1 sources

                {
                    var9_9 = var8_8 / 3;
                    var10_11 = var8_8 % 3;
                    var11_12 = var1_1.a(var8_8);
                    if (var11_12 != null && var11_12.a() != w.cO) {
                        if (var11_12.a() != w.bd) {
                            var6_6 = false;
                            break;
                        }
                        if (var7_7 != -1 && var7_7 != var11_12.h()) {
                            var6_6 = false;
                            break;
                        }
                        if (var2_5.c()[var9_9].charAt(var10_11) == ' ') {
                            var6_6 = false;
                            break;
                        }
                        var7_7 = var11_12.h();
                    } else if (var2_5.c()[var9_9].charAt(var10_11) != ' ') {
                        var6_6 = false;
                        break;
                    }
                    ++var8_8;
lbl53:
                    // 2 sources

                    ** while (var8_8 < var1_1.e() && var6_6)
                }
            }
            if (!var6_6) continue;
            return var2_5;
        }
        return null;
    }

    /* synthetic */ z(z z2) {
        this();
    }
}

