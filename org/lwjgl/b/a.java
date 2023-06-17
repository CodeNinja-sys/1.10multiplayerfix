/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.b;

import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;

public final class a {
    private int a;

    public a() {
        this(2);
    }

    public a(int n2) {
        if (3 < n2) {
            throw new IllegalArgumentException("Invalid OpenGL ES version specified: " + n2);
        }
        this.a = n2;
    }

    private a(a a2) {
        this.a = a2.a;
    }

    public int a() {
        return this.a;
    }

    public IntBuffer b() {
        int n2 = 1;
        IntBuffer intBuffer = BufferUtils.d(n2 * 2 + 1);
        intBuffer.put(12440).put(this.a);
        intBuffer.put(12344);
        intBuffer.rewind();
        return intBuffer;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append("ContextAttribs:");
        stringBuilder.append(" Version=").append(this.a);
        return stringBuilder.toString();
    }
}

