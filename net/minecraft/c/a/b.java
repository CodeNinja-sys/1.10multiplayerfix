/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.a;

import com.c.a.e;
import java.net.SocketAddress;
import net.minecraft.c.a;
import net.minecraft.c.a.d;
import net.minecraft.c.b.p;
import net.minecraft.w.a.g;

public class b
extends p {
    private net.minecraft.e.e f;

    public b(d d2) {
        super(d2);
        this.a(10);
    }

    @Override
    protected void a(g g2) {
        if (g2.X().equals(this.a().aa())) {
            this.f = g2.e(new net.minecraft.e.e());
        }
        super.a(g2);
    }

    @Override
    public String a(SocketAddress socketAddress, e e2) {
        return e2.b().equalsIgnoreCase(this.a().aa()) && this.a(e2.b()) != null ? "That name is already taken." : super.a(socketAddress, e2);
    }

    public d a() {
        return (d)super.c();
    }

    @Override
    public net.minecraft.e.e b() {
        return this.f;
    }

    @Override
    public /* synthetic */ a c() {
        return this.a();
    }
}

