/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.e;

import com.a.a.d.yk;
import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;
import net.minecraft.client.g.e.f;
import net.minecraft.u.ad;
import net.minecraft.u.b.b;
import net.minecraft.u.ba;

public class p {
    private static final int a = (int)Math.pow(16.0, 0.0);
    private static final int b = (int)Math.pow(16.0, 1.0);
    private static final int c = (int)Math.pow(16.0, 2.0);
    private final BitSet d = new BitSet(4096);
    private static final int[] e = new int[1352];
    private int f = 4096;
    private static /* synthetic */ int[] g;

    static {
        boolean bl2 = false;
        int n2 = 15;
        int n3 = 0;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 16; ++i4) {
                    if (i2 != 0 && i2 != 15 && i3 != 0 && i3 != 15 && i4 != 0 && i4 != 15) continue;
                    p.e[n3++] = p.a(i2, i3, i4);
                }
            }
        }
    }

    public void a(b b2) {
        this.d.set(p.c(b2), true);
        --this.f;
    }

    private static int c(b b2) {
        return p.a(b2.cy_() & 0xF, b2.k() & 0xF, b2.l() & 0xF);
    }

    private static int a(int n2, int n3, int n4) {
        return n2 << 0 | n3 << 8 | n4 << 4;
    }

    public f a() {
        f f2 = new f();
        if (4096 - this.f < 256) {
            f2.a(true);
        } else if (this.f == 0) {
            f2.a(false);
        } else {
            int[] arrn = e;
            int n2 = e.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = arrn[i2];
                if (this.d.get(n3)) continue;
                f2.a(this.a(n3));
            }
        }
        return f2;
    }

    public Set b(b b2) {
        return this.a(p.c(b2));
    }

    private Set a(int n2) {
        EnumSet<ad> enumSet = EnumSet.noneOf(ad.class);
        ArrayDeque arrayDeque = yk.a();
        arrayDeque.add(ba.a(n2));
        this.d.set(n2, true);
        while (!arrayDeque.isEmpty()) {
            int n3 = (Integer)arrayDeque.poll();
            this.a(n3, enumSet);
            for (ad ad2 : ad.values()) {
                int n4 = this.a(n3, ad2);
                if (n4 < 0 || this.d.get(n4)) continue;
                this.d.set(n4, true);
                arrayDeque.add(ba.a(n4));
            }
        }
        return enumSet;
    }

    private void a(int n2, Set set) {
        int n3 = n2 >> 0 & 0xF;
        if (n3 == 0) {
            set.add(ad.e);
        } else if (n3 == 15) {
            set.add(ad.f);
        }
        int n4 = n2 >> 8 & 0xF;
        if (n4 == 0) {
            set.add(ad.a);
        } else if (n4 == 15) {
            set.add(ad.b);
        }
        int n5 = n2 >> 4 & 0xF;
        if (n5 == 0) {
            set.add(ad.c);
        } else if (n5 == 15) {
            set.add(ad.d);
        }
    }

    private int a(int n2, ad ad2) {
        switch (p.b()[ad2.ordinal()]) {
            case 1: {
                if ((n2 >> 8 & 0xF) == 0) {
                    return -1;
                }
                return n2 - c;
            }
            case 2: {
                if ((n2 >> 8 & 0xF) == 15) {
                    return -1;
                }
                return n2 + c;
            }
            case 3: {
                if ((n2 >> 4 & 0xF) == 0) {
                    return -1;
                }
                return n2 - b;
            }
            case 4: {
                if ((n2 >> 4 & 0xF) == 15) {
                    return -1;
                }
                return n2 + b;
            }
            case 5: {
                if ((n2 >> 0 & 0xF) == 0) {
                    return -1;
                }
                return n2 - a;
            }
            case 6: {
                if ((n2 >> 0 & 0xF) == 15) {
                    return -1;
                }
                return n2 + a;
            }
        }
        return -1;
    }

    static /* synthetic */ int[] b() {
        if (g != null) {
            return g;
        }
        int[] arrn = new int[ad.values().length];
        try {
            arrn[ad.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        g = arrn;
        return arrn;
    }
}

