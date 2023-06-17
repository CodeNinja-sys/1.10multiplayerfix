/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.i;
import net.minecraft.q.a.a.m;
import net.minecraft.q.a.a.s;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class k
extends s {
    protected final bp a;

    public k(bp bp2, int n2, int n3, a[] arra) {
        super(n2, n3, arra);
        this.a = bp2;
    }

    @Override
    public void a(Collection collection, Random random, m m2) {
        i i2 = m2.d().a(this.a);
        List list = i2.a(random, m2);
        collection.addAll(list);
    }

    @Override
    protected void a(z z2, ad ad2) {
        z2.a("name", this.a.toString());
    }

    public static k a(z z2, u u2, int n2, int n3, a[] arra) {
        bp bp2 = new bp(bc.f(z2, "name"));
        return new k(bp2, n2, n3, arra);
    }
}

