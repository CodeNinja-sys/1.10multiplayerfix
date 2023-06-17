/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import java.nio.ByteBuffer;
import java.util.List;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.d.e;
import net.minecraft.client.g.d.f;
import net.minecraft.client.g.g;

public class r {
    private static /* synthetic */ int[] a;

    public void a(g g2) {
        if (g2.h() > 0) {
            int n2;
            Object object;
            int n3;
            f f2 = g2.g();
            int n4 = f2.g();
            ByteBuffer byteBuffer = g2.f();
            List list = f2.h();
            block12: for (n3 = 0; n3 < list.size(); ++n3) {
                e e2 = (e)list.get(n3);
                object = e2.b();
                int n5 = e2.a().c();
                n2 = e2.d();
                byteBuffer.position(f2.d(n3));
                switch (r.a()[((Enum)object).ordinal()]) {
                    case 1: {
                        bd.b(e2.c(), n5, n4, byteBuffer);
                        bd.n(32884);
                        continue block12;
                    }
                    case 4: {
                        ay.l(ay.q + n2);
                        bd.a(e2.c(), n5, n4, byteBuffer);
                        bd.n(32888);
                        ay.l(ay.q);
                        continue block12;
                    }
                    case 3: {
                        bd.c(e2.c(), n5, n4, byteBuffer);
                        bd.n(32886);
                        continue block12;
                    }
                    case 2: {
                        bd.a(n5, n4, byteBuffer);
                        bd.n(32885);
                    }
                }
            }
            bd.d(g2.i(), 0, g2.h());
            int n6 = list.size();
            block13: for (n3 = 0; n3 < n6; ++n3) {
                object = (e)list.get(n3);
                net.minecraft.client.g.d.g g3 = ((e)object).b();
                n2 = ((e)object).d();
                switch (r.a()[g3.ordinal()]) {
                    case 1: {
                        bd.m(32884);
                        continue block13;
                    }
                    case 4: {
                        ay.l(ay.q + n2);
                        bd.m(32888);
                        ay.l(ay.q);
                        continue block13;
                    }
                    case 3: {
                        bd.m(32886);
                        bd.F();
                        continue block13;
                    }
                    case 2: {
                        bd.m(32885);
                    }
                }
            }
        }
        g2.b();
    }

    static /* synthetic */ int[] a() {
        if (a != null) {
            return a;
        }
        int[] arrn = new int[net.minecraft.client.g.d.g.values().length];
        try {
            arrn[net.minecraft.client.g.d.g.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.client.g.d.g.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.client.g.d.g.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.client.g.d.g.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.client.g.d.g.g.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.client.g.d.g.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.client.g.d.g.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        a = arrn;
        return arrn;
    }
}

