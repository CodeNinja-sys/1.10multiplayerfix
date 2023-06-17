/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

import com.a.b.ad;
import com.a.b.z;
import java.util.Collection;
import java.util.Random;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.m;
import net.minecraft.u.b.n;

public abstract class s {
    protected final int c;
    protected final int d;
    protected final a[] e;

    protected s(int n2, int n3, a[] arra) {
        this.c = n2;
        this.d = n3;
        this.e = arra;
    }

    public int a(float f2) {
        return Math.max(n.d((float)this.c + (float)this.d * f2), 0);
    }

    public abstract void a(Collection var1, Random var2, m var3);

    protected abstract void a(z var1, ad var2);
}

