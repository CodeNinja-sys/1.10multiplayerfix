/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c.a;

import io.netty.util.c.ag;
import java.security.SecureRandom;
import java.util.Random;

final class m
extends SecureRandom {
    private static final long a = -8209473337192526191L;
    private static final SecureRandom b = new m();

    static SecureRandom a() {
        return b;
    }

    private m() {
    }

    @Override
    public String getAlgorithm() {
        return "insecure";
    }

    @Override
    public void setSeed(byte[] arrby) {
    }

    @Override
    public void setSeed(long l2) {
    }

    @Override
    public void nextBytes(byte[] arrby) {
        m.b().nextBytes(arrby);
    }

    @Override
    public byte[] generateSeed(int n2) {
        byte[] arrby = new byte[n2];
        m.b().nextBytes(arrby);
        return arrby;
    }

    @Override
    public int nextInt() {
        return m.b().nextInt();
    }

    @Override
    public int nextInt(int n2) {
        return m.b().nextInt(n2);
    }

    @Override
    public boolean nextBoolean() {
        return m.b().nextBoolean();
    }

    @Override
    public long nextLong() {
        return m.b().nextLong();
    }

    @Override
    public float nextFloat() {
        return m.b().nextFloat();
    }

    @Override
    public double nextDouble() {
        return m.b().nextDouble();
    }

    @Override
    public double nextGaussian() {
        return m.b().nextGaussian();
    }

    private static Random b() {
        return ag.b();
    }
}

