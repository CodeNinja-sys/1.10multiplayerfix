/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.d;

import java.util.List;
import net.minecraft.q.d.a;
import net.minecraft.q.d.b;
import net.minecraft.q.d.e;
import net.minecraft.q.d.f;
import net.minecraft.q.d.g;
import net.minecraft.q.d.h;
import net.minecraft.q.v;

public abstract class d
extends Enum {
    public static final /* enum */ d a = new g();
    public static final /* enum */ d b = new f();
    public static final /* enum */ d c = new e();
    public static final /* enum */ d d = new h();
    public static final /* enum */ d e = new a();
    private static final /* synthetic */ d[] f;

    static {
        f = new d[]{a, b, c, d, e};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d() {
        void var2_-1;
        void var1_-1;
    }

    public abstract void a(v var1, b var2, List var3, int var4, net.minecraft.u.b.b var5);

    public static d[] values() {
        d[] arrd = f;
        int n2 = arrd.length;
        d[] arrd2 = new d[n2];
        System.arraycopy(f, 0, arrd2, 0, n2);
        return arrd2;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ d(d d2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }
}

