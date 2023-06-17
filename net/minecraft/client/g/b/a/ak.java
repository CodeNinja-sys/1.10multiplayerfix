/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import java.util.Map;
import net.minecraft.client.g.b.a.ac;
import net.minecraft.client.g.b.a.b;
import net.minecraft.u.ad;
import org.lwjgl.util.e.l;

public class ak {
    public final l a;
    public final l b;
    public final Map c;
    public final ac d;
    public final boolean e;
    private static /* synthetic */ int[] f;

    public ak(l l2, l l3, Map map, ac ac2, boolean bl2) {
        this.a = l2;
        this.b = l3;
        this.c = map;
        this.d = ac2;
        this.e = bl2;
        this.b();
    }

    private void b() {
        for (Map.Entry entry : this.c.entrySet()) {
            float[] arrf = this.a((ad)entry.getKey());
            ((b)entry.getValue()).e.a(arrf);
        }
    }

    private float[] a(ad ad2) {
        switch (ak.a()[ad2.ordinal()]) {
            case 1: {
                return new float[]{this.a.a, 16.0f - this.b.c, this.b.a, 16.0f - this.a.c};
            }
            case 2: {
                return new float[]{this.a.a, this.a.c, this.b.a, this.b.c};
            }
            default: {
                return new float[]{16.0f - this.b.a, 16.0f - this.b.b, 16.0f - this.a.a, 16.0f - this.a.b};
            }
            case 4: {
                return new float[]{this.a.a, 16.0f - this.b.b, this.b.a, 16.0f - this.a.b};
            }
            case 5: {
                return new float[]{this.a.c, 16.0f - this.b.b, this.b.c, 16.0f - this.a.b};
            }
            case 6: 
        }
        return new float[]{16.0f - this.b.c, 16.0f - this.b.b, 16.0f - this.a.c, 16.0f - this.a.b};
    }

    static /* synthetic */ int[] a() {
        if (f != null) {
            return f;
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
        f = arrn;
        return arrn;
    }
}

