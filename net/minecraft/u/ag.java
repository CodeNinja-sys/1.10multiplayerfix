/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.b.cm;
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.u.ad;

public enum ag implements cm,
Iterable
{
    a,
    b;


    public ad[] a() {
        switch (this) {
            case a: {
                return new ad[]{ad.c, ad.f, ad.d, ad.e};
            }
            case b: {
                return new ad[]{ad.b, ad.a};
            }
        }
        throw new Error("Someone's been tampering with the universe!");
    }

    public ad a(Random random) {
        ad[] arrad = this.a();
        return arrad[random.nextInt(arrad.length)];
    }

    public boolean a(ad ad2) {
        return ad2 != null && ad2.l().e() == this;
    }

    public Iterator iterator() {
        return nj.b(this.a());
    }
}

