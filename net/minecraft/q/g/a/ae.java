/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.az;
import net.minecraft.g.c.b;
import net.minecraft.g.ck;
import net.minecraft.g.cn;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.b.g;

public class ae
extends aj {
    private final cn a;

    public ae(cn cn2) {
        super(true);
        this.a = cn2;
    }

    public ae() {
        super(false);
        this.a = null;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        cn cn2 = this.a;
        if (cn2 == null) {
            cn2 = random.nextBoolean() ? p.bg : p.bh;
        }
        int n2 = random.nextInt(3) + 4;
        if (random.nextInt(12) == 0) {
            n2 *= 2;
        }
        boolean bl2 = true;
        if (b2.k() >= 1 && b2.k() + n2 + 1 < 256) {
            int n3;
            int n4;
            int n5;
            int n6;
            for (int i2 = b2.k(); i2 <= b2.k() + 1 + n2; ++i2) {
                n6 = 3;
                if (i2 <= b2.k() + 3) {
                    n6 = 0;
                }
                g g2 = new g();
                for (n5 = b2.cy_() - n6; n5 <= b2.cy_() + n6 && bl2; ++n5) {
                    for (n4 = b2.l() - n6; n4 <= b2.l() + n6 && bl2; ++n4) {
                        if (i2 >= 0 && i2 < 256) {
                            h h2 = k2.n(g2.b(n5, i2, n4)).d();
                            if (h2 == h.a || h2 == h.j) continue;
                            bl2 = false;
                            continue;
                        }
                        bl2 = false;
                    }
                }
            }
            if (!bl2) {
                return false;
            }
            cn cn3 = k2.n(b2.c()).c();
            if (cn3 != p.d && cn3 != p.c && cn3 != p.bw) {
                return false;
            }
            n6 = b2.k() + n2;
            if (cn2 == p.bh) {
                n6 = b2.k() + n2 - 3;
            }
            for (n3 = n6; n3 <= b2.k() + n2; ++n3) {
                n5 = 1;
                if (n3 < b2.k() + n2) {
                    ++n5;
                }
                if (cn2 == p.bg) {
                    n5 = 3;
                }
                n4 = b2.cy_() - n5;
                int n7 = b2.cy_() + n5;
                int n8 = b2.l() - n5;
                int n9 = b2.l() + n5;
                for (int i3 = n4; i3 <= n7; ++i3) {
                    for (int i4 = n8; i4 <= n9; ++i4) {
                        net.minecraft.u.b.b b3;
                        int n10 = 5;
                        if (i3 == n4) {
                            --n10;
                        } else if (i3 == n7) {
                            ++n10;
                        }
                        if (i4 == n8) {
                            n10 -= 3;
                        } else if (i4 == n9) {
                            n10 += 3;
                        }
                        ck ck2 = ck.a(n10);
                        if (cn2 == p.bg || n3 < b2.k() + n2) {
                            if ((i3 == n4 || i3 == n7) && (i4 == n8 || i4 == n9)) continue;
                            if (i3 == b2.cy_() - (n5 - 1) && i4 == n8) {
                                ck2 = ck.a;
                            }
                            if (i3 == n4 && i4 == b2.l() - (n5 - 1)) {
                                ck2 = ck.a;
                            }
                            if (i3 == b2.cy_() + (n5 - 1) && i4 == n8) {
                                ck2 = ck.c;
                            }
                            if (i3 == n7 && i4 == b2.l() - (n5 - 1)) {
                                ck2 = ck.c;
                            }
                            if (i3 == b2.cy_() - (n5 - 1) && i4 == n9) {
                                ck2 = ck.g;
                            }
                            if (i3 == n4 && i4 == b2.l() + (n5 - 1)) {
                                ck2 = ck.g;
                            }
                            if (i3 == b2.cy_() + (n5 - 1) && i4 == n9) {
                                ck2 = ck.i;
                            }
                            if (i3 == n7 && i4 == b2.l() + (n5 - 1)) {
                                ck2 = ck.i;
                            }
                        }
                        if (ck2 == ck.e && n3 < b2.k() + n2) {
                            ck2 = ck.k;
                        }
                        if (b2.k() < b2.k() + n2 - 1 && ck2 == ck.k || k2.n(b3 = new net.minecraft.u.b.b(i3, n3, i4)).e()) continue;
                        this.a(k2, b3, cn2.v().a(az.a, (Comparable)((Object)ck2)));
                    }
                }
            }
            for (n3 = 0; n3 < n2; ++n3) {
                b b4 = k2.n(b2.a(n3));
                if (b4.e()) continue;
                this.a(k2, b2.a(n3), cn2.v().a(az.a, (Comparable)((Object)ck.j)));
            }
            return true;
        }
        return false;
    }
}

