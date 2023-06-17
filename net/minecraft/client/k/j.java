/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import java.util.Arrays;
import net.minecraft.client.b.d;
import net.minecraft.client.f.u;
import net.minecraft.client.k.ab;
import net.minecraft.client.k.ap;
import net.minecraft.client.k.bo;
import net.minecraft.client.k.ca;
import net.minecraft.client.k.n;
import net.minecraft.client.r;
import org.apache.commons.c.c;

public class j
extends ca {
    private final ab a;
    private final r b;
    private final bo[] w;
    private int x;

    public j(ab ab2, r r2) {
        super(r2, ab2.p + 45, ab2.q, 63, ab2.q - 32, 20);
        this.a = ab2;
        this.b = r2;
        Object[] arrobject = (d[])org.apache.commons.c.c.c(r2.w.ao);
        this.w = new bo[arrobject.length + net.minecraft.client.b.d.d().size()];
        Arrays.sort(arrobject);
        int n2 = 0;
        String string = null;
        Object[] arrobject2 = arrobject;
        int n3 = arrobject.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            Object object = arrobject2[i2];
            String string2 = ((d)object).f();
            if (!string2.equals(string)) {
                string = string2;
                this.w[n2++] = new n(this, string2);
            }
            if ((n4 = r2.m.a(net.minecraft.client.f.u.a(((d)object).h(), new Object[0]))) > this.x) {
                this.x = n4;
            }
            this.w[n2++] = new ap(this, (d)object, null);
        }
    }

    @Override
    protected int a() {
        return this.w.length;
    }

    @Override
    public bo e(int n2) {
        return this.w[n2];
    }

    @Override
    protected int j() {
        return super.j() + 15;
    }

    @Override
    public int i() {
        return super.i() + 32;
    }

    static /* synthetic */ r a(j j2) {
        return j2.b;
    }

    static /* synthetic */ ab b(j j2) {
        return j2.a;
    }

    static /* synthetic */ int c(j j2) {
        return j2.x;
    }
}

