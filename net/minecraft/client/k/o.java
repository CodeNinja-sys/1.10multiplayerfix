/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.k.bk;
import net.minecraft.client.k.ch;
import net.minecraft.client.r;

public class o
extends ch {
    private boolean a;
    private final String b;
    private final bk c;

    public o(bk bk2, int n2, int n3, int n4, String string, boolean bl2) {
        super(n2, n3, n4, 150, 20, "");
        this.b = string;
        this.a = bl2;
        this.i = this.a();
        this.c = bk2;
    }

    private String a() {
        return String.valueOf(u.a(this.b, new Object[0])) + ": " + u.a(this.a ? "gui.yes" : "gui.no", new Object[0]);
    }

    public void a(boolean bl2) {
        this.a = bl2;
        this.i = this.a();
        this.c.a(this.j, bl2);
    }

    @Override
    public boolean a(r r2, int n2, int n3) {
        if (super.a(r2, n2, n3)) {
            this.a = !this.a;
            this.i = this.a();
            this.c.a(this.j, this.a);
            return true;
        }
        return false;
    }
}

