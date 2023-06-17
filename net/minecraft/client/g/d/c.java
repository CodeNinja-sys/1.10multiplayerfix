/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.d;

import java.nio.ByteBuffer;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.d.f;

public class c {
    private int a;
    private final f b;
    private int c;

    public c(f f2) {
        this.b = f2;
        this.a = ay.e();
    }

    public void a() {
        ay.g(ay.R, this.a);
    }

    public void a(ByteBuffer byteBuffer) {
        this.a();
        ay.a(ay.R, byteBuffer, 35044);
        this.b();
        this.c = byteBuffer.limit() / this.b.g();
    }

    public void a(int n2) {
        bd.d(n2, 0, this.c);
    }

    public void b() {
        ay.g(ay.R, 0);
    }

    public void c() {
        if (this.a >= 0) {
            ay.g(this.a);
            this.a = -1;
        }
    }
}

