/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import org.lwjgl.x;

final class y
extends x {
    y(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    @Override
    public boolean s() {
        return true;
    }

    @Override
    protected x a(ByteBuffer byteBuffer) {
        return new y(byteBuffer);
    }

    @Override
    public x r() {
        return this.q();
    }

    @Override
    public x a(long l2) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public x a(int n2, long l2) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public x a(x x2) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public x b(long[] arrl, int n2, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public x u() {
        throw new ReadOnlyBufferException();
    }
}

