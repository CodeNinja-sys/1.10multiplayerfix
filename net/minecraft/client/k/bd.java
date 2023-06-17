/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.i.j;
import net.minecraft.client.k.ai;
import net.minecraft.client.k.be;
import net.minecraft.client.k.bo;
import net.minecraft.client.k.bw;
import net.minecraft.client.k.ca;
import net.minecraft.client.k.cw;
import net.minecraft.client.l.o;
import net.minecraft.client.r;

public class bd
extends ca {
    private final ai a;
    private final List b = ov.a();
    private final List w = ov.a();
    private final bo x = new be();
    private int y = -1;

    public bd(ai ai2, r r2, int n2, int n3, int n4, int n5, int n6) {
        super(r2, n2, n3, n4, n5, n6);
        this.a = ai2;
    }

    @Override
    public bo e(int n2) {
        if (n2 < this.b.size()) {
            return (bo)this.b.get(n2);
        }
        if ((n2 -= this.b.size()) == 0) {
            return this.x;
        }
        return (bo)this.w.get(--n2);
    }

    @Override
    protected int a() {
        return this.b.size() + 1 + this.w.size();
    }

    public void b(int n2) {
        this.y = n2;
    }

    @Override
    protected boolean a(int n2) {
        return n2 == this.y;
    }

    public int b() {
        return this.y;
    }

    public void a(j j2) {
        this.b.clear();
        for (int i2 = 0; i2 < j2.c(); ++i2) {
            this.b.add(new bw(this.a, j2.a(i2)));
        }
    }

    public void a(List list) {
        this.w.clear();
        for (o o2 : list) {
            this.w.add(new cw(this.a, o2));
        }
    }

    @Override
    protected int j() {
        return super.j() + 30;
    }

    @Override
    public int i() {
        return super.i() + 85;
    }
}

