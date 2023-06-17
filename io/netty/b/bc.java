/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.af;
import io.netty.b.bi;
import io.netty.b.d;
import io.netty.b.g;
import io.netty.b.h;
import io.netty.b.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

public class bc
extends d {
    private final g d;

    public bc(g g2) {
        super(g2.k());
        this.d = g2 instanceof bc || g2 instanceof af ? g2.n() : g2;
        this.a(g2.p(), g2.q());
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean j(int n2) {
        return false;
    }

    @Override
    public g n() {
        return this.d;
    }

    @Override
    public h l() {
        return this.d.l();
    }

    @Override
    public ByteOrder m() {
        return this.d.m();
    }

    @Override
    public boolean o() {
        return this.d.o();
    }

    @Override
    public boolean W() {
        return false;
    }

    @Override
    public byte[] X() {
        throw new ReadOnlyBufferException();
    }

    @Override
    public int Y() {
        throw new ReadOnlyBufferException();
    }

    @Override
    public boolean Z() {
        return false;
    }

    @Override
    public long aa() {
        throw new ReadOnlyBufferException();
    }

    @Override
    public g B() {
        throw new ReadOnlyBufferException();
    }

    @Override
    public g b(int n2, g g2, int n3, int n4) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public g b(int n2, byte[] arrby, int n3, int n4) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public g b(int n2, ByteBuffer byteBuffer) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public g b(int n2, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    protected void m(int n2, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public g c(int n2, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    protected void n(int n2, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public g d(int n2, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    protected void o(int n2, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public g e(int n2, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    protected void p(int n2, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public g a(int n2, long l2) {
        throw new ReadOnlyBufferException();
    }

    @Override
    protected void b(int n2, long l2) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public int a(int n2, InputStream inputStream, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public int a(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public int a(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        return this.d.a(n2, gatheringByteChannel, n3);
    }

    @Override
    public g a(int n2, OutputStream outputStream, int n3) {
        this.d.a(n2, outputStream, n3);
        return this;
    }

    @Override
    public g a(int n2, byte[] arrby, int n3, int n4) {
        this.d.a(n2, arrby, n3, n4);
        return this;
    }

    @Override
    public g a(int n2, g g2, int n3, int n4) {
        this.d.a(n2, g2, n3, n4);
        return this;
    }

    @Override
    public g a(int n2, ByteBuffer byteBuffer) {
        this.d.a(n2, byteBuffer);
        return this;
    }

    @Override
    public g S() {
        return new bc(this);
    }

    @Override
    public g h(int n2, int n3) {
        return this.d.h(n2, n3);
    }

    @Override
    public g i(int n2, int n3) {
        return bi.c(this.d.i(n2, n3));
    }

    @Override
    public byte m(int n2) {
        return this.c(n2);
    }

    @Override
    protected byte c(int n2) {
        return this.d.m(n2);
    }

    @Override
    public short o(int n2) {
        return this.d(n2);
    }

    @Override
    protected short d(int n2) {
        return this.d.o(n2);
    }

    @Override
    public int r(int n2) {
        return this.e(n2);
    }

    @Override
    protected int e(int n2) {
        return this.d.r(n2);
    }

    @Override
    public int s(int n2) {
        return this.K(n2);
    }

    @Override
    protected int K(int n2) {
        return this.d.s(n2);
    }

    @Override
    public long u(int n2) {
        return this.L(n2);
    }

    @Override
    protected long L(int n2) {
        return this.d.u(n2);
    }

    @Override
    public int T() {
        return this.d.T();
    }

    @Override
    public ByteBuffer j(int n2, int n3) {
        return this.d.j(n2, n3).asReadOnlyBuffer();
    }

    @Override
    public ByteBuffer[] l(int n2, int n3) {
        return this.d.l(n2, n3);
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        return this.j(n2, n3);
    }

    @Override
    public int a(int n2, int n3, l l2) {
        return this.d.a(n2, n3, l2);
    }

    @Override
    public int b(int n2, int n3, l l2) {
        return this.d.b(n2, n3, l2);
    }

    @Override
    public int j() {
        return this.d.j();
    }

    @Override
    public g f(int n2) {
        throw new ReadOnlyBufferException();
    }
}

