/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import java.io.IOException;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class as
implements p {
    private String a;
    private net.minecraft.x.a b;

    public as() {
    }

    public as(String string, net.minecraft.x.a a2) {
        this.a = string;
        this.b = a2;
        if (a2.q() > 0x100000) {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e(20);
        int n2 = a2.r();
        if (n2 < 0 || n2 > 0x100000) {
            throw new IOException("Payload may not be larger than 1048576 bytes");
        }
        this.b = new net.minecraft.x.a(a2.y(n2));
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.b(this.b);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public String a() {
        return this.a;
    }

    public net.minecraft.x.a b() {
        return this.b;
    }
}

