/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.f.af;
import net.minecraft.f.ap;
import net.minecraft.f.c;
import net.minecraft.f.o;
import net.minecraft.u.a.a;
import net.minecraft.u.a.e;
import net.minecraft.u.aw;
import net.minecraft.x.d.b.j;

public class y
extends ap
implements aw {
    private final af a = new o(this);

    public static void a(a a2) {
        a2.a(net.minecraft.u.a.c.d, (e)new c());
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.a.a(e2);
    }

    @Override
    public net.minecraft.e.e a(net.minecraft.e.e e2) {
        super.a(e2);
        this.a.b(e2);
        return e2;
    }

    @Override
    public void a() {
        this.a.c();
    }

    @Override
    public j bJ_() {
        return new j(this.l, 1, this.d());
    }

    @Override
    public net.minecraft.e.e d() {
        net.minecraft.e.e e2 = this.a(new net.minecraft.e.e());
        e2.q("SpawnPotentials");
        return e2;
    }

    @Override
    public boolean c(int n2, int n3) {
        return this.a.b(n2) ? true : super.c(n2, n3);
    }

    @Override
    public boolean bK_() {
        return true;
    }

    public af b() {
        return this.a;
    }
}

