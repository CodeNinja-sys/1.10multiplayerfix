/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.g.g;
import net.minecraft.client.j.as;
import net.minecraft.client.j.s;
import net.minecraft.client.j.w;

public class bg {
    private final as[] h;
    private final s[] i;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public String g;

    public bg(w w2, int n2, int n3, float f2, float f3, float f4, int n4, int n5, int n6, float f5) {
        this(w2, n2, n3, f2, f3, f4, n4, n5, n6, f5, w2.i);
    }

    public bg(w w2, int n2, int n3, float f2, float f3, float f4, int n4, int n5, int n6, float f5, boolean bl2) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f2 + (float)n4;
        this.e = f3 + (float)n5;
        this.f = f4 + (float)n6;
        this.h = new as[8];
        this.i = new s[6];
        float f6 = f2 + (float)n4;
        float f7 = f3 + (float)n5;
        float f8 = f4 + (float)n6;
        f2 -= f5;
        f3 -= f5;
        f4 -= f5;
        f6 += f5;
        f7 += f5;
        f8 += f5;
        if (bl2) {
            float f9 = f6;
            f6 = f2;
            f2 = f9;
        }
        as as2 = new as(f2, f3, f4, 0.0f, 0.0f);
        as as3 = new as(f6, f3, f4, 0.0f, 8.0f);
        as as4 = new as(f6, f7, f4, 8.0f, 8.0f);
        as as5 = new as(f2, f7, f4, 8.0f, 0.0f);
        as as6 = new as(f2, f3, f8, 0.0f, 0.0f);
        as as7 = new as(f6, f3, f8, 0.0f, 8.0f);
        as as8 = new as(f6, f7, f8, 8.0f, 8.0f);
        as as9 = new as(f2, f7, f8, 8.0f, 0.0f);
        this.h[0] = as2;
        this.h[1] = as3;
        this.h[2] = as4;
        this.h[3] = as5;
        this.h[4] = as6;
        this.h[5] = as7;
        this.h[6] = as8;
        this.h[7] = as9;
        this.i[0] = new s(new as[]{as7, as3, as4, as8}, n2 + n6 + n4, n3 + n6, n2 + n6 + n4 + n6, n3 + n6 + n5, w2.a, w2.b);
        this.i[1] = new s(new as[]{as2, as6, as9, as5}, n2, n3 + n6, n2 + n6, n3 + n6 + n5, w2.a, w2.b);
        this.i[2] = new s(new as[]{as7, as6, as2, as3}, n2 + n6, n3, n2 + n6 + n4, n3 + n6, w2.a, w2.b);
        this.i[3] = new s(new as[]{as4, as5, as9, as8}, n2 + n6 + n4, n3 + n6, n2 + n6 + n4 + n4, n3, w2.a, w2.b);
        this.i[4] = new s(new as[]{as3, as2, as5, as4}, n2 + n6, n3 + n6, n2 + n6 + n4, n3 + n6 + n5, w2.a, w2.b);
        this.i[5] = new s(new as[]{as6, as7, as8, as9}, n2 + n6 + n4 + n6, n3 + n6, n2 + n6 + n4 + n6 + n4, n3 + n6 + n5, w2.a, w2.b);
        if (bl2) {
            s[] arrs = this.i;
            int n7 = this.i.length;
            for (int i2 = 0; i2 < n7; ++i2) {
                s s2 = arrs[i2];
                s2.a();
            }
        }
    }

    public void a(g g2, float f2) {
        s[] arrs = this.i;
        int n2 = this.i.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            s s2 = arrs[i2];
            s2.a(g2, f2);
        }
    }

    public bg a(String string) {
        this.g = string;
        return this;
    }
}

