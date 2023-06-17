/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class v
implements p {
    private String a;

    public v() {
    }

    public v(String string) {
        if (string.length() > 100) {
            string = string.substring(0, 100);
        }
        this.a = string;
    }

    @Override
    public void a(a a2) {
        this.a = a2.e(100);
    }

    @Override
    public void b(a a2) {
        a2.a(this.a);
    }

    public void a(b b2) {
        b2.a(this);
    }

    public String a() {
        return this.a;
    }
}

