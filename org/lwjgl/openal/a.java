/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.openal;

import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;

public final class a {
    final long a;
    private boolean b;

    a(long l2) {
        this.a = l2;
        this.b = true;
    }

    public boolean equals(Object object) {
        if (object instanceof a) {
            return ((a)object).a == this.a;
        }
        return super.equals(object);
    }

    static IntBuffer a(int n2, int n3, int n4) {
        IntBuffer intBuffer = BufferUtils.d(7);
        intBuffer.put(4103);
        intBuffer.put(n2);
        intBuffer.put(4104);
        intBuffer.put(n3);
        intBuffer.put(4105);
        intBuffer.put(n4);
        intBuffer.put(0);
        return intBuffer;
    }

    void a() {
        this.b = false;
    }

    public boolean b() {
        return this.b;
    }
}

