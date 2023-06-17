/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.util.UUID;
import net.minecraft.q.ae;
import net.minecraft.q.ar;
import net.minecraft.u.d.a;

public abstract class q {
    private final UUID h;
    protected a a;
    protected float b;
    protected ae c;
    protected ar d;
    protected boolean e;
    protected boolean f;
    protected boolean g;

    public q(UUID uUID, a a2, ae ae2, ar ar2) {
        this.h = uUID;
        this.a = a2;
        this.c = ae2;
        this.d = ar2;
        this.b = 1.0f;
    }

    public UUID a() {
        return this.h;
    }

    public a b() {
        return this.a;
    }

    public void a(a a2) {
        this.a = a2;
    }

    public float c() {
        return this.b;
    }

    public void a(float f2) {
        this.b = f2;
    }

    public ae d() {
        return this.c;
    }

    public void a(ae ae2) {
        this.c = ae2;
    }

    public ar e() {
        return this.d;
    }

    public void a(ar ar2) {
        this.d = ar2;
    }

    public boolean f() {
        return this.e;
    }

    public q a(boolean bl2) {
        this.e = bl2;
        return this;
    }

    public boolean g() {
        return this.f;
    }

    public q b(boolean bl2) {
        this.f = bl2;
        return this;
    }

    public q c(boolean bl2) {
        this.g = bl2;
        return this;
    }

    public boolean h() {
        return this.g;
    }
}

