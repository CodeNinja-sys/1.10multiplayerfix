/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.j.ak;
import net.minecraft.client.j.w;
import net.minecraft.w.l;
import net.minecraft.w.n;

public abstract class ap {
    public float p;
    public boolean q;
    public boolean r = true;
    public List s = ov.a();
    private final Map a = sz.c();
    public int t = 64;
    public int u = 32;

    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
    }

    public void a(l l2, float f2, float f3, float f4) {
    }

    public w a(Random random) {
        return (w)this.s.get(random.nextInt(this.s.size()));
    }

    protected void a(String string, int n2, int n3) {
        this.a.put(string, new ak(n2, n3));
    }

    public ak a(String string) {
        return (ak)this.a.get(string);
    }

    public static void a(w w2, w w3) {
        w3.f = w2.f;
        w3.g = w2.g;
        w3.h = w2.h;
        w3.c = w2.c;
        w3.d = w2.d;
        w3.e = w2.e;
    }

    public void a(ap ap2) {
        this.p = ap2.p;
        this.q = ap2.q;
        this.r = ap2.r;
    }
}

