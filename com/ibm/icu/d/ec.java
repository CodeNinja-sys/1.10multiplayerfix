/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.eb;
import java.util.EnumSet;
import java.util.Set;

public final class ec {
    private EnumSet a = EnumSet.noneOf(eb.class);
    private EnumSet b = EnumSet.noneOf(eb.class);
    private boolean c = false;
    private boolean d = false;
    private boolean e = true;

    public boolean a() {
        return !this.a.isEmpty();
    }

    public Set b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    private void d() {
        this.a.clear();
        this.b.clear();
        this.c = false;
        this.d = false;
        this.e = true;
    }

    static /* synthetic */ void a(ec ec2) {
        ec2.d();
    }

    static /* synthetic */ EnumSet b(ec ec2) {
        return ec2.a;
    }

    static /* synthetic */ EnumSet c(ec ec2) {
        return ec2.b;
    }

    static /* synthetic */ boolean a(ec ec2, boolean bl2) {
        ec2.c = bl2;
        return ec2.c;
    }

    static /* synthetic */ boolean b(ec ec2, boolean bl2) {
        ec2.d = bl2;
        return ec2.d;
    }

    static /* synthetic */ boolean d(ec ec2) {
        return ec2.d;
    }

    static /* synthetic */ boolean c(ec ec2, boolean bl2) {
        ec2.e = bl2;
        return ec2.e;
    }

    static /* synthetic */ boolean e(ec ec2) {
        return ec2.e;
    }
}

