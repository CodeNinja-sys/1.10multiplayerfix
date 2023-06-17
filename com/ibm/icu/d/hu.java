/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.jd;
import com.ibm.icu.d.iq;
import com.ibm.icu.d.ld;
import com.ibm.icu.d.lf;

class hu
implements ld {
    private ld f;
    private int g;
    private int h;
    public static final int a = Integer.MAX_VALUE;

    public hu(ld ld2, int n2, int n3) {
        if (ld2 == null || n2 < 0 || n3 < 0 || n2 > n3) {
            throw new IllegalArgumentException();
        }
        this.f = ld2;
        this.g = n2;
        this.h = n3;
    }

    public int a(iq iq2, int[] arrn, int n2, boolean bl2) {
        int n3;
        int n4 = arrn[0];
        for (n3 = 0; n3 < this.h; ++n3) {
            int n5 = arrn[0];
            int n6 = this.f.a(iq2, arrn, n2, bl2);
            if (n6 == 2) {
                if (n5 != arrn[0]) continue;
                break;
            }
            if (!bl2 || n6 != 1) break;
            return 1;
        }
        if (bl2 && arrn[0] == n2) {
            return 1;
        }
        if (n3 >= this.g) {
            return 2;
        }
        arrn[0] = n4;
        return 0;
    }

    public String a(boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f.a(bl2));
        if (this.g == 0) {
            if (this.h == 1) {
                return stringBuilder.append('?').toString();
            }
            if (this.h == Integer.MAX_VALUE) {
                return stringBuilder.append('*').toString();
            }
        } else if (this.g == 1 && this.h == Integer.MAX_VALUE) {
            return stringBuilder.append('+').toString();
        }
        stringBuilder.append('{');
        stringBuilder.append(jd.a((long)this.g, 1));
        stringBuilder.append(',');
        if (this.h != Integer.MAX_VALUE) {
            stringBuilder.append(jd.a((long)this.h, 1));
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean a(int n2) {
        return this.g == 0 || this.f.a(n2);
    }

    public void a(lf lf2) {
        if (this.h > 0) {
            this.f.a(lf2);
        }
    }
}

