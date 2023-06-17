/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class z
implements p {
    private String a;
    private String b;

    public z() {
    }

    public z(String string, String string2) {
        this.a = string;
        this.b = string2;
        if (string2.length() > 40) {
            throw new IllegalArgumentException("Hash is too long (max 40, was " + string2.length() + ")");
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e(32767);
        this.b = a2.e(40);
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.a(this.b);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}

