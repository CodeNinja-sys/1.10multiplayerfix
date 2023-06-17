/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.d;

import java.nio.IntBuffer;
import java.util.concurrent.Callable;
import org.lwjgl.util.d.b;

final class c
implements Callable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ IntBuffer c;
    final /* synthetic */ int d;

    c(int n2, int n3, IntBuffer intBuffer, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = intBuffer;
        this.d = n4;
    }

    public Long a() {
        return org.lwjgl.util.d.b.a(this.a, this.b, this.c, this.d);
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

