/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.g;
import net.minecraft.client.k.bo;
import net.minecraft.client.k.br;
import net.minecraft.client.k.ca;
import net.minecraft.client.k.dg;
import net.minecraft.client.k.dm;
import net.minecraft.client.r;
import net.minecraft.q.a.w;
import net.minecraft.q.a.x;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class az
extends ca {
    private static final d a = org.apache.logging.log4j.c.c();
    private final dm b;
    private final List w = ov.a();
    private int x = -1;

    public az(dm dm2, r r2, int n2, int n3, int n4, int n5, int n6) {
        super(r2, n2, n3, n4, n5, n6);
        this.b = dm2;
        this.b();
    }

    public void b() {
        List list;
        w w2 = this.c.g();
        try {
            list = w2.b();
        }
        catch (g g2) {
            a.b("Couldn't load level list", (Throwable)g2);
            this.c.a(new dg("Unable to load worlds", g2.getMessage()));
            return;
        }
        Collections.sort(list);
        for (x x2 : list) {
            this.w.add(new br(this, x2, this.c.g()));
        }
    }

    public br b(int n2) {
        return (br)this.w.get(n2);
    }

    @Override
    protected int a() {
        return this.w.size();
    }

    @Override
    protected int j() {
        return super.j() + 20;
    }

    @Override
    public int i() {
        return super.i() + 50;
    }

    public void c(int n2) {
        this.x = n2;
        this.b.a(this.e());
    }

    @Override
    protected boolean a(int n2) {
        return n2 == this.x;
    }

    public br e() {
        return this.x >= 0 && this.x < this.a() ? this.b(this.x) : null;
    }

    public dm f() {
        return this.b;
    }

    @Override
    public /* synthetic */ bo e(int n2) {
        return this.b(n2);
    }
}

