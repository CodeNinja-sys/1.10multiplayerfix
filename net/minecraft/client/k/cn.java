/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.b.e;
import net.minecraft.client.k.bo;
import net.minecraft.client.k.bz;
import net.minecraft.client.k.ca;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cp;
import net.minecraft.client.k.d;
import net.minecraft.client.r;

public class cn
extends ca {
    private final List a = ov.a();

    public cn(r r2, int n2, int n3, int n4, int n5, int n6, e ... arre) {
        super(r2, n2, n3, n4, n5, n6);
        this.m = false;
        for (int i2 = 0; i2 < arre.length; i2 += 2) {
            e e2 = arre[i2];
            e e3 = i2 < arre.length - 1 ? arre[i2 + 1] : null;
            ch ch2 = this.a(r2, n2 / 2 - 155, 0, e2);
            ch ch3 = this.a(r2, n2 / 2 - 155 + 160, 0, e3);
            this.a.add(new bz(ch2, ch3));
        }
    }

    private ch a(r r2, int n2, int n3, e e2) {
        if (e2 == null) {
            return null;
        }
        int n4 = e2.c();
        return e2.a() ? new d(n4, n2, n3, e2) : new cp(n4, n2, n3, e2, r2.w.c(e2));
    }

    public bz b(int n2) {
        return (bz)this.a.get(n2);
    }

    @Override
    protected int a() {
        return this.a.size();
    }

    @Override
    public int i() {
        return 400;
    }

    @Override
    protected int j() {
        return super.j() + 32;
    }

    @Override
    public /* synthetic */ bo e(int n2) {
        return this.b(n2);
    }
}

